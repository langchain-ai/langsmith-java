// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.blocking.platform.AlertService
import com.langsmith_api.api.services.blocking.platform.AlertServiceImpl
import com.langsmith_api.api.services.blocking.platform.DatasetService
import com.langsmith_api.api.services.blocking.platform.DatasetServiceImpl
import com.langsmith_api.api.services.blocking.platform.OrgService
import com.langsmith_api.api.services.blocking.platform.OrgServiceImpl
import java.util.function.Consumer

class PlatformServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlatformService {

    private val withRawResponse: PlatformService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptions) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val orgs: OrgService by lazy { OrgServiceImpl(clientOptions) }

    override fun withRawResponse(): PlatformService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlatformService =
        PlatformServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun alerts(): AlertService = alerts

    override fun datasets(): DatasetService = datasets

    override fun orgs(): OrgService = orgs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlatformService.WithRawResponse {

        private val alerts: AlertService.WithRawResponse by lazy {
            AlertServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgService.WithRawResponse by lazy {
            OrgServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlatformService.WithRawResponse =
            PlatformServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun alerts(): AlertService.WithRawResponse = alerts

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun orgs(): OrgService.WithRawResponse = orgs
    }
}
