// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
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
import com.langsmith_api.api.models.platform.alerts.AlertCreateParams
import com.langsmith_api.api.models.platform.alerts.AlertDeleteParams
import com.langsmith_api.api.models.platform.alerts.AlertDeleteResponse
import com.langsmith_api.api.models.platform.alerts.AlertRetrieveParams
import com.langsmith_api.api.models.platform.alerts.AlertRuleResponse
import com.langsmith_api.api.models.platform.alerts.AlertTestParams
import com.langsmith_api.api.models.platform.alerts.AlertTestResponse
import com.langsmith_api.api.models.platform.alerts.AlertUpdateParams
import com.langsmith_api.api.models.platform.alerts.AlertUpdateResponse
import java.util.function.Consumer

class AlertServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertService {

    private val withRawResponse: AlertService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService =
        AlertServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions,
    ): AlertRuleResponse =
        // post /v1/platform/alerts/{session_id}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions,
    ): AlertRuleResponse =
        // get /v1/platform/alerts/{session_id}/{alert_rule_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions,
    ): AlertUpdateResponse =
        // patch /v1/platform/alerts/{session_id}/{alert_rule_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: AlertDeleteParams,
        requestOptions: RequestOptions,
    ): AlertDeleteResponse =
        // delete /v1/platform/alerts/{session_id}/{alert_rule_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun test(params: AlertTestParams, requestOptions: RequestOptions): AlertTestResponse =
        // post /v1/platform/alerts/{session_id}/test
        withRawResponse().test(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertService.WithRawResponse =
            AlertServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AlertRuleResponse> =
            jsonHandler<AlertRuleResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertRuleResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "alerts", params._pathParam(0))
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

        private val retrieveHandler: Handler<AlertRuleResponse> =
            jsonHandler<AlertRuleResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertRuleResponse> {
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

        private val updateHandler: Handler<AlertUpdateResponse> =
            jsonHandler<AlertUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertUpdateResponse> {
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

        private val deleteHandler: Handler<AlertDeleteResponse> =
            jsonHandler<AlertDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AlertDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertDeleteResponse> {
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

        private val testHandler: Handler<AlertTestResponse> =
            jsonHandler<AlertTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: AlertTestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertTestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "alerts", params._pathParam(0), "test")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
