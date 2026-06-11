// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.emptyHandler
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
import com.langchain.smith.models.onlineevaluators.BulkDeleteEvaluatorsResponse
import com.langchain.smith.models.onlineevaluators.CreateOnlineEvaluatorResponse
import com.langchain.smith.models.onlineevaluators.GetOnlineEvaluatorSpendResponse
import com.langchain.smith.models.onlineevaluators.OnlineEvaluator
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorBulkDeleteParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorCreateParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorDeleteParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListPage
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListPageResponse
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorRetrieveParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorSpendParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorUpdateParams
import com.langchain.smith.models.onlineevaluators.UpdateOnlineEvaluatorResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnlineEvaluatorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OnlineEvaluatorService {

    private val withRawResponse: OnlineEvaluatorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OnlineEvaluatorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnlineEvaluatorService =
        OnlineEvaluatorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: OnlineEvaluatorCreateParams,
        requestOptions: RequestOptions,
    ): CreateOnlineEvaluatorResponse =
        // post /v1/platform/evaluators
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: OnlineEvaluatorRetrieveParams,
        requestOptions: RequestOptions,
    ): OnlineEvaluator =
        // get /v1/platform/evaluators/{evaluator_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OnlineEvaluatorUpdateParams,
        requestOptions: RequestOptions,
    ): UpdateOnlineEvaluatorResponse =
        // patch /v1/platform/evaluators/{evaluator_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: OnlineEvaluatorListParams,
        requestOptions: RequestOptions,
    ): OnlineEvaluatorListPage =
        // get /v1/platform/evaluators
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OnlineEvaluatorDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/platform/evaluators/{evaluator_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun bulkDelete(
        params: OnlineEvaluatorBulkDeleteParams,
        requestOptions: RequestOptions,
    ): BulkDeleteEvaluatorsResponse =
        // delete /v1/platform/evaluators
        withRawResponse().bulkDelete(params, requestOptions).parse()

    override fun spend(
        params: OnlineEvaluatorSpendParams,
        requestOptions: RequestOptions,
    ): GetOnlineEvaluatorSpendResponse =
        // get /v1/platform/evaluators/spend
        withRawResponse().spend(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OnlineEvaluatorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnlineEvaluatorService.WithRawResponse =
            OnlineEvaluatorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreateOnlineEvaluatorResponse> =
            jsonHandler<CreateOnlineEvaluatorResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OnlineEvaluatorCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateOnlineEvaluatorResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators")
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

        private val retrieveHandler: Handler<OnlineEvaluator> =
            jsonHandler<OnlineEvaluator>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OnlineEvaluatorRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnlineEvaluator> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evaluatorId", params.evaluatorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators", params._pathParam(0))
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

        private val updateHandler: Handler<UpdateOnlineEvaluatorResponse> =
            jsonHandler<UpdateOnlineEvaluatorResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OnlineEvaluatorUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdateOnlineEvaluatorResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evaluatorId", params.evaluatorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators", params._pathParam(0))
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

        private val listHandler: Handler<OnlineEvaluatorListPageResponse> =
            jsonHandler<OnlineEvaluatorListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OnlineEvaluatorListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnlineEvaluatorListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators")
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
                    .let {
                        OnlineEvaluatorListPage.builder()
                            .service(OnlineEvaluatorServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: OnlineEvaluatorDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evaluatorId", params.evaluatorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val bulkDeleteHandler: Handler<BulkDeleteEvaluatorsResponse> =
            jsonHandler<BulkDeleteEvaluatorsResponse>(clientOptions.jsonMapper)

        override fun bulkDelete(
            params: OnlineEvaluatorBulkDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkDeleteEvaluatorsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkDeleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val spendHandler: Handler<GetOnlineEvaluatorSpendResponse> =
            jsonHandler<GetOnlineEvaluatorSpendResponse>(clientOptions.jsonMapper)

        override fun spend(
            params: OnlineEvaluatorSpendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GetOnlineEvaluatorSpendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "evaluators", "spend")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { spendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
