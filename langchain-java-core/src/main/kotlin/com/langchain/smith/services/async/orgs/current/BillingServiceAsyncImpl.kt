// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.orgs.current.billing.BillingListParams
import com.langchain.smith.models.orgs.current.billing.BillingListResponse
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageParams
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BillingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingServiceAsync {

    private val withRawResponse: BillingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingServiceAsync =
        BillingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: BillingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingListResponse> =
        // get /api/v1/orgs/current/billing
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveUsage(
        params: BillingRetrieveUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BillingRetrieveUsageResponse>> =
        // get /api/v1/orgs/current/billing/usage
        withRawResponse().retrieveUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingServiceAsync.WithRawResponse =
            BillingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BillingListResponse> =
            jsonHandler<BillingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BillingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "billing")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveUsageHandler: Handler<List<BillingRetrieveUsageResponse>> =
            jsonHandler<List<BillingRetrieveUsageResponse>>(clientOptions.jsonMapper)

        override fun retrieveUsage(
            params: BillingRetrieveUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BillingRetrieveUsageResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "billing", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
