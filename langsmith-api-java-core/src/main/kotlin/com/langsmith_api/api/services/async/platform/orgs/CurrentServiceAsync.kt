// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform.orgs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.async.platform.orgs.current.AccessPolicyServiceAsync
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

    fun accessPolicies(): AccessPolicyServiceAsync

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

        fun accessPolicies(): AccessPolicyServiceAsync.WithRawResponse
    }
}
