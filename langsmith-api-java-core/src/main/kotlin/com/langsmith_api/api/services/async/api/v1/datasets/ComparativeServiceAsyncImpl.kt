// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeCreateParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeCreateResponse
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeDeleteParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeDeleteResponse
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeListParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.ComparativeListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ComparativeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ComparativeServiceAsync {

    private val withRawResponse: ComparativeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ComparativeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComparativeServiceAsync =
        ComparativeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ComparativeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ComparativeCreateResponse> =
        // post /api/v1/datasets/comparative
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ComparativeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ComparativeListResponse>> =
        // get /api/v1/datasets/{dataset_id}/comparative
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ComparativeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ComparativeDeleteResponse> =
        // delete /api/v1/datasets/comparative/{comparative_experiment_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ComparativeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComparativeServiceAsync.WithRawResponse =
            ComparativeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ComparativeCreateResponse> =
            jsonHandler<ComparativeCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ComparativeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ComparativeCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "comparative")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<ComparativeListResponse>> =
            jsonHandler<List<ComparativeListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ComparativeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ComparativeListResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "comparative")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ComparativeDeleteResponse> =
            jsonHandler<ComparativeDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ComparativeDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ComparativeDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("comparativeExperimentId", params.comparativeExperimentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "comparative", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
