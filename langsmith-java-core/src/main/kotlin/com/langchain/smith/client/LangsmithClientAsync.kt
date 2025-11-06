// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.ClientEventsParams
import com.langchain.smith.models.ClientEventsResponse
import com.langchain.smith.models.ClientLoginParams
import com.langchain.smith.models.ClientLoginResponse
import com.langchain.smith.models.ClientRetrieveOkParams
import com.langchain.smith.models.ClientRetrieveOkResponse
import com.langchain.smith.models.ClientUpdateParams
import com.langchain.smith.models.ClientUpdateResponse
import com.langchain.smith.services.async.AceServiceAsync
import com.langchain.smith.services.async.AnnotationQueueServiceAsync
import com.langchain.smith.services.async.ApiKeyServiceAsync
import com.langchain.smith.services.async.BulkExportServiceAsync
import com.langchain.smith.services.async.CommentServiceAsync
import com.langchain.smith.services.async.CommitServiceAsync
import com.langchain.smith.services.async.DatasetServiceAsync
import com.langchain.smith.services.async.ExampleServiceAsync
import com.langchain.smith.services.async.FeedbackConfigServiceAsync
import com.langchain.smith.services.async.FeedbackServiceAsync
import com.langchain.smith.services.async.InfoServiceAsync
import com.langchain.smith.services.async.MeServiceAsync
import com.langchain.smith.services.async.ModelPriceMapServiceAsync
import com.langchain.smith.services.async.OAuthServiceAsync
import com.langchain.smith.services.async.OrgServiceAsync
import com.langchain.smith.services.async.PlatformServiceAsync
import com.langchain.smith.services.async.PlaygroundSettingServiceAsync
import com.langchain.smith.services.async.PromptWebhookServiceAsync
import com.langchain.smith.services.async.PublicServiceAsync
import com.langchain.smith.services.async.RepoServiceAsync
import com.langchain.smith.services.async.RunServiceAsync
import com.langchain.smith.services.async.ServiceAccountServiceAsync
import com.langchain.smith.services.async.SessionServiceAsync
import com.langchain.smith.services.async.SettingServiceAsync
import com.langchain.smith.services.async.SsoServiceAsync
import com.langchain.smith.services.async.TenantServiceAsync
import com.langchain.smith.services.async.TtlSettingServiceAsync
import com.langchain.smith.services.async.UsageLimitServiceAsync
import com.langchain.smith.services.async.WorkspaceServiceAsync
import java.util.concurrent.CompletableFuture
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

    fun orgs(): OrgServiceAsync

    fun oauth(): OAuthServiceAsync

    fun sso(): SsoServiceAsync

    fun apiKey(): ApiKeyServiceAsync

    fun examples(): ExampleServiceAsync

    fun datasets(): DatasetServiceAsync

    fun runs(): RunServiceAsync

    fun feedback(): FeedbackServiceAsync

    fun public_(): PublicServiceAsync

    fun annotationQueues(): AnnotationQueueServiceAsync

    fun ace(): AceServiceAsync

    fun bulkExports(): BulkExportServiceAsync

    fun tenants(): TenantServiceAsync

    fun info(): InfoServiceAsync

    fun feedbackConfigs(): FeedbackConfigServiceAsync

    fun modelPriceMap(): ModelPriceMapServiceAsync

    fun usageLimits(): UsageLimitServiceAsync

    fun ttlSettings(): TtlSettingServiceAsync

    fun promptWebhooks(): PromptWebhookServiceAsync

    fun workspaces(): WorkspaceServiceAsync

    fun playgroundSettings(): PlaygroundSettingServiceAsync

    fun me(): MeServiceAsync

    fun serviceAccounts(): ServiceAccountServiceAsync

    fun repos(): RepoServiceAsync

    fun commits(): CommitServiceAsync

    fun settings(): SettingServiceAsync

    fun comments(): CommentServiceAsync

    fun platform(): PlatformServiceAsync

    /** Like a repo. */
    fun update(repo: String, params: ClientUpdateParams): CompletableFuture<ClientUpdateResponse> =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: ClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientUpdateResponse> =
        update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: ClientUpdateParams): CompletableFuture<ClientUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientUpdateResponse>

    /** Create Event */
    fun events(params: ClientEventsParams): CompletableFuture<ClientEventsResponse> =
        events(params, RequestOptions.none())

    /** @see events */
    fun events(
        params: ClientEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientEventsResponse>

    /** Login */
    fun login(): CompletableFuture<ClientLoginResponse> = login(ClientLoginParams.none())

    /** @see login */
    fun login(
        params: ClientLoginParams = ClientLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientLoginResponse>

    /** @see login */
    fun login(
        params: ClientLoginParams = ClientLoginParams.none()
    ): CompletableFuture<ClientLoginResponse> = login(params, RequestOptions.none())

    /** @see login */
    fun login(requestOptions: RequestOptions): CompletableFuture<ClientLoginResponse> =
        login(ClientLoginParams.none(), requestOptions)

    /** Ok */
    fun retrieveOk(): CompletableFuture<ClientRetrieveOkResponse> =
        retrieveOk(ClientRetrieveOkParams.none())

    /** @see retrieveOk */
    fun retrieveOk(
        params: ClientRetrieveOkParams = ClientRetrieveOkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientRetrieveOkResponse>

    /** @see retrieveOk */
    fun retrieveOk(
        params: ClientRetrieveOkParams = ClientRetrieveOkParams.none()
    ): CompletableFuture<ClientRetrieveOkResponse> = retrieveOk(params, RequestOptions.none())

    /** @see retrieveOk */
    fun retrieveOk(requestOptions: RequestOptions): CompletableFuture<ClientRetrieveOkResponse> =
        retrieveOk(ClientRetrieveOkParams.none(), requestOptions)

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

        fun orgs(): OrgServiceAsync.WithRawResponse

        fun oauth(): OAuthServiceAsync.WithRawResponse

        fun sso(): SsoServiceAsync.WithRawResponse

        fun apiKey(): ApiKeyServiceAsync.WithRawResponse

        fun examples(): ExampleServiceAsync.WithRawResponse

        fun datasets(): DatasetServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        fun feedback(): FeedbackServiceAsync.WithRawResponse

        fun public_(): PublicServiceAsync.WithRawResponse

        fun annotationQueues(): AnnotationQueueServiceAsync.WithRawResponse

        fun ace(): AceServiceAsync.WithRawResponse

        fun bulkExports(): BulkExportServiceAsync.WithRawResponse

        fun tenants(): TenantServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        fun feedbackConfigs(): FeedbackConfigServiceAsync.WithRawResponse

        fun modelPriceMap(): ModelPriceMapServiceAsync.WithRawResponse

        fun usageLimits(): UsageLimitServiceAsync.WithRawResponse

        fun ttlSettings(): TtlSettingServiceAsync.WithRawResponse

        fun promptWebhooks(): PromptWebhookServiceAsync.WithRawResponse

        fun workspaces(): WorkspaceServiceAsync.WithRawResponse

        fun playgroundSettings(): PlaygroundSettingServiceAsync.WithRawResponse

        fun me(): MeServiceAsync.WithRawResponse

        fun serviceAccounts(): ServiceAccountServiceAsync.WithRawResponse

        fun repos(): RepoServiceAsync.WithRawResponse

        fun commits(): CommitServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun platform(): PlatformServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/likes/{owner}/{repo}`, but is otherwise the
         * same as [LangsmithClientAsync.update].
         */
        fun update(
            repo: String,
            params: ClientUpdateParams,
        ): CompletableFuture<HttpResponseFor<ClientUpdateResponse>> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        fun update(
            repo: String,
            params: ClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientUpdateResponse>> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        fun update(
            params: ClientUpdateParams
        ): CompletableFuture<HttpResponseFor<ClientUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [LangsmithClientAsync.events].
         */
        fun events(
            params: ClientEventsParams
        ): CompletableFuture<HttpResponseFor<ClientEventsResponse>> =
            events(params, RequestOptions.none())

        /** @see events */
        fun events(
            params: ClientEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/login`, but is otherwise the same as
         * [LangsmithClientAsync.login].
         */
        fun login(): CompletableFuture<HttpResponseFor<ClientLoginResponse>> =
            login(ClientLoginParams.none())

        /** @see login */
        fun login(
            params: ClientLoginParams = ClientLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientLoginResponse>>

        /** @see login */
        fun login(
            params: ClientLoginParams = ClientLoginParams.none()
        ): CompletableFuture<HttpResponseFor<ClientLoginResponse>> =
            login(params, RequestOptions.none())

        /** @see login */
        fun login(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClientLoginResponse>> =
            login(ClientLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ok`, but is otherwise the same as
         * [LangsmithClientAsync.retrieveOk].
         */
        fun retrieveOk(): CompletableFuture<HttpResponseFor<ClientRetrieveOkResponse>> =
            retrieveOk(ClientRetrieveOkParams.none())

        /** @see retrieveOk */
        fun retrieveOk(
            params: ClientRetrieveOkParams = ClientRetrieveOkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientRetrieveOkResponse>>

        /** @see retrieveOk */
        fun retrieveOk(
            params: ClientRetrieveOkParams = ClientRetrieveOkParams.none()
        ): CompletableFuture<HttpResponseFor<ClientRetrieveOkResponse>> =
            retrieveOk(params, RequestOptions.none())

        /** @see retrieveOk */
        fun retrieveOk(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClientRetrieveOkResponse>> =
            retrieveOk(ClientRetrieveOkParams.none(), requestOptions)
    }
}
