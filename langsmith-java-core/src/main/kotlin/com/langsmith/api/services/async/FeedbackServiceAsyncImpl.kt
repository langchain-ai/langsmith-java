// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.FeedbackCreateParams
import com.langsmith.api.models.FeedbackDeleteParams
import com.langsmith.api.models.FeedbackDeleteResponse
import com.langsmith.api.models.FeedbackEagerParams
import com.langsmith.api.models.FeedbackListParams
import com.langsmith.api.models.FeedbackRetrieveParams
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.FeedbackUpdateParams
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class FeedbackServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FeedbackServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<FeedbackSchema> =
        jsonHandler<FeedbackSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new feedback. */
    override fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FeedbackSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("feedback")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<FeedbackSchema> =
        jsonHandler<FeedbackSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific feedback. */
    override fun retrieve(
        params: FeedbackRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FeedbackSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("feedback", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<FeedbackSchema> =
        jsonHandler<FeedbackSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Replace an existing feedback entry with a new, modified entry. */
    override fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FeedbackSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("feedback", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<FeedbackSchema>> =
        jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all Feedback by query params. */
    override fun list(
        params: FeedbackListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<List<FeedbackSchema>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("feedback")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val deleteHandler: Handler<FeedbackDeleteResponse> =
        jsonHandler<FeedbackDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a feedback. */
    override fun delete(
        params: FeedbackDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FeedbackDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("feedback", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val eagerHandler: Handler<FeedbackSchema> =
        jsonHandler<FeedbackSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new feedback.
     *
     * This method is invoked under the assumption that the run is already visible in the app, thus
     * already present in DB
     */
    override fun eager(
        params: FeedbackEagerParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FeedbackSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("feedback", "eager")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { eagerHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
