// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current.members

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
import com.langchain.smith.models.orgs.current.members.basic.BasicBatchParams
import com.langchain.smith.models.orgs.current.members.basic.BasicBatchResponse
import java.util.function.Consumer

class BasicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BasicService {

    private val withRawResponse: BasicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BasicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BasicService =
        BasicServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(
        params: BasicBatchParams,
        requestOptions: RequestOptions,
    ): List<BasicBatchResponse> =
        // post /api/v1/orgs/current/members/basic/batch
        withRawResponse().batch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BasicService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BasicService.WithRawResponse =
            BasicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchHandler: Handler<List<BasicBatchResponse>> =
            jsonHandler<List<BasicBatchResponse>>(clientOptions.jsonMapper)

        override fun batch(
            params: BasicBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BasicBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "members", "basic", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
