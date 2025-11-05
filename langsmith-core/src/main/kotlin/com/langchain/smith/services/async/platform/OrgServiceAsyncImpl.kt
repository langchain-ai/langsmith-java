// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.platform.orgs.CurrentServiceAsync
import com.langchain.smith.services.async.platform.orgs.CurrentServiceAsyncImpl
import java.util.function.Consumer

class OrgServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrgServiceAsync {

    private val withRawResponse: OrgServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentServiceAsync by lazy { CurrentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrgServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync =
        OrgServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentServiceAsync = current

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgServiceAsync.WithRawResponse {

        private val current: CurrentServiceAsync.WithRawResponse by lazy {
            CurrentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgServiceAsync.WithRawResponse =
            OrgServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentServiceAsync.WithRawResponse = current
    }
}
