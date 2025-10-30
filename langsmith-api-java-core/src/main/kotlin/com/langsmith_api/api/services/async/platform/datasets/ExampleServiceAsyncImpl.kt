// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.multipartFormData
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.platform.datasets.examples.ExampleHardDeleteParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleHardDeleteResponse
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUpdateParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUpdateResponse
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUploadParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ExampleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleServiceAsync {

    private val withRawResponse: ExampleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExampleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleServiceAsync =
        ExampleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleUpdateResponse> =
        // patch /v1/platform/datasets/{dataset_id}/examples
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun hardDelete(
        params: ExampleHardDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleHardDeleteResponse> =
        // post /v1/platform/datasets/examples/delete
        withRawResponse().hardDelete(params, requestOptions).thenApply { it.parse() }

    override fun upload(
        params: ExampleUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleUploadResponse> =
        // post /v1/platform/datasets/{dataset_id}/examples
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExampleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleServiceAsync.WithRawResponse =
            ExampleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ExampleUpdateResponse> =
            jsonHandler<ExampleUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "datasets", params._pathParam(0), "examples")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val hardDeleteHandler: Handler<ExampleHardDeleteResponse> =
            jsonHandler<ExampleHardDeleteResponse>(clientOptions.jsonMapper)

        override fun hardDelete(
            params: ExampleHardDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleHardDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "datasets", "examples", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { hardDeleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadHandler: Handler<ExampleUploadResponse> =
            jsonHandler<ExampleUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: ExampleUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleUploadResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "datasets", params._pathParam(0), "examples")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
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
