// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.workspaces.current.shared.SharedDeleteAllParams
import com.langchain.smith.models.workspaces.current.shared.SharedListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SharedServiceTest {

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
        val sharedService = client.workspaces().current().shared()

        val shareds = sharedService.list(SharedListParams.builder().limit(1L).offset(0L).build())

        shareds.validate()
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
        val sharedService = client.workspaces().current().shared()

        val response =
            sharedService.deleteAll(
                SharedDeleteAllParams.builder()
                    .addShareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
