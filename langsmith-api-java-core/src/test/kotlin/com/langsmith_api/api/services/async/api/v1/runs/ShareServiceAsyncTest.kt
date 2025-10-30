// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.runs

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShareServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val shareServiceAsync = client.api().v1().runs().share()

        val runShareSchemaFuture = shareServiceAsync.create("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val runShareSchema = runShareSchemaFuture.get()
        runShareSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val shareServiceAsync = client.api().v1().runs().share()

        val runShareSchemaFuture = shareServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val runShareSchema = runShareSchemaFuture.get()
        val unwrappedRunShareSchema = runShareSchema.getOrNull()
        unwrappedRunShareSchema?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val shareServiceAsync = client.api().v1().runs().share()

        val responseFuture = shareServiceAsync.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
