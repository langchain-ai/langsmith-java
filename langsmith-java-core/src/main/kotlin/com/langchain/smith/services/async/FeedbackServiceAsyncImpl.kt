// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.feedback.FeedbackCreateParams
import com.langchain.smith.models.feedback.FeedbackDeleteParams
import com.langchain.smith.models.feedback.FeedbackDeleteResponse
import com.langchain.smith.models.feedback.FeedbackListPageAsync
import com.langchain.smith.models.feedback.FeedbackListParams
import com.langchain.smith.models.feedback.FeedbackRetrieveParams
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.feedback.FeedbackUpdateParams
import com.langchain.smith.services.async.feedback.ConfigServiceAsync
import com.langchain.smith.services.async.feedback.ConfigServiceAsyncImpl
import com.langchain.smith.services.async.feedback.TokenServiceAsync
import com.langchain.smith.services.async.feedback.TokenServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeedbackServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackServiceAsync {

    private val withRawResponse: FeedbackServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tokens: TokenServiceAsync by lazy { TokenServiceAsyncImpl(clientOptions) }

    private val configs: ConfigServiceAsync by lazy { ConfigServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FeedbackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync =
        FeedbackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tokens(): TokenServiceAsync = tokens

    override fun configs(): ConfigServiceAsync = configs

    override fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackSchema> =
        // post /api/v1/feedback
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FeedbackRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackSchema> =
        // get /api/v1/feedback/{feedback_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackSchema> =
        // patch /api/v1/feedback/{feedback_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FeedbackListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackListPageAsync> =
        // get /api/v1/feedback
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FeedbackDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackDeleteResponse> =
        // delete /api/v1/feedback/{feedback_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tokens: TokenServiceAsync.WithRawResponse by lazy {
            TokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val configs: ConfigServiceAsync.WithRawResponse by lazy {
            ConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackServiceAsync.WithRawResponse =
            FeedbackServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tokens(): TokenServiceAsync.WithRawResponse = tokens

        override fun configs(): ConfigServiceAsync.WithRawResponse = configs

        private val createHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun create(
            params: FeedbackCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback")
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

        private val retrieveHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FeedbackRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackId", params.feedbackId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback", params._pathParam(0))
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

        private val updateHandler: Handler<FeedbackSchema> =
            jsonHandler<FeedbackSchema>(clientOptions.jsonMapper)

        override fun update(
            params: FeedbackUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> {
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

        private val listHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun list(
            params: FeedbackListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback")
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
                            .let {
                                FeedbackListPageAsync.builder()
                                    .service(FeedbackServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<FeedbackDeleteResponse> =
            jsonHandler<FeedbackDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FeedbackDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>> {
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
