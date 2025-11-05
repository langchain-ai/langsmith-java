// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspaces.current.CurrentRetrieveStatsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CurrentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStats() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.workspaces().current()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.workspaces().current()

        val responseFuture = currentServiceAsync.retrieveUsageLimits()

        val response = responseFuture.get()
        response.validate()
    }
}
