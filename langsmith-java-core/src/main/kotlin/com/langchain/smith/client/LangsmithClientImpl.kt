// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getPackageVersion
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.ClientEventsParams
import com.langchain.smith.models.ClientEventsResponse
import com.langchain.smith.models.ClientLoginParams
import com.langchain.smith.models.ClientLoginResponse
import com.langchain.smith.models.ClientRetrieveOkParams
import com.langchain.smith.models.ClientRetrieveOkResponse
import com.langchain.smith.models.ClientUpdateParams
import com.langchain.smith.models.ClientUpdateResponse
import com.langchain.smith.services.blocking.AceService
import com.langchain.smith.services.blocking.AceServiceImpl
import com.langchain.smith.services.blocking.AnnotationQueueService
import com.langchain.smith.services.blocking.AnnotationQueueServiceImpl
import com.langchain.smith.services.blocking.ApiKeyService
import com.langchain.smith.services.blocking.ApiKeyServiceImpl
import com.langchain.smith.services.blocking.BulkExportService
import com.langchain.smith.services.blocking.BulkExportServiceImpl
import com.langchain.smith.services.blocking.ChartService
import com.langchain.smith.services.blocking.ChartServiceImpl
import com.langchain.smith.services.blocking.CommentService
import com.langchain.smith.services.blocking.CommentServiceImpl
import com.langchain.smith.services.blocking.CommitService
import com.langchain.smith.services.blocking.CommitServiceImpl
import com.langchain.smith.services.blocking.DatasetService
import com.langchain.smith.services.blocking.DatasetServiceImpl
import com.langchain.smith.services.blocking.ExampleService
import com.langchain.smith.services.blocking.ExampleServiceImpl
import com.langchain.smith.services.blocking.FeedbackConfigService
import com.langchain.smith.services.blocking.FeedbackConfigServiceImpl
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.FeedbackServiceImpl
import com.langchain.smith.services.blocking.InfoService
import com.langchain.smith.services.blocking.InfoServiceImpl
import com.langchain.smith.services.blocking.MeService
import com.langchain.smith.services.blocking.MeServiceImpl
import com.langchain.smith.services.blocking.ModelPriceMapService
import com.langchain.smith.services.blocking.ModelPriceMapServiceImpl
import com.langchain.smith.services.blocking.OAuthService
import com.langchain.smith.services.blocking.OAuthServiceImpl
import com.langchain.smith.services.blocking.OrgChartService
import com.langchain.smith.services.blocking.OrgChartServiceImpl
import com.langchain.smith.services.blocking.OrgService
import com.langchain.smith.services.blocking.OrgServiceImpl
import com.langchain.smith.services.blocking.PlatformService
import com.langchain.smith.services.blocking.PlatformServiceImpl
import com.langchain.smith.services.blocking.PlaygroundSettingService
import com.langchain.smith.services.blocking.PlaygroundSettingServiceImpl
import com.langchain.smith.services.blocking.PromptService
import com.langchain.smith.services.blocking.PromptServiceImpl
import com.langchain.smith.services.blocking.PromptWebhookService
import com.langchain.smith.services.blocking.PromptWebhookServiceImpl
import com.langchain.smith.services.blocking.PublicService
import com.langchain.smith.services.blocking.PublicServiceImpl
import com.langchain.smith.services.blocking.RepoService
import com.langchain.smith.services.blocking.RepoServiceImpl
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.blocking.RunServiceImpl
import com.langchain.smith.services.blocking.ServiceAccountService
import com.langchain.smith.services.blocking.ServiceAccountServiceImpl
import com.langchain.smith.services.blocking.SessionService
import com.langchain.smith.services.blocking.SessionServiceImpl
import com.langchain.smith.services.blocking.SettingService
import com.langchain.smith.services.blocking.SettingServiceImpl
import com.langchain.smith.services.blocking.SsoService
import com.langchain.smith.services.blocking.SsoServiceImpl
import com.langchain.smith.services.blocking.TenantService
import com.langchain.smith.services.blocking.TenantServiceImpl
import com.langchain.smith.services.blocking.TtlSettingService
import com.langchain.smith.services.blocking.TtlSettingServiceImpl
import com.langchain.smith.services.blocking.UsageLimitService
import com.langchain.smith.services.blocking.UsageLimitServiceImpl
import com.langchain.smith.services.blocking.WorkspaceService
import com.langchain.smith.services.blocking.WorkspaceServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LangsmithClientImpl(private val clientOptions: ClientOptions) : LangsmithClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LangsmithClientAsync by lazy { LangsmithClientAsyncImpl(clientOptions) }

    private val withRawResponse: LangsmithClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptionsWithUserAgent) }

    private val orgs: OrgService by lazy { OrgServiceImpl(clientOptionsWithUserAgent) }

    private val oauth: OAuthService by lazy { OAuthServiceImpl(clientOptionsWithUserAgent) }

    private val sso: SsoService by lazy { SsoServiceImpl(clientOptionsWithUserAgent) }

    private val apiKey: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptionsWithUserAgent) }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptionsWithUserAgent) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptionsWithUserAgent) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptionsWithUserAgent) }

    private val feedback: FeedbackService by lazy {
        FeedbackServiceImpl(clientOptionsWithUserAgent)
    }

    private val public_: PublicService by lazy { PublicServiceImpl(clientOptionsWithUserAgent) }

    private val annotationQueues: AnnotationQueueService by lazy {
        AnnotationQueueServiceImpl(clientOptionsWithUserAgent)
    }

    private val ace: AceService by lazy { AceServiceImpl(clientOptionsWithUserAgent) }

    private val bulkExports: BulkExportService by lazy {
        BulkExportServiceImpl(clientOptionsWithUserAgent)
    }

    private val tenants: TenantService by lazy { TenantServiceImpl(clientOptionsWithUserAgent) }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptionsWithUserAgent) }

    private val feedbackConfigs: FeedbackConfigService by lazy {
        FeedbackConfigServiceImpl(clientOptionsWithUserAgent)
    }

    private val modelPriceMap: ModelPriceMapService by lazy {
        ModelPriceMapServiceImpl(clientOptionsWithUserAgent)
    }

    private val usageLimits: UsageLimitService by lazy {
        UsageLimitServiceImpl(clientOptionsWithUserAgent)
    }

    private val ttlSettings: TtlSettingService by lazy {
        TtlSettingServiceImpl(clientOptionsWithUserAgent)
    }

    private val prompts: PromptService by lazy { PromptServiceImpl(clientOptionsWithUserAgent) }

    private val promptWebhooks: PromptWebhookService by lazy {
        PromptWebhookServiceImpl(clientOptionsWithUserAgent)
    }

    private val workspaces: WorkspaceService by lazy {
        WorkspaceServiceImpl(clientOptionsWithUserAgent)
    }

    private val playgroundSettings: PlaygroundSettingService by lazy {
        PlaygroundSettingServiceImpl(clientOptionsWithUserAgent)
    }

    private val me: MeService by lazy { MeServiceImpl(clientOptionsWithUserAgent) }

    private val serviceAccounts: ServiceAccountService by lazy {
        ServiceAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val charts: ChartService by lazy { ChartServiceImpl(clientOptionsWithUserAgent) }

    private val orgCharts: OrgChartService by lazy {
        OrgChartServiceImpl(clientOptionsWithUserAgent)
    }

    private val repos: RepoService by lazy { RepoServiceImpl(clientOptionsWithUserAgent) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptionsWithUserAgent) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptionsWithUserAgent) }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptionsWithUserAgent) }

    private val platform: PlatformService by lazy {
        PlatformServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LangsmithClientAsync = async

    override fun withRawResponse(): LangsmithClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClient =
        LangsmithClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

    override fun platform(): PlatformService = platform

    override fun update(
        params: ClientUpdateParams,
        requestOptions: RequestOptions,
    ): ClientUpdateResponse =
        // post /api/v1/likes/{owner}/{repo}
        withRawResponse().update(params, requestOptions).parse()

    override fun events(
        params: ClientEventsParams,
        requestOptions: RequestOptions,
    ): ClientEventsResponse =
        // post /api/v1/events
        withRawResponse().events(params, requestOptions).parse()

    override fun login(
        params: ClientLoginParams,
        requestOptions: RequestOptions,
    ): ClientLoginResponse =
        // post /api/v1/login
        withRawResponse().login(params, requestOptions).parse()

    override fun retrieveOk(
        params: ClientRetrieveOkParams,
        requestOptions: RequestOptions,
    ): ClientRetrieveOkResponse =
        // get /api/v1/ok
        withRawResponse().retrieveOk(params, requestOptions).parse()

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangsmithClient.WithRawResponse {

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

        private val platform: PlatformService.WithRawResponse by lazy {
            PlatformServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithClient.WithRawResponse =
            LangsmithClientImpl.WithRawResponseImpl(
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

        override fun platform(): PlatformService.WithRawResponse = platform

        private val updateHandler: Handler<ClientUpdateResponse> =
            jsonHandler<ClientUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ClientUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientUpdateResponse> {
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

        private val eventsHandler: Handler<ClientEventsResponse> =
            jsonHandler<ClientEventsResponse>(clientOptions.jsonMapper)

        override fun events(
            params: ClientEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientEventsResponse> {
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

        private val loginHandler: Handler<ClientLoginResponse> =
            jsonHandler<ClientLoginResponse>(clientOptions.jsonMapper)

        override fun login(
            params: ClientLoginParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientLoginResponse> {
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

        private val retrieveOkHandler: Handler<ClientRetrieveOkResponse> =
            jsonHandler<ClientRetrieveOkResponse>(clientOptions.jsonMapper)

        override fun retrieveOk(
            params: ClientRetrieveOkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientRetrieveOkResponse> {
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
