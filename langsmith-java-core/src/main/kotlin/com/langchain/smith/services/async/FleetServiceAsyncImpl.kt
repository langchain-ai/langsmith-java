// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.fleet.ThreadServiceAsync
import com.langchain.smith.services.async.fleet.ThreadServiceAsyncImpl
import java.util.function.Consumer

class FleetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FleetServiceAsync {

    private val withRawResponse: FleetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val threads: ThreadServiceAsync by lazy { ThreadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FleetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetServiceAsync =
        FleetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun threads(): ThreadServiceAsync = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FleetServiceAsync.WithRawResponse {

        private val threads: ThreadServiceAsync.WithRawResponse by lazy {
            ThreadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FleetServiceAsync.WithRawResponse =
            FleetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun threads(): ThreadServiceAsync.WithRawResponse = threads
    }
}
