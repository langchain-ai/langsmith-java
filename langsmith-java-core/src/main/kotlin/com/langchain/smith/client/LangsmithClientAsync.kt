// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.AnnotationQueueServiceAsync
import com.langchain.smith.services.async.CommitServiceAsync
import com.langchain.smith.services.async.DatasetServiceAsync
import com.langchain.smith.services.async.ExampleServiceAsync
import com.langchain.smith.services.async.FeedbackServiceAsync
import com.langchain.smith.services.async.InfoServiceAsync
import com.langchain.smith.services.async.PlatformServiceAsync
import com.langchain.smith.services.async.PublicServiceAsync
import com.langchain.smith.services.async.RepoServiceAsync
import com.langchain.smith.services.async.RunServiceAsync
import com.langchain.smith.services.async.SessionServiceAsync
import com.langchain.smith.services.async.SettingServiceAsync
import com.langchain.smith.services.async.WorkspaceServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the LangChain REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface LangsmithClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): LangsmithClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClientAsync

    fun sessions(): SessionServiceAsync

    fun examples(): ExampleServiceAsync

    fun datasets(): DatasetServiceAsync

    fun runs(): RunServiceAsync

    fun feedback(): FeedbackServiceAsync

    fun public_(): PublicServiceAsync

    fun annotationQueues(): AnnotationQueueServiceAsync

    fun info(): InfoServiceAsync

    fun workspaces(): WorkspaceServiceAsync

    fun repos(): RepoServiceAsync

    fun commits(): CommitServiceAsync

    fun settings(): SettingServiceAsync

    fun platform(): PlatformServiceAsync

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
     * A view of [LangsmithClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithClientAsync.WithRawResponse

        fun sessions(): SessionServiceAsync.WithRawResponse

        fun examples(): ExampleServiceAsync.WithRawResponse

        fun datasets(): DatasetServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        fun feedback(): FeedbackServiceAsync.WithRawResponse

        fun public_(): PublicServiceAsync.WithRawResponse

        fun annotationQueues(): AnnotationQueueServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        fun workspaces(): WorkspaceServiceAsync.WithRawResponse

        fun repos(): RepoServiceAsync.WithRawResponse

        fun commits(): CommitServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun platform(): PlatformServiceAsync.WithRawResponse
    }
}
