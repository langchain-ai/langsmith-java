// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigRetrieveFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigSchema
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigUpdateFeedbackConfigsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FeedbackConfigServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FeedbackConfigServiceAsync {

    private val withRawResponse: FeedbackConfigServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeedbackConfigServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): FeedbackConfigServiceAsync =
        FeedbackConfigServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun feedbackConfigs(
        params: FeedbackConfigFeedbackConfigsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackConfigSchema> =
        // post /api/v1/feedback-configs
        withRawResponse().feedbackConfigs(params, requestOptions).thenApply { it.parse() }

    override fun retrieveFeedbackConfigs(
        params: FeedbackConfigRetrieveFeedbackConfigsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FeedbackConfigSchema>> =
        // get /api/v1/feedback-configs
        withRawResponse().retrieveFeedbackConfigs(params, requestOptions).thenApply { it.parse() }

    override fun updateFeedbackConfigs(
        params: FeedbackConfigUpdateFeedbackConfigsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackConfigSchema> =
        // patch /api/v1/feedback-configs
        withRawResponse().updateFeedbackConfigs(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackConfigServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackConfigServiceAsync.WithRawResponse =
            FeedbackConfigServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val feedbackConfigsHandler: Handler<FeedbackConfigSchema> =
            jsonHandler<FeedbackConfigSchema>(clientOptions.jsonMapper)

        override fun feedbackConfigs(
            params: FeedbackConfigFeedbackConfigsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackConfigSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback-configs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { feedbackConfigsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveFeedbackConfigsHandler: Handler<List<FeedbackConfigSchema>> =
            jsonHandler<List<FeedbackConfigSchema>>(clientOptions.jsonMapper)

        override fun retrieveFeedbackConfigs(
            params: FeedbackConfigRetrieveFeedbackConfigsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FeedbackConfigSchema>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback-configs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveFeedbackConfigsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val updateFeedbackConfigsHandler: Handler<FeedbackConfigSchema> =
            jsonHandler<FeedbackConfigSchema>(clientOptions.jsonMapper)

        override fun updateFeedbackConfigs(
            params: FeedbackConfigUpdateFeedbackConfigsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackConfigSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback-configs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateFeedbackConfigsHandler.handle(it) }
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
