// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPageAsync
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsParams
import com.langchain.smith.services.async.sandboxes.BoxServiceAsync
import com.langchain.smith.services.async.sandboxes.RegistryServiceAsync
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SandboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxServiceAsync

    fun boxes(): BoxServiceAsync

    fun registries(): RegistryServiceAsync

    fun snapshots(): SnapshotServiceAsync

    /**
     * Returns priced usage per sandbox or snapshot and UTC hour in the half-open requested
     * interval. LCU uses the recorded compute amount for sandboxes; snapshots have zero LCU. LSU
     * allocates the recorded workspace storage amount proportionally to attributed bytes, including
     * checkpoints on their sandbox and snapshots as separate resources. Resource filters preserve
     * each resource's share. Rate changes do not reprice recorded amounts. An access-filtered page
     * can have no items and a non-null next_cursor; continue until next_cursor is null.
     */
    fun listUsageCosts(
        params: SandboxListUsageCostsParams
    ): CompletableFuture<SandboxListUsageCostsPageAsync> =
        listUsageCosts(params, RequestOptions.none())

    /** @see listUsageCosts */
    fun listUsageCosts(
        params: SandboxListUsageCostsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxListUsageCostsPageAsync>

    /**
     * A view of [SandboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxServiceAsync.WithRawResponse

        fun boxes(): BoxServiceAsync.WithRawResponse

        fun registries(): RegistryServiceAsync.WithRawResponse

        fun snapshots(): SnapshotServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/usage/costs`, but is otherwise the
         * same as [SandboxServiceAsync.listUsageCosts].
         */
        fun listUsageCosts(
            params: SandboxListUsageCostsParams
        ): CompletableFuture<HttpResponseFor<SandboxListUsageCostsPageAsync>> =
            listUsageCosts(params, RequestOptions.none())

        /** @see listUsageCosts */
        fun listUsageCosts(
            params: SandboxListUsageCostsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxListUsageCostsPageAsync>>
    }
}
