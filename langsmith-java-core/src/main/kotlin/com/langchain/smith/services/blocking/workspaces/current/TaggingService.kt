// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.taggings.Tagging
import com.langchain.smith.models.workspaces.current.taggings.TaggingCreateParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingDeleteParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingDeleteResponse
import com.langchain.smith.models.workspaces.current.taggings.TaggingListParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingListResponse
import java.util.function.Consumer

interface TaggingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaggingService

    /** Create Tagging */
    fun create(params: TaggingCreateParams): Tagging = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaggingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tagging

    /** List Taggings */
    fun list(): List<TaggingListResponse> = list(TaggingListParams.none())

    /** @see list */
    fun list(
        params: TaggingListParams = TaggingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TaggingListResponse>

    /** @see list */
    fun list(params: TaggingListParams = TaggingListParams.none()): List<TaggingListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TaggingListResponse> =
        list(TaggingListParams.none(), requestOptions)

    /** Delete Tagging */
    fun delete(taggingId: String): TaggingDeleteResponse =
        delete(taggingId, TaggingDeleteParams.none())

    /** @see delete */
    fun delete(
        taggingId: String,
        params: TaggingDeleteParams = TaggingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaggingDeleteResponse =
        delete(params.toBuilder().taggingId(taggingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        taggingId: String,
        params: TaggingDeleteParams = TaggingDeleteParams.none(),
    ): TaggingDeleteResponse = delete(taggingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TaggingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaggingDeleteResponse

    /** @see delete */
    fun delete(params: TaggingDeleteParams): TaggingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taggingId: String, requestOptions: RequestOptions): TaggingDeleteResponse =
        delete(taggingId, TaggingDeleteParams.none(), requestOptions)

    /** A view of [TaggingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaggingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/taggings`, but is
         * otherwise the same as [TaggingService.create].
         */
        @MustBeClosed
        fun create(params: TaggingCreateParams): HttpResponseFor<Tagging> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TaggingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tagging>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/taggings`, but is
         * otherwise the same as [TaggingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<TaggingListResponse>> = list(TaggingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaggingListParams = TaggingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TaggingListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaggingListParams = TaggingListParams.none()
        ): HttpResponseFor<List<TaggingListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TaggingListResponse>> =
            list(TaggingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/taggings/{tagging_id}`, but is otherwise the same as
         * [TaggingService.delete].
         */
        @MustBeClosed
        fun delete(taggingId: String): HttpResponseFor<TaggingDeleteResponse> =
            delete(taggingId, TaggingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            taggingId: String,
            params: TaggingDeleteParams = TaggingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaggingDeleteResponse> =
            delete(params.toBuilder().taggingId(taggingId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            taggingId: String,
            params: TaggingDeleteParams = TaggingDeleteParams.none(),
        ): HttpResponseFor<TaggingDeleteResponse> = delete(taggingId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TaggingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaggingDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: TaggingDeleteParams): HttpResponseFor<TaggingDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            taggingId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaggingDeleteResponse> =
            delete(taggingId, TaggingDeleteParams.none(), requestOptions)
    }
}
