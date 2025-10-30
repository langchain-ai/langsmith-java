// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.client

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.blocking.ApiService
import com.langsmith_api.api.services.blocking.DatasetService
import com.langsmith_api.api.services.blocking.FeedbackService
import com.langsmith_api.api.services.blocking.PlatformService
import com.langsmith_api.api.services.blocking.RunService
import java.util.function.Consumer

/**
 * A client for interacting with the Langsmith API REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LangsmithApiClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LangsmithApiClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithApiClient

    fun api(): ApiService

    fun datasets(): DatasetService

    fun feedback(): FeedbackService

    fun runs(): RunService

    fun platform(): PlatformService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [LangsmithApiClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithApiClient.WithRawResponse

        fun api(): ApiService.WithRawResponse

        fun datasets(): DatasetService.WithRawResponse

        fun feedback(): FeedbackService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun platform(): PlatformService.WithRawResponse
    }
}
