// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.models.commits.CommitCreateParams
import com.langchain.smith.models.commits.CommitCreateResponse
import com.langchain.smith.models.commits.CommitListPage
import com.langchain.smith.models.commits.CommitListPageResponse
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitRetrieveResponse
import java.util.function.Consumer

class CommitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitService {

    private val withRawResponse: CommitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService =
        CommitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions,
    ): CommitCreateResponse =
        // post /commits/{owner}/{repo}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions,
    ): CommitRetrieveResponse =
        // get /commits/{owner}/{repo}/{commit}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: CommitListParams, requestOptions: RequestOptions): CommitListPage =
        // get /commits/{owner}/{repo}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommitService.WithRawResponse =
            CommitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CommitCreateResponse> =
            jsonHandler<CommitCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("commits", params._pathParam(0), params._pathParam(1))
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

        private val retrieveHandler: Handler<CommitRetrieveResponse> =
            jsonHandler<CommitRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "commits",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val listHandler: Handler<CommitListPageResponse> =
            jsonHandler<CommitListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("commits", params._pathParam(0), params._pathParam(1))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CommitListPage.builder()
                            .service(CommitServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
