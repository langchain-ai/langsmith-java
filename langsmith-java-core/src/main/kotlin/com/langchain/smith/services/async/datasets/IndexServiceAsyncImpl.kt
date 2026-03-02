// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import java.util.function.Consumer

class IndexServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IndexServiceAsync {

    private val withRawResponse: IndexServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndexServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexServiceAsync =
        IndexServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndexServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndexServiceAsync.WithRawResponse =
            IndexServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
