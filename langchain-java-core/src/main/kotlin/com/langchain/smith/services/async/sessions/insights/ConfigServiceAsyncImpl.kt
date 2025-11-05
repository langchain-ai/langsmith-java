// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions.insights

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigListParams
import com.langchain.smith.models.sessions.insights.configs.ConfigListResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateParams
import com.langchain.smith.models.sessions.insights.configs.CreateClusteringJobConfigResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigServiceAsync {

    private val withRawResponse: ConfigServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync =
        ConfigServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateClusteringJobConfigResponse> =
        // post /api/v1/sessions/{session_id}/insights/configs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateClusteringJobConfigResponse> =
        // patch /api/v1/sessions/{session_id}/insights/configs/{config_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConfigListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigListResponse> =
        // get /api/v1/sessions/{session_id}/insights/configs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ConfigDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigDeleteResponse> =
        // delete /api/v1/sessions/{session_id}/insights/configs/{config_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun generate(
        params: ConfigGenerateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigGenerateResponse> =
        // post /api/v1/sessions/{session_id}/insights/configs/generate
        withRawResponse().generate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse =
            ConfigServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreateClusteringJobConfigResponse> =
            jsonHandler<CreateClusteringJobConfigResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<CreateClusteringJobConfigResponse> =
            jsonHandler<CreateClusteringJobConfigResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ConfigListResponse> =
            jsonHandler<ConfigListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConfigListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigListResponse>> {
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

        private val deleteHandler: Handler<ConfigDeleteResponse> =
            jsonHandler<ConfigDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ConfigDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateHandler: Handler<ConfigGenerateResponse> =
            jsonHandler<ConfigGenerateResponse>(clientOptions.jsonMapper)

        override fun generate(
            params: ConfigGenerateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigGenerateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
