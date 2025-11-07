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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.public_.PublicRetrieveFeedbacksParams
import com.langchain.smith.services.async.public_.DatasetServiceAsync
import com.langchain.smith.services.async.public_.DatasetServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PublicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PublicServiceAsync {

    private val withRawResponse: PublicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PublicServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicServiceAsync =
        PublicServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasets(): DatasetServiceAsync = datasets

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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicServiceAsync.WithRawResponse =
            PublicServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

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
