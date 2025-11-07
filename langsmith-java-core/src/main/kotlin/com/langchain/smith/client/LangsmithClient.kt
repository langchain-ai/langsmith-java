// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.AnnotationQueueService
import com.langchain.smith.services.blocking.CommitService
import com.langchain.smith.services.blocking.DatasetService
import com.langchain.smith.services.blocking.ExampleService
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.InfoService
import com.langchain.smith.services.blocking.PlatformService
import com.langchain.smith.services.blocking.PublicService
import com.langchain.smith.services.blocking.RepoService
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.blocking.SessionService
import com.langchain.smith.services.blocking.SettingService
import com.langchain.smith.services.blocking.WorkspaceService
import java.util.function.Consumer

/**
 * A client for interacting with the LangChain REST API synchronously. You can also switch to
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
interface LangsmithClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LangsmithClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClient

    fun sessions(): SessionService

    fun examples(): ExampleService

    fun datasets(): DatasetService

    fun runs(): RunService

    fun feedback(): FeedbackService

    fun public_(): PublicService

    fun annotationQueues(): AnnotationQueueService

    fun info(): InfoService

    fun workspaces(): WorkspaceService

    fun repos(): RepoService

    fun commits(): CommitService

    fun settings(): SettingService

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

    /** A view of [LangsmithClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClient.WithRawResponse

        fun sessions(): SessionService.WithRawResponse

        fun examples(): ExampleService.WithRawResponse

        fun datasets(): DatasetService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun feedback(): FeedbackService.WithRawResponse

        fun public_(): PublicService.WithRawResponse

        fun annotationQueues(): AnnotationQueueService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        fun workspaces(): WorkspaceService.WithRawResponse

        fun repos(): RepoService.WithRawResponse

        fun commits(): CommitService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun platform(): PlatformService.WithRawResponse
    }
}
