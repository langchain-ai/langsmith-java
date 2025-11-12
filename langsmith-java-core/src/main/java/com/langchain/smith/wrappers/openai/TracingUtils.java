package com.langchain.smith.wrappers.openai;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;

/** Internal utility for OpenTelemetry span creation and management. */
final class TracingUtils {

    private static final String INSTRUMENTATION_NAME = "langsmith-java-otel-wrappers";

    private TracingUtils() {}

    static Tracer getTracer() {
        try {
            Tracer tracer = io.opentelemetry.api.GlobalOpenTelemetry.get().getTracer(INSTRUMENTATION_NAME);

            boolean debug =
                    Boolean.getBoolean("langsmith.debug") || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));
            if (debug) {
                io.opentelemetry.api.OpenTelemetry otel = io.opentelemetry.api.GlobalOpenTelemetry.get();
                boolean isNoop = otel.getClass().getName().contains("Noop");
                System.out.println("[TracingUtils] Tracer obtained: "
                        + tracer.getClass().getName() + ", OpenTelemetry isNoop: " + isNoop);
            }

            return tracer;
        } catch (Exception e) {
            return io.opentelemetry.api.GlobalOpenTelemetry.get().getTracer(INSTRUMENTATION_NAME);
        }
    }

    static SpanBuilder createSpanBuilder(String model, String operationType, String spanKind) {
        Tracer tracer = getTracer();
        String spanName = operationType + " " + (model != null ? model : "unknown");
        SpanBuilder builder = tracer.spanBuilder(spanName)
                .setSpanKind(SpanKind.CLIENT)
                .setAttribute("gen_ai.system", "openai")
                .setAttribute("gen_ai.operation.name", operationType)
                .setAttribute("gen_ai.provider.name", "openai");

        if (spanKind != null) {
            builder.setAttribute("langsmith.span.kind", spanKind);
        }

        return builder;
    }

    static SpanBuilder createSpanBuilder(String model, String operationType) {
        return createSpanBuilder(model, operationType, "llm");
    }

    static void setRequestAttributes(Span span, String model) {
        if (model != null) {
            span.setAttribute("gen_ai.request.model", model);
        }
    }

    static void setRequestParameters(Span span, Double temperature, Double topP, Long maxTokens) {
        if (temperature != null) {
            span.setAttribute("gen_ai.request.temperature", temperature);
        }
        if (topP != null) {
            span.setAttribute("gen_ai.request.top_p", topP);
        }
        if (maxTokens != null) {
            span.setAttribute("gen_ai.request.max_tokens", maxTokens);
        }
    }

    static void setInputMessages(Span span, String messagesJson) {
        if (messagesJson != null) {
            span.setAttribute("gen_ai.input.messages", messagesJson);
        }
    }

    static void setOutputMessages(Span span, String messagesJson) {
        if (messagesJson != null) {
            span.setAttribute("gen_ai.output.messages", messagesJson);
        }
    }

    static void setResponseAttributes(Span span, Long inputTokens, Long outputTokens, Long totalTokens) {
        if (inputTokens != null) {
            span.setAttribute("gen_ai.usage.input_tokens", inputTokens);
        }
        if (outputTokens != null) {
            span.setAttribute("gen_ai.usage.output_tokens", outputTokens);
        }
        if (totalTokens != null) {
            span.setAttribute("gen_ai.usage.total_tokens", totalTokens);
        }
    }

    static void setResponseMetadata(Span span, String responseModel, String finishReason) {
        if (responseModel != null) {
            span.setAttribute("gen_ai.response.model", responseModel);
        }
        if (finishReason != null) {
            span.setAttribute("gen_ai.response.finish_reason", finishReason);
        }
    }

    static void recordException(Span span, Throwable exception) {
        span.recordException(exception);
        span.setAttribute("error", true);
    }

    static String escapeJsonString(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
