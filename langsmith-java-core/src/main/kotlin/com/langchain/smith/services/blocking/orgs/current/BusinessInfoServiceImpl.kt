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
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoResponse
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoResponse
import java.util.function.Consumer

class BusinessInfoServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessInfoService {

    private val withRawResponse: BusinessInfoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessInfoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessInfoService =
        BusinessInfoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun businessInfo(
        params: BusinessInfoBusinessInfoParams,
        requestOptions: RequestOptions,
    ): BusinessInfoBusinessInfoResponse =
        // post /api/v1/orgs/current/business-info
        withRawResponse().businessInfo(params, requestOptions).parse()

    override fun retrieveBusinessInfo(
        params: BusinessInfoRetrieveBusinessInfoParams,
        requestOptions: RequestOptions,
    ): BusinessInfoRetrieveBusinessInfoResponse =
        // get /api/v1/orgs/current/business-info
        withRawResponse().retrieveBusinessInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessInfoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessInfoService.WithRawResponse =
            BusinessInfoServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val businessInfoHandler: Handler<BusinessInfoBusinessInfoResponse> =
            jsonHandler<BusinessInfoBusinessInfoResponse>(clientOptions.jsonMapper)

        override fun businessInfo(
            params: BusinessInfoBusinessInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusinessInfoBusinessInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "business-info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { businessInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveBusinessInfoHandler: Handler<BusinessInfoRetrieveBusinessInfoResponse> =
            jsonHandler<BusinessInfoRetrieveBusinessInfoResponse>(clientOptions.jsonMapper)

        override fun retrieveBusinessInfo(
            params: BusinessInfoRetrieveBusinessInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "business-info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
