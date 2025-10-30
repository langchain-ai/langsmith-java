// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.runs.rules

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
import com.langsmith_api.api.models.api.v1.runs.rules.trigger.TriggerCreateParams
import com.langsmith_api.api.models.api.v1.runs.rules.trigger.TriggerCreateResponse
import java.util.function.Consumer

class TriggerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TriggerService {

    private val withRawResponse: TriggerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TriggerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService =
        TriggerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TriggerCreateParams,
        requestOptions: RequestOptions,
    ): TriggerCreateResponse =
        // post /api/v1/runs/rules/trigger
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TriggerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerService.WithRawResponse =
            TriggerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TriggerCreateResponse> =
            jsonHandler<TriggerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TriggerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TriggerCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", "trigger")
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
    }
}
