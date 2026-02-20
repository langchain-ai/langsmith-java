package com.langchain.smith.otel

import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.Tracer
import io.opentelemetry.context.Context

/**
 * Utility object for creating OpenTelemetry spans with Gen AI semantic conventions.
 * Provides helper methods to create spans for LLM, tool, retrieval, and chain operations.
 */
object OtelSpanCreator {

    @JvmStatic
    fun createLlmSpan(
        tracer: Tracer,
        name: String,
        system: String,
        model: String,
        serviceName: String?,
        sessionId: String?,
    ): Span {
        val span = tracer.spanBuilder(name).setParent(Context.current()).startSpan()
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "chat")
        span.setAttribute(AttributeKey.stringKey("gen_ai.system"), system)
        span.setAttribute(AttributeKey.stringKey("gen_ai.request.model"), model)
        serviceName?.let { span.setAttribute(AttributeKey.stringKey("service.name"), it) }
        sessionId?.let { span.setAttribute(AttributeKey.stringKey("session.id"), it) }
        return span
    }

    @JvmStatic
    fun setInput(span: Span, input: String?) {
        input?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), it) }
    }

    @JvmStatic
    fun setOutput(span: Span, output: String?) {
        output?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.completion"), it) }
    }

    @JvmStatic
    fun setOutputMessages(span: Span, messagesJson: String?) {
        messagesJson?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.output.messages"), it) }
    }

    @JvmStatic
    fun setInputMessages(span: Span, messagesJson: String?) {
        messagesJson?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.input.messages"), it) }
    }

    @JvmStatic
    fun setTokenUsage(span: Span, inputTokens: Int, outputTokens: Int) {
        span.setAttribute(AttributeKey.longKey("gen_ai.usage.input_tokens"), inputTokens.toLong())
        span.setAttribute(AttributeKey.longKey("gen_ai.usage.output_tokens"), outputTokens.toLong())
    }

    @JvmStatic
    fun createToolSpan(
        tracer: Tracer,
        name: String,
        toolName: String,
        serviceName: String?,
        sessionId: String?,
    ): Span {
        val span = tracer.spanBuilder(name).setParent(Context.current()).startSpan()
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "tool")
        span.setAttribute(AttributeKey.stringKey("tool.name"), toolName)
        serviceName?.let { span.setAttribute(AttributeKey.stringKey("service.name"), it) }
        sessionId?.let { span.setAttribute(AttributeKey.stringKey("session.id"), it) }
        return span
    }

    @JvmStatic
    fun createRetrievalSpan(
        tracer: Tracer,
        name: String,
        serviceName: String?,
        sessionId: String?,
    ): Span {
        val span = tracer.spanBuilder(name).setParent(Context.current()).startSpan()
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "retrieval")
        serviceName?.let { span.setAttribute(AttributeKey.stringKey("service.name"), it) }
        sessionId?.let { span.setAttribute(AttributeKey.stringKey("session.id"), it) }
        return span
    }

    @JvmStatic
    fun createChainSpan(
        tracer: Tracer,
        name: String,
        serviceName: String?,
        sessionId: String?,
    ): Span {
        val span = tracer.spanBuilder(name).setParent(Context.current()).startSpan()
        span.setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), "chat")
        serviceName?.let { span.setAttribute(AttributeKey.stringKey("service.name"), it) }
        sessionId?.let { span.setAttribute(AttributeKey.stringKey("session.id"), it) }
        return span
    }
}
