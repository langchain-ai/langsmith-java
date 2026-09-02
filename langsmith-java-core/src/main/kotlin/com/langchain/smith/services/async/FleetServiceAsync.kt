// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.fleet.ThreadServiceAsync
import java.util.function.Consumer

interface FleetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetServiceAsync

    fun threads(): ThreadServiceAsync

    /** A view of [FleetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FleetServiceAsync.WithRawResponse

        fun threads(): ThreadServiceAsync.WithRawResponse
    }
}
