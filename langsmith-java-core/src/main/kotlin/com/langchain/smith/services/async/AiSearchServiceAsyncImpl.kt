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
import com.langchain.smith.models.aisearch.AiSearchParseParams
import com.langchain.smith.models.aisearch.AiSearchParseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AiSearchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AiSearchServiceAsync {

    private val withRawResponse: AiSearchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AiSearchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiSearchServiceAsync =
        AiSearchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun parse(
        params: AiSearchParseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiSearchParseResponse> =
        // post /api/v2/ai-search/parse
        withRawResponse().parse(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiSearchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiSearchServiceAsync.WithRawResponse =
            AiSearchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val parseHandler: Handler<AiSearchParseResponse> =
            jsonHandler<AiSearchParseResponse>(clientOptions.jsonMapper)

        override fun parse(
            params: AiSearchParseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiSearchParseResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "ai-search", "parse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { parseHandler.handle(it) }
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
