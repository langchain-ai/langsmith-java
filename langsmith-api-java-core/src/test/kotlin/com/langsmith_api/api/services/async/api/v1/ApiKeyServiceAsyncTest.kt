// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.orgs.current.servicekeys.ApiKeyCreateRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val apiKeyServiceAsync = client.api().v1().apiKey()

        val apiKeyGetResponseFuture =
            apiKeyServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val apiKeyGetResponse = apiKeyGetResponseFuture.get()
        apiKeyGetResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun apiKey() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val apiKeyServiceAsync = client.api().v1().apiKey()

        val apiKeyCreateResponseFuture =
            apiKeyServiceAsync.apiKey(
                ApiKeyCreateRequest.builder()
                    .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val apiKeyCreateResponse = apiKeyCreateResponseFuture.get()
        apiKeyCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveApiKey() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val apiKeyServiceAsync = client.api().v1().apiKey()

        val apiKeyGetResponsesFuture = apiKeyServiceAsync.retrieveApiKey()

        val apiKeyGetResponses = apiKeyGetResponsesFuture.get()
        apiKeyGetResponses.forEach { it.validate() }
    }
}
