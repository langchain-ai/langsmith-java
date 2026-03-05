package com.langchain.smith.wrappers.openai

import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.SpanBuilder
import io.opentelemetry.api.trace.SpanKind
import io.opentelemetry.api.trace.Tracer

/** Internal utility for OpenTelemetry span creation and management. */
internal object TracingUtils {
    private const val INSTRUMENTATION_NAME = "langsmith-java-otel-wrappers"

    fun getTracer(): Tracer =
        io.opentelemetry.api.GlobalOpenTelemetry.get().getTracer(INSTRUMENTATION_NAME)

    fun createSpanBuilder(
        model: String?,
        operationType: String,
        spanKind: String? = "llm",
    ): SpanBuilder {
        val tracer = getTracer()
        val spanName = "$operationType ${model ?: "unknown"}"
        val builder =
            tracer
                .spanBuilder(spanName)
                .setSpanKind(SpanKind.CLIENT)
                .setAttribute(AttributeKey.stringKey("gen_ai.system"), "openai")
                .setAttribute(AttributeKey.stringKey("gen_ai.operation.name"), operationType)
                .setAttribute(AttributeKey.stringKey("gen_ai.provider.name"), "openai")
        spanKind?.let { builder.setAttribute(AttributeKey.stringKey("langsmith.span.kind"), it) }
        return builder
    }

    fun setRequestAttributes(span: Span, model: String?) {
        model?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.request.model"), it) }
    }

    fun setRequestParameters(span: Span, temperature: Double?, topP: Double?, maxTokens: Long?) {
        temperature?.let {
            span.setAttribute(AttributeKey.doubleKey("gen_ai.request.temperature"), it)
        }
        topP?.let { span.setAttribute(AttributeKey.doubleKey("gen_ai.request.top_p"), it) }
        maxTokens?.let { span.setAttribute(AttributeKey.longKey("gen_ai.request.max_tokens"), it) }
    }

    fun setInputMessages(span: Span, messagesJson: String?) {
        messagesJson?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.input.messages"), it) }
    }

    fun setOutputMessages(span: Span, messagesJson: String?) {
        messagesJson?.let {
            span.setAttribute(AttributeKey.stringKey("gen_ai.output.messages"), it)
        }
    }

    fun setResponseAttributes(
        span: Span,
        inputTokens: Long?,
        outputTokens: Long?,
        totalTokens: Long?,
    ) {
        inputTokens?.let {
            span.setAttribute(AttributeKey.longKey("gen_ai.usage.input_tokens"), it)
        }
        outputTokens?.let {
            span.setAttribute(AttributeKey.longKey("gen_ai.usage.output_tokens"), it)
        }
        totalTokens?.let {
            span.setAttribute(AttributeKey.longKey("gen_ai.usage.total_tokens"), it)
        }
    }

    fun setResponseMetadata(span: Span, responseModel: String?, finishReason: String?) {
        responseModel?.let {
            span.setAttribute(AttributeKey.stringKey("gen_ai.response.model"), it)
        }
        finishReason?.let {
            span.setAttribute(AttributeKey.stringKey("gen_ai.response.finish_reason"), it)
        }
    }

    fun recordException(span: Span, exception: Throwable) {
        span.recordException(exception)
        span.setAttribute(AttributeKey.booleanKey("error"), true)
    }

    fun escapeJsonString(str: String?): String =
        str?.replace("\\", "\\\\")
            ?.replace("\"", "\\\"")
            ?.replace("\n", "\\n")
            ?.replace("\r", "\\r")
            ?.replace("\t", "\\t") ?: ""
}
