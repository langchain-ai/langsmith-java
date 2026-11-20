// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPage
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsParams
import com.langchain.smith.models.sandboxes.SandboxRetrieveUsageParams
import com.langchain.smith.models.sandboxes.SandboxRetrieveUsageResponse
import com.langchain.smith.services.blocking.sandboxes.BoxService
import com.langchain.smith.services.blocking.sandboxes.RegistryService
import com.langchain.smith.services.blocking.sandboxes.SnapshotService
import com.langchain.smith.services.blocking.sandboxes.VolumeService
import java.util.function.Consumer

interface SandboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService

    fun boxes(): BoxService

    fun volumes(): VolumeService

    fun registries(): RegistryService

    fun snapshots(): SnapshotService

    /**
     * Returns priced usage per sandbox or snapshot and UTC hour in the half-open requested
     * interval. LCU uses the recorded compute amount for sandboxes; snapshots have zero LCU. LSU
     * allocates the recorded workspace storage amount proportionally to attributed bytes, including
     * checkpoints on their sandbox and snapshots as separate resources. Resource filters preserve
     * each resource's share. Rate changes do not reprice recorded amounts. An access-filtered page
     * can have no items and a non-null next_cursor; continue until next_cursor is null.
     */
    fun listUsageCosts(params: SandboxListUsageCostsParams): SandboxListUsageCostsPage =
        listUsageCosts(params, RequestOptions.none())

    /** @see listUsageCosts */
    fun listUsageCosts(
        params: SandboxListUsageCostsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxListUsageCostsPage

    /** Get current sandbox resource usage and quota limits for the workspace */
    fun retrieveUsage(): SandboxRetrieveUsageResponse =
        retrieveUsage(SandboxRetrieveUsageParams.none())

    /** @see retrieveUsage */
    fun retrieveUsage(
        params: SandboxRetrieveUsageParams = SandboxRetrieveUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxRetrieveUsageResponse

    /** @see retrieveUsage */
    fun retrieveUsage(
        params: SandboxRetrieveUsageParams = SandboxRetrieveUsageParams.none()
    ): SandboxRetrieveUsageResponse = retrieveUsage(params, RequestOptions.none())

    /** @see retrieveUsage */
    fun retrieveUsage(requestOptions: RequestOptions): SandboxRetrieveUsageResponse =
        retrieveUsage(SandboxRetrieveUsageParams.none(), requestOptions)

    /** A view of [SandboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService.WithRawResponse

        fun boxes(): BoxService.WithRawResponse

        fun volumes(): VolumeService.WithRawResponse

        fun registries(): RegistryService.WithRawResponse

        fun snapshots(): SnapshotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/usage/costs`, but is otherwise the
         * same as [SandboxService.listUsageCosts].
         */
        @MustBeClosed
        fun listUsageCosts(
            params: SandboxListUsageCostsParams
        ): HttpResponseFor<SandboxListUsageCostsPage> =
            listUsageCosts(params, RequestOptions.none())

        /** @see listUsageCosts */
        @MustBeClosed
        fun listUsageCosts(
            params: SandboxListUsageCostsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxListUsageCostsPage>

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/usage`, but is otherwise the same
         * as [SandboxService.retrieveUsage].
         */
        @MustBeClosed
        fun retrieveUsage(): HttpResponseFor<SandboxRetrieveUsageResponse> =
            retrieveUsage(SandboxRetrieveUsageParams.none())

        /** @see retrieveUsage */
        @MustBeClosed
        fun retrieveUsage(
            params: SandboxRetrieveUsageParams = SandboxRetrieveUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxRetrieveUsageResponse>

        /** @see retrieveUsage */
        @MustBeClosed
        fun retrieveUsage(
            params: SandboxRetrieveUsageParams = SandboxRetrieveUsageParams.none()
        ): HttpResponseFor<SandboxRetrieveUsageResponse> =
            retrieveUsage(params, RequestOptions.none())

        /** @see retrieveUsage */
        @MustBeClosed
        fun retrieveUsage(
            requestOptions: RequestOptions
        ): HttpResponseFor<SandboxRetrieveUsageResponse> =
            retrieveUsage(SandboxRetrieveUsageParams.none(), requestOptions)
    }
}
