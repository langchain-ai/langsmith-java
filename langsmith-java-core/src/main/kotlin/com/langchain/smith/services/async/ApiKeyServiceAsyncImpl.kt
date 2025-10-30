// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.apikey.ApiKeyApiKeyParams
import com.langchain.smith.models.apikey.ApiKeyDeleteParams
import com.langchain.smith.models.apikey.ApiKeyRetrieveApiKeyParams
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import com.langchain.smith.services.async.apikey.CurrentServiceAsync
import com.langchain.smith.services.async.apikey.CurrentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ApiKeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyServiceAsync {

    private val withRawResponse: ApiKeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentServiceAsync by lazy { CurrentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ApiKeyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyServiceAsync =
        ApiKeyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentServiceAsync = current

    override fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        // delete /api/v1/api-key/{api_key_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun apiKey(
        params: ApiKeyApiKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyCreateResponse> =
        // post /api/v1/api-key
        withRawResponse().apiKey(params, requestOptions).thenApply { it.parse() }

    override fun retrieveApiKey(
        params: ApiKeyRetrieveApiKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        // get /api/v1/api-key
        withRawResponse().retrieveApiKey(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiKeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val current: CurrentServiceAsync.WithRawResponse by lazy {
            CurrentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyServiceAsync.WithRawResponse =
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentServiceAsync.WithRawResponse = current

        private val deleteHandler: Handler<ApiKeyGetResponse> =
            jsonHandler<ApiKeyGetResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKeyId", params.apiKeyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "api-key", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val apiKeyHandler: Handler<ApiKeyCreateResponse> =
            jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper)

        override fun apiKey(
            params: ApiKeyApiKeyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "api-key")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { apiKeyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveApiKeyHandler: Handler<List<ApiKeyGetResponse>> =
            jsonHandler<List<ApiKeyGetResponse>>(clientOptions.jsonMapper)

        override fun retrieveApiKey(
            params: ApiKeyRetrieveApiKeyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "api-key")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveApiKeyHandler.handle(it) }
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
