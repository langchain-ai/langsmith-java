// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.tags.TagListParams
import com.langchain.smith.models.workspaces.current.tags.TagListResponse
import com.langchain.smith.models.workspaces.current.tags.TagResourcesParams
import com.langchain.smith.models.workspaces.current.tags.TagResourcesResponse
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceParams
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync

    /** List Tags */
    fun list(): CompletableFuture<List<TagListResponse>> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagListResponse>>

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none()
    ): CompletableFuture<List<TagListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TagListResponse>> =
        list(TagListParams.none(), requestOptions)

    /** List Tags For Resources */
    fun resources(params: TagResourcesParams): CompletableFuture<TagResourcesResponse> =
        resources(params, RequestOptions.none())

    /** @see resources */
    fun resources(
        params: TagResourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagResourcesResponse>

    /** List Tags For Resource */
    fun retrieveResource(
        params: TagRetrieveResourceParams
    ): CompletableFuture<List<TagRetrieveResourceResponse>> =
        retrieveResource(params, RequestOptions.none())

    /** @see retrieveResource */
    fun retrieveResource(
        params: TagRetrieveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagRetrieveResourceResponse>>

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tags`, but is otherwise
         * the same as [TagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TagListResponse>>> =
            list(TagListParams.none())

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagListResponse>>>

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TagListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TagListResponse>>> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/tags/resources`, but is
         * otherwise the same as [TagServiceAsync.resources].
         */
        fun resources(
            params: TagResourcesParams
        ): CompletableFuture<HttpResponseFor<TagResourcesResponse>> =
            resources(params, RequestOptions.none())

        /** @see resources */
        fun resources(
            params: TagResourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagResourcesResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tags/resource`, but is
         * otherwise the same as [TagServiceAsync.retrieveResource].
         */
        fun retrieveResource(
            params: TagRetrieveResourceParams
        ): CompletableFuture<HttpResponseFor<List<TagRetrieveResourceResponse>>> =
            retrieveResource(params, RequestOptions.none())

        /** @see retrieveResource */
        fun retrieveResource(
            params: TagRetrieveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagRetrieveResourceResponse>>>
    }
}
