// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasParams
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasResponse
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptParams
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptResponse
import java.util.function.Consumer

class PromptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptService {

    private val withRawResponse: PromptService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptService =
        PromptServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun canvas(
        params: PromptCanvasParams,
        requestOptions: RequestOptions,
    ): PromptCanvasResponse =
        // post /api/v1/prompts/canvas
        withRawResponse().canvas(params, requestOptions).parse()

    override fun invokePrompt(
        params: PromptInvokePromptParams,
        requestOptions: RequestOptions,
    ): PromptInvokePromptResponse =
        // post /api/v1/prompts/invoke_prompt
        withRawResponse().invokePrompt(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptService.WithRawResponse =
            PromptServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val canvasHandler: Handler<PromptCanvasResponse> =
            jsonHandler<PromptCanvasResponse>(clientOptions.jsonMapper)

        override fun canvas(
            params: PromptCanvasParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptCanvasResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompts", "canvas")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { canvasHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val invokePromptHandler: Handler<PromptInvokePromptResponse> =
            jsonHandler<PromptInvokePromptResponse>(clientOptions.jsonMapper)

        override fun invokePrompt(
            params: PromptInvokePromptParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptInvokePromptResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompts", "invoke_prompt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
