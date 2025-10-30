// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveStatsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CurrentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStats() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.api().v1().workspaces().current()

        val responseFuture =
            currentServiceAsync.retrieveStats(
                CurrentRetrieveStatsParams.builder()
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveUsageLimits() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.api().v1().workspaces().current()

        val responseFuture = currentServiceAsync.retrieveUsageLimits()

        val response = responseFuture.get()
        response.validate()
    }
}
