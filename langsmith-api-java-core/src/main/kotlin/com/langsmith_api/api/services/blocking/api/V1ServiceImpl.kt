// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api

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
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.V1EventsParams
import com.langsmith_api.api.models.api.v1.V1EventsResponse
import com.langsmith_api.api.models.api.v1.V1LoginParams
import com.langsmith_api.api.models.api.v1.V1LoginResponse
import com.langsmith_api.api.models.api.v1.V1RetrieveOkParams
import com.langsmith_api.api.models.api.v1.V1RetrieveOkResponse
import com.langsmith_api.api.models.api.v1.V1UpdateParams
import com.langsmith_api.api.models.api.v1.V1UpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.AceService
import com.langsmith_api.api.services.blocking.api.v1.AceServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.AnnotationQueueService
import com.langsmith_api.api.services.blocking.api.v1.AnnotationQueueServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.ApiKeyService
import com.langsmith_api.api.services.blocking.api.v1.ApiKeyServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.BulkExportService
import com.langsmith_api.api.services.blocking.api.v1.BulkExportServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.ChartService
import com.langsmith_api.api.services.blocking.api.v1.ChartServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.CommentService
import com.langsmith_api.api.services.blocking.api.v1.CommentServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.CommitService
import com.langsmith_api.api.services.blocking.api.v1.CommitServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.DatasetService
import com.langsmith_api.api.services.blocking.api.v1.DatasetServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.ExampleService
import com.langsmith_api.api.services.blocking.api.v1.ExampleServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.FeedbackConfigService
import com.langsmith_api.api.services.blocking.api.v1.FeedbackConfigServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.FeedbackService
import com.langsmith_api.api.services.blocking.api.v1.FeedbackServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.InfoService
import com.langsmith_api.api.services.blocking.api.v1.InfoServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.MeService
import com.langsmith_api.api.services.blocking.api.v1.MeServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.ModelPriceMapService
import com.langsmith_api.api.services.blocking.api.v1.ModelPriceMapServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.OAuthService
import com.langsmith_api.api.services.blocking.api.v1.OAuthServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.OrgChartService
import com.langsmith_api.api.services.blocking.api.v1.OrgChartServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.OrgService
import com.langsmith_api.api.services.blocking.api.v1.OrgServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.PlaygroundSettingService
import com.langsmith_api.api.services.blocking.api.v1.PlaygroundSettingServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.PromptService
import com.langsmith_api.api.services.blocking.api.v1.PromptServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.PromptWebhookService
import com.langsmith_api.api.services.blocking.api.v1.PromptWebhookServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.PublicService
import com.langsmith_api.api.services.blocking.api.v1.PublicServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.RepoService
import com.langsmith_api.api.services.blocking.api.v1.RepoServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.RunService
import com.langsmith_api.api.services.blocking.api.v1.RunServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.ServiceAccountService
import com.langsmith_api.api.services.blocking.api.v1.ServiceAccountServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.SessionService
import com.langsmith_api.api.services.blocking.api.v1.SessionServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.SettingService
import com.langsmith_api.api.services.blocking.api.v1.SettingServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.SsoService
import com.langsmith_api.api.services.blocking.api.v1.SsoServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.TenantService
import com.langsmith_api.api.services.blocking.api.v1.TenantServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.TtlSettingService
import com.langsmith_api.api.services.blocking.api.v1.TtlSettingServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.UsageLimitService
import com.langsmith_api.api.services.blocking.api.v1.UsageLimitServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.WorkspaceService
import com.langsmith_api.api.services.blocking.api.v1.WorkspaceServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    private val orgs: OrgService by lazy { OrgServiceImpl(clientOptions) }

    private val oauth: OAuthService by lazy { OAuthServiceImpl(clientOptions) }

    private val sso: SsoService by lazy { SsoServiceImpl(clientOptions) }

    private val apiKey: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptions) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val feedback: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    private val public_: PublicService by lazy { PublicServiceImpl(clientOptions) }

    private val annotationQueues: AnnotationQueueService by lazy {
        AnnotationQueueServiceImpl(clientOptions)
    }

    private val ace: AceService by lazy { AceServiceImpl(clientOptions) }

    private val bulkExports: BulkExportService by lazy { BulkExportServiceImpl(clientOptions) }

    private val tenants: TenantService by lazy { TenantServiceImpl(clientOptions) }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    private val feedbackConfigs: FeedbackConfigService by lazy {
        FeedbackConfigServiceImpl(clientOptions)
    }

    private val modelPriceMap: ModelPriceMapService by lazy {
        ModelPriceMapServiceImpl(clientOptions)
    }

    private val usageLimits: UsageLimitService by lazy { UsageLimitServiceImpl(clientOptions) }

    private val ttlSettings: TtlSettingService by lazy { TtlSettingServiceImpl(clientOptions) }

    private val prompts: PromptService by lazy { PromptServiceImpl(clientOptions) }

    private val promptWebhooks: PromptWebhookService by lazy {
        PromptWebhookServiceImpl(clientOptions)
    }

    private val workspaces: WorkspaceService by lazy { WorkspaceServiceImpl(clientOptions) }

    private val playgroundSettings: PlaygroundSettingService by lazy {
        PlaygroundSettingServiceImpl(clientOptions)
    }

    private val me: MeService by lazy { MeServiceImpl(clientOptions) }

    private val serviceAccounts: ServiceAccountService by lazy {
        ServiceAccountServiceImpl(clientOptions)
    }

    private val charts: ChartService by lazy { ChartServiceImpl(clientOptions) }

    private val orgCharts: OrgChartService by lazy { OrgChartServiceImpl(clientOptions) }

    private val repos: RepoService by lazy { RepoServiceImpl(clientOptions) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionService = sessions

    override fun orgs(): OrgService = orgs

    override fun oauth(): OAuthService = oauth

    override fun sso(): SsoService = sso

    override fun apiKey(): ApiKeyService = apiKey

    override fun examples(): ExampleService = examples

    override fun datasets(): DatasetService = datasets

    override fun runs(): RunService = runs

    override fun feedback(): FeedbackService = feedback

    override fun public_(): PublicService = public_

    override fun annotationQueues(): AnnotationQueueService = annotationQueues

    override fun ace(): AceService = ace

    override fun bulkExports(): BulkExportService = bulkExports

    override fun tenants(): TenantService = tenants

    override fun info(): InfoService = info

    override fun feedbackConfigs(): FeedbackConfigService = feedbackConfigs

    override fun modelPriceMap(): ModelPriceMapService = modelPriceMap

    override fun usageLimits(): UsageLimitService = usageLimits

    override fun ttlSettings(): TtlSettingService = ttlSettings

    override fun prompts(): PromptService = prompts

    override fun promptWebhooks(): PromptWebhookService = promptWebhooks

    override fun workspaces(): WorkspaceService = workspaces

    override fun playgroundSettings(): PlaygroundSettingService = playgroundSettings

    override fun me(): MeService = me

    override fun serviceAccounts(): ServiceAccountService = serviceAccounts

    override fun charts(): ChartService = charts

    override fun orgCharts(): OrgChartService = orgCharts

    override fun repos(): RepoService = repos

    override fun commits(): CommitService = commits

    override fun settings(): SettingService = settings

    override fun comments(): CommentService = comments

    override fun update(params: V1UpdateParams, requestOptions: RequestOptions): V1UpdateResponse =
        // post /api/v1/likes/{owner}/{repo}
        withRawResponse().update(params, requestOptions).parse()

    override fun events(params: V1EventsParams, requestOptions: RequestOptions): V1EventsResponse =
        // post /api/v1/events
        withRawResponse().events(params, requestOptions).parse()

    override fun login(params: V1LoginParams, requestOptions: RequestOptions): V1LoginResponse =
        // post /api/v1/login
        withRawResponse().login(params, requestOptions).parse()

    override fun retrieveOk(
        params: V1RetrieveOkParams,
        requestOptions: RequestOptions,
    ): V1RetrieveOkResponse =
        // get /api/v1/ok
        withRawResponse().retrieveOk(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val sessions: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgService.WithRawResponse by lazy {
            OrgServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauth: OAuthService.WithRawResponse by lazy {
            OAuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sso: SsoService.WithRawResponse by lazy {
            SsoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKey: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val examples: ExampleService.WithRawResponse by lazy {
            ExampleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedback: FeedbackService.WithRawResponse by lazy {
            FeedbackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val public_: PublicService.WithRawResponse by lazy {
            PublicServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val annotationQueues: AnnotationQueueService.WithRawResponse by lazy {
            AnnotationQueueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ace: AceService.WithRawResponse by lazy {
            AceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bulkExports: BulkExportService.WithRawResponse by lazy {
            BulkExportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tenants: TenantService.WithRawResponse by lazy {
            TenantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedbackConfigs: FeedbackConfigService.WithRawResponse by lazy {
            FeedbackConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val modelPriceMap: ModelPriceMapService.WithRawResponse by lazy {
            ModelPriceMapServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageLimits: UsageLimitService.WithRawResponse by lazy {
            UsageLimitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ttlSettings: TtlSettingService.WithRawResponse by lazy {
            TtlSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val prompts: PromptService.WithRawResponse by lazy {
            PromptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val promptWebhooks: PromptWebhookService.WithRawResponse by lazy {
            PromptWebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val workspaces: WorkspaceService.WithRawResponse by lazy {
            WorkspaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val playgroundSettings: PlaygroundSettingService.WithRawResponse by lazy {
            PlaygroundSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val me: MeService.WithRawResponse by lazy {
            MeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val serviceAccounts: ServiceAccountService.WithRawResponse by lazy {
            ServiceAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val charts: ChartService.WithRawResponse by lazy {
            ChartServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgCharts: OrgChartService.WithRawResponse by lazy {
            OrgChartServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val repos: RepoService.WithRawResponse by lazy {
            RepoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val commits: CommitService.WithRawResponse by lazy {
            CommitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sessions(): SessionService.WithRawResponse = sessions

        override fun orgs(): OrgService.WithRawResponse = orgs

        override fun oauth(): OAuthService.WithRawResponse = oauth

        override fun sso(): SsoService.WithRawResponse = sso

        override fun apiKey(): ApiKeyService.WithRawResponse = apiKey

        override fun examples(): ExampleService.WithRawResponse = examples

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun runs(): RunService.WithRawResponse = runs

        override fun feedback(): FeedbackService.WithRawResponse = feedback

        override fun public_(): PublicService.WithRawResponse = public_

        override fun annotationQueues(): AnnotationQueueService.WithRawResponse = annotationQueues

        override fun ace(): AceService.WithRawResponse = ace

        override fun bulkExports(): BulkExportService.WithRawResponse = bulkExports

        override fun tenants(): TenantService.WithRawResponse = tenants

        override fun info(): InfoService.WithRawResponse = info

        override fun feedbackConfigs(): FeedbackConfigService.WithRawResponse = feedbackConfigs

        override fun modelPriceMap(): ModelPriceMapService.WithRawResponse = modelPriceMap

        override fun usageLimits(): UsageLimitService.WithRawResponse = usageLimits

        override fun ttlSettings(): TtlSettingService.WithRawResponse = ttlSettings

        override fun prompts(): PromptService.WithRawResponse = prompts

        override fun promptWebhooks(): PromptWebhookService.WithRawResponse = promptWebhooks

        override fun workspaces(): WorkspaceService.WithRawResponse = workspaces

        override fun playgroundSettings(): PlaygroundSettingService.WithRawResponse =
            playgroundSettings

        override fun me(): MeService.WithRawResponse = me

        override fun serviceAccounts(): ServiceAccountService.WithRawResponse = serviceAccounts

        override fun charts(): ChartService.WithRawResponse = charts

        override fun orgCharts(): OrgChartService.WithRawResponse = orgCharts

        override fun repos(): RepoService.WithRawResponse = repos

        override fun commits(): CommitService.WithRawResponse = commits

        override fun settings(): SettingService.WithRawResponse = settings

        override fun comments(): CommentService.WithRawResponse = comments

        private val updateHandler: Handler<V1UpdateResponse> =
            jsonHandler<V1UpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1UpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val eventsHandler: Handler<V1EventsResponse> =
            jsonHandler<V1EventsResponse>(clientOptions.jsonMapper)

        override fun events(
            params: V1EventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1EventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { eventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val loginHandler: Handler<V1LoginResponse> =
            jsonHandler<V1LoginResponse>(clientOptions.jsonMapper)

        override fun login(
            params: V1LoginParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1LoginResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "login")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { loginHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveOkHandler: Handler<V1RetrieveOkResponse> =
            jsonHandler<V1RetrieveOkResponse>(clientOptions.jsonMapper)

        override fun retrieveOk(
            params: V1RetrieveOkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveOkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ok")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
