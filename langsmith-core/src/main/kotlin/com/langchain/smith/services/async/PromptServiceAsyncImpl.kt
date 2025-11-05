// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.prompts.PromptCanvasParams
import com.langchain.smith.models.prompts.PromptCanvasResponse
import com.langchain.smith.models.prompts.PromptInvokePromptParams
import com.langchain.smith.models.prompts.PromptInvokePromptResponse
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
