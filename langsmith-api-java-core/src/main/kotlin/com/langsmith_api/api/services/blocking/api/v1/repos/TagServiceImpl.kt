// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos

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
import com.langsmith_api.api.models.api.v1.repos.tags.RepoTag
import com.langsmith_api.api.models.api.v1.repos.tags.TagCreateParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagDeleteParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagDeleteResponse
import com.langsmith_api.api.models.api.v1.repos.tags.TagListParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagUpdateParams
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

    override fun list(params: TagListParams, requestOptions: RequestOptions): List<RepoTag> =
        // get /api/v1/repos/{owner}/{repo}/tags
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions,
    ): TagDeleteResponse =
        // delete /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().delete(params, requestOptions).parse()

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

        private val listHandler: Handler<List<RepoTag>> =
            jsonHandler<List<RepoTag>>(clientOptions.jsonMapper)

        override fun list(
            params: TagListParams,
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
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
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
    }
}
