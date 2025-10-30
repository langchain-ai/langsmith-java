// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.async.platform.orgs.CurrentServiceAsync
import java.util.function.Consumer

interface OrgServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync

    fun current(): CurrentServiceAsync

    /** A view of [OrgServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync.WithRawResponse

        fun current(): CurrentServiceAsync.WithRawResponse
    }
}
