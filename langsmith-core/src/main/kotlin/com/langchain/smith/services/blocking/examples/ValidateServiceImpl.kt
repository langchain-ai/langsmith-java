// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.examples

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
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
import com.langchain.smith.models.examples.validate.ExampleValidationResult
import com.langchain.smith.models.examples.validate.ValidateBulkParams
import com.langchain.smith.models.examples.validate.ValidateCreateParams
import java.util.function.Consumer

class ValidateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidateService {

    private val withRawResponse: ValidateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService =
        ValidateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ValidateCreateParams,
        requestOptions: RequestOptions,
    ): ExampleValidationResult =
        // post /api/v1/examples/validate
        withRawResponse().create(params, requestOptions).parse()

    override fun bulk(
        params: ValidateBulkParams,
        requestOptions: RequestOptions,
    ): List<ExampleValidationResult> =
        // post /api/v1/examples/validate/bulk
        withRawResponse().bulk(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateService.WithRawResponse =
            ValidateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExampleValidationResult> =
            jsonHandler<ExampleValidationResult>(clientOptions.jsonMapper)

        override fun create(
            params: ValidateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleValidationResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", "validate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val bulkHandler: Handler<List<ExampleValidationResult>> =
            jsonHandler<List<ExampleValidationResult>>(clientOptions.jsonMapper)

        override fun bulk(
            params: ValidateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ExampleValidationResult>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", "validate", "bulk")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
