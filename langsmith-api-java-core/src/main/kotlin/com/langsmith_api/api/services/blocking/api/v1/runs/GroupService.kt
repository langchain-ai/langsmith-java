// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.runs

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.group.GroupCreateParams
import com.langsmith_api.api.models.api.v1.runs.group.GroupCreateResponse
import com.langsmith_api.api.models.api.v1.runs.group.GroupStatsParams
import com.langsmith_api.api.models.api.v1.runs.group.GroupStatsResponse
import com.langsmith_api.api.models.api.v1.runs.group.RunGroupRequest
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Get runs grouped by an expression */
    fun create(params: GroupCreateParams): GroupCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupCreateResponse

    /** @see create */
    fun create(
        runGroupRequest: RunGroupRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupCreateResponse =
        create(GroupCreateParams.builder().runGroupRequest(runGroupRequest).build(), requestOptions)

    /** @see create */
    fun create(runGroupRequest: RunGroupRequest): GroupCreateResponse =
        create(runGroupRequest, RequestOptions.none())

    /** Get stats for the grouped runs. */
    fun stats(params: GroupStatsParams): GroupStatsResponse = stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: GroupStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupStatsResponse

    /** @see stats */
    fun stats(
        runGroupRequest: RunGroupRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupStatsResponse =
        stats(GroupStatsParams.builder().runGroupRequest(runGroupRequest).build(), requestOptions)

    /** @see stats */
    fun stats(runGroupRequest: RunGroupRequest): GroupStatsResponse =
        stats(runGroupRequest, RequestOptions.none())

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/group`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<GroupCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            runGroupRequest: RunGroupRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupCreateResponse> =
            create(
                GroupCreateParams.builder().runGroupRequest(runGroupRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(runGroupRequest: RunGroupRequest): HttpResponseFor<GroupCreateResponse> =
            create(runGroupRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/group/stats`, but is otherwise the
         * same as [GroupService.stats].
         */
        @MustBeClosed
        fun stats(params: GroupStatsParams): HttpResponseFor<GroupStatsResponse> =
            stats(params, RequestOptions.none())

        /** @see stats */
        @MustBeClosed
        fun stats(
            params: GroupStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupStatsResponse>

        /** @see stats */
        @MustBeClosed
        fun stats(
            runGroupRequest: RunGroupRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupStatsResponse> =
            stats(
                GroupStatsParams.builder().runGroupRequest(runGroupRequest).build(),
                requestOptions,
            )

        /** @see stats */
        @MustBeClosed
        fun stats(runGroupRequest: RunGroupRequest): HttpResponseFor<GroupStatsResponse> =
            stats(runGroupRequest, RequestOptions.none())
    }
}
