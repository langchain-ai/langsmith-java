// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.platform.DatasetServiceAsync
import com.langchain.smith.services.async.platform.DatasetServiceAsyncImpl
import java.util.function.Consumer

class PlatformServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlatformServiceAsync {

    private val withRawResponse: PlatformServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PlatformServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlatformServiceAsync =
        PlatformServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasets(): DatasetServiceAsync = datasets

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlatformServiceAsync.WithRawResponse {

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlatformServiceAsync.WithRawResponse =
            PlatformServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets
    }
}
