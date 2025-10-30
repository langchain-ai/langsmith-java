// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.feedback.FeedbackSchema
import com.langsmith_api.api.models.api.v1.public_.PublicRetrieveFeedbacksParams
import com.langsmith_api.api.services.async.api.v1.public_.DatasetServiceAsync
import com.langsmith_api.api.services.async.api.v1.public_.DatasetServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.public_.ExampleServiceAsync
import com.langsmith_api.api.services.async.api.v1.public_.ExampleServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.public_.RunServiceAsync
import com.langsmith_api.api.services.async.api.v1.public_.RunServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.public_.SchemaServiceAsync
import com.langsmith_api.api.services.async.api.v1.public_.SchemaServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PublicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PublicServiceAsync {

    private val withRawResponse: PublicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val examples: ExampleServiceAsync by lazy { ExampleServiceAsyncImpl(clientOptions) }

    private val schemas: SchemaServiceAsync by lazy { SchemaServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PublicServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicServiceAsync =
        PublicServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasets(): DatasetServiceAsync = datasets

    override fun examples(): ExampleServiceAsync = examples

    override fun schemas(): SchemaServiceAsync = schemas

    override fun runs(): RunServiceAsync = runs

    override fun retrieveFeedbacks(
        params: PublicRetrieveFeedbacksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FeedbackSchema>> =
        // get /api/v1/public/{share_token}/feedbacks
        withRawResponse().retrieveFeedbacks(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PublicServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val examples: ExampleServiceAsync.WithRawResponse by lazy {
            ExampleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val schemas: SchemaServiceAsync.WithRawResponse by lazy {
            SchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicServiceAsync.WithRawResponse =
            PublicServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun examples(): ExampleServiceAsync.WithRawResponse = examples

        override fun schemas(): SchemaServiceAsync.WithRawResponse = schemas

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val retrieveFeedbacksHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", params._pathParam(0), "feedbacks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveFeedbacksHandler.handle(it) }
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
