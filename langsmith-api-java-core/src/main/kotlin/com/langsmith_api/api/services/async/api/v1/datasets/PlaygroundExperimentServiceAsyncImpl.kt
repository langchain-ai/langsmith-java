// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

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
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentBatchParams
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentBatchResponse
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentStreamParams
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentStreamResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PlaygroundExperimentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PlaygroundExperimentServiceAsync {

    private val withRawResponse: PlaygroundExperimentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaygroundExperimentServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PlaygroundExperimentServiceAsync =
        PlaygroundExperimentServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun batch(
        params: PlaygroundExperimentBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundExperimentBatchResponse> =
        // post /api/v1/datasets/playground_experiment/batch
        withRawResponse().batch(params, requestOptions).thenApply { it.parse() }

    override fun stream(
        params: PlaygroundExperimentStreamParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundExperimentStreamResponse> =
        // post /api/v1/datasets/playground_experiment/stream
        withRawResponse().stream(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaygroundExperimentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaygroundExperimentServiceAsync.WithRawResponse =
            PlaygroundExperimentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchHandler: Handler<PlaygroundExperimentBatchResponse> =
            jsonHandler<PlaygroundExperimentBatchResponse>(clientOptions.jsonMapper)

        override fun batch(
            params: PlaygroundExperimentBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundExperimentBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "playground_experiment", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val streamHandler: Handler<PlaygroundExperimentStreamResponse> =
            jsonHandler<PlaygroundExperimentStreamResponse>(clientOptions.jsonMapper)

        override fun stream(
            params: PlaygroundExperimentStreamParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundExperimentStreamResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "playground_experiment", "stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { streamHandler.handle(it) }
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
