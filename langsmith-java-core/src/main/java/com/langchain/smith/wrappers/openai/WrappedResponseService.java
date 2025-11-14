package com.langchain.smith.wrappers.openai;

import com.openai.core.ClientOptions;
import com.openai.core.RequestOptions;
import com.openai.core.http.StreamResponse;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;
import com.openai.models.responses.ResponseStreamEvent;
import com.openai.models.responses.StructuredResponse;
import com.openai.models.responses.StructuredResponseCreateParams;
import com.openai.services.blocking.ResponseService;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;
import java.util.function.Consumer;

/**
 * Wrapped ResponseService that adds OpenTelemetry tracing to response operations.
 */
class WrappedResponseService implements ResponseService {

    private final ResponseService delegate;

    WrappedResponseService(ResponseService delegate) {
        this.delegate = delegate;
    }

    @Override
    public ResponseService.WithRawResponse withRawResponse() {
        return delegate.withRawResponse();
    }

    @Override
    public ResponseService withOptions(Consumer<ClientOptions.Builder> options) {
        return new WrappedResponseService(delegate.withOptions(options));
    }

    @Override
    public com.openai.services.blocking.responses.InputItemService inputItems() {
        return delegate.inputItems();
    }

    @Override
    public com.openai.services.blocking.responses.InputTokenService inputTokens() {
        return delegate.inputTokens();
    }

    @Override
    public Response create() {
        return create((ResponseCreateParams) null, null);
    }

    @Override
    public Response create(RequestOptions requestOptions) {
        return create((ResponseCreateParams) null, requestOptions);
    }

    @Override
    public Response create(ResponseCreateParams params) {
        return create(params, null);
    }

    @Override
    public Response create(ResponseCreateParams params, RequestOptions requestOptions) {
        // Extract model from params
        String model = params != null && params.model() != null ? params.model().toString() : "unknown";

        Span span = TracingUtils.createSpanBuilder(model, "response").startSpan();

        try (Scope scope = span.makeCurrent()) {
            // Set experiment context attributes if present
            setExperimentContextAttributes(span);

            // Set request attributes (core attributes already set on builder)
            TracingUtils.setRequestAttributes(span, model);

            // Set request parameters if available (handle Optional types)
            if (params != null) {
                Double temperature = params.temperature().orElse(null);
                Double topP = params.topP().orElse(null);
                TracingUtils.setRequestParameters(span, temperature, topP, null);
            }

            Response result;
            // If requestOptions is null, use the single-parameter version
            if (requestOptions == null) {
                result = delegate.create(params);
            } else {
                result = delegate.create(params, requestOptions);
            }

            // Extract response model (simplified - just use the request model)
            TracingUtils.setResponseMetadata(span, model, null);

            // Extract usage information from result
            if (result.usage().isPresent()) {
                com.openai.models.responses.ResponseUsage usage = result.usage().get();
                TracingUtils.setResponseAttributes(
                        span, (long) usage.inputTokens(), (long) usage.outputTokens(), (long) usage.totalTokens());
            }

            if (result.status() != null) {
                span.setAttribute("gen_ai.response.status", result.status().toString());
            }

            return result;
        } catch (Exception e) {
            TracingUtils.recordException(span, e);
            throw e;
        } finally {
            span.end();
        }
    }

    @Override
    public <T> StructuredResponse<T> create(StructuredResponseCreateParams<T> params) {
        return create(params, null);
    }

    @Override
    public <T> StructuredResponse<T> create(StructuredResponseCreateParams<T> params, RequestOptions requestOptions) {
        // Get model from rawParams
        String model = params != null
                        && params.rawParams() != null
                        && params.rawParams().model() != null
                ? params.rawParams().model().toString()
                : "unknown";

        Span span = TracingUtils.createSpanBuilder(model, "response").startSpan();

        try (Scope scope = span.makeCurrent()) {
            // Set experiment context attributes if present
            setExperimentContextAttributes(span);

            // Set request attributes (core attributes already set on builder)
            TracingUtils.setRequestAttributes(span, model);

            // Set request parameters if available (handle Optional types)
            if (params != null && params.rawParams() != null) {
                Double temperature = params.rawParams().temperature().orElse(null);
                Double topP = params.rawParams().topP().orElse(null);
                TracingUtils.setRequestParameters(span, temperature, topP, null);
            }

            StructuredResponse<T> result;
            // If requestOptions is null, use the single-parameter version
            if (requestOptions == null) {
                result = delegate.create(params);
            } else {
                result = delegate.create(params, requestOptions);
            }

            // Extract response model (simplified - just use the request model)
            TracingUtils.setResponseMetadata(span, model, null);

            if (result.usage().isPresent()) {
                com.openai.models.responses.ResponseUsage usage = result.usage().get();
                TracingUtils.setResponseAttributes(
                        span, (long) usage.inputTokens(), (long) usage.outputTokens(), (long) usage.totalTokens());
            }

            return result;
        } catch (Exception e) {
            TracingUtils.recordException(span, e);
            throw e;
        } finally {
            span.end();
        }
    }

    @Override
    public StreamResponse<ResponseStreamEvent> createStreaming() {
        return createStreaming((ResponseCreateParams) null, null);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> createStreaming(RequestOptions requestOptions) {
        return createStreaming((ResponseCreateParams) null, requestOptions);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> createStreaming(ResponseCreateParams params) {
        return createStreaming(params, null);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> createStreaming(
            ResponseCreateParams params, RequestOptions requestOptions) {
        String model = params != null && params.model() != null ? params.model().toString() : "unknown";

        Span span = TracingUtils.createSpanBuilder(model, "response").startSpan();

        try (Scope scope = span.makeCurrent()) {
            // Set experiment context attributes if present
            setExperimentContextAttributes(span);

            // Set request attributes (core attributes already set on builder)
            TracingUtils.setRequestAttributes(span, model);
            span.setAttribute("gen_ai.streaming", true);

            // Set request parameters if available (handle Optional types)
            if (params != null) {
                Double temperature = params.temperature().orElse(null);
                Double topP = params.topP().orElse(null);
                TracingUtils.setRequestParameters(span, temperature, topP, null);
            }

            StreamResponse<ResponseStreamEvent> result;
            // If requestOptions is null, use the single-parameter version
            if (requestOptions == null) {
                result = delegate.createStreaming(params);
            } else {
                result = delegate.createStreaming(params, requestOptions);
            }

            return result;
        } catch (Exception e) {
            TracingUtils.recordException(span, e);
            throw e;
        } finally {
            // Note: For streaming, the span will end immediately
            span.end();
        }
    }

    @Override
    public StreamResponse<ResponseStreamEvent> createStreaming(StructuredResponseCreateParams<?> params) {
        return createStreaming(params, null);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> createStreaming(
            StructuredResponseCreateParams<?> params, RequestOptions requestOptions) {
        // Get model from rawParams
        String model = params != null
                        && params.rawParams() != null
                        && params.rawParams().model() != null
                ? params.rawParams().model().toString()
                : "unknown";

        Span span = TracingUtils.createSpanBuilder(model, "response").startSpan();

        try (Scope scope = span.makeCurrent()) {
            // Set experiment context attributes if present
            setExperimentContextAttributes(span);

            // Set request attributes (core attributes already set on builder)
            TracingUtils.setRequestAttributes(span, model);
            span.setAttribute("gen_ai.streaming", true);

            // Set request parameters if available (handle Optional types)
            if (params != null && params.rawParams() != null) {
                Double temperature = params.rawParams().temperature().orElse(null);
                Double topP = params.rawParams().topP().orElse(null);
                TracingUtils.setRequestParameters(span, temperature, topP, null);
            }

            StreamResponse<ResponseStreamEvent> result;
            // If requestOptions is null, use the single-parameter version
            if (requestOptions == null) {
                result = delegate.createStreaming(params);
            } else {
                result = delegate.createStreaming(params, requestOptions);
            }

            return result;
        } catch (Exception e) {
            TracingUtils.recordException(span, e);
            throw e;
        } finally {
            span.end();
        }
    }

    /**
     * Sets experiment context attributes on the span if they are present.
     * This includes reference example ID, session ID, and metadata.
     *
     * @param span the span to set attributes on
     */
    private void setExperimentContextAttributes(Span span) {
        // Set reference example ID if present
        String referenceExampleId = ExperimentContext.current().getReferenceExampleId();
        if (referenceExampleId != null && !referenceExampleId.isEmpty()) {
            span.setAttribute("langsmith.reference_example_id", referenceExampleId);
        }

        // Set session ID (experiment ID) if present
        // This is critical for linking runs to experiments in the dataset's Experiments tab
        String sessionId = ExperimentContext.current().getSessionId();
        if (sessionId != null && !sessionId.isEmpty()) {
            span.setAttribute("langsmith.trace.session_id", sessionId);
        }

        // Set custom metadata
        java.util.Map<String, String> metadata = ExperimentContext.current().getMetadata();
        for (java.util.Map.Entry<String, String> entry : metadata.entrySet()) {
            span.setAttribute("langsmith.metadata." + entry.getKey(), entry.getValue());
        }
    }

    // Delegate other methods without tracing (for now)
    @Override
    public Response retrieve(String responseId) {
        return delegate.retrieve(responseId);
    }

    @Override
    public Response retrieve(String responseId, RequestOptions requestOptions) {
        return delegate.retrieve(responseId, requestOptions);
    }

    @Override
    public Response retrieve(String responseId, com.openai.models.responses.ResponseRetrieveParams params) {
        return delegate.retrieve(responseId, params);
    }

    @Override
    public Response retrieve(
            String responseId,
            com.openai.models.responses.ResponseRetrieveParams params,
            RequestOptions requestOptions) {
        return delegate.retrieve(responseId, params, requestOptions);
    }

    @Override
    public Response retrieve(com.openai.models.responses.ResponseRetrieveParams params) {
        return delegate.retrieve(params);
    }

    @Override
    public Response retrieve(com.openai.models.responses.ResponseRetrieveParams params, RequestOptions requestOptions) {
        return delegate.retrieve(params, requestOptions);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> retrieveStreaming(String responseId) {
        return delegate.retrieveStreaming(responseId);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> retrieveStreaming(String responseId, RequestOptions requestOptions) {
        return delegate.retrieveStreaming(responseId, requestOptions);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> retrieveStreaming(
            String responseId, com.openai.models.responses.ResponseRetrieveParams params) {
        return delegate.retrieveStreaming(responseId, params);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> retrieveStreaming(
            String responseId,
            com.openai.models.responses.ResponseRetrieveParams params,
            RequestOptions requestOptions) {
        return delegate.retrieveStreaming(responseId, params, requestOptions);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> retrieveStreaming(
            com.openai.models.responses.ResponseRetrieveParams params) {
        return delegate.retrieveStreaming(params);
    }

    @Override
    public StreamResponse<ResponseStreamEvent> retrieveStreaming(
            com.openai.models.responses.ResponseRetrieveParams params, RequestOptions requestOptions) {
        return delegate.retrieveStreaming(params, requestOptions);
    }

    @Override
    public void delete(String responseId) {
        delegate.delete(responseId);
    }

    @Override
    public void delete(String responseId, RequestOptions requestOptions) {
        delegate.delete(responseId, requestOptions);
    }

    @Override
    public void delete(String responseId, com.openai.models.responses.ResponseDeleteParams params) {
        delegate.delete(responseId, params);
    }

    @Override
    public void delete(
            String responseId, com.openai.models.responses.ResponseDeleteParams params, RequestOptions requestOptions) {
        delegate.delete(responseId, params, requestOptions);
    }

    @Override
    public void delete(com.openai.models.responses.ResponseDeleteParams params) {
        delegate.delete(params);
    }

    @Override
    public void delete(com.openai.models.responses.ResponseDeleteParams params, RequestOptions requestOptions) {
        delegate.delete(params, requestOptions);
    }

    @Override
    public Response cancel(String responseId) {
        return delegate.cancel(responseId);
    }

    @Override
    public Response cancel(String responseId, RequestOptions requestOptions) {
        return delegate.cancel(responseId, requestOptions);
    }

    @Override
    public Response cancel(String responseId, com.openai.models.responses.ResponseCancelParams params) {
        return delegate.cancel(responseId, params);
    }

    @Override
    public Response cancel(
            String responseId, com.openai.models.responses.ResponseCancelParams params, RequestOptions requestOptions) {
        return delegate.cancel(responseId, params, requestOptions);
    }

    @Override
    public Response cancel(com.openai.models.responses.ResponseCancelParams params) {
        return delegate.cancel(params);
    }

    @Override
    public Response cancel(com.openai.models.responses.ResponseCancelParams params, RequestOptions requestOptions) {
        return delegate.cancel(params, requestOptions);
    }
}
