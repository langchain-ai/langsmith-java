// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.Tagging
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TaggingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaggingServiceAsync

    /** Create Tagging */
    fun create(params: TaggingCreateParams): CompletableFuture<Tagging> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaggingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tagging>

    /** List Taggings */
    fun list(): CompletableFuture<List<TaggingListResponse>> = list(TaggingListParams.none())

    /** @see list */
    fun list(
        params: TaggingListParams = TaggingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TaggingListResponse>>

    /** @see list */
    fun list(
        params: TaggingListParams = TaggingListParams.none()
    ): CompletableFuture<List<TaggingListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TaggingListResponse>> =
        list(TaggingListParams.none(), requestOptions)

    /** Delete Tagging */
    fun delete(taggingId: String): CompletableFuture<TaggingDeleteResponse> =
        delete(taggingId, TaggingDeleteParams.none())

    /** @see delete */
    fun delete(
        taggingId: String,
        params: TaggingDeleteParams = TaggingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaggingDeleteResponse> =
        delete(params.toBuilder().taggingId(taggingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        taggingId: String,
        params: TaggingDeleteParams = TaggingDeleteParams.none(),
    ): CompletableFuture<TaggingDeleteResponse> = delete(taggingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TaggingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaggingDeleteResponse>

    /** @see delete */
    fun delete(params: TaggingDeleteParams): CompletableFuture<TaggingDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        taggingId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TaggingDeleteResponse> =
        delete(taggingId, TaggingDeleteParams.none(), requestOptions)

    /**
     * A view of [TaggingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaggingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/taggings`, but is
         * otherwise the same as [TaggingServiceAsync.create].
         */
        fun create(params: TaggingCreateParams): CompletableFuture<HttpResponseFor<Tagging>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TaggingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tagging>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/taggings`, but is
         * otherwise the same as [TaggingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TaggingListResponse>>> =
            list(TaggingListParams.none())

        /** @see list */
        fun list(
            params: TaggingListParams = TaggingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TaggingListResponse>>>

        /** @see list */
        fun list(
            params: TaggingListParams = TaggingListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TaggingListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TaggingListResponse>>> =
            list(TaggingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/taggings/{tagging_id}`, but is otherwise the same as
         * [TaggingServiceAsync.delete].
         */
        fun delete(taggingId: String): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>> =
            delete(taggingId, TaggingDeleteParams.none())

        /** @see delete */
        fun delete(
            taggingId: String,
            params: TaggingDeleteParams = TaggingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>> =
            delete(params.toBuilder().taggingId(taggingId).build(), requestOptions)

        /** @see delete */
        fun delete(
            taggingId: String,
            params: TaggingDeleteParams = TaggingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>> =
            delete(taggingId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TaggingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>>

        /** @see delete */
        fun delete(
            params: TaggingDeleteParams
        ): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            taggingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>> =
            delete(taggingId, TaggingDeleteParams.none(), requestOptions)
    }
}
