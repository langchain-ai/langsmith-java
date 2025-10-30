// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs.rules

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
import com.langchain.smith.models.runs.rules.RunRulesSchema
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateParams
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateResponse
import com.langchain.smith.models.runs.rules.trigger.TriggerExecuteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TriggerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TriggerServiceAsync {

    private val withRawResponse: TriggerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TriggerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerServiceAsync =
        TriggerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TriggerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TriggerCreateResponse> =
        // post /api/v1/runs/rules/trigger
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun execute(
        params: TriggerExecuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunRulesSchema> =
        // post /api/v1/runs/rules/{rule_id}/trigger
        withRawResponse().execute(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TriggerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerServiceAsync.WithRawResponse =
            TriggerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TriggerCreateResponse> =
            jsonHandler<TriggerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TriggerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", "trigger")
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

        private val executeHandler: Handler<RunRulesSchema> =
            jsonHandler<RunRulesSchema>(clientOptions.jsonMapper)

        override fun execute(
            params: TriggerExecuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", params._pathParam(0), "trigger")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { executeHandler.handle(it) }
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
