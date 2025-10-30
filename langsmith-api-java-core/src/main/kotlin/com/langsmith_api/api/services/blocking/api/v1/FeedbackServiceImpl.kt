// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.models.api.v1.feedback.FeedbackCreateParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackDeleteParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackDeleteResponse
import com.langsmith_api.api.models.api.v1.feedback.FeedbackEagerParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackListParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackRetrieveParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackSchema
import com.langsmith_api.api.models.api.v1.feedback.FeedbackUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.feedback.FormulaService
import com.langsmith_api.api.services.blocking.api.v1.feedback.FormulaServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.feedback.TokenService
import com.langsmith_api.api.services.blocking.api.v1.feedback.TokenServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeedbackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackService {

    private val withRawResponse: FeedbackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val formulas: FormulaService by lazy { FormulaServiceImpl(clientOptions) }

    private val tokens: TokenService by lazy { TokenServiceImpl(clientOptions) }

    override fun withRawResponse(): FeedbackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService =
        FeedbackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun formulas(): FormulaService = formulas

    override fun tokens(): TokenService = tokens

    override fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions,
    ): FeedbackSchema =
        // post /api/v1/feedback
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FeedbackRetrieveParams,
        requestOptions: RequestOptions,
    ): FeedbackSchema =
        // get /api/v1/feedback/{feedback_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions,
    ): FeedbackSchema =
        // patch /api/v1/feedback/{feedback_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: FeedbackListParams,
        requestOptions: RequestOptions,
    ): List<FeedbackSchema> =
        // get /api/v1/feedback
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: FeedbackDeleteParams,
        requestOptions: RequestOptions,
    ): FeedbackDeleteResponse =
        // delete /api/v1/feedback/{feedback_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun eager(
        params: FeedbackEagerParams,
        requestOptions: RequestOptions,
    ): FeedbackSchema =
        // post /api/v1/feedback/eager
        withRawResponse().eager(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val formulas: FormulaService.WithRawResponse by lazy {
            FormulaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokens: TokenService.WithRawResponse by lazy {
            TokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackService.WithRawResponse =
            FeedbackServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun formulas(): FormulaService.WithRawResponse = formulas

        override fun tokens(): TokenService.WithRawResponse = tokens

        private val createHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun create(
            params: FeedbackCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback")
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

        private val retrieveHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FeedbackRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackId", params.feedbackId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", params._pathParam(0))
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

        private val updateHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun update(
            params: FeedbackUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackId", params.feedbackId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", params._pathParam(0))
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

        private val listHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun list(
            params: FeedbackListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeedbackSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback")
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

        private val deleteHandler: Handler<FeedbackDeleteResponse> =
            jsonHandler<FeedbackDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FeedbackDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackId", params.feedbackId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", params._pathParam(0))
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

        private val eagerHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun eager(
            params: FeedbackEagerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "eager")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { eagerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
