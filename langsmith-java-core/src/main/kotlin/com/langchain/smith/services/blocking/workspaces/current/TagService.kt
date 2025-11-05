// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.tags.TagListParams
import com.langchain.smith.models.workspaces.current.tags.TagListResponse
import com.langchain.smith.models.workspaces.current.tags.TagResourcesParams
import com.langchain.smith.models.workspaces.current.tags.TagResourcesResponse
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceParams
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceResponse
import java.util.function.Consumer

interface TagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService

    /** List Tags */
    fun list(): List<TagListResponse> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagListResponse>

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): List<TagListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TagListResponse> =
        list(TagListParams.none(), requestOptions)

    /** List Tags For Resources */
    fun resources(params: TagResourcesParams): TagResourcesResponse =
        resources(params, RequestOptions.none())

    /** @see resources */
    fun resources(
        params: TagResourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagResourcesResponse

    /** List Tags For Resource */
    fun retrieveResource(params: TagRetrieveResourceParams): List<TagRetrieveResourceResponse> =
        retrieveResource(params, RequestOptions.none())

    /** @see retrieveResource */
    fun retrieveResource(
        params: TagRetrieveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagRetrieveResourceResponse>

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tags`, but is otherwise
         * the same as [TagService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<TagListResponse>> = list(TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none()
        ): HttpResponseFor<List<TagListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TagListResponse>> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/tags/resources`, but is
         * otherwise the same as [TagService.resources].
         */
        @MustBeClosed
        fun resources(params: TagResourcesParams): HttpResponseFor<TagResourcesResponse> =
            resources(params, RequestOptions.none())

        /** @see resources */
        @MustBeClosed
        fun resources(
            params: TagResourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagResourcesResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tags/resource`, but is
         * otherwise the same as [TagService.retrieveResource].
         */
        @MustBeClosed
        fun retrieveResource(
            params: TagRetrieveResourceParams
        ): HttpResponseFor<List<TagRetrieveResourceResponse>> =
            retrieveResource(params, RequestOptions.none())

        /** @see retrieveResource */
        @MustBeClosed
        fun retrieveResource(
            params: TagRetrieveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagRetrieveResourceResponse>>
    }
}
