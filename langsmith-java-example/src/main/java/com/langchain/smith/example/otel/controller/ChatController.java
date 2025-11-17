package com.langchain.smith.example.otel.controller;

import com.langchain.smith.example.otel.service.LlmService;
import com.langchain.smith.otel.OtelSpanCreator;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller demonstrating OpenTelemetry tracing with LangSmith.
 */
@RestController
@RequestMapping("/api")
public class ChatController {

    private final Tracer tracer;
    private final LlmService llmService;

    @Autowired
    public ChatController(Tracer tracer, LlmService llmService) {
        this.tracer = tracer;
        this.llmService = llmService;
    }

    @PostMapping("/chat")
    public Map<String, Object> chat(@RequestBody Map<String, String> request) {
        String userMessage = request.getOrDefault("message", "Hello!");

        // Create a root span for the entire request
        Span rootSpan = OtelSpanCreator.createChainSpan(tracer, "chat_request", "spring-boot-langsmith", null);

        try (Scope scope = rootSpan.makeCurrent()) {
            OtelSpanCreator.setInput(rootSpan, userMessage);

            System.out.println("→ Processing chat request: " + userMessage);

            // Call the LLM service (which creates its own span)
            String response = llmService.generateResponse(userMessage);

            OtelSpanCreator.setOutput(rootSpan, response);
            rootSpan.setStatus(StatusCode.OK);

            System.out.println("← Chat response generated");

            return Map.of(
                    "request",
                    userMessage,
                    "response",
                    response,
                    "model",
                    "gpt-4",
                    "trace_id",
                    rootSpan.getSpanContext().getTraceId());

        } catch (Exception e) {
            rootSpan.setStatus(StatusCode.ERROR, e.getMessage());
            throw e;
        } finally {
            rootSpan.end();
        }
    }

    @GetMapping("/analyze")
    public Map<String, Object> analyze(@RequestParam String text) {
        // Create a span for the analysis operation
        Span analysisSpan = OtelSpanCreator.createChainSpan(tracer, "text_analysis", "spring-boot-langsmith", null);

        try (Scope scope = analysisSpan.makeCurrent()) {
            OtelSpanCreator.setInput(analysisSpan, text);

            System.out.println("→ Analyzing text: " + text);

            // Simulate analysis with nested operations
            int wordCount = text.split("\\s+").length;
            String sentiment = llmService.analyzeSentiment(text);

            String result = String.format("Word count: %d, Sentiment: %s", wordCount, sentiment);
            OtelSpanCreator.setOutput(analysisSpan, result);
            analysisSpan.setStatus(StatusCode.OK);

            System.out.println("← Analysis complete");

            return Map.of(
                    "text", text,
                    "word_count", wordCount,
                    "sentiment", sentiment,
                    "trace_id", analysisSpan.getSpanContext().getTraceId());

        } catch (Exception e) {
            analysisSpan.setStatus(StatusCode.ERROR, e.getMessage());
            throw e;
        } finally {
            analysisSpan.end();
        }
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "healthy", "service", "spring-boot-langsmith");
    }
}
