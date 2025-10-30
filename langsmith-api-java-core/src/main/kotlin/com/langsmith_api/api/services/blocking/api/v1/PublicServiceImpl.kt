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
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.feedback.FeedbackSchema
import com.langsmith_api.api.models.api.v1.public_.PublicRetrieveFeedbacksParams
import com.langsmith_api.api.services.blocking.api.v1.public_.DatasetService
import com.langsmith_api.api.services.blocking.api.v1.public_.DatasetServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.public_.ExampleService
import com.langsmith_api.api.services.blocking.api.v1.public_.ExampleServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.public_.RunService
import com.langsmith_api.api.services.blocking.api.v1.public_.RunServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.public_.SchemaService
import com.langsmith_api.api.services.blocking.api.v1.public_.SchemaServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PublicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PublicService {

    private val withRawResponse: PublicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptions) }

    private val schemas: SchemaService by lazy { SchemaServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun withRawResponse(): PublicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicService =
        PublicServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasets(): DatasetService = datasets

    override fun examples(): ExampleService = examples

    override fun schemas(): SchemaService = schemas

    override fun runs(): RunService = runs

    override fun retrieveFeedbacks(
        params: PublicRetrieveFeedbacksParams,
        requestOptions: RequestOptions,
    ): List<FeedbackSchema> =
        // get /api/v1/public/{share_token}/feedbacks
        withRawResponse().retrieveFeedbacks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PublicService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val examples: ExampleService.WithRawResponse by lazy {
            ExampleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val schemas: SchemaService.WithRawResponse by lazy {
            SchemaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicService.WithRawResponse =
            PublicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun examples(): ExampleService.WithRawResponse = examples

        override fun schemas(): SchemaService.WithRawResponse = schemas

        override fun runs(): RunService.WithRawResponse = runs

        private val retrieveFeedbacksHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun retrieveFeedbacks(
            params: PublicRetrieveFeedbacksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeedbackSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", params._pathParam(0), "feedbacks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
