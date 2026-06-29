// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
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
    }
}
