// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

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
import com.langchain.smith.models.workspaces.current.secrets.SecretCreateParams
import com.langchain.smith.models.workspaces.current.secrets.SecretCreateResponse
import com.langchain.smith.models.workspaces.current.secrets.SecretListParams
import com.langchain.smith.models.workspaces.current.secrets.SecretListResponse
import com.langchain.smith.models.workspaces.current.secrets.SecretRetrieveEncryptedParams
import com.langchain.smith.models.workspaces.current.secrets.SecretRetrieveEncryptedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SecretServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SecretServiceAsync {

    private val withRawResponse: SecretServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SecretServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync =
        SecretServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretCreateResponse> =
        // post /api/v1/workspaces/current/secrets
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SecretListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SecretListResponse>> =
        // get /api/v1/workspaces/current/secrets
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveEncrypted(
        params: SecretRetrieveEncryptedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretRetrieveEncryptedResponse> =
        // get /api/v1/workspaces/current/secrets/encrypted
        withRawResponse().retrieveEncrypted(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SecretServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse =
            SecretServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SecretCreateResponse> =
            jsonHandler<SecretCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "secrets")
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

        private val listHandler: Handler<List<SecretListResponse>> =
            jsonHandler<List<SecretListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SecretListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SecretListResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "secrets")
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

        private val retrieveEncryptedHandler: Handler<SecretRetrieveEncryptedResponse> =
            jsonHandler<SecretRetrieveEncryptedResponse>(clientOptions.jsonMapper)

        override fun retrieveEncrypted(
            params: SecretRetrieveEncryptedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretRetrieveEncryptedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "secrets", "encrypted")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveEncryptedHandler.handle(it) }
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
