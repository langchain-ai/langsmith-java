// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.CurrentRetrieveStatsParams
import com.langchain.smith.models.workspaces.current.CurrentRetrieveStatsResponse
import com.langchain.smith.models.workspaces.current.CurrentRetrieveUsageLimitsParams
import com.langchain.smith.models.workspaces.current.CurrentRetrieveUsageLimitsResponse
import com.langchain.smith.services.async.workspaces.current.MemberServiceAsync
import com.langchain.smith.services.async.workspaces.current.SecretServiceAsync
import com.langchain.smith.services.async.workspaces.current.SharedServiceAsync
import com.langchain.smith.services.async.workspaces.current.TagKeyServiceAsync
import com.langchain.smith.services.async.workspaces.current.TagServiceAsync
import com.langchain.smith.services.async.workspaces.current.TaggingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CurrentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync

    fun members(): MemberServiceAsync

    fun shared(): SharedServiceAsync

    fun secrets(): SecretServiceAsync

    fun tagKeys(): TagKeyServiceAsync

    fun taggings(): TaggingServiceAsync

    fun tags(): TagServiceAsync

    /** Get Current Workspace Stats */
    fun retrieveStats(): CompletableFuture<CurrentRetrieveStatsResponse> =
        retrieveStats(CurrentRetrieveStatsParams.none())

    /** @see retrieveStats */
    fun retrieveStats(
        params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentRetrieveStatsResponse>

    /** @see retrieveStats */
    fun retrieveStats(
        params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none()
    ): CompletableFuture<CurrentRetrieveStatsResponse> =
        retrieveStats(params, RequestOptions.none())

    /** @see retrieveStats */
    fun retrieveStats(
        requestOptions: RequestOptions
    ): CompletableFuture<CurrentRetrieveStatsResponse> =
        retrieveStats(CurrentRetrieveStatsParams.none(), requestOptions)

    /** Get Current Workspace Usage Limits Info */
    fun retrieveUsageLimits(): CompletableFuture<CurrentRetrieveUsageLimitsResponse> =
        retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentRetrieveUsageLimitsResponse>

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none()
    ): CompletableFuture<CurrentRetrieveUsageLimitsResponse> =
        retrieveUsageLimits(params, RequestOptions.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        requestOptions: RequestOptions
    ): CompletableFuture<CurrentRetrieveUsageLimitsResponse> =
        retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none(), requestOptions)

    /**
     * A view of [CurrentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentServiceAsync.WithRawResponse

        fun members(): MemberServiceAsync.WithRawResponse

        fun shared(): SharedServiceAsync.WithRawResponse

        fun secrets(): SecretServiceAsync.WithRawResponse

        fun tagKeys(): TagKeyServiceAsync.WithRawResponse

        fun taggings(): TaggingServiceAsync.WithRawResponse

        fun tags(): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/stats`, but is otherwise
         * the same as [CurrentServiceAsync.retrieveStats].
         */
        fun retrieveStats(): CompletableFuture<HttpResponseFor<CurrentRetrieveStatsResponse>> =
            retrieveStats(CurrentRetrieveStatsParams.none())

        /** @see retrieveStats */
        fun retrieveStats(
            params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveStatsResponse>>

        /** @see retrieveStats */
        fun retrieveStats(
            params: CurrentRetrieveStatsParams = CurrentRetrieveStatsParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveStatsResponse>> =
            retrieveStats(params, RequestOptions.none())

        /** @see retrieveStats */
        fun retrieveStats(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveStatsResponse>> =
            retrieveStats(CurrentRetrieveStatsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/usage_limits`, but is
         * otherwise the same as [CurrentServiceAsync.retrieveUsageLimits].
         */
        fun retrieveUsageLimits():
            CompletableFuture<HttpResponseFor<CurrentRetrieveUsageLimitsResponse>> =
            retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none())

        /** @see retrieveUsageLimits */
        fun retrieveUsageLimits(
            params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveUsageLimitsResponse>>

        /** @see retrieveUsageLimits */
        fun retrieveUsageLimits(
            params: CurrentRetrieveUsageLimitsParams = CurrentRetrieveUsageLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveUsageLimitsResponse>> =
            retrieveUsageLimits(params, RequestOptions.none())

        /** @see retrieveUsageLimits */
        fun retrieveUsageLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveUsageLimitsResponse>> =
            retrieveUsageLimits(CurrentRetrieveUsageLimitsParams.none(), requestOptions)
    }
}
