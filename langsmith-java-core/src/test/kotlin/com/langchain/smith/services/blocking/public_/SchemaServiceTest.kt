// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SchemaServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveMessageJson() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val schemaService = client.public_().schemas()

        val response = schemaService.retrieveMessageJson("version")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTooldefJson() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val schemaService = client.public_().schemas()

        val response = schemaService.retrieveTooldefJson("version")

        response.validate()
    }
}
