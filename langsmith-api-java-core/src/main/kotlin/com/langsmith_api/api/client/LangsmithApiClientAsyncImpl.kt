// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.client

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.getPackageVersion
import com.langsmith_api.api.services.async.ApiServiceAsync
import com.langsmith_api.api.services.async.ApiServiceAsyncImpl
import com.langsmith_api.api.services.async.DatasetServiceAsync
import com.langsmith_api.api.services.async.DatasetServiceAsyncImpl
import com.langsmith_api.api.services.async.FeedbackServiceAsync
import com.langsmith_api.api.services.async.FeedbackServiceAsyncImpl
import com.langsmith_api.api.services.async.PlatformServiceAsync
import com.langsmith_api.api.services.async.PlatformServiceAsyncImpl
import com.langsmith_api.api.services.async.RunServiceAsync
import com.langsmith_api.api.services.async.RunServiceAsyncImpl
import java.util.function.Consumer

class LangsmithApiClientAsyncImpl(private val clientOptions: ClientOptions) :
    LangsmithApiClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LangsmithApiClient by lazy { LangsmithApiClientImpl(clientOptions) }

    private val withRawResponse: LangsmithApiClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val api: ApiServiceAsync by lazy { ApiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val datasets: DatasetServiceAsync by lazy {
        DatasetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val feedback: FeedbackServiceAsync by lazy {
        FeedbackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val platform: PlatformServiceAsync by lazy {
        PlatformServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LangsmithApiClient = sync

    override fun withRawResponse(): LangsmithApiClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithApiClientAsync =
        LangsmithApiClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun api(): ApiServiceAsync = api

    override fun datasets(): DatasetServiceAsync = datasets

    override fun feedback(): FeedbackServiceAsync = feedback

    override fun runs(): RunServiceAsync = runs

    override fun platform(): PlatformServiceAsync = platform

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangsmithApiClientAsync.WithRawResponse {

        private val api: ApiServiceAsync.WithRawResponse by lazy {
            ApiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedback: FeedbackServiceAsync.WithRawResponse by lazy {
            FeedbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val platform: PlatformServiceAsync.WithRawResponse by lazy {
            PlatformServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithApiClientAsync.WithRawResponse =
            LangsmithApiClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun api(): ApiServiceAsync.WithRawResponse = api

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun feedback(): FeedbackServiceAsync.WithRawResponse = feedback

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        override fun platform(): PlatformServiceAsync.WithRawResponse = platform
    }
}
