// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.getPackageVersion
import com.langchain.smith.services.blocking.AnnotationQueueService
import com.langchain.smith.services.blocking.AnnotationQueueServiceImpl
import com.langchain.smith.services.blocking.CommitService
import com.langchain.smith.services.blocking.CommitServiceImpl
import com.langchain.smith.services.blocking.DatasetService
import com.langchain.smith.services.blocking.DatasetServiceImpl
import com.langchain.smith.services.blocking.EvaluatorService
import com.langchain.smith.services.blocking.EvaluatorServiceImpl
import com.langchain.smith.services.blocking.ExampleService
import com.langchain.smith.services.blocking.ExampleServiceImpl
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.FeedbackServiceImpl
import com.langchain.smith.services.blocking.InfoService
import com.langchain.smith.services.blocking.InfoServiceImpl
import com.langchain.smith.services.blocking.IssueService
import com.langchain.smith.services.blocking.IssueServiceImpl
import com.langchain.smith.services.blocking.OnlineEvaluatorService
import com.langchain.smith.services.blocking.OnlineEvaluatorServiceImpl
import com.langchain.smith.services.blocking.PublicService
import com.langchain.smith.services.blocking.PublicServiceImpl
import com.langchain.smith.services.blocking.RepoService
import com.langchain.smith.services.blocking.RepoServiceImpl
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.blocking.RunServiceImpl
import com.langchain.smith.services.blocking.SandboxService
import com.langchain.smith.services.blocking.SandboxServiceImpl
import com.langchain.smith.services.blocking.SessionService
import com.langchain.smith.services.blocking.SessionServiceImpl
import com.langchain.smith.services.blocking.SettingService
import com.langchain.smith.services.blocking.SettingServiceImpl
import com.langchain.smith.services.blocking.ThreadService
import com.langchain.smith.services.blocking.ThreadServiceImpl
import com.langchain.smith.services.blocking.TraceService
import com.langchain.smith.services.blocking.TraceServiceImpl
import com.langchain.smith.services.blocking.WorkspaceService
import com.langchain.smith.services.blocking.WorkspaceServiceImpl
import java.util.function.Consumer

class LangsmithClientImpl(private val clientOptions: ClientOptions) : LangsmithClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "langsmith-java/${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LangsmithClientAsync by lazy { LangsmithClientAsyncImpl(clientOptions) }

    private val withRawResponse: LangsmithClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptionsWithUserAgent) }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptionsWithUserAgent) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptionsWithUserAgent) }

    private val runs = lazy { RunServiceImpl(clientOptionsWithUserAgent) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptionsWithUserAgent) }

    private val traces: TraceService by lazy { TraceServiceImpl(clientOptionsWithUserAgent) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptionsWithUserAgent) }

    private val traces: TraceService by lazy { TraceServiceImpl(clientOptionsWithUserAgent) }

    private val evaluators: EvaluatorService by lazy {
        EvaluatorServiceImpl(clientOptionsWithUserAgent)
    }

    private val onlineEvaluators: OnlineEvaluatorService by lazy {
        OnlineEvaluatorServiceImpl(clientOptionsWithUserAgent)
    }

    private val feedback: FeedbackService by lazy {
        FeedbackServiceImpl(clientOptionsWithUserAgent)
    }

    private val public_: PublicService by lazy { PublicServiceImpl(clientOptionsWithUserAgent) }

    private val annotationQueues: AnnotationQueueService by lazy {
        AnnotationQueueServiceImpl(clientOptionsWithUserAgent)
    }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptionsWithUserAgent) }

    private val workspaces: WorkspaceService by lazy {
        WorkspaceServiceImpl(clientOptionsWithUserAgent)
    }

    private val repos: RepoService by lazy { RepoServiceImpl(clientOptionsWithUserAgent) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptionsWithUserAgent) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptionsWithUserAgent) }

    private val issues: IssueService by lazy { IssueServiceImpl(clientOptionsWithUserAgent) }

    private val sandboxes: SandboxService by lazy { SandboxServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): LangsmithClientAsync = async

    override fun withRawResponse(): LangsmithClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClient =
        LangsmithClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionService = sessions

    override fun examples(): ExampleService = examples

    override fun datasets(): DatasetService = datasets

    override fun runs(): RunService = runs.value

    override fun threads(): ThreadService = threads

    override fun traces(): TraceService = traces

    override fun threads(): ThreadService = threads

    override fun traces(): TraceService = traces

    override fun evaluators(): EvaluatorService = evaluators

    override fun onlineEvaluators(): OnlineEvaluatorService = onlineEvaluators

    override fun feedback(): FeedbackService = feedback

    override fun public_(): PublicService = public_

    override fun annotationQueues(): AnnotationQueueService = annotationQueues

    override fun info(): InfoService = info

    override fun workspaces(): WorkspaceService = workspaces

    override fun repos(): RepoService = repos

    override fun commits(): CommitService = commits

    override fun settings(): SettingService = settings

    override fun issues(): IssueService = issues

    override fun sandboxes(): SandboxService = sandboxes

    override fun close() {
        if (runs.isInitialized()) {
            runs.value.shutdown()
        }
        clientOptions.close()
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangsmithClient.WithRawResponse {

        private val sessions: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val threads: ThreadService.WithRawResponse by lazy {
            ThreadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val traces: TraceService.WithRawResponse by lazy {
            TraceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val evaluators: EvaluatorService.WithRawResponse by lazy {
            EvaluatorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onlineEvaluators: OnlineEvaluatorService.WithRawResponse by lazy {
            OnlineEvaluatorServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val workspaces: WorkspaceService.WithRawResponse by lazy {
            WorkspaceServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val issues: IssueService.WithRawResponse by lazy {
            IssueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sandboxes: SandboxService.WithRawResponse by lazy {
            SandboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithClient.WithRawResponse =
            LangsmithClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sessions(): SessionService.WithRawResponse = sessions

        override fun examples(): ExampleService.WithRawResponse = examples

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun runs(): RunService.WithRawResponse = runs

        override fun threads(): ThreadService.WithRawResponse = threads

        override fun traces(): TraceService.WithRawResponse = traces

        override fun evaluators(): EvaluatorService.WithRawResponse = evaluators

        override fun onlineEvaluators(): OnlineEvaluatorService.WithRawResponse = onlineEvaluators

        override fun feedback(): FeedbackService.WithRawResponse = feedback

        override fun public_(): PublicService.WithRawResponse = public_

        override fun annotationQueues(): AnnotationQueueService.WithRawResponse = annotationQueues

        override fun info(): InfoService.WithRawResponse = info

        override fun workspaces(): WorkspaceService.WithRawResponse = workspaces

        override fun repos(): RepoService.WithRawResponse = repos

        override fun commits(): CommitService.WithRawResponse = commits

        override fun settings(): SettingService.WithRawResponse = settings

        override fun issues(): IssueService.WithRawResponse = issues

        override fun sandboxes(): SandboxService.WithRawResponse = sandboxes
    }
}
