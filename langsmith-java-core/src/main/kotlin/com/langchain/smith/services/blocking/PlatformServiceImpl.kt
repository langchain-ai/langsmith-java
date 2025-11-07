// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.platform.DatasetService
import com.langchain.smith.services.blocking.platform.DatasetServiceImpl
import java.util.function.Consumer

class PlatformServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlatformService {

    private val withRawResponse: PlatformService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    override fun withRawResponse(): PlatformService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlatformService =
        PlatformServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasets(): DatasetService = datasets

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlatformService.WithRawResponse {

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlatformService.WithRawResponse =
            PlatformServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasets(): DatasetService.WithRawResponse = datasets
    }
}
