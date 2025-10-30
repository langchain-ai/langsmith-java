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
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapDeleteParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapDeleteResponse
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapModelPriceMapParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapModelPriceMapResponse
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapRetrieveModelPriceMapParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapRetrieveModelPriceMapResponse
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapUpdateParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ModelPriceMapServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelPriceMapService {

    private val withRawResponse: ModelPriceMapService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModelPriceMapService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelPriceMapService =
        ModelPriceMapServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ModelPriceMapUpdateParams,
        requestOptions: RequestOptions,
    ): ModelPriceMapUpdateResponse =
        // put /api/v1/model-price-map/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: ModelPriceMapDeleteParams,
        requestOptions: RequestOptions,
    ): ModelPriceMapDeleteResponse =
        // delete /api/v1/model-price-map/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun modelPriceMap(
        params: ModelPriceMapModelPriceMapParams,
        requestOptions: RequestOptions,
    ): ModelPriceMapModelPriceMapResponse =
        // post /api/v1/model-price-map
        withRawResponse().modelPriceMap(params, requestOptions).parse()

    override fun retrieveModelPriceMap(
        params: ModelPriceMapRetrieveModelPriceMapParams,
        requestOptions: RequestOptions,
    ): ModelPriceMapRetrieveModelPriceMapResponse =
        // get /api/v1/model-price-map
        withRawResponse().retrieveModelPriceMap(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelPriceMapService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelPriceMapService.WithRawResponse =
            ModelPriceMapServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ModelPriceMapUpdateResponse> =
            jsonHandler<ModelPriceMapUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ModelPriceMapUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelPriceMapUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "model-price-map", params._pathParam(0))
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

        private val deleteHandler: Handler<ModelPriceMapDeleteResponse> =
            jsonHandler<ModelPriceMapDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ModelPriceMapDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelPriceMapDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "model-price-map", params._pathParam(0))
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

        private val modelPriceMapHandler: Handler<ModelPriceMapModelPriceMapResponse> =
            jsonHandler<ModelPriceMapModelPriceMapResponse>(clientOptions.jsonMapper)

        override fun modelPriceMap(
            params: ModelPriceMapModelPriceMapParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelPriceMapModelPriceMapResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "model-price-map")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { modelPriceMapHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveModelPriceMapHandler:
            Handler<ModelPriceMapRetrieveModelPriceMapResponse> =
            jsonHandler<ModelPriceMapRetrieveModelPriceMapResponse>(clientOptions.jsonMapper)

        override fun retrieveModelPriceMap(
            params: ModelPriceMapRetrieveModelPriceMapParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "model-price-map")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveModelPriceMapHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
