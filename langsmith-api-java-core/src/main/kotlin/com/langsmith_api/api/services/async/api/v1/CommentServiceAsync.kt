// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.comments.Comment
import com.langsmith_api.api.models.api.v1.comments.CommentRetrieveParams
import com.langsmith_api.api.models.api.v1.comments.CommentUpdateParams
import com.langsmith_api.api.models.api.v1.comments.ListCommentsResponse
import com.langsmith_api.api.services.async.api.v1.comments.LikeServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync

    fun like(): LikeServiceAsync

    /** Get Sub Comments */
    fun retrieve(
        parentCommentId: String,
        params: CommentRetrieveParams,
    ): CompletableFuture<ListCommentsResponse> =
        retrieve(parentCommentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        parentCommentId: String,
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListCommentsResponse> =
        retrieve(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CommentRetrieveParams): CompletableFuture<ListCommentsResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListCommentsResponse>

    /** Create Sub Comment */
    fun update(parentCommentId: String, params: CommentUpdateParams): CompletableFuture<Comment> =
        update(parentCommentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        parentCommentId: String,
        params: CommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Comment> =
        update(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see update */
    fun update(params: CommentUpdateParams): CompletableFuture<Comment> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Comment>

    /**
     * A view of [CommentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse

        fun like(): LikeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}`, but is otherwise the same as
         * [CommentServiceAsync.retrieve].
         */
        fun retrieve(
            parentCommentId: String,
            params: CommentRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> =
            retrieve(parentCommentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            parentCommentId: String,
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> =
            retrieve(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: CommentRetrieveParams
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}`, but is otherwise the same as
         * [CommentServiceAsync.update].
         */
        fun update(
            parentCommentId: String,
            params: CommentUpdateParams,
        ): CompletableFuture<HttpResponseFor<Comment>> =
            update(parentCommentId, params, RequestOptions.none())

        /** @see update */
        fun update(
            parentCommentId: String,
            params: CommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Comment>> =
            update(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see update */
        fun update(params: CommentUpdateParams): CompletableFuture<HttpResponseFor<Comment>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Comment>>
    }
}
