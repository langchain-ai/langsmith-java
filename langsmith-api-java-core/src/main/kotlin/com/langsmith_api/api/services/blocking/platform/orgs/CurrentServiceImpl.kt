// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform.orgs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.blocking.platform.orgs.current.AccessPolicyService
import com.langsmith_api.api.services.blocking.platform.orgs.current.AccessPolicyServiceImpl
import java.util.function.Consumer

class CurrentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentService {

    private val withRawResponse: CurrentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accessPolicies: AccessPolicyService by lazy {
        AccessPolicyServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CurrentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService =
        CurrentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accessPolicies(): AccessPolicyService = accessPolicies

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentService.WithRawResponse {

        private val accessPolicies: AccessPolicyService.WithRawResponse by lazy {
            AccessPolicyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentService.WithRawResponse =
            CurrentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accessPolicies(): AccessPolicyService.WithRawResponse = accessPolicies
    }
}
