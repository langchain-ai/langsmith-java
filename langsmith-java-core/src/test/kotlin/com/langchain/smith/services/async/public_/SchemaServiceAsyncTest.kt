// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SchemaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveMessageJson() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val schemaServiceAsync = client.public_().schemas()

        val responseFuture = schemaServiceAsync.retrieveMessageJson("version")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTooldefJson() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val schemaServiceAsync = client.public_().schemas()

        val responseFuture = schemaServiceAsync.retrieveTooldefJson("version")

        val response = responseFuture.get()
        response.validate()
    }
}
