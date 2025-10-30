// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.blocking.datasets.ExperimentViewOverrideService
import com.langsmith_api.api.services.blocking.datasets.ExperimentViewOverrideServiceImpl
import java.util.function.Consumer

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val withRawResponse: DatasetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val experimentViewOverrides: ExperimentViewOverrideService by lazy {
        ExperimentViewOverrideServiceImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService =
        DatasetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun experimentViewOverrides(): ExperimentViewOverrideService = experimentViewOverrides

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetService.WithRawResponse {

        private val experimentViewOverrides: ExperimentViewOverrideService.WithRawResponse by lazy {
            ExperimentViewOverrideServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetService.WithRawResponse =
            DatasetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun experimentViewOverrides(): ExperimentViewOverrideService.WithRawResponse =
            experimentViewOverrides
    }
}
