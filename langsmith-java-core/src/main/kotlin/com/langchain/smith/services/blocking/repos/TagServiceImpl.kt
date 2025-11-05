// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos

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
import com.langchain.smith.models.repos.tags.RepoTag
import com.langchain.smith.models.repos.tags.TagCreateParams
import com.langchain.smith.models.repos.tags.TagDeleteParams
import com.langchain.smith.models.repos.tags.TagDeleteResponse
import com.langchain.smith.models.repos.tags.TagListParams
import com.langchain.smith.models.repos.tags.TagListResponse
import com.langchain.smith.models.repos.tags.TagRetrieveAllParams
import com.langchain.smith.models.repos.tags.TagRetrieveParams
import com.langchain.smith.models.repos.tags.TagUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagServiceImpl internal constructor(private val clientOptions: ClientOptions) : TagService {

    private val withRawResponse: TagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService =
        TagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: TagCreateParams, requestOptions: RequestOptions): RepoTag =
        // post /api/v1/repos/{owner}/{repo}/tags
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: TagRetrieveParams, requestOptions: RequestOptions): RepoTag =
        // get /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TagUpdateParams, requestOptions: RequestOptions): RepoTag =
        // patch /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: TagListParams, requestOptions: RequestOptions): TagListResponse =
        // get /api/v1/repos/tags
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions,
    ): TagDeleteResponse =
        // delete /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveAll(
        params: TagRetrieveAllParams,
        requestOptions: RequestOptions,
    ): List<RepoTag> =
        // get /api/v1/repos/{owner}/{repo}/tags
        withRawResponse().retrieveAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagService.WithRawResponse =
            TagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RepoTag> = jsonHandler<RepoTag>(clientOptions.jsonMapper)

        override fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RepoTag> {
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
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "tags",
                    )
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

        private val retrieveHandler: Handler<RepoTag> =
            jsonHandler<RepoTag>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TagRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RepoTag> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagName", params.tagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "tags",
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

        private val updateHandler: Handler<RepoTag> = jsonHandler<RepoTag>(clientOptions.jsonMapper)

        override fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RepoTag> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagName", params.tagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "tags",
                        params._pathParam(2),
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

        private val listHandler: Handler<TagListResponse> =
            jsonHandler<TagListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TagListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "repos", "tags")
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

        private val deleteHandler: Handler<TagDeleteResponse> =
            jsonHandler<TagDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagName", params.tagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "tags",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveAllHandler: Handler<List<RepoTag>> =
            jsonHandler<List<RepoTag>>(clientOptions.jsonMapper)

        override fun retrieveAll(
            params: TagRetrieveAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RepoTag>> {
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
                        "repos",
                        params._pathParam(0),
                        params._pathParam(1),
                        "tags",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
