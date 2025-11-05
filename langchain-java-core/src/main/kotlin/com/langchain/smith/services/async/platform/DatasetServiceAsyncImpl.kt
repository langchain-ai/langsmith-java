// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.platform.datasets.ExampleServiceAsync
import com.langchain.smith.services.async.platform.datasets.ExampleServiceAsyncImpl
import java.util.function.Consumer

class DatasetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetServiceAsync {

    private val withRawResponse: DatasetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val examples: ExampleServiceAsync by lazy { ExampleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DatasetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetServiceAsync =
        DatasetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun examples(): ExampleServiceAsync = examples

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetServiceAsync.WithRawResponse {

        private val examples: ExampleServiceAsync.WithRawResponse by lazy {
            ExampleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetServiceAsync.WithRawResponse =
            DatasetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun examples(): ExampleServiceAsync.WithRawResponse = examples
    }
}
