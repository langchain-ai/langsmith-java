// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.emptyHandler
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
import com.langchain.smith.models.sandboxes.registries.RegistryCreateParams
import com.langchain.smith.models.sandboxes.registries.RegistryDeleteParams
import com.langchain.smith.models.sandboxes.registries.RegistryListParams
import com.langchain.smith.models.sandboxes.registries.RegistryListResponse
import com.langchain.smith.models.sandboxes.registries.RegistryResponse
import com.langchain.smith.models.sandboxes.registries.RegistryRetrieveParams
import com.langchain.smith.models.sandboxes.registries.RegistryUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RegistryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegistryService {

    private val withRawResponse: RegistryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegistryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegistryService =
        RegistryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RegistryCreateParams,
        requestOptions: RequestOptions,
    ): RegistryResponse =
        // post /v2/sandboxes/registries
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RegistryRetrieveParams,
        requestOptions: RequestOptions,
    ): RegistryResponse =
        // get /v2/sandboxes/registries/{name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RegistryUpdateParams,
        requestOptions: RequestOptions,
    ): RegistryResponse =
        // patch /v2/sandboxes/registries/{name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RegistryListParams,
        requestOptions: RequestOptions,
    ): RegistryListResponse =
        // get /v2/sandboxes/registries
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RegistryDeleteParams, requestOptions: RequestOptions) {
        // delete /v2/sandboxes/registries/{name}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegistryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegistryService.WithRawResponse =
            RegistryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RegistryResponse> =
            jsonHandler<RegistryResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RegistryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegistryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "registries")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<RegistryResponse> =
            jsonHandler<RegistryResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RegistryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegistryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "registries", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<RegistryResponse> =
            jsonHandler<RegistryResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RegistryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegistryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathName", params.pathName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "registries", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<RegistryListResponse> =
            jsonHandler<RegistryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RegistryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegistryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "registries")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RegistryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "registries", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
