// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

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
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import com.langchain.smith.models.orgs.current.servicekeys.ServiceKeyDeleteParams
import com.langchain.smith.models.orgs.current.servicekeys.ServiceKeyRetrieveServiceKeysParams
import com.langchain.smith.models.orgs.current.servicekeys.ServiceKeyServiceKeysParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ServiceKeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ServiceKeyServiceAsync {

    private val withRawResponse: ServiceKeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ServiceKeyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceKeyServiceAsync =
        ServiceKeyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: ServiceKeyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        // delete /api/v1/orgs/current/service-keys/{api_key_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveServiceKeys(
        params: ServiceKeyRetrieveServiceKeysParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        // get /api/v1/orgs/current/service-keys
        withRawResponse().retrieveServiceKeys(params, requestOptions).thenApply { it.parse() }

    override fun serviceKeys(
        params: ServiceKeyServiceKeysParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyCreateResponse> =
        // post /api/v1/orgs/current/service-keys
        withRawResponse().serviceKeys(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ServiceKeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceKeyServiceAsync.WithRawResponse =
            ServiceKeyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<ApiKeyGetResponse> =
            jsonHandler<ApiKeyGetResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ServiceKeyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKeyId", params.apiKeyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "orgs",
                        "current",
                        "service-keys",
                        params._pathParam(0),
                    )
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

        private val retrieveServiceKeysHandler: Handler<List<ApiKeyGetResponse>> =
            jsonHandler<List<ApiKeyGetResponse>>(clientOptions.jsonMapper)

        override fun retrieveServiceKeys(
            params: ServiceKeyRetrieveServiceKeysParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "service-keys")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveServiceKeysHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val serviceKeysHandler: Handler<ApiKeyCreateResponse> =
            jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper)

        override fun serviceKeys(
            params: ServiceKeyServiceKeysParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "service-keys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { serviceKeysHandler.handle(it) }
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
