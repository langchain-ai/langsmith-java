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
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoResponse
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BusinessInfoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessInfoServiceAsync {

    private val withRawResponse: BusinessInfoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessInfoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessInfoServiceAsync =
        BusinessInfoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun businessInfo(
        params: BusinessInfoBusinessInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BusinessInfoBusinessInfoResponse> =
        // post /api/v1/orgs/current/business-info
        withRawResponse().businessInfo(params, requestOptions).thenApply { it.parse() }

    override fun retrieveBusinessInfo(
        params: BusinessInfoRetrieveBusinessInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BusinessInfoRetrieveBusinessInfoResponse> =
        // get /api/v1/orgs/current/business-info
        withRawResponse().retrieveBusinessInfo(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessInfoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessInfoServiceAsync.WithRawResponse =
            BusinessInfoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val businessInfoHandler: Handler<BusinessInfoBusinessInfoResponse> =
            jsonHandler<BusinessInfoBusinessInfoResponse>(clientOptions.jsonMapper)

        override fun businessInfo(
            params: BusinessInfoBusinessInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusinessInfoBusinessInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "business-info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { businessInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveBusinessInfoHandler: Handler<BusinessInfoRetrieveBusinessInfoResponse> =
            jsonHandler<BusinessInfoRetrieveBusinessInfoResponse>(clientOptions.jsonMapper)

        override fun retrieveBusinessInfo(
            params: BusinessInfoRetrieveBusinessInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "business-info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveBusinessInfoHandler.handle(it) }
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
