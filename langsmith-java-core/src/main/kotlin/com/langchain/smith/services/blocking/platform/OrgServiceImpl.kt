// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.platform.orgs.CurrentService
import com.langchain.smith.services.blocking.platform.orgs.CurrentServiceImpl
import java.util.function.Consumer

class OrgServiceImpl internal constructor(private val clientOptions: ClientOptions) : OrgService {

    private val withRawResponse: OrgService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    override fun withRawResponse(): OrgService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService =
        OrgServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentService = current

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgService.WithRawResponse {

        private val current: CurrentService.WithRawResponse by lazy {
            CurrentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgService.WithRawResponse =
            OrgServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentService.WithRawResponse = current
    }
}
