// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentBatchParams
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentBatchResponse
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentStreamParams
import com.langchain.smith.models.datasets.playgroundexperiment.PlaygroundExperimentStreamResponse
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
