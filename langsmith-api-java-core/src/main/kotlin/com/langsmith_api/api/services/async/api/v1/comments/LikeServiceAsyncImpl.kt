// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.comments

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.comments.like.LikeCreateParams
import com.langsmith_api.api.models.api.v1.comments.like.LikeCreateResponse
import com.langsmith_api.api.models.api.v1.comments.like.LikeDeleteAllParams
import com.langsmith_api.api.models.api.v1.comments.like.LikeDeleteAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LikeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LikeServiceAsync {

    private val withRawResponse: LikeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LikeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeServiceAsync =
        LikeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LikeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LikeCreateResponse> =
        // post /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: LikeDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LikeDeleteAllResponse> =
        // delete /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like
        withRawResponse().deleteAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LikeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LikeServiceAsync.WithRawResponse =
            LikeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LikeCreateResponse> =
            jsonHandler<LikeCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LikeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> {
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
                        "like",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAllHandler: Handler<LikeDeleteAllResponse> =
            jsonHandler<LikeDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: LikeDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LikeDeleteAllResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("parentCommentId", params.parentCommentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "comments",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
                        "like",
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
                            .use { deleteAllHandler.handle(it) }
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
