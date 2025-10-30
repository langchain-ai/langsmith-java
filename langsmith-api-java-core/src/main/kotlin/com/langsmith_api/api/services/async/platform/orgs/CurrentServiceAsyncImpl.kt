// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform.orgs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.services.async.platform.orgs.current.AccessPolicyServiceAsync
import com.langsmith_api.api.services.async.platform.orgs.current.AccessPolicyServiceAsyncImpl
import java.util.function.Consumer

class CurrentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentServiceAsync {

    private val withRawResponse: CurrentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accessPolicies: AccessPolicyServiceAsync by lazy {
        AccessPolicyServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CurrentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync =
        CurrentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accessPolicies(): AccessPolicyServiceAsync = accessPolicies

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentServiceAsync.WithRawResponse {

        private val accessPolicies: AccessPolicyServiceAsync.WithRawResponse by lazy {
            AccessPolicyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentServiceAsync.WithRawResponse =
            CurrentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accessPolicies(): AccessPolicyServiceAsync.WithRawResponse = accessPolicies
    }
}
