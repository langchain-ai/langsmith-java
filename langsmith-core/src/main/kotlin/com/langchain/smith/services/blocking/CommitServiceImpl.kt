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
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitListResponse
import com.langchain.smith.models.commits.CommitManifestResponse
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitUpdateParams
import com.langchain.smith.models.commits.CommitUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitService {

    private val withRawResponse: CommitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService =
        CommitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions,
    ): CommitManifestResponse =
        // get /api/v1/commits/{owner}/{repo}/{commit}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CommitUpdateParams,
        requestOptions: RequestOptions,
    ): CommitUpdateResponse =
        // post /api/v1/commits/{owner}/{repo}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CommitListParams,
        requestOptions: RequestOptions,
    ): CommitListResponse =
        // get /api/v1/commits/{owner}/{repo}
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

        private val retrieveHandler: Handler<CommitManifestResponse> =
            jsonHandler<CommitManifestResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitManifestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commit", params.commit().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
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

        private val updateHandler: Handler<CommitUpdateResponse> =
            jsonHandler<CommitUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CommitUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "commits",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CommitListResponse> =
            jsonHandler<CommitListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "commits",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
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
            }
        }
    }
}
