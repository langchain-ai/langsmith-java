// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PublicServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFeedbacks() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val publicService = client.public_()

        val page = publicService.retrieveFeedbacks("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.items().forEach { it.validate() }
    }
}
