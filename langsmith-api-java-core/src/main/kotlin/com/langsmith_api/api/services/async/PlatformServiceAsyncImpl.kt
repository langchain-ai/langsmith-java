// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.async.platform.AlertServiceAsync
import com.langsmith_api.api.services.async.platform.AlertServiceAsyncImpl
import com.langsmith_api.api.services.async.platform.DatasetServiceAsync
import com.langsmith_api.api.services.async.platform.DatasetServiceAsyncImpl
import com.langsmith_api.api.services.async.platform.OrgServiceAsync
import com.langsmith_api.api.services.async.platform.OrgServiceAsyncImpl
import java.util.function.Consumer

class PlatformServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlatformServiceAsync {

    private val withRawResponse: PlatformServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val alerts: AlertServiceAsync by lazy { AlertServiceAsyncImpl(clientOptions) }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val orgs: OrgServiceAsync by lazy { OrgServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PlatformServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlatformServiceAsync =
        PlatformServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun alerts(): AlertServiceAsync = alerts

    override fun datasets(): DatasetServiceAsync = datasets

    override fun orgs(): OrgServiceAsync = orgs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlatformServiceAsync.WithRawResponse {

        private val alerts: AlertServiceAsync.WithRawResponse by lazy {
            AlertServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgServiceAsync.WithRawResponse by lazy {
            OrgServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlatformServiceAsync.WithRawResponse =
            PlatformServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun alerts(): AlertServiceAsync.WithRawResponse = alerts

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun orgs(): OrgServiceAsync.WithRawResponse = orgs
    }
}
