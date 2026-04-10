package com.langchain.smith.tracing;

import static org.assertj.core.api.Assertions.assertThat;

import com.langchain.smith.client.LangsmithClient;
import dev.langchain4j.agent.tool.ToolExecutionRequest;
import dev.langchain4j.agent.tool.ToolSpecification;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.ToolExecutionResultMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.service.tool.ToolExecutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Verifies that LangSmith tracing context is correctly propagated when LangChain4j tool calls are
 * executed concurrently on separate threads.
 *
 * <p>The fix is {@link TraceConfig#getParent()}: capture the parent {@link RunTree} on the
 * originating thread and pass it through the config so child tool runs are linked correctly even
 * when executing on a foreign thread.
 */
class LangChain4jParallelToolTest {

    private final LangsmithClient client = Mockito.mock(LangsmithClient.class);

    // -- scripted ChatModel --------------------------------------------------

    private static ChatModel scriptedChatModel(AiMessage first, AiMessage second) {
        Queue<AiMessage> queue = new ConcurrentLinkedQueue<>(Arrays.asList(first, second));
        return new ChatModel() {
            @Override
            public ChatResponse doChat(ChatRequest chatRequest) {
                AiMessage next = queue.poll();
                if (next == null) {
                    throw new IllegalStateException("No more scripted responses");
                }
                return ChatResponse.builder().aiMessage(next).build();
            }
        };
    }

    // -- tests ---------------------------------------------------------------

    /**
     * End-to-end: scripted LLM returns two tool calls, they execute in parallel on a thread pool,
     * each tool's {@link TraceConfig} carries the parent, both child runs link to the agent trace.
     */
    @Test
    void parallelToolCalls_preserveTraceContext() throws Exception {
        ToolExecutionRequest getWeather = ToolExecutionRequest.builder()
                .id("call_1")
                .name("getWeather")
                .arguments("{\"city\":\"NYC\"}")
                .build();
        ToolExecutionRequest getTime = ToolExecutionRequest.builder()
                .id("call_2")
                .name("getTime")
                .arguments("{\"city\":\"NYC\"}")
                .build();

        ChatModel chatModel =
                scriptedChatModel(AiMessage.from(getWeather, getTime), AiMessage.from("NYC: sunny, 2:30 PM"));

        ToolSpecification weatherSpec = ToolSpecification.builder()
                .name("getWeather")
                .description("weather")
                .build();
        ToolSpecification timeSpec =
                ToolSpecification.builder().name("getTime").description("time").build();

        Map<String, RunTree> capturedToolRuns = new ConcurrentHashMap<>();
        Queue<String> threadNames = new ConcurrentLinkedQueue<>();

        HashMap<String, ToolExecutor> executors = new HashMap<>();
        executors.put("getWeather", (req, mem) -> {
            capturedToolRuns.put("getWeather", Tracing.getCurrentRunTree());
            threadNames.add(Thread.currentThread().getName());
            return "Sunny, 72F";
        });
        executors.put("getTime", (req, mem) -> {
            capturedToolRuns.put("getTime", Tracing.getCurrentRunTree());
            threadNames.add(Thread.currentThread().getName());
            return "2:30 PM";
        });

        RunTree agentRun = RunTree.builder()
                .name("agent")
                .runType(RunType.CHAIN)
                .client(client)
                .projectName("test-project")
                .build();

        String finalAnswer = Tracing.withParent(agentRun, (Callable<String>) () -> {
            ChatResponse response = chatModel.chat(ChatRequest.builder()
                    .messages(Arrays.<ChatMessage>asList(UserMessage.from("Weather and time in NYC?")))
                    .toolSpecifications(Arrays.asList(weatherSpec, timeSpec))
                    .build());

            AiMessage aiMessage = response.aiMessage();
            ArrayList<ChatMessage> messages = new ArrayList<>();
            messages.add(UserMessage.from("Weather and time in NYC?"));

            while (aiMessage.hasToolExecutionRequests()) {
                messages.add(aiMessage);

                // Capture parent BEFORE dispatching to the pool
                RunTree parent = Tracing.getCurrentRunTree();
                ExecutorService pool = Executors.newFixedThreadPool(2);
                LinkedHashMap<ToolExecutionRequest, CompletableFuture<String>> futures = new LinkedHashMap<>();

                for (ToolExecutionRequest toolReq : aiMessage.toolExecutionRequests()) {
                    CompletableFuture<String> future = CompletableFuture.supplyAsync(
                            () -> {
                                // Pass parent through TraceConfig — works on any thread
                                Function<ToolExecutionRequest, String> traced = Tracing.traceFunction(
                                        r -> executors.get(r.name()).execute(r, null),
                                        TraceConfig.builder()
                                                .name(toolReq.name())
                                                .client(client)
                                                .runType(RunType.TOOL)
                                                .tracingEnabled(true)
                                                .parent(parent)
                                                .build());
                                return traced.apply(toolReq);
                            },
                            pool);
                    futures.put(toolReq, future);
                }

                for (Map.Entry<ToolExecutionRequest, CompletableFuture<String>> e : futures.entrySet()) {
                    messages.add(ToolExecutionResultMessage.from(
                            e.getKey(), e.getValue().join()));
                }
                pool.shutdown();
                pool.awaitTermination(5, TimeUnit.SECONDS);

                response = chatModel.chat(ChatRequest.builder()
                        .messages(messages)
                        .toolSpecifications(Arrays.asList(weatherSpec, timeSpec))
                        .build());
                aiMessage = response.aiMessage();
            }
            return aiMessage.text();
        });

        assertThat(finalAnswer).isEqualTo("NYC: sunny, 2:30 PM");
        assertThat(threadNames).hasSize(2);
        for (String t : threadNames) {
            assertThat(t).isNotEqualTo(Thread.currentThread().getName());
        }
        assertThat(capturedToolRuns.get("getWeather")).isNotNull();
        assertThat(capturedToolRuns.get("getTime")).isNotNull();
        assertThat(capturedToolRuns.get("getWeather").getParentRunId()).isEqualTo(agentRun.getId());
        assertThat(capturedToolRuns.get("getTime").getParentRunId()).isEqualTo(agentRun.getId());
        assertThat(capturedToolRuns.get("getWeather").getTraceId()).isEqualTo(agentRun.getTraceId());
        assertThat(capturedToolRuns.get("getTime").getTraceId()).isEqualTo(agentRun.getTraceId());
    }

    /** Without config.parent, tool runs become detached root traces. */
    @Test
    void parallelToolCalls_withoutParent_contextIsLost() throws Exception {
        ToolExecutionRequest req1 = ToolExecutionRequest.builder()
                .id("c1")
                .name("t1")
                .arguments("{}")
                .build();
        ToolExecutionRequest req2 = ToolExecutionRequest.builder()
                .id("c2")
                .name("t2")
                .arguments("{}")
                .build();

        ChatModel chatModel = scriptedChatModel(AiMessage.from(req1, req2), AiMessage.from("done"));

        Map<String, RunTree> captured = new ConcurrentHashMap<>();
        HashMap<String, ToolExecutor> executors = new HashMap<>();
        executors.put("t1", (r, m) -> {
            captured.put("t1", Tracing.getCurrentRunTree());
            return "ok";
        });
        executors.put("t2", (r, m) -> {
            captured.put("t2", Tracing.getCurrentRunTree());
            return "ok";
        });

        RunTree agentRun = RunTree.builder()
                .name("agent")
                .runType(RunType.CHAIN)
                .client(client)
                .build();

        Tracing.withParent(agentRun, () -> {
            ChatResponse response = chatModel.chat(ChatRequest.builder()
                    .messages(Arrays.<ChatMessage>asList(UserMessage.from("go")))
                    .build());

            ExecutorService pool = Executors.newFixedThreadPool(2);
            LinkedHashMap<ToolExecutionRequest, CompletableFuture<String>> futures = new LinkedHashMap<>();

            for (ToolExecutionRequest toolReq : response.aiMessage().toolExecutionRequests()) {
                futures.put(
                        toolReq,
                        CompletableFuture.supplyAsync(
                                () -> {
                                    // No parent in config — context lost
                                    Function<ToolExecutionRequest, String> traced = Tracing.traceFunction(
                                            r -> executors.get(r.name()).execute(r, null),
                                            TraceConfig.builder()
                                                    .name(toolReq.name())
                                                    .client(client)
                                                    .runType(RunType.TOOL)
                                                    .tracingEnabled(true)
                                                    .build());
                                    return traced.apply(toolReq);
                                },
                                pool));
            }

            for (Map.Entry<ToolExecutionRequest, CompletableFuture<String>> e : futures.entrySet()) {
                e.getValue().join();
            }
            pool.shutdown();
            try {
                pool.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        });

        // Detached root traces
        assertThat(captured.get("t1").getParentRunId()).isNull();
        assertThat(captured.get("t2").getParentRunId()).isNull();
        assertThat(captured.get("t1").getTraceId()).isNotEqualTo(agentRun.getTraceId());
    }

    /** Errors are captured on the child RunTree even across thread boundaries. */
    @Test
    void parallelToolCalls_errorIsCaptured() throws Exception {
        ToolExecutionRequest failReq = ToolExecutionRequest.builder()
                .id("c1")
                .name("fail")
                .arguments("{}")
                .build();
        ToolExecutionRequest okReq = ToolExecutionRequest.builder()
                .id("c2")
                .name("ok")
                .arguments("{}")
                .build();

        ChatModel chatModel = scriptedChatModel(AiMessage.from(failReq, okReq), AiMessage.from("done"));

        Map<String, RunTree> captured = new ConcurrentHashMap<>();
        HashMap<String, ToolExecutor> executors = new HashMap<>();
        executors.put("fail", (r, m) -> {
            captured.put("fail", Tracing.getCurrentRunTree());
            throw new RuntimeException("connection timeout");
        });
        executors.put("ok", (r, m) -> {
            captured.put("ok", Tracing.getCurrentRunTree());
            return "ok";
        });

        RunTree agentRun = RunTree.builder()
                .name("agent")
                .runType(RunType.CHAIN)
                .client(client)
                .build();

        Tracing.withParent(agentRun, () -> {
            ChatResponse response = chatModel.chat(ChatRequest.builder()
                    .messages(Arrays.<ChatMessage>asList(UserMessage.from("go")))
                    .build());

            RunTree parent = Tracing.getCurrentRunTree();
            ExecutorService pool = Executors.newFixedThreadPool(2);
            LinkedHashMap<ToolExecutionRequest, CompletableFuture<String>> futures = new LinkedHashMap<>();

            for (ToolExecutionRequest toolReq : response.aiMessage().toolExecutionRequests()) {
                futures.put(
                        toolReq,
                        CompletableFuture.supplyAsync(
                                () -> {
                                    Function<ToolExecutionRequest, String> traced = Tracing.traceFunction(
                                            r -> executors.get(r.name()).execute(r, null),
                                            TraceConfig.builder()
                                                    .name(toolReq.name())
                                                    .client(client)
                                                    .runType(RunType.TOOL)
                                                    .tracingEnabled(true)
                                                    .parent(parent)
                                                    .build());
                                    return traced.apply(toolReq);
                                },
                                pool));
            }

            for (Map.Entry<ToolExecutionRequest, CompletableFuture<String>> e : futures.entrySet()) {
                try {
                    e.getValue().join();
                } catch (Exception ignored) {
                }
            }
            pool.shutdown();
            try {
                pool.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        });

        assertThat(captured.get("fail").getParentRunId()).isEqualTo(agentRun.getId());
        assertThat(captured.get("ok").getParentRunId()).isEqualTo(agentRun.getId());
        assertThat(captured.get("fail").getError()).contains("connection timeout");
        assertThat(captured.get("ok").getError()).isNull();
    }
}
