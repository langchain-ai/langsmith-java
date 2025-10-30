// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.client

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.getPackageVersion
import com.langsmith_api.api.services.blocking.ApiService
import com.langsmith_api.api.services.blocking.ApiServiceImpl
import com.langsmith_api.api.services.blocking.DatasetService
import com.langsmith_api.api.services.blocking.DatasetServiceImpl
import com.langsmith_api.api.services.blocking.FeedbackService
import com.langsmith_api.api.services.blocking.FeedbackServiceImpl
import com.langsmith_api.api.services.blocking.PlatformService
import com.langsmith_api.api.services.blocking.PlatformServiceImpl
import com.langsmith_api.api.services.blocking.RunService
import com.langsmith_api.api.services.blocking.RunServiceImpl
import java.util.function.Consumer

class LangsmithApiClientImpl(private val clientOptions: ClientOptions) : LangsmithApiClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LangsmithApiClientAsync by lazy {
        LangsmithApiClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: LangsmithApiClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val api: ApiService by lazy { ApiServiceImpl(clientOptionsWithUserAgent) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptionsWithUserAgent) }

    private val feedback: FeedbackService by lazy {
        FeedbackServiceImpl(clientOptionsWithUserAgent)
    }

    private val runs: RunService by lazy { RunServiceImpl(clientOptionsWithUserAgent) }

    private val platform: PlatformService by lazy {
        PlatformServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LangsmithApiClientAsync = async

    override fun withRawResponse(): LangsmithApiClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangsmithApiClient =
        LangsmithApiClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun api(): ApiService = api

    override fun datasets(): DatasetService = datasets

    override fun feedback(): FeedbackService = feedback

    override fun runs(): RunService = runs

    override fun platform(): PlatformService = platform

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangsmithApiClient.WithRawResponse {

        private val api: ApiService.WithRawResponse by lazy {
            ApiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedback: FeedbackService.WithRawResponse by lazy {
            FeedbackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val platform: PlatformService.WithRawResponse by lazy {
            PlatformServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangsmithApiClient.WithRawResponse =
            LangsmithApiClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun api(): ApiService.WithRawResponse = api

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun feedback(): FeedbackService.WithRawResponse = feedback

        override fun runs(): RunService.WithRawResponse = runs

        override fun platform(): PlatformService.WithRawResponse = platform
    }
}
