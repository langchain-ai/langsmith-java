// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.feedback

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.feedback.formulas.FeedbackFormula
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaCreateParams
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaDeleteParams
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaDeleteResponse
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaListParams
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaRetrieveParams
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FormulaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FormulaServiceAsync {

    private val withRawResponse: FormulaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FormulaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormulaServiceAsync =
        FormulaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FormulaCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackFormula> =
        // post /api/v1/feedback/formulas
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FormulaRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackFormula> =
        // get /api/v1/feedback/formulas/{feedback_formula_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FormulaUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackFormula> =
        // put /api/v1/feedback/formulas/{feedback_formula_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FormulaListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FeedbackFormula>> =
        // get /api/v1/feedback/formulas
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FormulaDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormulaDeleteResponse> =
        // delete /api/v1/feedback/formulas/{feedback_formula_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FormulaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FormulaServiceAsync.WithRawResponse =
            FormulaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FeedbackFormula> =
            jsonHandler<FeedbackFormula>(clientOptions.jsonMapper)

        override fun create(
            params: FormulaCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "formulas")
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

        private val retrieveHandler: Handler<FeedbackFormula> =
            jsonHandler<FeedbackFormula>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FormulaRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackFormulaId", params.feedbackFormulaId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "formulas", params._pathParam(0))
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

        private val updateHandler: Handler<FeedbackFormula> =
            jsonHandler<FeedbackFormula>(clientOptions.jsonMapper)

        override fun update(
            params: FormulaUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackFormulaId", params.feedbackFormulaId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "formulas", params._pathParam(0))
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

        private val listHandler: Handler<List<FeedbackFormula>> =
            jsonHandler<List<FeedbackFormula>>(clientOptions.jsonMapper)

        override fun list(
            params: FormulaListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FeedbackFormula>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "formulas")
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

        private val deleteHandler: Handler<FormulaDeleteResponse> =
            jsonHandler<FormulaDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FormulaDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackFormulaId", params.feedbackFormulaId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", "formulas", params._pathParam(0))
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
    }
}
