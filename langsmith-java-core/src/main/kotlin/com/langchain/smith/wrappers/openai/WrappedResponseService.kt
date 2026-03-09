package com.langchain.smith.wrappers.openai

import com.openai.core.ClientOptions
import com.openai.core.RequestOptions
import com.openai.core.http.StreamResponse
import com.openai.helpers.ResponseAccumulator
import com.openai.models.responses.Response
import com.openai.models.responses.ResponseCreateParams
import com.openai.models.responses.ResponseStreamEvent
import com.openai.models.responses.StructuredResponse
import com.openai.models.responses.StructuredResponseCreateParams
import com.openai.services.blocking.ResponseService
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import java.util.function.Consumer
import java.util.stream.Stream
import kotlin.jvm.optionals.getOrNull

/** Wrapped ResponseService that adds OpenTelemetry tracing to response operations. */
internal class WrappedResponseService(private val delegate: ResponseService) : ResponseService {

    override fun withRawResponse() = delegate.withRawResponse()

    override fun withOptions(options: Consumer<ClientOptions.Builder>) =
        WrappedResponseService(delegate.withOptions(options))

    override fun inputItems() = delegate.inputItems()

    override fun inputTokens() = delegate.inputTokens()

    override fun create(): Response = createResponse(null, null)

    override fun create(requestOptions: RequestOptions): Response =
        createResponse(null, requestOptions)

    override fun create(params: ResponseCreateParams): Response = createResponse(params, null)

    override fun create(params: ResponseCreateParams, requestOptions: RequestOptions): Response =
        createResponse(params, requestOptions)

    private fun createResponse(
        params: ResponseCreateParams?,
        requestOptions: RequestOptions?,
    ): Response {
        val model =
            if (params != null && params.model().isPresent) params.model().toString() else null
        val span = TracingUtils.createSpanBuilder(model, "response").startSpan()
        try {
            span.makeCurrent().use {
                setExperimentContextAttributes(span)
                TracingUtils.setRequestAttributes(span, model)
                if (params != null) {
                    TracingUtils.setRequestParameters(
                        span,
                        params.temperature().orElse(null),
                        params.topP().orElse(null),
                        null,
                    )
                }
                val result =
                    when {
                        params == null && requestOptions == null -> delegate.create()
                        params == null -> delegate.create(requestOptions!!)
                        requestOptions == null -> delegate.create(params)
                        else -> delegate.create(params, requestOptions)
                    }
                TracingUtils.setResponseMetadata(span, model, null)
                result.usage().ifPresent { usage ->
                    TracingUtils.setResponseAttributes(
                        span,
                        usage.inputTokens().toLong(),
                        usage.outputTokens().toLong(),
                        usage.totalTokens().toLong(),
                    )
                }
                result.status()?.let {
                    span.setAttribute(
                        AttributeKey.stringKey("gen_ai.response.status"),
                        it.toString(),
                    )
                }
                return result
            }
        } catch (e: Exception) {
            TracingUtils.recordException(span, e)
            throw e
        } finally {
            span.end()
        }
    }

    override fun <T : Any> create(
        params: StructuredResponseCreateParams<T>
    ): StructuredResponse<T> = createStructured(params, null)

    override fun <T : Any> create(
        params: StructuredResponseCreateParams<T>,
        requestOptions: RequestOptions,
    ): StructuredResponse<T> = createStructured(params, requestOptions)

    private fun <T : Any> createStructured(
        params: StructuredResponseCreateParams<T>,
        requestOptions: RequestOptions?,
    ): StructuredResponse<T> {
        val model =
            if (params.rawParams != null && params.rawParams!!.model() != null)
                params.rawParams!!.model().toString()
            else null
        val span = TracingUtils.createSpanBuilder(model, "response").startSpan()
        try {
            span.makeCurrent().use {
                setExperimentContextAttributes(span)
                TracingUtils.setRequestAttributes(span, model)
                if (params.rawParams != null) {
                    val raw = params.rawParams!!
                    TracingUtils.setRequestParameters(
                        span,
                        raw.temperature().orElse(null),
                        raw.topP().orElse(null),
                        null,
                    )
                }
                val result =
                    if (requestOptions == null) delegate.create(params)
                    else delegate.create(params, requestOptions)
                TracingUtils.setResponseMetadata(span, model, null)
                result.usage().ifPresent { usage ->
                    TracingUtils.setResponseAttributes(
                        span,
                        usage.inputTokens().toLong(),
                        usage.outputTokens().toLong(),
                        usage.totalTokens().toLong(),
                    )
                }
                return result
            }
        } catch (e: Exception) {
            TracingUtils.recordException(span, e)
            throw e
        } finally {
            span.end()
        }
    }

    override fun createStreaming(): StreamResponse<ResponseStreamEvent> =
        createStreamingResponse(null, null)

    override fun createStreaming(
        requestOptions: RequestOptions
    ): StreamResponse<ResponseStreamEvent> = createStreamingResponse(null, requestOptions)

    override fun createStreaming(
        params: ResponseCreateParams
    ): StreamResponse<ResponseStreamEvent> = createStreamingResponse(params, null)

    override fun createStreaming(
        params: ResponseCreateParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ResponseStreamEvent> = createStreamingResponse(params, requestOptions)

    private fun createStreamingResponse(
        params: ResponseCreateParams?,
        requestOptions: RequestOptions?,
    ): StreamResponse<ResponseStreamEvent> {
        val model =
            if (params != null && params.model() != null) params.model().toString() else null
        val span = TracingUtils.createSpanBuilder(model, "response").startSpan()
        try {
            span.makeCurrent().use {
                setExperimentContextAttributes(span)
                TracingUtils.setRequestAttributes(span, model)
                span.setAttribute(AttributeKey.booleanKey("gen_ai.streaming"), true)
                if (params != null) {
                    TracingUtils.setRequestParameters(
                        span,
                        params.temperature().orElse(null),
                        params.topP().orElse(null),
                        null,
                    )
                }
                val accumulator = ResponseAccumulator.create()
                val delegateStream =
                    when {
                        params == null && requestOptions == null -> delegate.createStreaming()
                        params == null -> delegate.createStreaming(requestOptions!!)
                        requestOptions == null -> delegate.createStreaming(params)
                        else -> delegate.createStreaming(params, requestOptions)
                    }
                return TracedResponseStreamResponse(span, accumulator, delegateStream)
            }
        } catch (e: Exception) {
            TracingUtils.recordException(span, e)
            span.end()
            throw e
        }
    }

    override fun createStreaming(
        params: StructuredResponseCreateParams<*>
    ): StreamResponse<ResponseStreamEvent> = createStreamingStructured(params, null)

    override fun createStreaming(
        params: StructuredResponseCreateParams<*>,
        requestOptions: RequestOptions,
    ): StreamResponse<ResponseStreamEvent> = createStreamingStructured(params, requestOptions)

    private fun createStreamingStructured(
        params: StructuredResponseCreateParams<*>?,
        requestOptions: RequestOptions?,
    ): StreamResponse<ResponseStreamEvent> {
        val model =
            if (params != null && params.rawParams != null && params.rawParams!!.model() != null)
                params.rawParams!!.model().toString()
            else null
        val span = TracingUtils.createSpanBuilder(model, "response").startSpan()
        try {
            span.makeCurrent().use {
                setExperimentContextAttributes(span)
                TracingUtils.setRequestAttributes(span, model)
                span.setAttribute(AttributeKey.booleanKey("gen_ai.streaming"), true)
                if (params != null && params.rawParams != null) {
                    val raw = params.rawParams!!
                    TracingUtils.setRequestParameters(
                        span,
                        raw.temperature().orElse(null),
                        raw.topP().orElse(null),
                        null,
                    )
                }
                val accumulator = ResponseAccumulator.create()
                val delegateStream =
                    when {
                        requestOptions == null -> delegate.createStreaming(params!!)
                        else -> delegate.createStreaming(params!!, requestOptions)
                    }
                return TracedResponseStreamResponse(span, accumulator, delegateStream)
            }
        } catch (e: Exception) {
            TracingUtils.recordException(span, e)
            span.end()
            throw e
        }
    }

    private fun setExperimentContextAttributes(span: Span) {
        ExperimentContext.current()
            .getReferenceExampleId()
            .filter { it.isNotEmpty() }
            .ifPresent {
                span.setAttribute(AttributeKey.stringKey("langsmith.reference_example_id"), it)
            }
        ExperimentContext.current()
            .getSessionId()
            .filter { it.isNotEmpty() }
            .ifPresent {
                span.setAttribute(AttributeKey.stringKey("langsmith.trace.session_id"), it)
            }
        for ((key, value) in ExperimentContext.current().getMetadata()) {
            span.setAttribute(AttributeKey.stringKey("langsmith.metadata.$key"), value)
        }
    }

    override fun retrieve(responseId: String) = delegate.retrieve(responseId)

    override fun retrieve(responseId: String, requestOptions: RequestOptions) =
        delegate.retrieve(responseId, requestOptions)

    override fun retrieve(
        responseId: String,
        params: com.openai.models.responses.ResponseRetrieveParams,
    ) = delegate.retrieve(responseId, params)

    override fun retrieve(
        responseId: String,
        params: com.openai.models.responses.ResponseRetrieveParams,
        requestOptions: RequestOptions,
    ) = delegate.retrieve(responseId, params, requestOptions)

    override fun retrieve(params: com.openai.models.responses.ResponseRetrieveParams) =
        delegate.retrieve(params)

    override fun retrieve(
        params: com.openai.models.responses.ResponseRetrieveParams,
        requestOptions: RequestOptions,
    ) = delegate.retrieve(params, requestOptions)

    override fun retrieveStreaming(responseId: String) = delegate.retrieveStreaming(responseId)

    override fun retrieveStreaming(responseId: String, requestOptions: RequestOptions) =
        delegate.retrieveStreaming(responseId, requestOptions)

    override fun retrieveStreaming(
        responseId: String,
        params: com.openai.models.responses.ResponseRetrieveParams,
    ) = delegate.retrieveStreaming(responseId, params)

    override fun retrieveStreaming(
        responseId: String,
        params: com.openai.models.responses.ResponseRetrieveParams,
        requestOptions: RequestOptions,
    ) = delegate.retrieveStreaming(responseId, params, requestOptions)

    override fun retrieveStreaming(params: com.openai.models.responses.ResponseRetrieveParams) =
        delegate.retrieveStreaming(params)

    override fun retrieveStreaming(
        params: com.openai.models.responses.ResponseRetrieveParams,
        requestOptions: RequestOptions,
    ) = delegate.retrieveStreaming(params, requestOptions)

    override fun delete(responseId: String) = delegate.delete(responseId)

    override fun delete(responseId: String, requestOptions: RequestOptions) =
        delegate.delete(responseId, requestOptions)

    override fun delete(
        responseId: String,
        params: com.openai.models.responses.ResponseDeleteParams,
    ) = delegate.delete(responseId, params)

    override fun delete(
        responseId: String,
        params: com.openai.models.responses.ResponseDeleteParams,
        requestOptions: RequestOptions,
    ) = delegate.delete(responseId, params, requestOptions)

    override fun delete(params: com.openai.models.responses.ResponseDeleteParams) =
        delegate.delete(params)

    override fun delete(
        params: com.openai.models.responses.ResponseDeleteParams,
        requestOptions: RequestOptions,
    ) = delegate.delete(params, requestOptions)

    override fun cancel(responseId: String) = delegate.cancel(responseId)

    override fun cancel(responseId: String, requestOptions: RequestOptions) =
        delegate.cancel(responseId, requestOptions)

    override fun cancel(
        responseId: String,
        params: com.openai.models.responses.ResponseCancelParams,
    ) = delegate.cancel(responseId, params)

    override fun cancel(
        responseId: String,
        params: com.openai.models.responses.ResponseCancelParams,
        requestOptions: RequestOptions,
    ) = delegate.cancel(responseId, params, requestOptions)

    override fun cancel(params: com.openai.models.responses.ResponseCancelParams) =
        delegate.cancel(params)

    override fun cancel(
        params: com.openai.models.responses.ResponseCancelParams,
        requestOptions: RequestOptions,
    ) = delegate.cancel(params, requestOptions)
}

/**
 * Wraps a streaming Responses API stream so that completion/usage are applied to the span from the
 * response.completed (or terminal) event, and the span is ended when the stream is closed.
 */
private class TracedResponseStreamResponse(
    private val span: Span,
    private val accumulator: ResponseAccumulator,
    private val delegate: StreamResponse<ResponseStreamEvent>,
) : StreamResponse<ResponseStreamEvent> {

    @Volatile private var closed = false

    override fun stream(): Stream<ResponseStreamEvent> =
        delegate.stream().map { event ->
            try {
                accumulator.accumulate(event)
            } catch (_: IllegalStateException) {
                // Terminal event already accumulated; ignore duplicate or late events
            }
            event
        }

    override fun close() {
        if (closed) return
        closed = true
        try {
            try {
                val resp = accumulator.response()
                resp.usage().ifPresent { u ->
                    TracingUtils.setResponseAttributes(
                        span,
                        u.inputTokens().toLong(),
                        u.outputTokens().toLong(),
                        u.totalTokens().toLong(),
                    )
                }
                resp.status().getOrNull()?.let {
                    span.setAttribute(
                        AttributeKey.stringKey("gen_ai.response.status"),
                        it.toString(),
                    )
                }
            } catch (_: IllegalStateException) {
                // Stream closed before a terminal event (completed/incomplete/failed)
            }
        } finally {
            span.end()
            try {
                delegate.close()
            } catch (_: Exception) {
                // Already ended span; ensure delegate is closed best-effort
            }
        }
    }
}
