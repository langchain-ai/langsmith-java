// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.comments.Comment
import com.langsmith_api.api.models.api.v1.comments.CommentRetrieveParams
import com.langsmith_api.api.models.api.v1.comments.CommentUpdateParams
import com.langsmith_api.api.models.api.v1.comments.ListCommentsResponse
import com.langsmith_api.api.services.blocking.api.v1.comments.LikeService
import java.util.function.Consumer

interface CommentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService

    fun like(): LikeService

    /** Get Sub Comments */
    fun retrieve(parentCommentId: String, params: CommentRetrieveParams): ListCommentsResponse =
        retrieve(parentCommentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        parentCommentId: String,
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListCommentsResponse =
        retrieve(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CommentRetrieveParams): ListCommentsResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListCommentsResponse

    /** Create Sub Comment */
    fun update(parentCommentId: String, params: CommentUpdateParams): Comment =
        update(parentCommentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        parentCommentId: String,
        params: CommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Comment = update(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see update */
    fun update(params: CommentUpdateParams): Comment = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Comment

    /** A view of [CommentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService.WithRawResponse

        fun like(): LikeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}`, but is otherwise the same as
         * [CommentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            parentCommentId: String,
            params: CommentRetrieveParams,
        ): HttpResponseFor<ListCommentsResponse> =
            retrieve(parentCommentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            parentCommentId: String,
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListCommentsResponse> =
            retrieve(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommentRetrieveParams): HttpResponseFor<ListCommentsResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListCommentsResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}`, but is otherwise the same as
         * [CommentService.update].
         */
        @MustBeClosed
        fun update(parentCommentId: String, params: CommentUpdateParams): HttpResponseFor<Comment> =
            update(parentCommentId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            parentCommentId: String,
            params: CommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Comment> =
            update(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CommentUpdateParams): HttpResponseFor<Comment> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Comment>
    }
}
