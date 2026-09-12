// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.fleet.ThreadService
import com.langchain.smith.services.blocking.fleet.ThreadServiceImpl
import java.util.function.Consumer

class FleetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FleetService {

    private val withRawResponse: FleetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptions) }

    override fun withRawResponse(): FleetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetService =
        FleetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun threads(): ThreadService = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FleetService.WithRawResponse {

        private val threads: ThreadService.WithRawResponse by lazy {
            ThreadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FleetService.WithRawResponse =
            FleetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun threads(): ThreadService.WithRawResponse = threads
    }
}
