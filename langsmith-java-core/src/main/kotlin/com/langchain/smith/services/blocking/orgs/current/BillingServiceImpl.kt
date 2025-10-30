// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.orgs.current.billing.BillingListParams
import com.langchain.smith.models.orgs.current.billing.BillingListResponse
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageParams
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageResponse
import java.util.function.Consumer

class BillingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingService {

    private val withRawResponse: BillingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingService =
        BillingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: BillingListParams,
        requestOptions: RequestOptions,
    ): BillingListResponse =
        // get /api/v1/orgs/current/billing
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveUsage(
        params: BillingRetrieveUsageParams,
        requestOptions: RequestOptions,
    ): List<BillingRetrieveUsageResponse> =
        // get /api/v1/orgs/current/billing/usage
        withRawResponse().retrieveUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingService.WithRawResponse =
            BillingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BillingListResponse> =
            jsonHandler<BillingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BillingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "billing")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveUsageHandler: Handler<List<BillingRetrieveUsageResponse>> =
            jsonHandler<List<BillingRetrieveUsageResponse>>(clientOptions.jsonMapper)

        override fun retrieveUsage(
            params: BillingRetrieveUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BillingRetrieveUsageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "billing", "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
