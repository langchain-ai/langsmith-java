// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.async.platform.AlertServiceAsync
import com.langsmith_api.api.services.async.platform.DatasetServiceAsync
import com.langsmith_api.api.services.async.platform.OrgServiceAsync
import java.util.function.Consumer

interface PlatformServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlatformServiceAsync

    fun alerts(): AlertServiceAsync

    fun datasets(): DatasetServiceAsync

    fun orgs(): OrgServiceAsync

    /**
     * A view of [PlatformServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlatformServiceAsync.WithRawResponse

        fun alerts(): AlertServiceAsync.WithRawResponse

        fun datasets(): DatasetServiceAsync.WithRawResponse

        fun orgs(): OrgServiceAsync.WithRawResponse
    }
}
