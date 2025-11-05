// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.feedback

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
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
import com.langchain.smith.models.feedback.tokens.FeedbackIngestTokenSchema
import com.langchain.smith.models.feedback.tokens.TokenCreateParams
import com.langchain.smith.models.feedback.tokens.TokenCreateResponse
import com.langchain.smith.models.feedback.tokens.TokenListParams
import com.langchain.smith.models.feedback.tokens.TokenRetrieveParams
import com.langchain.smith.models.feedback.tokens.TokenRetrieveResponse
import com.langchain.smith.models.feedback.tokens.TokenUpdateParams
import com.langchain.smith.models.feedback.tokens.TokenUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenServiceAsync {

    private val withRawResponse: TokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenServiceAsync =
        TokenServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenCreateResponse> =
        // post /api/v1/feedback/tokens
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TokenRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenRetrieveResponse> =
        // get /api/v1/feedback/tokens/{token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenUpdateResponse> =
        // post /api/v1/feedback/tokens/{token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TokenListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FeedbackIngestTokenSchema>> =
        // get /api/v1/feedback/tokens
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenServiceAsync.WithRawResponse =
            TokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TokenCreateResponse> =
            jsonHandler<TokenCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "tokens")
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

        private val retrieveHandler: Handler<TokenRetrieveResponse> =
            jsonHandler<TokenRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TokenRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "tokens", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<TokenUpdateResponse> =
            jsonHandler<TokenUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "tokens", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<List<FeedbackIngestTokenSchema>> =
            jsonHandler<List<FeedbackIngestTokenSchema>>(clientOptions.jsonMapper)

        override fun list(
            params: TokenListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FeedbackIngestTokenSchema>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "tokens")
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
    }
}
