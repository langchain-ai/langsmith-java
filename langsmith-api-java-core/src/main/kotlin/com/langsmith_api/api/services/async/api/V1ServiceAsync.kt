// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api

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
import com.langsmith_api.api.services.async.api.v1.AceServiceAsync
import com.langsmith_api.api.services.async.api.v1.AnnotationQueueServiceAsync
import com.langsmith_api.api.services.async.api.v1.ApiKeyServiceAsync
import com.langsmith_api.api.services.async.api.v1.BulkExportServiceAsync
import com.langsmith_api.api.services.async.api.v1.ChartServiceAsync
import com.langsmith_api.api.services.async.api.v1.CommentServiceAsync
import com.langsmith_api.api.services.async.api.v1.CommitServiceAsync
import com.langsmith_api.api.services.async.api.v1.DatasetServiceAsync
import com.langsmith_api.api.services.async.api.v1.ExampleServiceAsync
import com.langsmith_api.api.services.async.api.v1.FeedbackConfigServiceAsync
import com.langsmith_api.api.services.async.api.v1.FeedbackServiceAsync
import com.langsmith_api.api.services.async.api.v1.InfoServiceAsync
import com.langsmith_api.api.services.async.api.v1.MeServiceAsync
import com.langsmith_api.api.services.async.api.v1.ModelPriceMapServiceAsync
import com.langsmith_api.api.services.async.api.v1.OAuthServiceAsync
import com.langsmith_api.api.services.async.api.v1.OrgChartServiceAsync
import com.langsmith_api.api.services.async.api.v1.OrgServiceAsync
import com.langsmith_api.api.services.async.api.v1.PlaygroundSettingServiceAsync
import com.langsmith_api.api.services.async.api.v1.PromptServiceAsync
import com.langsmith_api.api.services.async.api.v1.PromptWebhookServiceAsync
import com.langsmith_api.api.services.async.api.v1.PublicServiceAsync
import com.langsmith_api.api.services.async.api.v1.RepoServiceAsync
import com.langsmith_api.api.services.async.api.v1.RunServiceAsync
import com.langsmith_api.api.services.async.api.v1.ServiceAccountServiceAsync
import com.langsmith_api.api.services.async.api.v1.SessionServiceAsync
import com.langsmith_api.api.services.async.api.v1.SettingServiceAsync
import com.langsmith_api.api.services.async.api.v1.SsoServiceAsync
import com.langsmith_api.api.services.async.api.v1.TenantServiceAsync
import com.langsmith_api.api.services.async.api.v1.TtlSettingServiceAsync
import com.langsmith_api.api.services.async.api.v1.UsageLimitServiceAsync
import com.langsmith_api.api.services.async.api.v1.WorkspaceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

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

    fun prompts(): PromptServiceAsync

    fun promptWebhooks(): PromptWebhookServiceAsync

    fun workspaces(): WorkspaceServiceAsync

    fun playgroundSettings(): PlaygroundSettingServiceAsync

    fun me(): MeServiceAsync

    fun serviceAccounts(): ServiceAccountServiceAsync

    fun charts(): ChartServiceAsync

    fun orgCharts(): OrgChartServiceAsync

    fun repos(): RepoServiceAsync

    fun commits(): CommitServiceAsync

    fun settings(): SettingServiceAsync

    fun comments(): CommentServiceAsync

    /** Like a repo. */
    fun update(repo: String, params: V1UpdateParams): CompletableFuture<V1UpdateResponse> =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1UpdateResponse> =
        update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: V1UpdateParams): CompletableFuture<V1UpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1UpdateResponse>

    /** Create Event */
    fun events(params: V1EventsParams): CompletableFuture<V1EventsResponse> =
        events(params, RequestOptions.none())

    /** @see events */
    fun events(
        params: V1EventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1EventsResponse>

    /** Login */
    fun login(): CompletableFuture<V1LoginResponse> = login(V1LoginParams.none())

    /** @see login */
    fun login(
        params: V1LoginParams = V1LoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1LoginResponse>

    /** @see login */
    fun login(params: V1LoginParams = V1LoginParams.none()): CompletableFuture<V1LoginResponse> =
        login(params, RequestOptions.none())

    /** @see login */
    fun login(requestOptions: RequestOptions): CompletableFuture<V1LoginResponse> =
        login(V1LoginParams.none(), requestOptions)

    /** Ok */
    fun retrieveOk(): CompletableFuture<V1RetrieveOkResponse> =
        retrieveOk(V1RetrieveOkParams.none())

    /** @see retrieveOk */
    fun retrieveOk(
        params: V1RetrieveOkParams = V1RetrieveOkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1RetrieveOkResponse>

    /** @see retrieveOk */
    fun retrieveOk(
        params: V1RetrieveOkParams = V1RetrieveOkParams.none()
    ): CompletableFuture<V1RetrieveOkResponse> = retrieveOk(params, RequestOptions.none())

    /** @see retrieveOk */
    fun retrieveOk(requestOptions: RequestOptions): CompletableFuture<V1RetrieveOkResponse> =
        retrieveOk(V1RetrieveOkParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

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

        fun prompts(): PromptServiceAsync.WithRawResponse

        fun promptWebhooks(): PromptWebhookServiceAsync.WithRawResponse

        fun workspaces(): WorkspaceServiceAsync.WithRawResponse

        fun playgroundSettings(): PlaygroundSettingServiceAsync.WithRawResponse

        fun me(): MeServiceAsync.WithRawResponse

        fun serviceAccounts(): ServiceAccountServiceAsync.WithRawResponse

        fun charts(): ChartServiceAsync.WithRawResponse

        fun orgCharts(): OrgChartServiceAsync.WithRawResponse

        fun repos(): RepoServiceAsync.WithRawResponse

        fun commits(): CommitServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/likes/{owner}/{repo}`, but is otherwise the
         * same as [V1ServiceAsync.update].
         */
        fun update(
            repo: String,
            params: V1UpdateParams,
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        fun update(
            repo: String,
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        fun update(params: V1UpdateParams): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [V1ServiceAsync.events].
         */
        fun events(params: V1EventsParams): CompletableFuture<HttpResponseFor<V1EventsResponse>> =
            events(params, RequestOptions.none())

        /** @see events */
        fun events(
            params: V1EventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1EventsResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/login`, but is otherwise the same as
         * [V1ServiceAsync.login].
         */
        fun login(): CompletableFuture<HttpResponseFor<V1LoginResponse>> =
            login(V1LoginParams.none())

        /** @see login */
        fun login(
            params: V1LoginParams = V1LoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1LoginResponse>>

        /** @see login */
        fun login(
            params: V1LoginParams = V1LoginParams.none()
        ): CompletableFuture<HttpResponseFor<V1LoginResponse>> =
            login(params, RequestOptions.none())

        /** @see login */
        fun login(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1LoginResponse>> =
            login(V1LoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ok`, but is otherwise the same as
         * [V1ServiceAsync.retrieveOk].
         */
        fun retrieveOk(): CompletableFuture<HttpResponseFor<V1RetrieveOkResponse>> =
            retrieveOk(V1RetrieveOkParams.none())

        /** @see retrieveOk */
        fun retrieveOk(
            params: V1RetrieveOkParams = V1RetrieveOkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveOkResponse>>

        /** @see retrieveOk */
        fun retrieveOk(
            params: V1RetrieveOkParams = V1RetrieveOkParams.none()
        ): CompletableFuture<HttpResponseFor<V1RetrieveOkResponse>> =
            retrieveOk(params, RequestOptions.none())

        /** @see retrieveOk */
        fun retrieveOk(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1RetrieveOkResponse>> =
            retrieveOk(V1RetrieveOkParams.none(), requestOptions)
    }
}
