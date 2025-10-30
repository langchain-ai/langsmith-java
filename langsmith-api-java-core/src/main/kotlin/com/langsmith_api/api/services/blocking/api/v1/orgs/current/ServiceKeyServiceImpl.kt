// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

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
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyGetResponse
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyRetrieveServiceKeysParams
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ServiceKeyServiceKeysParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ServiceKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ServiceKeyService {

    private val withRawResponse: ServiceKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ServiceKeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceKeyService =
        ServiceKeyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: ServiceKeyDeleteParams,
        requestOptions: RequestOptions,
    ): ApiKeyGetResponse =
        // delete /api/v1/orgs/current/service-keys/{api_key_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveServiceKeys(
        params: ServiceKeyRetrieveServiceKeysParams,
        requestOptions: RequestOptions,
    ): List<ApiKeyGetResponse> =
        // get /api/v1/orgs/current/service-keys
        withRawResponse().retrieveServiceKeys(params, requestOptions).parse()

    override fun serviceKeys(
        params: ServiceKeyServiceKeysParams,
        requestOptions: RequestOptions,
    ): ApiKeyCreateResponse =
        // post /api/v1/orgs/current/service-keys
        withRawResponse().serviceKeys(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ServiceKeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceKeyService.WithRawResponse =
            ServiceKeyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<ApiKeyGetResponse> =
            jsonHandler<ApiKeyGetResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ServiceKeyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyGetResponse> {
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

        private val retrieveServiceKeysHandler: Handler<List<ApiKeyGetResponse>> =
            jsonHandler<List<ApiKeyGetResponse>>(clientOptions.jsonMapper)

        override fun retrieveServiceKeys(
            params: ServiceKeyRetrieveServiceKeysParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ApiKeyGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "service-keys")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveServiceKeysHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val serviceKeysHandler: Handler<ApiKeyCreateResponse> =
            jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper)

        override fun serviceKeys(
            params: ServiceKeyServiceKeysParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "service-keys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
