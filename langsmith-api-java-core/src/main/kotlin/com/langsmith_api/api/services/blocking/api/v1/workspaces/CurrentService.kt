// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveStatsParams
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveStatsResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveUsageLimitsParams
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveUsageLimitsResponse
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.MemberService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.SecretService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.SharedService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.TagKeyService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.TagService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.TaggingService
import java.util.function.Consumer

interface CurrentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService

    fun members(): MemberService

    fun shared(): SharedService

    fun secrets(): SecretService

    fun tagKeys(): TagKeyService

    fun taggings(): TaggingService

    fun tags(): TagService

    /** Get Current Workspace Stats */
    fun retrieveStats(): CurrentRetrieveStatsResponse =
        retrieveStats(CurrentRetrieveStatsParams.none())

    /** @see retrieveStats */
    fun retrieveStats(
        params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentRetrieveStatsResponse

    /** @see retrieveStats */
    fun retrieveStats(
        params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none()
    ): CurrentRetrieveStatsResponse = retrieveStats(params, RequestOptions.none())

    /** @see retrieveStats */
    fun retrieveStats(requestOptions: RequestOptions): CurrentRetrieveStatsResponse =
        retrieveStats(CurrentRetrieveStatsParams.none(), requestOptions)

    /** Get Current Workspace Usage Limits Info */
    fun retrieveUsageLimits(): CurrentRetrieveUsageLimitsResponse =
        retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentRetrieveUsageLimitsResponse

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none()
    ): CurrentRetrieveUsageLimitsResponse = retrieveUsageLimits(params, RequestOptions.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(requestOptions: RequestOptions): CurrentRetrieveUsageLimitsResponse =
        retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none(), requestOptions)

    /** A view of [CurrentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService.WithRawResponse

        fun members(): MemberService.WithRawResponse

        fun shared(): SharedService.WithRawResponse

        fun secrets(): SecretService.WithRawResponse

        fun tagKeys(): TagKeyService.WithRawResponse

        fun taggings(): TaggingService.WithRawResponse

        fun tags(): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/stats`, but is otherwise
         * the same as [CurrentService.retrieveStats].
         */
        @MustBeClosed
        fun retrieveStats(): HttpResponseFor<CurrentRetrieveStatsResponse> =
            retrieveStats(CurrentRetrieveStatsParams.none())

        /** @see retrieveStats */
        @MustBeClosed
        fun retrieveStats(
            params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentRetrieveStatsResponse>

        /** @see retrieveStats */
        @MustBeClosed
        fun retrieveStats(
            params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none()
        ): HttpResponseFor<CurrentRetrieveStatsResponse> =
            retrieveStats(params, RequestOptions.none())

        /** @see retrieveStats */
        @MustBeClosed
        fun retrieveStats(
            requestOptions: RequestOptions
        ): HttpResponseFor<CurrentRetrieveStatsResponse> =
            retrieveStats(CurrentRetrieveStatsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/usage_limits`, but is
         * otherwise the same as [CurrentService.retrieveUsageLimits].
         */
        @MustBeClosed
        fun retrieveUsageLimits(): HttpResponseFor<CurrentRetrieveUsageLimitsResponse> =
            retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none())

        /** @see retrieveUsageLimits */
        @MustBeClosed
        fun retrieveUsageLimits(
            params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentRetrieveUsageLimitsResponse>

        /** @see retrieveUsageLimits */
        @MustBeClosed
        fun retrieveUsageLimits(
            params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none()
        ): HttpResponseFor<CurrentRetrieveUsageLimitsResponse> =
            retrieveUsageLimits(params, RequestOptions.none())

        /** @see retrieveUsageLimits */
        @MustBeClosed
        fun retrieveUsageLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<CurrentRetrieveUsageLimitsResponse> =
            retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none(), requestOptions)
    }
}
