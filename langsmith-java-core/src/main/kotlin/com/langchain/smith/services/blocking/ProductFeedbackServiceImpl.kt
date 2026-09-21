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
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateParams
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateResponse
import com.langchain.smith.models.productfeedback.ProductFeedbackRetrieveParams
import com.langchain.smith.models.productfeedback.ProductFeedbackRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProductFeedbackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductFeedbackService {

    private val withRawResponse: ProductFeedbackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductFeedbackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductFeedbackService =
        ProductFeedbackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ProductFeedbackCreateParams,
        requestOptions: RequestOptions,
    ): ProductFeedbackCreateResponse =
        // post /api/v1/platform/product-feedbacks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProductFeedbackRetrieveParams,
        requestOptions: RequestOptions,
    ): ProductFeedbackRetrieveResponse =
        // get /api/v1/platform/product-feedbacks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductFeedbackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductFeedbackService.WithRawResponse =
            ProductFeedbackServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ProductFeedbackCreateResponse> =
            jsonHandler<ProductFeedbackCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProductFeedbackCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductFeedbackCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "platform", "product-feedbacks")
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

        private val retrieveHandler: Handler<ProductFeedbackRetrieveResponse> =
            jsonHandler<ProductFeedbackRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProductFeedbackRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductFeedbackRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "product-feedbacks",
                        params._pathParam(0),
                    )
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
    }
}
