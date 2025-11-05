// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current.members

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.members.pending.PendingListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val pendingService = client.orgs().current().members().pending()

        val orgPendingIdentities =
            pendingService.list(
                PendingListParams.builder().addEmail("string").limit(1L).offset(0L).build()
            )

        orgPendingIdentities.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val pendingService = client.orgs().current().members().pending()

        val response = pendingService.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
