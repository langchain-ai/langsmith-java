// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.sandboxes.BoxServiceAsync
import com.langchain.smith.services.async.sandboxes.RegistryServiceAsync
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsync
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
    }
}
