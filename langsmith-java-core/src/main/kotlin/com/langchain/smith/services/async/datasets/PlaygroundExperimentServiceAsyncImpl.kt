// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import java.util.function.Consumer

class PlaygroundExperimentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PlaygroundExperimentServiceAsync {

    private val withRawResponse: PlaygroundExperimentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaygroundExperimentServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PlaygroundExperimentServiceAsync =
        PlaygroundExperimentServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaygroundExperimentServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaygroundExperimentServiceAsync.WithRawResponse =
            PlaygroundExperimentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
