// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions.insights

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
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigListParams
import com.langchain.smith.models.sessions.insights.configs.ConfigListResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateParams
import com.langchain.smith.models.sessions.insights.configs.CreateClusteringJobConfigResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigService {

    private val withRawResponse: ConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService =
        ConfigServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions,
    ): CreateClusteringJobConfigResponse =
        // post /api/v1/sessions/{session_id}/insights/configs
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions,
    ): CreateClusteringJobConfigResponse =
        // patch /api/v1/sessions/{session_id}/insights/configs/{config_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ConfigListParams,
        requestOptions: RequestOptions,
    ): ConfigListResponse =
        // get /api/v1/sessions/{session_id}/insights/configs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ConfigDeleteParams,
        requestOptions: RequestOptions,
    ): ConfigDeleteResponse =
        // delete /api/v1/sessions/{session_id}/insights/configs/{config_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun generate(
        params: ConfigGenerateParams,
        requestOptions: RequestOptions,
    ): ConfigGenerateResponse =
        // post /api/v1/sessions/{session_id}/insights/configs/generate
        withRawResponse().generate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigService.WithRawResponse =
            ConfigServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreateClusteringJobConfigResponse> =
            jsonHandler<CreateClusteringJobConfigResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateClusteringJobConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        "configs",
                    )
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

        private val updateHandler: Handler<CreateClusteringJobConfigResponse> =
            jsonHandler<CreateClusteringJobConfigResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateClusteringJobConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        "configs",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<ConfigListResponse> =
            jsonHandler<ConfigListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConfigListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        "configs",
                    )
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

        private val deleteHandler: Handler<ConfigDeleteResponse> =
            jsonHandler<ConfigDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ConfigDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        "configs",
                        params._pathParam(1),
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

        private val generateHandler: Handler<ConfigGenerateResponse> =
            jsonHandler<ConfigGenerateResponse>(clientOptions.jsonMapper)

        override fun generate(
            params: ConfigGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigGenerateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "insights",
                        "configs",
                        "generate",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
