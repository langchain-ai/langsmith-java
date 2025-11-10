package com.langchain.smith.otel;

import com.langchain.smith.models.runs.Run;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;
import java.time.Instant;

public final class OtelSpanCreator {

    private OtelSpanCreator() {}

    /**
     * Creates an LLM span with common gen_ai attributes pre-configured.
     *
     * @param tracer the OpenTelemetry tracer
     * @param name the span name
     * @param system the AI system (e.g., "openai", "anthropic")
     * @param model the model name (e.g., "gpt-4", "claude-3")
     * @param serviceName the service name
     * @param sessionId optional session ID
     * @return a started Span with gen_ai attributes set
     */
    public static Span createLlmSpan(
            Tracer tracer, String name, String system, String model, String serviceName, String sessionId) {
        Span span = tracer.spanBuilder(name).setParent(Context.current()).startSpan();
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "chat");
        span.setAttribute(AttributeKey.stringKey("gen_ai.system"), system);
        span.setAttribute(AttributeKey.stringKey("gen_ai.request.model"), model);
        if (serviceName != null) {
            span.setAttribute(AttributeKey.stringKey("service.name"), serviceName);
        }
        if (sessionId != null) {
            span.setAttribute(AttributeKey.stringKey("session.id"), sessionId);
        }
        return span;
    }

    /**
     * Sets the prompt/input on a span.
     *
     * @param span the span to set the input on
     * @param input the input/prompt text
     */
    public static void setInput(Span span, String input) {
        if (input != null) {
            span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), input);
        }
    }

    /**
     * Sets the completion/output on a span.
     *
     * @param span the span to set the output on
     * @param output the output/completion text
     */
    public static void setOutput(Span span, String output) {
        if (output != null) {
            span.setAttribute(AttributeKey.stringKey("gen_ai.completion"), output);
        }
    }

    /**
     * Sets token usage information on a span.
     *
     * @param span the span to set token usage on
     * @param inputTokens number of input tokens
     * @param outputTokens number of output tokens
     */
    public static void setTokenUsage(Span span, int inputTokens, int outputTokens) {
        span.setAttribute(AttributeKey.longKey("gen_ai.usage.input_tokens"), (long) inputTokens);
        span.setAttribute(AttributeKey.longKey("gen_ai.usage.output_tokens"), (long) outputTokens);
    }

    /**
     * Creates a tool span with common gen_ai attributes pre-configured.
     *
     * @param tracer the OpenTelemetry tracer
     * @param name the span name
     * @param toolName the tool name
     * @param serviceName the service name
     * @param sessionId optional session ID
     * @return a started Span with gen_ai attributes set
     */
    public static Span createToolSpan(
            Tracer tracer, String name, String toolName, String serviceName, String sessionId) {
        Span span = tracer.spanBuilder(name).setParent(Context.current()).startSpan();
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "tool");
        span.setAttribute(AttributeKey.stringKey("tool.name"), toolName);
        if (serviceName != null) {
            span.setAttribute(AttributeKey.stringKey("service.name"), serviceName);
        }
        if (sessionId != null) {
            span.setAttribute(AttributeKey.stringKey("session.id"), sessionId);
        }
        return span;
    }

    /**
     * Creates a retrieval span with common gen_ai attributes pre-configured.
     *
     * @param tracer the OpenTelemetry tracer
     * @param name the span name
     * @param serviceName the service name
     * @param sessionId optional session ID
     * @return a started Span with gen_ai attributes set
     */
    public static Span createRetrievalSpan(Tracer tracer, String name, String serviceName, String sessionId) {
        Span span = tracer.spanBuilder(name).setParent(Context.current()).startSpan();
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "retrieval");
        if (serviceName != null) {
            span.setAttribute(AttributeKey.stringKey("service.name"), serviceName);
        }
        if (sessionId != null) {
            span.setAttribute(AttributeKey.stringKey("session.id"), sessionId);
        }
        return span;
    }

    /**
     * Creates a chain/workflow span with common gen_ai attributes pre-configured.
     *
     * @param tracer the OpenTelemetry tracer
     * @param name the span name
     * @param serviceName the service name
     * @param sessionId optional session ID
     * @return a started Span with gen_ai attributes set
     */
    public static Span createChainSpan(Tracer tracer, String name, String serviceName, String sessionId) {
        Span span = tracer.spanBuilder(name).setParent(Context.current()).startSpan();
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "chat");
        if (serviceName != null) {
            span.setAttribute(AttributeKey.stringKey("service.name"), serviceName);
        }
        if (sessionId != null) {
            span.setAttribute(AttributeKey.stringKey("session.id"), sessionId);
        }
        return span;
    }

    /**
     * Creates and exports a span from a LangSmith Run using the native OTEL API.
     *
     * @param tracer the OpenTelemetry tracer
     * @param run the LangSmith Run to convert
     * @param projectName the project name for langsmith.project.name attribute
     */
    public static void createSpanFromRun(Tracer tracer, Run run, String projectName) {
        // Parse timestamps
        Instant startTime = parseTime(run.startTime().orElse(null));
        Instant endTime = parseTime(run.endTime().orElse(null));

        if (startTime == null) {
            startTime = Instant.now().minusSeconds(1);
        }
        if (endTime == null) {
            endTime = Instant.now();
        }

        String traceIdHex = normalizeTraceId(run.traceId()
                .orElseGet(() -> java.util.UUID.randomUUID().toString().replace("-", "")));
        String spanIdHex = normalizeSpanId(run.id()
                .orElseGet(() ->
                        java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 16)));
        String parentSpanIdHex =
                run.parentRunId().map(OtelSpanCreator::normalizeSpanId).orElse(null);

        // Create SpanContext for this span
        SpanContext spanContext =
                SpanContext.create(traceIdHex, spanIdHex, TraceFlags.getSampled(), TraceState.getDefault());

        // Create parent context if we have a parent span ID
        Context parentContext = Context.root();
        if (parentSpanIdHex != null) {
            SpanContext parentSpanContext =
                    SpanContext.create(traceIdHex, parentSpanIdHex, TraceFlags.getSampled(), TraceState.getDefault());
            parentContext = Context.root().with(Span.wrap(parentSpanContext));
        }

        SpanKind spanKind = determineSpanKind(run);

        String spanName = run.name().orElse("langsmith.run");
        SpanBuilder spanBuilder = tracer.spanBuilder(spanName)
                .setSpanKind(spanKind)
                .setParent(parentContext)
                .setStartTimestamp(startTime);

        Span span = spanBuilder.startSpan();

        try {
            // Set OpenTelemetry GenAI semantic convention attributes

            span.setAttribute(
                    AttributeKey.stringKey("gen_ai.operation.name"),
                    mapRunTypeToOperation(run.runType().orElse(null)));

            run.name().ifPresent(name -> {
                if (name.contains("openai") || name.contains("gpt")) {
                    span.setAttribute(AttributeKey.stringKey("gen_ai.system"), "openai");
                } else if (name.contains("anthropic") || name.contains("claude")) {
                    span.setAttribute(AttributeKey.stringKey("gen_ai.system"), "anthropic");
                }
            });

            if (projectName != null) {
                span.setAttribute(AttributeKey.stringKey("service.name"), projectName);
            }
            run.sessionId().ifPresent(id -> span.setAttribute(AttributeKey.stringKey("session.id"), id));

            if (run.error().isPresent()) {
                span.setStatus(StatusCode.ERROR, run.error().get());
                span.setAttribute(AttributeKey.booleanKey("error"), true);
                span.setAttribute(AttributeKey.stringKey("error.type"), "runtime_error");
            } else {
                span.setStatus(StatusCode.OK);
            }

            run.tags().ifPresent(tags -> {
                for (int i = 0; i < tags.size(); i++) {
                    span.setAttribute(AttributeKey.stringKey("tag." + i), tags.get(i));
                }
            });

        } finally {
            span.end(endTime);
        }
    }

    private static Instant parseTime(String timeString) {
        if (timeString == null || timeString.isEmpty()) {
            return null;
        }
        try {
            return Instant.parse(timeString);
        } catch (Exception e) {
            try {
                long epochMilli = Long.parseLong(timeString);
                return Instant.ofEpochMilli(epochMilli);
            } catch (Exception e2) {
                return null;
            }
        }
    }

    private static SpanKind determineSpanKind(Run run) {
        return run.runType()
                .map(rt -> {
                    if (rt == Run.RunType.LLM) return SpanKind.CLIENT;
                    if (rt == Run.RunType.CHAIN) return SpanKind.INTERNAL;
                    if (rt == Run.RunType.TOOL) return SpanKind.CLIENT;
                    return SpanKind.INTERNAL;
                })
                .orElse(SpanKind.INTERNAL);
    }

    private static String mapRunTypeToOperation(Run.RunType runType) {
        if (runType == null) {
            return "chat";
        }
        if (runType == Run.RunType.LLM) {
            return "chat";
        } else if (runType == Run.RunType.CHAIN) {
            return "chat";
        } else if (runType == Run.RunType.TOOL) {
            return "tool";
        } else if (runType == Run.RunType.RETRIEVER) {
            return "retrieval";
        } else if (runType == Run.RunType.PARSER) {
            return "parse";
        } else if (runType == Run.RunType.PROMPT) {
            return "prompt";
        } else {
            return "chat";
        }
    }

    private static String normalizeTraceId(String traceId) {
        if (traceId == null) {
            traceId = java.util.UUID.randomUUID().toString().replace("-", "");
        }
        traceId = traceId.toLowerCase();
        if (traceId.length() < 32) {
            traceId = String.format("%32s", traceId).replace(' ', '0');
        } else if (traceId.length() > 32) {
            traceId = traceId.substring(0, 32);
        }
        return traceId;
    }

    private static String normalizeSpanId(String spanId) {
        if (spanId == null) {
            spanId = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        }
        spanId = spanId.toLowerCase();
        if (spanId.length() < 16) {
            spanId = String.format("%16s", spanId).replace(' ', '0');
        } else if (spanId.length() > 16) {
            spanId = spanId.substring(0, 16);
        }
        return spanId;
    }
}
