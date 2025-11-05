// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.comments

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
import com.langchain.smith.models.comments.like.LikeCreateParams
import com.langchain.smith.models.comments.like.LikeCreateResponse
import com.langchain.smith.models.comments.like.LikeDeleteAllParams
import com.langchain.smith.models.comments.like.LikeDeleteAllResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LikeServiceImpl internal constructor(private val clientOptions: ClientOptions) : LikeService {

    private val withRawResponse: LikeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LikeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeService =
        LikeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LikeCreateParams,
        requestOptions: RequestOptions,
    ): LikeCreateResponse =
        // post /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like
        withRawResponse().create(params, requestOptions).parse()

    override fun deleteAll(
        params: LikeDeleteAllParams,
        requestOptions: RequestOptions,
    ): LikeDeleteAllResponse =
        // delete /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like
        withRawResponse().deleteAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LikeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LikeService.WithRawResponse =
            LikeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LikeCreateResponse> =
            jsonHandler<LikeCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LikeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LikeCreateResponse> {
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

        private val deleteAllHandler: Handler<LikeDeleteAllResponse> =
            jsonHandler<LikeDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: LikeDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LikeDeleteAllResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
