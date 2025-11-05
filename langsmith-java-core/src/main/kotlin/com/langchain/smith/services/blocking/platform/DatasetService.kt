// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.platform.datasets.ExampleService
import java.util.function.Consumer

interface DatasetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService

    fun examples(): ExampleService

    /** A view of [DatasetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService.WithRawResponse

        fun examples(): ExampleService.WithRawResponse
    }
}
