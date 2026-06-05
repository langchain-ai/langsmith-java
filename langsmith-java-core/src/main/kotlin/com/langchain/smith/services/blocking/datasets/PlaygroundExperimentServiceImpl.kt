// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.core.ClientOptions
import java.util.function.Consumer

class PlaygroundExperimentServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PlaygroundExperimentService {

    private val withRawResponse: PlaygroundExperimentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaygroundExperimentService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PlaygroundExperimentService =
        PlaygroundExperimentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaygroundExperimentService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaygroundExperimentService.WithRawResponse =
            PlaygroundExperimentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
