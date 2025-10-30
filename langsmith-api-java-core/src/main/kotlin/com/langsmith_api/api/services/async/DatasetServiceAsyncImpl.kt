// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.async.datasets.ExperimentViewOverrideServiceAsync
import com.langsmith_api.api.services.async.datasets.ExperimentViewOverrideServiceAsyncImpl
import java.util.function.Consumer

class DatasetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetServiceAsync {

    private val withRawResponse: DatasetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val experimentViewOverrides: ExperimentViewOverrideServiceAsync by lazy {
        ExperimentViewOverrideServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetServiceAsync =
        DatasetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun experimentViewOverrides(): ExperimentViewOverrideServiceAsync =
        experimentViewOverrides

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetServiceAsync.WithRawResponse {

        private val experimentViewOverrides:
            ExperimentViewOverrideServiceAsync.WithRawResponse by lazy {
            ExperimentViewOverrideServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetServiceAsync.WithRawResponse =
            DatasetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun experimentViewOverrides(): ExperimentViewOverrideServiceAsync.WithRawResponse =
            experimentViewOverrides
    }
}
