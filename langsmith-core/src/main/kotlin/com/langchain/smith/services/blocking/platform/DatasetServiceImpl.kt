// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.platform.datasets.ExampleService
import com.langchain.smith.services.blocking.platform.datasets.ExampleServiceImpl
import java.util.function.Consumer

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val withRawResponse: DatasetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptions) }

    override fun withRawResponse(): DatasetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService =
        DatasetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun examples(): ExampleService = examples

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetService.WithRawResponse {

        private val examples: ExampleService.WithRawResponse by lazy {
            ExampleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetService.WithRawResponse =
            DatasetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun examples(): ExampleService.WithRawResponse = examples
    }
}
