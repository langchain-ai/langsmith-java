// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current.members

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.current.members.pending.PendingListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingServiceAsyncTest {

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
        val pendingServiceAsync = client.orgs().current().members().pending()

        val orgPendingIdentitiesFuture =
            pendingServiceAsync.list(
                PendingListParams.builder().addEmail("string").limit(1L).offset(0L).build()
            )

        val orgPendingIdentities = orgPendingIdentitiesFuture.get()
        orgPendingIdentities.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val pendingServiceAsync = client.orgs().current().members().pending()

        val responseFuture = pendingServiceAsync.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
