// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasParams
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasResponse
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptParams
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PromptServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptServiceAsync {

    private val withRawResponse: PromptServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptServiceAsync =
        PromptServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun canvas(
        params: PromptCanvasParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptCanvasResponse> =
        // post /api/v1/prompts/canvas
        withRawResponse().canvas(params, requestOptions).thenApply { it.parse() }

    override fun invokePrompt(
        params: PromptInvokePromptParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptInvokePromptResponse> =
        // post /api/v1/prompts/invoke_prompt
        withRawResponse().invokePrompt(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptServiceAsync.WithRawResponse =
            PromptServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val canvasHandler: Handler<PromptCanvasResponse> =
            jsonHandler<PromptCanvasResponse>(clientOptions.jsonMapper)

        override fun canvas(
            params: PromptCanvasParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptCanvasResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompts", "canvas")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { canvasHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val invokePromptHandler: Handler<PromptInvokePromptResponse> =
            jsonHandler<PromptInvokePromptResponse>(clientOptions.jsonMapper)

        override fun invokePrompt(
            params: PromptInvokePromptParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptInvokePromptResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompts", "invoke_prompt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { invokePromptHandler.handle(it) }
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
