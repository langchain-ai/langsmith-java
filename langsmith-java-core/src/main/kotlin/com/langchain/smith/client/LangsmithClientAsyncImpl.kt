// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.client

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.getPackageVersion
import com.langchain.smith.services.async.AnnotationQueueServiceAsync
import com.langchain.smith.services.async.AnnotationQueueServiceAsyncImpl
import com.langchain.smith.services.async.CommitServiceAsync
import com.langchain.smith.services.async.CommitServiceAsyncImpl
import com.langchain.smith.services.async.DatasetServiceAsync
import com.langchain.smith.services.async.DatasetServiceAsyncImpl
import com.langchain.smith.services.async.ExampleServiceAsync
import com.langchain.smith.services.async.ExampleServiceAsyncImpl
import com.langchain.smith.services.async.FeedbackServiceAsync
import com.langchain.smith.services.async.FeedbackServiceAsyncImpl
import com.langchain.smith.services.async.InfoServiceAsync
import com.langchain.smith.services.async.InfoServiceAsyncImpl
import com.langchain.smith.services.async.PlatformServiceAsync
import com.langchain.smith.services.async.PlatformServiceAsyncImpl
import com.langchain.smith.services.async.PublicServiceAsync
import com.langchain.smith.services.async.PublicServiceAsyncImpl
import com.langchain.smith.services.async.RepoServiceAsync
import com.langchain.smith.services.async.RepoServiceAsyncImpl
import com.langchain.smith.services.async.RunServiceAsync
import com.langchain.smith.services.async.RunServiceAsyncImpl
import com.langchain.smith.services.async.SessionServiceAsync
import com.langchain.smith.services.async.SessionServiceAsyncImpl
import com.langchain.smith.services.async.SettingServiceAsync
import com.langchain.smith.services.async.SettingServiceAsyncImpl
import com.langchain.smith.services.async.WorkspaceServiceAsync
import com.langchain.smith.services.async.WorkspaceServiceAsyncImpl
import java.util.function.Consumer

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

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val workspaces: WorkspaceServiceAsync by lazy {
        WorkspaceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val repos: RepoServiceAsync by lazy { RepoServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val commits: CommitServiceAsync by lazy {
        CommitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingServiceAsync by lazy {
        SettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val platform: PlatformServiceAsync by lazy {
        PlatformServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LangsmithClient = sync

    override fun withRawResponse(): LangsmithClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithClientAsync =
        LangsmithClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionServiceAsync = sessions

    override fun examples(): ExampleServiceAsync = examples

    override fun datasets(): DatasetServiceAsync = datasets

    override fun runs(): RunServiceAsync = runs

    override fun feedback(): FeedbackServiceAsync = feedback

    override fun public_(): PublicServiceAsync = public_

    override fun annotationQueues(): AnnotationQueueServiceAsync = annotationQueues

    override fun info(): InfoServiceAsync = info

    override fun workspaces(): WorkspaceServiceAsync = workspaces

    override fun repos(): RepoServiceAsync = repos

    override fun commits(): CommitServiceAsync = commits

    override fun settings(): SettingServiceAsync = settings

    override fun platform(): PlatformServiceAsync = platform

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangsmithClientAsync.WithRawResponse {

        private val sessions: SessionServiceAsync.WithRawResponse by lazy {
            SessionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val workspaces: WorkspaceServiceAsync.WithRawResponse by lazy {
            WorkspaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun examples(): ExampleServiceAsync.WithRawResponse = examples

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        override fun feedback(): FeedbackServiceAsync.WithRawResponse = feedback

        override fun public_(): PublicServiceAsync.WithRawResponse = public_

        override fun annotationQueues(): AnnotationQueueServiceAsync.WithRawResponse =
            annotationQueues

        override fun info(): InfoServiceAsync.WithRawResponse = info

        override fun workspaces(): WorkspaceServiceAsync.WithRawResponse = workspaces

        override fun repos(): RepoServiceAsync.WithRawResponse = repos

        override fun commits(): CommitServiceAsync.WithRawResponse = commits

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun platform(): PlatformServiceAsync.WithRawResponse = platform
    }
}
