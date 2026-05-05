// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.emptyHandler
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
import com.langchain.smith.models.repos.directories.DirectoryCommitParams
import com.langchain.smith.models.repos.directories.DirectoryCommitResponse
import com.langchain.smith.models.repos.directories.DirectoryDeleteParams
import com.langchain.smith.models.repos.directories.DirectoryListParams
import com.langchain.smith.models.repos.directories.DirectoryListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DirectoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectoryService {

    private val withRawResponse: DirectoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DirectoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService =
        DirectoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DirectoryListParams,
        requestOptions: RequestOptions,
    ): DirectoryListResponse =
        // get /v1/platform/hub/repos/{owner}/{repo}/directories
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DirectoryDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/platform/hub/repos/{owner}/{repo}/directories
        withRawResponse().delete(params, requestOptions)
    }

    override fun commit(
        params: DirectoryCommitParams,
        requestOptions: RequestOptions,
    ): DirectoryCommitResponse =
        // post /v1/platform/hub/repos/{owner}/{repo}/directories/commits
        withRawResponse().commit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirectoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectoryService.WithRawResponse =
            DirectoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DirectoryListResponse> =
            jsonHandler<DirectoryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DirectoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "hub",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "directories",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "hub",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "directories",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val commitHandler: Handler<DirectoryCommitResponse> =
            jsonHandler<DirectoryCommitResponse>(clientOptions.jsonMapper)

        override fun commit(
            params: DirectoryCommitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryCommitResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "hub",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "directories",
                        "commits",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { commitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
