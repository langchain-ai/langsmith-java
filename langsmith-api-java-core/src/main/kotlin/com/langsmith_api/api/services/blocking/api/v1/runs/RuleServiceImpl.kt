// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.runs

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
import com.langsmith_api.api.models.api.v1.runs.rules.RuleCreateParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleDeleteParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleDeleteResponse
import com.langsmith_api.api.models.api.v1.runs.rules.RuleListParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleLogSchema
import com.langsmith_api.api.models.api.v1.runs.rules.RuleRetrieveLastAppliedParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleRetrieveLogsParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleUpdateParams
import com.langsmith_api.api.models.api.v1.runs.rules.RunRulesSchema
import com.langsmith_api.api.services.blocking.api.v1.runs.rules.TriggerService
import com.langsmith_api.api.services.blocking.api.v1.runs.rules.TriggerServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RuleServiceImpl internal constructor(private val clientOptions: ClientOptions) : RuleService {

    private val withRawResponse: RuleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val trigger: TriggerService by lazy { TriggerServiceImpl(clientOptions) }

    override fun withRawResponse(): RuleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService =
        RuleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun trigger(): TriggerService = trigger

    override fun create(params: RuleCreateParams, requestOptions: RequestOptions): RunRulesSchema =
        // post /api/v1/runs/rules
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: RuleUpdateParams, requestOptions: RequestOptions): RunRulesSchema =
        // patch /api/v1/runs/rules/{rule_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RuleListParams,
        requestOptions: RequestOptions,
    ): List<RunRulesSchema> =
        // get /api/v1/runs/rules
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RuleDeleteParams,
        requestOptions: RequestOptions,
    ): RuleDeleteResponse =
        // delete /api/v1/runs/rules/{rule_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveLastApplied(
        params: RuleRetrieveLastAppliedParams,
        requestOptions: RequestOptions,
    ): RuleLogSchema =
        // get /api/v1/runs/rules/{rule_id}/last_applied
        withRawResponse().retrieveLastApplied(params, requestOptions).parse()

    override fun retrieveLogs(
        params: RuleRetrieveLogsParams,
        requestOptions: RequestOptions,
    ): List<RuleLogSchema> =
        // get /api/v1/runs/rules/{rule_id}/logs
        withRawResponse().retrieveLogs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val trigger: TriggerService.WithRawResponse by lazy {
            TriggerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleService.WithRawResponse =
            RuleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun trigger(): TriggerService.WithRawResponse = trigger

        private val createHandler: Handler<RunRulesSchema> =
            jsonHandler<RunRulesSchema>(clientOptions.jsonMapper)

        override fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunRulesSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules")
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

        private val updateHandler: Handler<RunRulesSchema> =
            jsonHandler<RunRulesSchema>(clientOptions.jsonMapper)

        override fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunRulesSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", params._pathParam(0))
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

        private val listHandler: Handler<List<RunRulesSchema>> =
            jsonHandler<List<RunRulesSchema>>(clientOptions.jsonMapper)

        override fun list(
            params: RuleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RunRulesSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<RuleDeleteResponse> =
            jsonHandler<RuleDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", params._pathParam(0))
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

        private val retrieveLastAppliedHandler: Handler<RuleLogSchema> =
            jsonHandler<RuleLogSchema>(clientOptions.jsonMapper)

        override fun retrieveLastApplied(
            params: RuleRetrieveLastAppliedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleLogSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "runs",
                        "rules",
                        params._pathParam(0),
                        "last_applied",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveLastAppliedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveLogsHandler: Handler<List<RuleLogSchema>> =
            jsonHandler<List<RuleLogSchema>>(clientOptions.jsonMapper)

        override fun retrieveLogs(
            params: RuleRetrieveLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RuleLogSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", params._pathParam(0), "logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
