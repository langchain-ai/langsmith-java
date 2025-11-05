// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.comments.Comment
import com.langchain.smith.models.comments.CommentCreateParams
import com.langchain.smith.models.comments.CommentCreateResponse
import com.langchain.smith.models.comments.CommentListParams
import com.langchain.smith.models.comments.CommentRetrieveParams
import com.langchain.smith.models.comments.CommentUpdateParams
import com.langchain.smith.models.comments.ListCommentsResponse
import com.langchain.smith.services.async.comments.LikeServiceAsync
import com.langchain.smith.services.async.comments.LikeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentServiceAsync {

    private val withRawResponse: CommentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val like: LikeServiceAsync by lazy { LikeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CommentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync =
        CommentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun like(): LikeServiceAsync = like

    override fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentCreateResponse> =
        // post /api/v1/comments/{owner}/{repo}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListCommentsResponse> =
        // get /api/v1/comments/{owner}/{repo}/{parent_comment_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CommentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Comment> =
        // post /api/v1/comments/{owner}/{repo}/{parent_comment_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CommentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListCommentsResponse> =
        // get /api/v1/comments/{owner}/{repo}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val like: LikeServiceAsync.WithRawResponse by lazy {
            LikeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse =
            CommentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun like(): LikeServiceAsync.WithRawResponse = like

        private val createHandler: Handler<CommentCreateResponse> =
            jsonHandler<CommentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> {
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
                        "comments",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val retrieveHandler: Handler<ListCommentsResponse> =
            jsonHandler<ListCommentsResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("parentCommentId", params.parentCommentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "comments",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val updateHandler: Handler<Comment> = jsonHandler<Comment>(clientOptions.jsonMapper)

        override fun update(
            params: CommentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Comment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("parentCommentId", params.parentCommentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "comments",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val listHandler: Handler<ListCommentsResponse> =
            jsonHandler<ListCommentsResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> {
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
                        "comments",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
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
    }
}
