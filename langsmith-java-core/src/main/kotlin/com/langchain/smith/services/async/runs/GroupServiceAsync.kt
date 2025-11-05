// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.group.GroupCreateParams
import com.langchain.smith.models.runs.group.GroupCreateResponse
import com.langchain.smith.models.runs.group.GroupStatsParams
import com.langchain.smith.models.runs.group.GroupStatsResponse
import com.langchain.smith.models.runs.group.RunGroupRequest
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Get runs grouped by an expression */
    fun create(params: GroupCreateParams): CompletableFuture<GroupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupCreateResponse>

    /** @see create */
    fun create(
        runGroupRequest: RunGroupRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupCreateResponse> =
        create(GroupCreateParams.builder().runGroupRequest(runGroupRequest).build(), requestOptions)

    /** @see create */
    fun create(runGroupRequest: RunGroupRequest): CompletableFuture<GroupCreateResponse> =
        create(runGroupRequest, RequestOptions.none())

    /** Get stats for the grouped runs. */
    fun stats(params: GroupStatsParams): CompletableFuture<GroupStatsResponse> =
        stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: GroupStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupStatsResponse>

    /** @see stats */
    fun stats(
        runGroupRequest: RunGroupRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupStatsResponse> =
        stats(GroupStatsParams.builder().runGroupRequest(runGroupRequest).build(), requestOptions)

    /** @see stats */
    fun stats(runGroupRequest: RunGroupRequest): CompletableFuture<GroupStatsResponse> =
        stats(runGroupRequest, RequestOptions.none())

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/group`, but is otherwise the same as
         * [GroupServiceAsync.create].
         */
        fun create(
            params: GroupCreateParams
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>>

        /** @see create */
        fun create(
            runGroupRequest: RunGroupRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(
                GroupCreateParams.builder().runGroupRequest(runGroupRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            runGroupRequest: RunGroupRequest
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(runGroupRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/group/stats`, but is otherwise the
         * same as [GroupServiceAsync.stats].
         */
        fun stats(
            params: GroupStatsParams
        ): CompletableFuture<HttpResponseFor<GroupStatsResponse>> =
            stats(params, RequestOptions.none())

        /** @see stats */
        fun stats(
            params: GroupStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupStatsResponse>>

        /** @see stats */
        fun stats(
            runGroupRequest: RunGroupRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupStatsResponse>> =
            stats(
                GroupStatsParams.builder().runGroupRequest(runGroupRequest).build(),
                requestOptions,
            )

        /** @see stats */
        fun stats(
            runGroupRequest: RunGroupRequest
        ): CompletableFuture<HttpResponseFor<GroupStatsResponse>> =
            stats(runGroupRequest, RequestOptions.none())
    }
}
