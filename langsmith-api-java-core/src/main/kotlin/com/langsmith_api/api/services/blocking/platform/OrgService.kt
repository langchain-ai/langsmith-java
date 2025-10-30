// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.blocking.platform.orgs.CurrentService
import java.util.function.Consumer

interface OrgService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService

    fun current(): CurrentService

    /** A view of [OrgService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService.WithRawResponse

        fun current(): CurrentService.WithRawResponse
    }
}
