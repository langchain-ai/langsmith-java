// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.V1EventsParams
import com.langsmith_api.api.models.api.v1.V1EventsResponse
import com.langsmith_api.api.models.api.v1.V1LoginParams
import com.langsmith_api.api.models.api.v1.V1LoginResponse
import com.langsmith_api.api.models.api.v1.V1RetrieveOkParams
import com.langsmith_api.api.models.api.v1.V1RetrieveOkResponse
import com.langsmith_api.api.models.api.v1.V1UpdateParams
import com.langsmith_api.api.models.api.v1.V1UpdateResponse
import com.langsmith_api.api.services.async.api.v1.AceServiceAsync
import com.langsmith_api.api.services.async.api.v1.AceServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.AnnotationQueueServiceAsync
import com.langsmith_api.api.services.async.api.v1.AnnotationQueueServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.ApiKeyServiceAsync
import com.langsmith_api.api.services.async.api.v1.ApiKeyServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.BulkExportServiceAsync
import com.langsmith_api.api.services.async.api.v1.BulkExportServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.ChartServiceAsync
import com.langsmith_api.api.services.async.api.v1.ChartServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.CommentServiceAsync
import com.langsmith_api.api.services.async.api.v1.CommentServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.CommitServiceAsync
import com.langsmith_api.api.services.async.api.v1.CommitServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.DatasetServiceAsync
import com.langsmith_api.api.services.async.api.v1.DatasetServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.ExampleServiceAsync
import com.langsmith_api.api.services.async.api.v1.ExampleServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.FeedbackConfigServiceAsync
import com.langsmith_api.api.services.async.api.v1.FeedbackConfigServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.FeedbackServiceAsync
import com.langsmith_api.api.services.async.api.v1.FeedbackServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.InfoServiceAsync
import com.langsmith_api.api.services.async.api.v1.InfoServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.MeServiceAsync
import com.langsmith_api.api.services.async.api.v1.MeServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.ModelPriceMapServiceAsync
import com.langsmith_api.api.services.async.api.v1.ModelPriceMapServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.OAuthServiceAsync
import com.langsmith_api.api.services.async.api.v1.OAuthServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.OrgChartServiceAsync
import com.langsmith_api.api.services.async.api.v1.OrgChartServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.OrgServiceAsync
import com.langsmith_api.api.services.async.api.v1.OrgServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.PlaygroundSettingServiceAsync
import com.langsmith_api.api.services.async.api.v1.PlaygroundSettingServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.PromptServiceAsync
import com.langsmith_api.api.services.async.api.v1.PromptServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.PromptWebhookServiceAsync
import com.langsmith_api.api.services.async.api.v1.PromptWebhookServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.PublicServiceAsync
import com.langsmith_api.api.services.async.api.v1.PublicServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.RepoServiceAsync
import com.langsmith_api.api.services.async.api.v1.RepoServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.RunServiceAsync
import com.langsmith_api.api.services.async.api.v1.RunServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.ServiceAccountServiceAsync
import com.langsmith_api.api.services.async.api.v1.ServiceAccountServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.SessionServiceAsync
import com.langsmith_api.api.services.async.api.v1.SessionServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.SettingServiceAsync
import com.langsmith_api.api.services.async.api.v1.SettingServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.SsoServiceAsync
import com.langsmith_api.api.services.async.api.v1.SsoServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.TenantServiceAsync
import com.langsmith_api.api.services.async.api.v1.TenantServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.TtlSettingServiceAsync
import com.langsmith_api.api.services.async.api.v1.TtlSettingServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.UsageLimitServiceAsync
import com.langsmith_api.api.services.async.api.v1.UsageLimitServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.WorkspaceServiceAsync
import com.langsmith_api.api.services.async.api.v1.WorkspaceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    private val orgs: OrgServiceAsync by lazy { OrgServiceAsyncImpl(clientOptions) }

    private val oauth: OAuthServiceAsync by lazy { OAuthServiceAsyncImpl(clientOptions) }

    private val sso: SsoServiceAsync by lazy { SsoServiceAsyncImpl(clientOptions) }

    private val apiKey: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    private val examples: ExampleServiceAsync by lazy { ExampleServiceAsyncImpl(clientOptions) }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val feedback: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    private val public_: PublicServiceAsync by lazy { PublicServiceAsyncImpl(clientOptions) }

    private val annotationQueues: AnnotationQueueServiceAsync by lazy {
        AnnotationQueueServiceAsyncImpl(clientOptions)
    }

    private val ace: AceServiceAsync by lazy { AceServiceAsyncImpl(clientOptions) }

    private val bulkExports: BulkExportServiceAsync by lazy {
        BulkExportServiceAsyncImpl(clientOptions)
    }

    private val tenants: TenantServiceAsync by lazy { TenantServiceAsyncImpl(clientOptions) }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    private val feedbackConfigs: FeedbackConfigServiceAsync by lazy {
        FeedbackConfigServiceAsyncImpl(clientOptions)
    }

    private val modelPriceMap: ModelPriceMapServiceAsync by lazy {
        ModelPriceMapServiceAsyncImpl(clientOptions)
    }

    private val usageLimits: UsageLimitServiceAsync by lazy {
        UsageLimitServiceAsyncImpl(clientOptions)
    }

    private val ttlSettings: TtlSettingServiceAsync by lazy {
        TtlSettingServiceAsyncImpl(clientOptions)
    }

    private val prompts: PromptServiceAsync by lazy { PromptServiceAsyncImpl(clientOptions) }

    private val promptWebhooks: PromptWebhookServiceAsync by lazy {
        PromptWebhookServiceAsyncImpl(clientOptions)
    }

    private val workspaces: WorkspaceServiceAsync by lazy {
        WorkspaceServiceAsyncImpl(clientOptions)
    }

    private val playgroundSettings: PlaygroundSettingServiceAsync by lazy {
        PlaygroundSettingServiceAsyncImpl(clientOptions)
    }

    private val me: MeServiceAsync by lazy { MeServiceAsyncImpl(clientOptions) }

    private val serviceAccounts: ServiceAccountServiceAsync by lazy {
        ServiceAccountServiceAsyncImpl(clientOptions)
    }

    private val charts: ChartServiceAsync by lazy { ChartServiceAsyncImpl(clientOptions) }

    private val orgCharts: OrgChartServiceAsync by lazy { OrgChartServiceAsyncImpl(clientOptions) }

    private val repos: RepoServiceAsync by lazy { RepoServiceAsyncImpl(clientOptions) }

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    private val comments: CommentServiceAsync by lazy { CommentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionServiceAsync = sessions

    override fun orgs(): OrgServiceAsync = orgs

    override fun oauth(): OAuthServiceAsync = oauth

    override fun sso(): SsoServiceAsync = sso

    override fun apiKey(): ApiKeyServiceAsync = apiKey

    override fun examples(): ExampleServiceAsync = examples

    override fun datasets(): DatasetServiceAsync = datasets

    override fun runs(): RunServiceAsync = runs

    override fun feedback(): FeedbackServiceAsync = feedback

    override fun public_(): PublicServiceAsync = public_

    override fun annotationQueues(): AnnotationQueueServiceAsync = annotationQueues

    override fun ace(): AceServiceAsync = ace

    override fun bulkExports(): BulkExportServiceAsync = bulkExports

    override fun tenants(): TenantServiceAsync = tenants

    override fun info(): InfoServiceAsync = info

    override fun feedbackConfigs(): FeedbackConfigServiceAsync = feedbackConfigs

    override fun modelPriceMap(): ModelPriceMapServiceAsync = modelPriceMap

    override fun usageLimits(): UsageLimitServiceAsync = usageLimits

    override fun ttlSettings(): TtlSettingServiceAsync = ttlSettings

    override fun prompts(): PromptServiceAsync = prompts

    override fun promptWebhooks(): PromptWebhookServiceAsync = promptWebhooks

    override fun workspaces(): WorkspaceServiceAsync = workspaces

    override fun playgroundSettings(): PlaygroundSettingServiceAsync = playgroundSettings

    override fun me(): MeServiceAsync = me

    override fun serviceAccounts(): ServiceAccountServiceAsync = serviceAccounts

    override fun charts(): ChartServiceAsync = charts

    override fun orgCharts(): OrgChartServiceAsync = orgCharts

    override fun repos(): RepoServiceAsync = repos

    override fun commits(): CommitServiceAsync = commits

    override fun settings(): SettingServiceAsync = settings

    override fun comments(): CommentServiceAsync = comments

    override fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1UpdateResponse> =
        // post /api/v1/likes/{owner}/{repo}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun events(
        params: V1EventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1EventsResponse> =
        // post /api/v1/events
        withRawResponse().events(params, requestOptions).thenApply { it.parse() }

    override fun login(
        params: V1LoginParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1LoginResponse> =
        // post /api/v1/login
        withRawResponse().login(params, requestOptions).thenApply { it.parse() }

    override fun retrieveOk(
        params: V1RetrieveOkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveOkResponse> =
        // get /api/v1/ok
        withRawResponse().retrieveOk(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val sessions: SessionServiceAsync.WithRawResponse by lazy {
            SessionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgServiceAsync.WithRawResponse by lazy {
            OrgServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauth: OAuthServiceAsync.WithRawResponse by lazy {
            OAuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sso: SsoServiceAsync.WithRawResponse by lazy {
            SsoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKey: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val examples: ExampleServiceAsync.WithRawResponse by lazy {
            ExampleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedback: FeedbackServiceAsync.WithRawResponse by lazy {
            FeedbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val public_: PublicServiceAsync.WithRawResponse by lazy {
            PublicServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val annotationQueues: AnnotationQueueServiceAsync.WithRawResponse by lazy {
            AnnotationQueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ace: AceServiceAsync.WithRawResponse by lazy {
            AceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bulkExports: BulkExportServiceAsync.WithRawResponse by lazy {
            BulkExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tenants: TenantServiceAsync.WithRawResponse by lazy {
            TenantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedbackConfigs: FeedbackConfigServiceAsync.WithRawResponse by lazy {
            FeedbackConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val modelPriceMap: ModelPriceMapServiceAsync.WithRawResponse by lazy {
            ModelPriceMapServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageLimits: UsageLimitServiceAsync.WithRawResponse by lazy {
            UsageLimitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ttlSettings: TtlSettingServiceAsync.WithRawResponse by lazy {
            TtlSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val prompts: PromptServiceAsync.WithRawResponse by lazy {
            PromptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val promptWebhooks: PromptWebhookServiceAsync.WithRawResponse by lazy {
            PromptWebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val workspaces: WorkspaceServiceAsync.WithRawResponse by lazy {
            WorkspaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val playgroundSettings: PlaygroundSettingServiceAsync.WithRawResponse by lazy {
            PlaygroundSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val me: MeServiceAsync.WithRawResponse by lazy {
            MeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val serviceAccounts: ServiceAccountServiceAsync.WithRawResponse by lazy {
            ServiceAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val charts: ChartServiceAsync.WithRawResponse by lazy {
            ChartServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgCharts: OrgChartServiceAsync.WithRawResponse by lazy {
            OrgChartServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val repos: RepoServiceAsync.WithRawResponse by lazy {
            RepoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val commits: CommitServiceAsync.WithRawResponse by lazy {
            CommitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sessions(): SessionServiceAsync.WithRawResponse = sessions

        override fun orgs(): OrgServiceAsync.WithRawResponse = orgs

        override fun oauth(): OAuthServiceAsync.WithRawResponse = oauth

        override fun sso(): SsoServiceAsync.WithRawResponse = sso

        override fun apiKey(): ApiKeyServiceAsync.WithRawResponse = apiKey

        override fun examples(): ExampleServiceAsync.WithRawResponse = examples

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        override fun feedback(): FeedbackServiceAsync.WithRawResponse = feedback

        override fun public_(): PublicServiceAsync.WithRawResponse = public_

        override fun annotationQueues(): AnnotationQueueServiceAsync.WithRawResponse =
            annotationQueues

        override fun ace(): AceServiceAsync.WithRawResponse = ace

        override fun bulkExports(): BulkExportServiceAsync.WithRawResponse = bulkExports

        override fun tenants(): TenantServiceAsync.WithRawResponse = tenants

        override fun info(): InfoServiceAsync.WithRawResponse = info

        override fun feedbackConfigs(): FeedbackConfigServiceAsync.WithRawResponse = feedbackConfigs

        override fun modelPriceMap(): ModelPriceMapServiceAsync.WithRawResponse = modelPriceMap

        override fun usageLimits(): UsageLimitServiceAsync.WithRawResponse = usageLimits

        override fun ttlSettings(): TtlSettingServiceAsync.WithRawResponse = ttlSettings

        override fun prompts(): PromptServiceAsync.WithRawResponse = prompts

        override fun promptWebhooks(): PromptWebhookServiceAsync.WithRawResponse = promptWebhooks

        override fun workspaces(): WorkspaceServiceAsync.WithRawResponse = workspaces

        override fun playgroundSettings(): PlaygroundSettingServiceAsync.WithRawResponse =
            playgroundSettings

        override fun me(): MeServiceAsync.WithRawResponse = me

        override fun serviceAccounts(): ServiceAccountServiceAsync.WithRawResponse = serviceAccounts

        override fun charts(): ChartServiceAsync.WithRawResponse = charts

        override fun orgCharts(): OrgChartServiceAsync.WithRawResponse = orgCharts

        override fun repos(): RepoServiceAsync.WithRawResponse = repos

        override fun commits(): CommitServiceAsync.WithRawResponse = commits

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        private val updateHandler: Handler<V1UpdateResponse> =
            jsonHandler<V1UpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "likes",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val eventsHandler: Handler<V1EventsResponse> =
            jsonHandler<V1EventsResponse>(clientOptions.jsonMapper)

        override fun events(
            params: V1EventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1EventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { eventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val loginHandler: Handler<V1LoginResponse> =
            jsonHandler<V1LoginResponse>(clientOptions.jsonMapper)

        override fun login(
            params: V1LoginParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1LoginResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "login")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { loginHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveOkHandler: Handler<V1RetrieveOkResponse> =
            jsonHandler<V1RetrieveOkResponse>(clientOptions.jsonMapper)

        override fun retrieveOk(
            params: V1RetrieveOkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1RetrieveOkResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ok")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveOkHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
