// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.comments.Comment
import com.langchain.smith.models.comments.CommentCreateParams
import com.langchain.smith.models.comments.CommentCreateResponse
import com.langchain.smith.models.comments.CommentListParams
import com.langchain.smith.models.comments.CommentRetrieveParams
import com.langchain.smith.models.comments.CommentUpdateParams
import com.langchain.smith.models.comments.ListCommentsResponse
import com.langchain.smith.services.blocking.comments.LikeService
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

    /** Create Comment */
    fun create(repo: String, params: CommentCreateParams): CommentCreateResponse =
        create(repo, params, RequestOptions.none())

    /** @see create */
    fun create(
        repo: String,
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse = create(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see create */
    fun create(params: CommentCreateParams): CommentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse

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

    /** Get Comments */
    fun list(repo: String, params: CommentListParams): ListCommentsResponse =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListCommentsResponse = list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: CommentListParams): ListCommentsResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListCommentsResponse

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
         * Returns a raw HTTP response for `post /api/v1/comments/{owner}/{repo}`, but is otherwise
         * the same as [CommentService.create].
         */
        @MustBeClosed
        fun create(
            repo: String,
            params: CommentCreateParams,
        ): HttpResponseFor<CommentCreateResponse> = create(repo, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            repo: String,
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse> =
            create(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CommentCreateParams): HttpResponseFor<CommentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse>

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

        /**
         * Returns a raw HTTP response for `get /api/v1/comments/{owner}/{repo}`, but is otherwise
         * the same as [CommentService.list].
         */
        @MustBeClosed
        fun list(repo: String, params: CommentListParams): HttpResponseFor<ListCommentsResponse> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            repo: String,
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListCommentsResponse> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: CommentListParams): HttpResponseFor<ListCommentsResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListCommentsResponse>
    }
}
