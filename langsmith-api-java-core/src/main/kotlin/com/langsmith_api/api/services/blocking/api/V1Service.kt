// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.V1EventsParams
import com.langsmith_api.api.models.api.v1.V1EventsResponse
import com.langsmith_api.api.models.api.v1.V1LoginParams
import com.langsmith_api.api.models.api.v1.V1LoginResponse
import com.langsmith_api.api.models.api.v1.V1RetrieveOkParams
import com.langsmith_api.api.models.api.v1.V1RetrieveOkResponse
import com.langsmith_api.api.models.api.v1.V1UpdateParams
import com.langsmith_api.api.models.api.v1.V1UpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.AceService
import com.langsmith_api.api.services.blocking.api.v1.AnnotationQueueService
import com.langsmith_api.api.services.blocking.api.v1.ApiKeyService
import com.langsmith_api.api.services.blocking.api.v1.BulkExportService
import com.langsmith_api.api.services.blocking.api.v1.ChartService
import com.langsmith_api.api.services.blocking.api.v1.CommentService
import com.langsmith_api.api.services.blocking.api.v1.CommitService
import com.langsmith_api.api.services.blocking.api.v1.DatasetService
import com.langsmith_api.api.services.blocking.api.v1.ExampleService
import com.langsmith_api.api.services.blocking.api.v1.FeedbackConfigService
import com.langsmith_api.api.services.blocking.api.v1.FeedbackService
import com.langsmith_api.api.services.blocking.api.v1.InfoService
import com.langsmith_api.api.services.blocking.api.v1.MeService
import com.langsmith_api.api.services.blocking.api.v1.ModelPriceMapService
import com.langsmith_api.api.services.blocking.api.v1.OAuthService
import com.langsmith_api.api.services.blocking.api.v1.OrgChartService
import com.langsmith_api.api.services.blocking.api.v1.OrgService
import com.langsmith_api.api.services.blocking.api.v1.PlaygroundSettingService
import com.langsmith_api.api.services.blocking.api.v1.PromptService
import com.langsmith_api.api.services.blocking.api.v1.PromptWebhookService
import com.langsmith_api.api.services.blocking.api.v1.PublicService
import com.langsmith_api.api.services.blocking.api.v1.RepoService
import com.langsmith_api.api.services.blocking.api.v1.RunService
import com.langsmith_api.api.services.blocking.api.v1.ServiceAccountService
import com.langsmith_api.api.services.blocking.api.v1.SessionService
import com.langsmith_api.api.services.blocking.api.v1.SettingService
import com.langsmith_api.api.services.blocking.api.v1.SsoService
import com.langsmith_api.api.services.blocking.api.v1.TenantService
import com.langsmith_api.api.services.blocking.api.v1.TtlSettingService
import com.langsmith_api.api.services.blocking.api.v1.UsageLimitService
import com.langsmith_api.api.services.blocking.api.v1.WorkspaceService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

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

    /** Like a repo. */
    fun update(repo: String, params: V1UpdateParams): V1UpdateResponse =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1UpdateResponse = update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: V1UpdateParams): V1UpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1UpdateResponse

    /** Create Event */
    fun events(params: V1EventsParams): V1EventsResponse = events(params, RequestOptions.none())

    /** @see events */
    fun events(
        params: V1EventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1EventsResponse

    /** Login */
    fun login(): V1LoginResponse = login(V1LoginParams.none())

    /** @see login */
    fun login(
        params: V1LoginParams = V1LoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1LoginResponse

    /** @see login */
    fun login(params: V1LoginParams = V1LoginParams.none()): V1LoginResponse =
        login(params, RequestOptions.none())

    /** @see login */
    fun login(requestOptions: RequestOptions): V1LoginResponse =
        login(V1LoginParams.none(), requestOptions)

    /** Ok */
    fun retrieveOk(): V1RetrieveOkResponse = retrieveOk(V1RetrieveOkParams.none())

    /** @see retrieveOk */
    fun retrieveOk(
        params: V1RetrieveOkParams = V1RetrieveOkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveOkResponse

    /** @see retrieveOk */
    fun retrieveOk(params: V1RetrieveOkParams = V1RetrieveOkParams.none()): V1RetrieveOkResponse =
        retrieveOk(params, RequestOptions.none())

    /** @see retrieveOk */
    fun retrieveOk(requestOptions: RequestOptions): V1RetrieveOkResponse =
        retrieveOk(V1RetrieveOkParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

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

        /**
         * Returns a raw HTTP response for `post /api/v1/likes/{owner}/{repo}`, but is otherwise the
         * same as [V1Service.update].
         */
        @MustBeClosed
        fun update(repo: String, params: V1UpdateParams): HttpResponseFor<V1UpdateResponse> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            repo: String,
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1UpdateResponse> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: V1UpdateParams): HttpResponseFor<V1UpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1UpdateResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [V1Service.events].
         */
        @MustBeClosed
        fun events(params: V1EventsParams): HttpResponseFor<V1EventsResponse> =
            events(params, RequestOptions.none())

        /** @see events */
        @MustBeClosed
        fun events(
            params: V1EventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1EventsResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/login`, but is otherwise the same as
         * [V1Service.login].
         */
        @MustBeClosed fun login(): HttpResponseFor<V1LoginResponse> = login(V1LoginParams.none())

        /** @see login */
        @MustBeClosed
        fun login(
            params: V1LoginParams = V1LoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1LoginResponse>

        /** @see login */
        @MustBeClosed
        fun login(params: V1LoginParams = V1LoginParams.none()): HttpResponseFor<V1LoginResponse> =
            login(params, RequestOptions.none())

        /** @see login */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): HttpResponseFor<V1LoginResponse> =
            login(V1LoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ok`, but is otherwise the same as
         * [V1Service.retrieveOk].
         */
        @MustBeClosed
        fun retrieveOk(): HttpResponseFor<V1RetrieveOkResponse> =
            retrieveOk(V1RetrieveOkParams.none())

        /** @see retrieveOk */
        @MustBeClosed
        fun retrieveOk(
            params: V1RetrieveOkParams = V1RetrieveOkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveOkResponse>

        /** @see retrieveOk */
        @MustBeClosed
        fun retrieveOk(
            params: V1RetrieveOkParams = V1RetrieveOkParams.none()
        ): HttpResponseFor<V1RetrieveOkResponse> = retrieveOk(params, RequestOptions.none())

        /** @see retrieveOk */
        @MustBeClosed
        fun retrieveOk(requestOptions: RequestOptions): HttpResponseFor<V1RetrieveOkResponse> =
            retrieveOk(V1RetrieveOkParams.none(), requestOptions)
    }
}
