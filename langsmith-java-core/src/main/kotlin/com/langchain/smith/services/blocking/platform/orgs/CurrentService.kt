// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform.orgs

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.platform.orgs.current.AccessPolicyService
import java.util.function.Consumer

interface CurrentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService

    fun accessPolicies(): AccessPolicyService

    /** A view of [CurrentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService.WithRawResponse

        fun accessPolicies(): AccessPolicyService.WithRawResponse
    }
}
