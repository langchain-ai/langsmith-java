// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPage
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsParams
import com.langchain.smith.services.blocking.sandboxes.BoxService
import com.langchain.smith.services.blocking.sandboxes.RegistryService
import com.langchain.smith.services.blocking.sandboxes.SnapshotService
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

    /** A view of [SandboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService.WithRawResponse

        fun boxes(): BoxService.WithRawResponse

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
    }
}
