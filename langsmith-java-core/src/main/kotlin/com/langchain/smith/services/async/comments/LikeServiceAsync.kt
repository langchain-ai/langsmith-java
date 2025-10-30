// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.comments

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.comments.like.LikeCreateParams
import com.langchain.smith.models.comments.like.LikeCreateResponse
import com.langchain.smith.models.comments.like.LikeDeleteAllParams
import com.langchain.smith.models.comments.like.LikeDeleteAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LikeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeServiceAsync

    /** Like Comment */
    fun create(
        parentCommentId: String,
        params: LikeCreateParams,
    ): CompletableFuture<LikeCreateResponse> =
        create(parentCommentId, params, RequestOptions.none())

    /** @see create */
    fun create(
        parentCommentId: String,
        params: LikeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeCreateResponse> =
        create(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see create */
    fun create(params: LikeCreateParams): CompletableFuture<LikeCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LikeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeCreateResponse>

    /** Unlike Comment */
    fun deleteAll(
        parentCommentId: String,
        params: LikeDeleteAllParams,
    ): CompletableFuture<LikeDeleteAllResponse> =
        deleteAll(parentCommentId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        parentCommentId: String,
        params: LikeDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeDeleteAllResponse> =
        deleteAll(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(params: LikeDeleteAllParams): CompletableFuture<LikeDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: LikeDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeDeleteAllResponse>

    /** A view of [LikeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like`, but is otherwise the same as
         * [LikeServiceAsync.create].
         */
        fun create(
            parentCommentId: String,
            params: LikeCreateParams,
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(parentCommentId, params, RequestOptions.none())

        /** @see create */
        fun create(
            parentCommentId: String,
            params: LikeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see create */
        fun create(
            params: LikeCreateParams
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LikeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like`, but is otherwise the same as
         * [LikeServiceAsync.deleteAll].
         */
        fun deleteAll(
            parentCommentId: String,
            params: LikeDeleteAllParams,
        ): CompletableFuture<HttpResponseFor<LikeDeleteAllResponse>> =
            deleteAll(parentCommentId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            parentCommentId: String,
            params: LikeDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeDeleteAllResponse>> =
            deleteAll(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            params: LikeDeleteAllParams
        ): CompletableFuture<HttpResponseFor<LikeDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: LikeDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeDeleteAllResponse>>
    }
}
