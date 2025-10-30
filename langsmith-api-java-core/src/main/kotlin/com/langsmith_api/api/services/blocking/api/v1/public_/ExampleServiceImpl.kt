// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.public_

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
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.examples.Example
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleListParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRetrieveCountParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRunsParams
import com.langsmith_api.api.models.api.v1.public_.examples.ExampleRunsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExampleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleService {

    private val withRawResponse: ExampleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExampleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService =
        ExampleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: ExampleListParams, requestOptions: RequestOptions): List<Example> =
        // get /api/v1/public/{share_token}/examples
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveCount(
        params: ExampleRetrieveCountParams,
        requestOptions: RequestOptions,
    ): Long =
        // get /api/v1/public/{share_token}/examples/count
        withRawResponse().retrieveCount(params, requestOptions).parse()

    override fun runs(
        params: ExampleRunsParams,
        requestOptions: RequestOptions,
    ): ExampleRunsResponse =
        // post /api/v1/public/{share_token}/examples/runs
        withRawResponse().runs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExampleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleService.WithRawResponse =
            ExampleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun list(
            params: ExampleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Example>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", params._pathParam(0), "examples")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrieveCountHandler: Handler<Long> =
            jsonHandler<Long>(clientOptions.jsonMapper)

        override fun retrieveCount(
            params: ExampleRetrieveCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Long> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "examples",
                        "count",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveCountHandler.handle(it) }
            }
        }

        private val runsHandler: Handler<ExampleRunsResponse> =
            jsonHandler<ExampleRunsResponse>(clientOptions.jsonMapper)

        override fun runs(
            params: ExampleRunsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleRunsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "examples",
                        "runs",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { runsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
