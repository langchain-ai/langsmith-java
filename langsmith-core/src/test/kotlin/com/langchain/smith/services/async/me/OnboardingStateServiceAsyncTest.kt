// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.me

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnboardingStateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val onboardingStateServiceAsync = client.me().onboardingState()

        val userOnboardingStateResponseFuture = onboardingStateServiceAsync.create()

        val userOnboardingStateResponse = userOnboardingStateResponseFuture.get()
        userOnboardingStateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val onboardingStateServiceAsync = client.me().onboardingState()

        val userOnboardingStateResponseFuture = onboardingStateServiceAsync.update("field")

        val userOnboardingStateResponse = userOnboardingStateResponseFuture.get()
        userOnboardingStateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val onboardingStateServiceAsync = client.me().onboardingState()

        val userOnboardingStateResponseFuture = onboardingStateServiceAsync.list()

        val userOnboardingStateResponse = userOnboardingStateResponseFuture.get()
        userOnboardingStateResponse.validate()
    }
}
