// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.public_.PublicRetrieveFeedbacksParams
import com.langchain.smith.services.blocking.public_.DatasetService
import com.langchain.smith.services.blocking.public_.DatasetServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PublicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PublicService {

    private val withRawResponse: PublicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    override fun withRawResponse(): PublicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicService =
        PublicServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasets(): DatasetService = datasets

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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicService.WithRawResponse =
            PublicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasets(): DatasetService.WithRawResponse = datasets

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
