// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.workspaces.current.CurrentRetrieveStatsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CurrentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStats() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.workspaces().current()

        val response =
            currentService.retrieveStats(
                CurrentRetrieveStatsParams.builder()
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveUsageLimits() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.workspaces().current()

        val response = currentService.retrieveUsageLimits()

        response.validate()
    }
}
