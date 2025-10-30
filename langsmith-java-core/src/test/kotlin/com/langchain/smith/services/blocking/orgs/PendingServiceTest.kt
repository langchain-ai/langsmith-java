// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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
        val pendingService = client.orgs().pending()

        val organizationPgSchemaSlims = pendingService.list()

        organizationPgSchemaSlims.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val pendingService = client.orgs().pending()

        val pending = pendingService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        pending.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun claim() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val pendingService = client.orgs().pending()

        val identity = pendingService.claim("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        identity.validate()
    }
}
