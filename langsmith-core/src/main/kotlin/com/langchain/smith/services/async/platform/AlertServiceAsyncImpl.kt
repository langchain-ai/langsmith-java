// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform

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
import com.langchain.smith.models.platform.alerts.AlertCreateParams
import com.langchain.smith.models.platform.alerts.AlertDeleteParams
import com.langchain.smith.models.platform.alerts.AlertDeleteResponse
import com.langchain.smith.models.platform.alerts.AlertRetrieveParams
import com.langchain.smith.models.platform.alerts.AlertRuleResponse
import com.langchain.smith.models.platform.alerts.AlertTestParams
import com.langchain.smith.models.platform.alerts.AlertTestResponse
import com.langchain.smith.models.platform.alerts.AlertUpdateParams
import com.langchain.smith.models.platform.alerts.AlertUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AlertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertServiceAsync {

    private val withRawResponse: AlertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync =
        AlertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertRuleResponse> =
        // post /v1/platform/alerts/{session_id}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertRuleResponse> =
        // get /v1/platform/alerts/{session_id}/{alert_rule_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertUpdateResponse> =
        // patch /v1/platform/alerts/{session_id}/{alert_rule_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AlertDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertDeleteResponse> =
        // delete /v1/platform/alerts/{session_id}/{alert_rule_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun test(
        params: AlertTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertTestResponse> =
        // post /v1/platform/alerts/{session_id}/test
        withRawResponse().test(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse =
            AlertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AlertRuleResponse> =
            jsonHandler<AlertRuleResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "alerts", params._pathParam(0))
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

        private val retrieveHandler: Handler<AlertRuleResponse> =
            jsonHandler<AlertRuleResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "alerts",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<AlertUpdateResponse> =
            jsonHandler<AlertUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "alerts",
                        params._pathParam(0),
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

        private val deleteHandler: Handler<AlertDeleteResponse> =
            jsonHandler<AlertDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AlertDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "alerts",
                        params._pathParam(0),
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

        private val testHandler: Handler<AlertTestResponse> =
            jsonHandler<AlertTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: AlertTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertTestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "alerts", params._pathParam(0), "test")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { testHandler.handle(it) }
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
