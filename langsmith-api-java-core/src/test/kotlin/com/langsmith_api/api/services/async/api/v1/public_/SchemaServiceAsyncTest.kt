// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SchemaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveMessageJson() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val schemaServiceAsync = client.api().v1().public_().schemas()

        val responseFuture = schemaServiceAsync.retrieveMessageJson("version")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTooldefJson() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val schemaServiceAsync = client.api().v1().public_().schemas()

        val responseFuture = schemaServiceAsync.retrieveTooldefJson("version")

        val response = responseFuture.get()
        response.validate()
    }
}
