// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.repos.tags.RepoTag
import com.langchain.smith.models.repos.tags.TagCreateParams
import com.langchain.smith.models.repos.tags.TagDeleteParams
import com.langchain.smith.models.repos.tags.TagDeleteResponse
import com.langchain.smith.models.repos.tags.TagListParams
import com.langchain.smith.models.repos.tags.TagListResponse
import com.langchain.smith.models.repos.tags.TagRetrieveAllParams
import com.langchain.smith.models.repos.tags.TagRetrieveParams
import com.langchain.smith.models.repos.tags.TagUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TagServiceAsync {

    private val withRawResponse: TagServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TagServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync =
        TagServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RepoTag> =
        // post /api/v1/repos/{owner}/{repo}/tags
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TagRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RepoTag> =
        // get /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RepoTag> =
        // patch /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TagListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagListResponse> =
        // get /api/v1/repos/tags
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagDeleteResponse> =
        // delete /api/v1/repos/{owner}/{repo}/tags/{tag_name}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveAll(
        params: TagRetrieveAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RepoTag>> =
        // get /api/v1/repos/{owner}/{repo}/tags
        withRawResponse().retrieveAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagServiceAsync.WithRawResponse =
            TagServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RepoTag> = jsonHandler<RepoTag>(clientOptions.jsonMapper)

        override fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RepoTag>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<RepoTag> =
            jsonHandler<RepoTag>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TagRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RepoTag>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<RepoTag> = jsonHandler<RepoTag>(clientOptions.jsonMapper)

        override fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RepoTag>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TagListResponse> =
            jsonHandler<TagListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TagListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "repos", "tags")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<TagDeleteResponse> =
            jsonHandler<TagDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveAllHandler: Handler<List<RepoTag>> =
            jsonHandler<List<RepoTag>>(clientOptions.jsonMapper)

        override fun retrieveAll(
            params: TagRetrieveAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
