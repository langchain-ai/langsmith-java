// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_

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
import com.langsmith_api.api.models.api.v1.examples.Example
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleListParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRetrieveCountParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRunsParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRunsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExampleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleServiceAsync {

    private val withRawResponse: ExampleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExampleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleServiceAsync =
        ExampleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ExampleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Example>> =
        // get /api/v1/public/{share_token}/examples
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCount(
        params: ExampleRetrieveCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Long> =
        // get /api/v1/public/{share_token}/examples/count
        withRawResponse().retrieveCount(params, requestOptions).thenApply { it.parse() }

    override fun runs(
        params: ExampleRunsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleRunsResponse> =
        // post /api/v1/public/{share_token}/examples/runs
        withRawResponse().runs(params, requestOptions).thenApply { it.parse() }

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

        private val listHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun list(
            params: ExampleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Example>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", params._pathParam(0), "examples")
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

        private val retrieveCountHandler: Handler<Long> =
            jsonHandler<Long>(clientOptions.jsonMapper)

        override fun retrieveCount(
            params: ExampleRetrieveCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Long>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "examples",
                        "count",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveCountHandler.handle(it) }
                    }
                }
        }

        private val runsHandler: Handler<ExampleRunsResponse> =
            jsonHandler<ExampleRunsResponse>(clientOptions.jsonMapper)

        override fun runs(
            params: ExampleRunsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleRunsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "examples",
                        "runs",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { runsHandler.handle(it) }
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
