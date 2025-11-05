// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.google.errorprone.annotations.MustBeClosed
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
import com.langchain.smith.services.blocking.AceService
import com.langchain.smith.services.blocking.AnnotationQueueService
import com.langchain.smith.services.blocking.ApiKeyService
import com.langchain.smith.services.blocking.BulkExportService
import com.langchain.smith.services.blocking.ChartService
import com.langchain.smith.services.blocking.CommentService
import com.langchain.smith.services.blocking.CommitService
import com.langchain.smith.services.blocking.DatasetService
import com.langchain.smith.services.blocking.ExampleService
import com.langchain.smith.services.blocking.FeedbackConfigService
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.InfoService
import com.langchain.smith.services.blocking.MeService
import com.langchain.smith.services.blocking.ModelPriceMapService
import com.langchain.smith.services.blocking.OAuthService
import com.langchain.smith.services.blocking.OrgChartService
import com.langchain.smith.services.blocking.OrgService
import com.langchain.smith.services.blocking.PlatformService
import com.langchain.smith.services.blocking.PlaygroundSettingService
import com.langchain.smith.services.blocking.PromptService
import com.langchain.smith.services.blocking.PromptWebhookService
import com.langchain.smith.services.blocking.PublicService
import com.langchain.smith.services.blocking.RepoService
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.blocking.ServiceAccountService
import com.langchain.smith.services.blocking.SessionService
import com.langchain.smith.services.blocking.SettingService
import com.langchain.smith.services.blocking.SsoService
import com.langchain.smith.services.blocking.TenantService
import com.langchain.smith.services.blocking.TtlSettingService
import com.langchain.smith.services.blocking.UsageLimitService
import com.langchain.smith.services.blocking.WorkspaceService
import java.util.function.Consumer

/**
 * A client for interacting with the Langsmith REST API synchronously. You can also switch to
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

    fun orgs(): OrgService

    fun oauth(): OAuthService

    fun sso(): SsoService

    fun apiKey(): ApiKeyService

    fun examples(): ExampleService

    fun datasets(): DatasetService

    fun runs(): RunService

    fun feedback(): FeedbackService

    fun public_(): PublicService

    fun annotationQueues(): AnnotationQueueService

    fun ace(): AceService

    fun bulkExports(): BulkExportService

    fun tenants(): TenantService

    fun info(): InfoService

    fun feedbackConfigs(): FeedbackConfigService

    fun modelPriceMap(): ModelPriceMapService

    fun usageLimits(): UsageLimitService

    fun ttlSettings(): TtlSettingService

    fun prompts(): PromptService

    fun promptWebhooks(): PromptWebhookService

    fun workspaces(): WorkspaceService

    fun playgroundSettings(): PlaygroundSettingService

    fun me(): MeService

    fun serviceAccounts(): ServiceAccountService

    fun charts(): ChartService

    fun orgCharts(): OrgChartService

    fun repos(): RepoService

    fun commits(): CommitService

    fun settings(): SettingService

    fun comments(): CommentService

    fun platform(): PlatformService

    /** Like a repo. */
    fun update(repo: String, params: ClientUpdateParams): ClientUpdateResponse =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: ClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientUpdateResponse = update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: ClientUpdateParams): ClientUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientUpdateResponse

    /** Create Event */
    fun events(params: ClientEventsParams): ClientEventsResponse =
        events(params, RequestOptions.none())

    /** @see events */
    fun events(
        params: ClientEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientEventsResponse

    /** Login */
    fun login(): ClientLoginResponse = login(ClientLoginParams.none())

    /** @see login */
    fun login(
        params: ClientLoginParams = ClientLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientLoginResponse

    /** @see login */
    fun login(params: ClientLoginParams = ClientLoginParams.none()): ClientLoginResponse =
        login(params, RequestOptions.none())

    /** @see login */
    fun login(requestOptions: RequestOptions): ClientLoginResponse =
        login(ClientLoginParams.none(), requestOptions)

    /** Ok */
    fun retrieveOk(): ClientRetrieveOkResponse = retrieveOk(ClientRetrieveOkParams.none())

    /** @see retrieveOk */
    fun retrieveOk(
        params: ClientRetrieveOkParams = ClientRetrieveOkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientRetrieveOkResponse

    /** @see retrieveOk */
    fun retrieveOk(
        params: ClientRetrieveOkParams = ClientRetrieveOkParams.none()
    ): ClientRetrieveOkResponse = retrieveOk(params, RequestOptions.none())

    /** @see retrieveOk */
    fun retrieveOk(requestOptions: RequestOptions): ClientRetrieveOkResponse =
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

    /** A view of [LangsmithClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClient.WithRawResponse

        fun sessions(): SessionService.WithRawResponse

        fun orgs(): OrgService.WithRawResponse

        fun oauth(): OAuthService.WithRawResponse

        fun sso(): SsoService.WithRawResponse

        fun apiKey(): ApiKeyService.WithRawResponse

        fun examples(): ExampleService.WithRawResponse

        fun datasets(): DatasetService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun feedback(): FeedbackService.WithRawResponse

        fun public_(): PublicService.WithRawResponse

        fun annotationQueues(): AnnotationQueueService.WithRawResponse

        fun ace(): AceService.WithRawResponse

        fun bulkExports(): BulkExportService.WithRawResponse

        fun tenants(): TenantService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        fun feedbackConfigs(): FeedbackConfigService.WithRawResponse

        fun modelPriceMap(): ModelPriceMapService.WithRawResponse

        fun usageLimits(): UsageLimitService.WithRawResponse

        fun ttlSettings(): TtlSettingService.WithRawResponse

        fun prompts(): PromptService.WithRawResponse

        fun promptWebhooks(): PromptWebhookService.WithRawResponse

        fun workspaces(): WorkspaceService.WithRawResponse

        fun playgroundSettings(): PlaygroundSettingService.WithRawResponse

        fun me(): MeService.WithRawResponse

        fun serviceAccounts(): ServiceAccountService.WithRawResponse

        fun charts(): ChartService.WithRawResponse

        fun orgCharts(): OrgChartService.WithRawResponse

        fun repos(): RepoService.WithRawResponse

        fun commits(): CommitService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun comments(): CommentService.WithRawResponse

        fun platform(): PlatformService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/likes/{owner}/{repo}`, but is otherwise the
         * same as [LangsmithClient.update].
         */
        @MustBeClosed
        fun update(
            repo: String,
            params: ClientUpdateParams,
        ): HttpResponseFor<ClientUpdateResponse> = update(repo, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            repo: String,
            params: ClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientUpdateResponse> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ClientUpdateParams): HttpResponseFor<ClientUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [LangsmithClient.events].
         */
        @MustBeClosed
        fun events(params: ClientEventsParams): HttpResponseFor<ClientEventsResponse> =
            events(params, RequestOptions.none())

        /** @see events */
        @MustBeClosed
        fun events(
            params: ClientEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientEventsResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/login`, but is otherwise the same as
         * [LangsmithClient.login].
         */
        @MustBeClosed
        fun login(): HttpResponseFor<ClientLoginResponse> = login(ClientLoginParams.none())

        /** @see login */
        @MustBeClosed
        fun login(
            params: ClientLoginParams = ClientLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientLoginResponse>

        /** @see login */
        @MustBeClosed
        fun login(
            params: ClientLoginParams = ClientLoginParams.none()
        ): HttpResponseFor<ClientLoginResponse> = login(params, RequestOptions.none())

        /** @see login */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): HttpResponseFor<ClientLoginResponse> =
            login(ClientLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ok`, but is otherwise the same as
         * [LangsmithClient.retrieveOk].
         */
        @MustBeClosed
        fun retrieveOk(): HttpResponseFor<ClientRetrieveOkResponse> =
            retrieveOk(ClientRetrieveOkParams.none())

        /** @see retrieveOk */
        @MustBeClosed
        fun retrieveOk(
            params: ClientRetrieveOkParams = ClientRetrieveOkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientRetrieveOkResponse>

        /** @see retrieveOk */
        @MustBeClosed
        fun retrieveOk(
            params: ClientRetrieveOkParams = ClientRetrieveOkParams.none()
        ): HttpResponseFor<ClientRetrieveOkResponse> = retrieveOk(params, RequestOptions.none())

        /** @see retrieveOk */
        @MustBeClosed
        fun retrieveOk(requestOptions: RequestOptions): HttpResponseFor<ClientRetrieveOkResponse> =
            retrieveOk(ClientRetrieveOkParams.none(), requestOptions)
    }
}
