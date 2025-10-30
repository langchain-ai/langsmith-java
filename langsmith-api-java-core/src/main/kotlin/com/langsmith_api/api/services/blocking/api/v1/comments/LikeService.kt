// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.comments

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.comments.like.LikeCreateParams
import com.langsmith_api.api.models.api.v1.comments.like.LikeCreateResponse
import com.langsmith_api.api.models.api.v1.comments.like.LikeDeleteAllParams
import com.langsmith_api.api.models.api.v1.comments.like.LikeDeleteAllResponse
import java.util.function.Consumer

interface LikeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeService

    /** Like Comment */
    fun create(parentCommentId: String, params: LikeCreateParams): LikeCreateResponse =
        create(parentCommentId, params, RequestOptions.none())

    /** @see create */
    fun create(
        parentCommentId: String,
        params: LikeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeCreateResponse =
        create(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see create */
    fun create(params: LikeCreateParams): LikeCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LikeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeCreateResponse

    /** Unlike Comment */
    fun deleteAll(parentCommentId: String, params: LikeDeleteAllParams): LikeDeleteAllResponse =
        deleteAll(parentCommentId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        parentCommentId: String,
        params: LikeDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeDeleteAllResponse =
        deleteAll(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(params: LikeDeleteAllParams): LikeDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: LikeDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeDeleteAllResponse

    /** A view of [LikeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like`, but is otherwise the same as
         * [LikeService.create].
         */
        @MustBeClosed
        fun create(
            parentCommentId: String,
            params: LikeCreateParams,
        ): HttpResponseFor<LikeCreateResponse> =
            create(parentCommentId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            parentCommentId: String,
            params: LikeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeCreateResponse> =
            create(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: LikeCreateParams): HttpResponseFor<LikeCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LikeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeCreateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/comments/{owner}/{repo}/{parent_comment_id}/like`, but is otherwise the same as
         * [LikeService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(
            parentCommentId: String,
            params: LikeDeleteAllParams,
        ): HttpResponseFor<LikeDeleteAllResponse> =
            deleteAll(parentCommentId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            parentCommentId: String,
            params: LikeDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeDeleteAllResponse> =
            deleteAll(params.toBuilder().parentCommentId(parentCommentId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: LikeDeleteAllParams): HttpResponseFor<LikeDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: LikeDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeDeleteAllResponse>
    }
}
