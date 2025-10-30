// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigRetrieveFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigSchema
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigUpdateFeedbackConfigsParams
import java.util.function.Consumer

class FeedbackConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackConfigService {

    private val withRawResponse: FeedbackConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeedbackConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackConfigService =
        FeedbackConfigServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun feedbackConfigs(
        params: FeedbackConfigFeedbackConfigsParams,
        requestOptions: RequestOptions,
    ): FeedbackConfigSchema =
        // post /api/v1/feedback-configs
        withRawResponse().feedbackConfigs(params, requestOptions).parse()

    override fun retrieveFeedbackConfigs(
        params: FeedbackConfigRetrieveFeedbackConfigsParams,
        requestOptions: RequestOptions,
    ): List<FeedbackConfigSchema> =
        // get /api/v1/feedback-configs
        withRawResponse().retrieveFeedbackConfigs(params, requestOptions).parse()

    override fun updateFeedbackConfigs(
        params: FeedbackConfigUpdateFeedbackConfigsParams,
        requestOptions: RequestOptions,
    ): FeedbackConfigSchema =
        // patch /api/v1/feedback-configs
        withRawResponse().updateFeedbackConfigs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackConfigService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackConfigService.WithRawResponse =
            FeedbackConfigServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val feedbackConfigsHandler: Handler<FeedbackConfigSchema> =
            jsonHandler<FeedbackConfigSchema>(clientOptions.jsonMapper)

        override fun feedbackConfigs(
            params: FeedbackConfigFeedbackConfigsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackConfigSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback-configs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { feedbackConfigsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveFeedbackConfigsHandler: Handler<List<FeedbackConfigSchema>> =
            jsonHandler<List<FeedbackConfigSchema>>(clientOptions.jsonMapper)

        override fun retrieveFeedbackConfigs(
            params: FeedbackConfigRetrieveFeedbackConfigsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeedbackConfigSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback-configs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveFeedbackConfigsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateFeedbackConfigsHandler: Handler<FeedbackConfigSchema> =
            jsonHandler<FeedbackConfigSchema>(clientOptions.jsonMapper)

        override fun updateFeedbackConfigs(
            params: FeedbackConfigUpdateFeedbackConfigsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackConfigSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "feedback-configs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
