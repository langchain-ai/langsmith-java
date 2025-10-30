// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.services.async.comments.LikeServiceAsync
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

    /** Create Comment */
    fun create(
        repo: String,
        params: CommentCreateParams,
    ): CompletableFuture<CommentCreateResponse> = create(repo, params, RequestOptions.none())

    /** @see create */
    fun create(
        repo: String,
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse> =
        create(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see create */
    fun create(params: CommentCreateParams): CompletableFuture<CommentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse>

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

    /** Get Comments */
    fun list(repo: String, params: CommentListParams): CompletableFuture<ListCommentsResponse> =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListCommentsResponse> =
        list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: CommentListParams): CompletableFuture<ListCommentsResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListCommentsResponse>

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
         * Returns a raw HTTP response for `post /api/v1/comments/{owner}/{repo}`, but is otherwise
         * the same as [CommentServiceAsync.create].
         */
        fun create(
            repo: String,
            params: CommentCreateParams,
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(repo, params, RequestOptions.none())

        /** @see create */
        fun create(
            repo: String,
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see create */
        fun create(
            params: CommentCreateParams
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>>

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

        /**
         * Returns a raw HTTP response for `get /api/v1/comments/{owner}/{repo}`, but is otherwise
         * the same as [CommentServiceAsync.list].
         */
        fun list(
            repo: String,
            params: CommentListParams,
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        fun list(
            repo: String,
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        fun list(
            params: CommentListParams
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListCommentsResponse>>
    }
}
