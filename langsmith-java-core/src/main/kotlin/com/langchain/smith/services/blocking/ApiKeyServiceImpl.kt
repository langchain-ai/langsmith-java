// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.apikey.ApiKeyApiKeyParams
import com.langchain.smith.models.apikey.ApiKeyDeleteParams
import com.langchain.smith.models.apikey.ApiKeyRetrieveApiKeyParams
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import com.langchain.smith.services.blocking.apikey.CurrentService
import com.langchain.smith.services.blocking.apikey.CurrentServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ApiKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyService {

    private val withRawResponse: ApiKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    override fun withRawResponse(): ApiKeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService =
        ApiKeyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentService = current

    override fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions,
    ): ApiKeyGetResponse =
        // delete /api/v1/api-key/{api_key_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun apiKey(
        params: ApiKeyApiKeyParams,
        requestOptions: RequestOptions,
    ): ApiKeyCreateResponse =
        // post /api/v1/api-key
        withRawResponse().apiKey(params, requestOptions).parse()

    override fun retrieveApiKey(
        params: ApiKeyRetrieveApiKeyParams,
        requestOptions: RequestOptions,
    ): List<ApiKeyGetResponse> =
        // get /api/v1/api-key
        withRawResponse().retrieveApiKey(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiKeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val current: CurrentService.WithRawResponse by lazy {
            CurrentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyService.WithRawResponse =
            ApiKeyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentService.WithRawResponse = current

        private val deleteHandler: Handler<ApiKeyGetResponse> =
            jsonHandler<ApiKeyGetResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyGetResponse> {
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

        private val apiKeyHandler: Handler<ApiKeyCreateResponse> =
            jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper)

        override fun apiKey(
            params: ApiKeyApiKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "api-key")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { apiKeyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveApiKeyHandler: Handler<List<ApiKeyGetResponse>> =
            jsonHandler<List<ApiKeyGetResponse>>(clientOptions.jsonMapper)

        override fun retrieveApiKey(
            params: ApiKeyRetrieveApiKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ApiKeyGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "api-key")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
