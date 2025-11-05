// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs

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
import com.langchain.smith.models.runs.rules.RuleCreateParams
import com.langchain.smith.models.runs.rules.RuleDeleteParams
import com.langchain.smith.models.runs.rules.RuleDeleteResponse
import com.langchain.smith.models.runs.rules.RuleListParams
import com.langchain.smith.models.runs.rules.RuleLogSchema
import com.langchain.smith.models.runs.rules.RuleRetrieveLastAppliedParams
import com.langchain.smith.models.runs.rules.RuleRetrieveLogsParams
import com.langchain.smith.models.runs.rules.RuleUpdateParams
import com.langchain.smith.models.runs.rules.RunRulesSchema
import com.langchain.smith.services.async.runs.rules.TriggerServiceAsync
import com.langchain.smith.services.async.runs.rules.TriggerServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RuleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RuleServiceAsync {

    private val withRawResponse: RuleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val trigger: TriggerServiceAsync by lazy { TriggerServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RuleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync =
        RuleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun trigger(): TriggerServiceAsync = trigger

    override fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunRulesSchema> =
        // post /api/v1/runs/rules
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunRulesSchema> =
        // patch /api/v1/runs/rules/{rule_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RuleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RunRulesSchema>> =
        // get /api/v1/runs/rules
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RuleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleDeleteResponse> =
        // delete /api/v1/runs/rules/{rule_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveLastApplied(
        params: RuleRetrieveLastAppliedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleLogSchema> =
        // get /api/v1/runs/rules/{rule_id}/last_applied
        withRawResponse().retrieveLastApplied(params, requestOptions).thenApply { it.parse() }

    override fun retrieveLogs(
        params: RuleRetrieveLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RuleLogSchema>> =
        // get /api/v1/runs/rules/{rule_id}/logs
        withRawResponse().retrieveLogs(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val trigger: TriggerServiceAsync.WithRawResponse by lazy {
            TriggerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleServiceAsync.WithRawResponse =
            RuleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun trigger(): TriggerServiceAsync.WithRawResponse = trigger

        private val createHandler: Handler<RunRulesSchema> =
            jsonHandler<RunRulesSchema>(clientOptions.jsonMapper)

        override fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules")
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

        private val updateHandler: Handler<RunRulesSchema> =
            jsonHandler<RunRulesSchema>(clientOptions.jsonMapper)

        override fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> {
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

        private val listHandler: Handler<List<RunRulesSchema>> =
            jsonHandler<List<RunRulesSchema>>(clientOptions.jsonMapper)

        override fun list(
            params: RuleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RunRulesSchema>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<RuleDeleteResponse> =
            jsonHandler<RuleDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> {
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

        private val retrieveLastAppliedHandler: Handler<RuleLogSchema> =
            jsonHandler<RuleLogSchema>(clientOptions.jsonMapper)

        override fun retrieveLastApplied(
            params: RuleRetrieveLastAppliedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleLogSchema>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveLastAppliedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveLogsHandler: Handler<List<RuleLogSchema>> =
            jsonHandler<List<RuleLogSchema>>(clientOptions.jsonMapper)

        override fun retrieveLogs(
            params: RuleRetrieveLogsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", params._pathParam(0), "logs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
