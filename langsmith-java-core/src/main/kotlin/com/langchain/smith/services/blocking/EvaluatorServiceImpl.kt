// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.evaluators.Evaluator
import com.langchain.smith.models.evaluators.EvaluatorCreateDecisionModelParams
import com.langchain.smith.models.evaluators.EvaluatorListParams
import com.langchain.smith.models.evaluators.EvaluatorListV2Page
import com.langchain.smith.models.evaluators.EvaluatorListV2PageResponse
import com.langchain.smith.models.evaluators.EvaluatorListV2Params
import java.util.function.Consumer

class EvaluatorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EvaluatorService {

    private val withRawResponse: EvaluatorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EvaluatorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvaluatorService =
        EvaluatorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated(
        "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
    )
    override fun list(
        params: EvaluatorListParams,
        requestOptions: RequestOptions,
    ): List<Evaluator> =
        // get /api/v1/runs/rules
        withRawResponse().list(params, requestOptions).parse()

    override fun createDecisionModel(
        params: EvaluatorCreateDecisionModelParams,
        requestOptions: RequestOptions,
    ): Evaluator =
        // post /api/v1/runs/rules/decision-models
        withRawResponse().createDecisionModel(params, requestOptions).parse()

    override fun listV2(
        params: EvaluatorListV2Params,
        requestOptions: RequestOptions,
    ): EvaluatorListV2Page =
        // get /api/v2/runs/rules
        withRawResponse().listV2(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvaluatorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EvaluatorService.WithRawResponse =
            EvaluatorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<Evaluator>> =
            jsonHandler<List<Evaluator>>(clientOptions.jsonMapper)

        @Deprecated(
            "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
        )
        override fun list(
            params: EvaluatorListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Evaluator>> {
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

        private val createDecisionModelHandler: Handler<Evaluator> =
            jsonHandler<Evaluator>(clientOptions.jsonMapper)

        override fun createDecisionModel(
            params: EvaluatorCreateDecisionModelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Evaluator> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "rules", "decision-models")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createDecisionModelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listV2Handler: Handler<EvaluatorListV2PageResponse> =
            jsonHandler<EvaluatorListV2PageResponse>(clientOptions.jsonMapper)

        override fun listV2(
            params: EvaluatorListV2Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluatorListV2Page> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "runs", "rules")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listV2Handler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EvaluatorListV2Page.builder()
                            .service(EvaluatorServiceImpl(clientOptions))
                            .params(params)
                            .requestOptions(requestOptions)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
