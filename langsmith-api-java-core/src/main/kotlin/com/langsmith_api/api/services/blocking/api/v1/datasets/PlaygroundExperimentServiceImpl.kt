// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

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
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentBatchParams
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentBatchResponse
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentStreamParams
import com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment.PlaygroundExperimentStreamResponse
import java.util.function.Consumer

class PlaygroundExperimentServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PlaygroundExperimentService {

    private val withRawResponse: PlaygroundExperimentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaygroundExperimentService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PlaygroundExperimentService =
        PlaygroundExperimentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(
        params: PlaygroundExperimentBatchParams,
        requestOptions: RequestOptions,
    ): PlaygroundExperimentBatchResponse =
        // post /api/v1/datasets/playground_experiment/batch
        withRawResponse().batch(params, requestOptions).parse()

    override fun stream(
        params: PlaygroundExperimentStreamParams,
        requestOptions: RequestOptions,
    ): PlaygroundExperimentStreamResponse =
        // post /api/v1/datasets/playground_experiment/stream
        withRawResponse().stream(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaygroundExperimentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaygroundExperimentService.WithRawResponse =
            PlaygroundExperimentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchHandler: Handler<PlaygroundExperimentBatchResponse> =
            jsonHandler<PlaygroundExperimentBatchResponse>(clientOptions.jsonMapper)

        override fun batch(
            params: PlaygroundExperimentBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaygroundExperimentBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "playground_experiment", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val streamHandler: Handler<PlaygroundExperimentStreamResponse> =
            jsonHandler<PlaygroundExperimentStreamResponse>(clientOptions.jsonMapper)

        override fun stream(
            params: PlaygroundExperimentStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaygroundExperimentStreamResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "playground_experiment", "stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
