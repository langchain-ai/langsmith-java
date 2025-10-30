// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
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
import com.langsmith_api.api.models.api.v1.serviceaccounts.ServiceAccountDeleteParams
import com.langsmith_api.api.models.api.v1.serviceaccounts.ServiceAccountDeleteResponse
import com.langsmith_api.api.models.api.v1.serviceaccounts.ServiceAccountRetrieveServiceAccountsParams
import com.langsmith_api.api.models.api.v1.serviceaccounts.ServiceAccountRetrieveServiceAccountsResponse
import com.langsmith_api.api.models.api.v1.serviceaccounts.ServiceAccountServiceAccountsParams
import com.langsmith_api.api.models.api.v1.serviceaccounts.ServiceAccountServiceAccountsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ServiceAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ServiceAccountService {

    private val withRawResponse: ServiceAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ServiceAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceAccountService =
        ServiceAccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: ServiceAccountDeleteParams,
        requestOptions: RequestOptions,
    ): ServiceAccountDeleteResponse =
        // delete /api/v1/service-accounts/{service_account_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveServiceAccounts(
        params: ServiceAccountRetrieveServiceAccountsParams,
        requestOptions: RequestOptions,
    ): List<ServiceAccountRetrieveServiceAccountsResponse> =
        // get /api/v1/service-accounts
        withRawResponse().retrieveServiceAccounts(params, requestOptions).parse()

    override fun serviceAccounts(
        params: ServiceAccountServiceAccountsParams,
        requestOptions: RequestOptions,
    ): ServiceAccountServiceAccountsResponse =
        // post /api/v1/service-accounts
        withRawResponse().serviceAccounts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ServiceAccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceAccountService.WithRawResponse =
            ServiceAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<ServiceAccountDeleteResponse> =
            jsonHandler<ServiceAccountDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ServiceAccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceAccountDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "service-accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveServiceAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val serviceAccountsHandler: Handler<ServiceAccountServiceAccountsResponse> =
            jsonHandler<ServiceAccountServiceAccountsResponse>(clientOptions.jsonMapper)

        override fun serviceAccounts(
            params: ServiceAccountServiceAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceAccountServiceAccountsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "service-accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
