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
import com.langchain.smith.models.serviceaccounts.ServiceAccountDeleteParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountDeleteResponse
import com.langchain.smith.models.serviceaccounts.ServiceAccountRetrieveServiceAccountsParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountRetrieveServiceAccountsResponse
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ServiceAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ServiceAccountServiceAsync {

    private val withRawResponse: ServiceAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ServiceAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ServiceAccountServiceAsync =
        ServiceAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: ServiceAccountDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceAccountDeleteResponse> =
        // delete /api/v1/service-accounts/{service_account_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveServiceAccounts(
        params: ServiceAccountRetrieveServiceAccountsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ServiceAccountRetrieveServiceAccountsResponse>> =
        // get /api/v1/service-accounts
        withRawResponse().retrieveServiceAccounts(params, requestOptions).thenApply { it.parse() }

    override fun serviceAccounts(
        params: ServiceAccountServiceAccountsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceAccountServiceAccountsResponse> =
        // post /api/v1/service-accounts
        withRawResponse().serviceAccounts(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ServiceAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceAccountServiceAsync.WithRawResponse =
            ServiceAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<ServiceAccountDeleteResponse> =
            jsonHandler<ServiceAccountDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ServiceAccountDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("serviceAccountId", params.serviceAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "service-accounts", params._pathParam(0))
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

        private val retrieveServiceAccountsHandler:
            Handler<List<ServiceAccountRetrieveServiceAccountsResponse>> =
            jsonHandler<List<ServiceAccountRetrieveServiceAccountsResponse>>(
                clientOptions.jsonMapper
            )

        override fun retrieveServiceAccounts(
            params: ServiceAccountRetrieveServiceAccountsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "service-accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveServiceAccountsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val serviceAccountsHandler: Handler<ServiceAccountServiceAccountsResponse> =
            jsonHandler<ServiceAccountServiceAccountsResponse>(clientOptions.jsonMapper)

        override fun serviceAccounts(
            params: ServiceAccountServiceAccountsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceAccountServiceAccountsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "service-accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { serviceAccountsHandler.handle(it) }
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
