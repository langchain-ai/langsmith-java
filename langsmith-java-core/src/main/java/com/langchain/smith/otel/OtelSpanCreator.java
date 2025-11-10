package com.langchain.smith.otel;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;

/**
 * Utility class for creating OpenTelemetry spans with Gen AI semantic conventions.
 * Provides helper methods to create spans for LLM, tool, retrieval, and chain operations.
 */
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
}
