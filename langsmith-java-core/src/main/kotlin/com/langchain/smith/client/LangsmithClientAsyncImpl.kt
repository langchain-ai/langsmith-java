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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.ClientEventsParams
import com.langchain.smith.models.ClientEventsResponse
import com.langchain.smith.models.ClientLoginParams
import com.langchain.smith.models.ClientLoginResponse
import com.langchain.smith.models.ClientRetrieveOkParams
import com.langchain.smith.models.ClientRetrieveOkResponse
import com.langchain.smith.models.ClientUpdateParams
import com.langchain.smith.models.ClientUpdateResponse
import com.langchain.smith.services.async.AceServiceAsync
import com.langchain.smith.services.async.AceServiceAsyncImpl
import com.langchain.smith.services.async.AnnotationQueueServiceAsync
import com.langchain.smith.services.async.AnnotationQueueServiceAsyncImpl
import com.langchain.smith.services.async.ApiKeyServiceAsync
import com.langchain.smith.services.async.ApiKeyServiceAsyncImpl
import com.langchain.smith.services.async.BulkExportServiceAsync
import com.langchain.smith.services.async.BulkExportServiceAsyncImpl
import com.langchain.smith.services.async.CommentServiceAsync
import com.langchain.smith.services.async.CommentServiceAsyncImpl
import com.langchain.smith.services.async.CommitServiceAsync
import com.langchain.smith.services.async.CommitServiceAsyncImpl
import com.langchain.smith.services.async.DatasetServiceAsync
import com.langchain.smith.services.async.DatasetServiceAsyncImpl
import com.langchain.smith.services.async.ExampleServiceAsync
import com.langchain.smith.services.async.ExampleServiceAsyncImpl
import com.langchain.smith.services.async.FeedbackConfigServiceAsync
import com.langchain.smith.services.async.FeedbackConfigServiceAsyncImpl
import com.langchain.smith.services.async.FeedbackServiceAsync
import com.langchain.smith.services.async.FeedbackServiceAsyncImpl
import com.langchain.smith.services.async.InfoServiceAsync
import com.langchain.smith.services.async.InfoServiceAsyncImpl
import com.langchain.smith.services.async.MeServiceAsync
import com.langchain.smith.services.async.MeServiceAsyncImpl
import com.langchain.smith.services.async.ModelPriceMapServiceAsync
import com.langchain.smith.services.async.ModelPriceMapServiceAsyncImpl
import com.langchain.smith.services.async.OAuthServiceAsync
import com.langchain.smith.services.async.OAuthServiceAsyncImpl
import com.langchain.smith.services.async.OrgServiceAsync
import com.langchain.smith.services.async.OrgServiceAsyncImpl
import com.langchain.smith.services.async.PlatformServiceAsync
import com.langchain.smith.services.async.PlatformServiceAsyncImpl
import com.langchain.smith.services.async.PlaygroundSettingServiceAsync
import com.langchain.smith.services.async.PlaygroundSettingServiceAsyncImpl
import com.langchain.smith.services.async.PromptWebhookServiceAsync
import com.langchain.smith.services.async.PromptWebhookServiceAsyncImpl
import com.langchain.smith.services.async.PublicServiceAsync
import com.langchain.smith.services.async.PublicServiceAsyncImpl
import com.langchain.smith.services.async.RepoServiceAsync
import com.langchain.smith.services.async.RepoServiceAsyncImpl
import com.langchain.smith.services.async.RunServiceAsync
import com.langchain.smith.services.async.RunServiceAsyncImpl
import com.langchain.smith.services.async.ServiceAccountServiceAsync
import com.langchain.smith.services.async.ServiceAccountServiceAsyncImpl
import com.langchain.smith.services.async.SessionServiceAsync
import com.langchain.smith.services.async.SessionServiceAsyncImpl
import com.langchain.smith.services.async.SettingServiceAsync
import com.langchain.smith.services.async.SettingServiceAsyncImpl
import com.langchain.smith.services.async.SsoServiceAsync
import com.langchain.smith.services.async.SsoServiceAsyncImpl
import com.langchain.smith.services.async.TenantServiceAsync
import com.langchain.smith.services.async.TenantServiceAsyncImpl
import com.langchain.smith.services.async.TtlSettingServiceAsync
import com.langchain.smith.services.async.TtlSettingServiceAsyncImpl
import com.langchain.smith.services.async.UsageLimitServiceAsync
import com.langchain.smith.services.async.UsageLimitServiceAsyncImpl
import com.langchain.smith.services.async.WorkspaceServiceAsync
import com.langchain.smith.services.async.WorkspaceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LangsmithClientAsyncImpl(private val clientOptions: ClientOptions) : LangsmithClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LangsmithClient by lazy { LangsmithClientImpl(clientOptions) }

    private val withRawResponse: LangsmithClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionServiceAsync by lazy {
        SessionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orgs: OrgServiceAsync by lazy { OrgServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val oauth: OAuthServiceAsync by lazy {
        OAuthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sso: SsoServiceAsync by lazy { SsoServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val apiKey: ApiKeyServiceAsync by lazy {
        ApiKeyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val examples: ExampleServiceAsync by lazy {
        ExampleServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val datasets: DatasetServiceAsync by lazy {
        DatasetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val feedback: FeedbackServiceAsync by lazy {
        FeedbackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val public_: PublicServiceAsync by lazy {
        PublicServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val annotationQueues: AnnotationQueueServiceAsync by lazy {
        AnnotationQueueServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ace: AceServiceAsync by lazy { AceServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val bulkExports: BulkExportServiceAsync by lazy {
        BulkExportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tenants: TenantServiceAsync by lazy {
        TenantServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val feedbackConfigs: FeedbackConfigServiceAsync by lazy {
        FeedbackConfigServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val modelPriceMap: ModelPriceMapServiceAsync by lazy {
        ModelPriceMapServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val usageLimits: UsageLimitServiceAsync by lazy {
        UsageLimitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ttlSettings: TtlSettingServiceAsync by lazy {
        TtlSettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val promptWebhooks: PromptWebhookServiceAsync by lazy {
        PromptWebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val workspaces: WorkspaceServiceAsync by lazy {
        WorkspaceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val playgroundSettings: PlaygroundSettingServiceAsync by lazy {
        PlaygroundSettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val me: MeServiceAsync by lazy { MeServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val serviceAccounts: ServiceAccountServiceAsync by lazy {
        ServiceAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val repos: RepoServiceAsync by lazy { RepoServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val commits: CommitServiceAsync by lazy {
        CommitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingServiceAsync by lazy {
        SettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val comments: CommentServiceAsync by lazy {
        CommentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val platform: PlatformServiceAsync by lazy {
        PlatformServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LangsmithClient = sync

    override fun withRawResponse(): LangsmithClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClientAsync =
        LangsmithClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

    override fun promptWebhooks(): PromptWebhookServiceAsync = promptWebhooks

    override fun workspaces(): WorkspaceServiceAsync = workspaces

    override fun playgroundSettings(): PlaygroundSettingServiceAsync = playgroundSettings

    override fun me(): MeServiceAsync = me

    override fun serviceAccounts(): ServiceAccountServiceAsync = serviceAccounts

    override fun repos(): RepoServiceAsync = repos

    override fun commits(): CommitServiceAsync = commits

    override fun settings(): SettingServiceAsync = settings

    override fun comments(): CommentServiceAsync = comments

    override fun platform(): PlatformServiceAsync = platform

    override fun update(
        params: ClientUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClientUpdateResponse> =
        // post /api/v1/likes/{owner}/{repo}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun events(
        params: ClientEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClientEventsResponse> =
        // post /api/v1/events
        withRawResponse().events(params, requestOptions).thenApply { it.parse() }

    override fun login(
        params: ClientLoginParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClientLoginResponse> =
        // post /api/v1/login
        withRawResponse().login(params, requestOptions).thenApply { it.parse() }

    override fun retrieveOk(
        params: ClientRetrieveOkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClientRetrieveOkResponse> =
        // get /api/v1/ok
        withRawResponse().retrieveOk(params, requestOptions).thenApply { it.parse() }

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangsmithClientAsync.WithRawResponse {

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

        private val platform: PlatformServiceAsync.WithRawResponse by lazy {
            PlatformServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithClientAsync.WithRawResponse =
            LangsmithClientAsyncImpl.WithRawResponseImpl(
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

        override fun promptWebhooks(): PromptWebhookServiceAsync.WithRawResponse = promptWebhooks

        override fun workspaces(): WorkspaceServiceAsync.WithRawResponse = workspaces

        override fun playgroundSettings(): PlaygroundSettingServiceAsync.WithRawResponse =
            playgroundSettings

        override fun me(): MeServiceAsync.WithRawResponse = me

        override fun serviceAccounts(): ServiceAccountServiceAsync.WithRawResponse = serviceAccounts

        override fun repos(): RepoServiceAsync.WithRawResponse = repos

        override fun commits(): CommitServiceAsync.WithRawResponse = commits

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        override fun platform(): PlatformServiceAsync.WithRawResponse = platform

        private val updateHandler: Handler<ClientUpdateResponse> =
            jsonHandler<ClientUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ClientUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClientUpdateResponse>> {
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

        private val eventsHandler: Handler<ClientEventsResponse> =
            jsonHandler<ClientEventsResponse>(clientOptions.jsonMapper)

        override fun events(
            params: ClientEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClientEventsResponse>> {
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

        private val loginHandler: Handler<ClientLoginResponse> =
            jsonHandler<ClientLoginResponse>(clientOptions.jsonMapper)

        override fun login(
            params: ClientLoginParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClientLoginResponse>> {
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

        private val retrieveOkHandler: Handler<ClientRetrieveOkResponse> =
            jsonHandler<ClientRetrieveOkResponse>(clientOptions.jsonMapper)

        override fun retrieveOk(
            params: ClientRetrieveOkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClientRetrieveOkResponse>> {
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
