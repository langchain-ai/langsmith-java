// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceTest {

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
        val apiKeyService = client.apiKey()

        val apiKeyGetResponse = apiKeyService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        apiKeyGetResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun apiKey() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val apiKeyService = client.apiKey()

        val apiKeyCreateResponse =
            apiKeyService.apiKey(
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

        apiKeyCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveApiKey() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val apiKeyService = client.apiKey()

        val apiKeyGetResponses = apiKeyService.retrieveApiKey()

        apiKeyGetResponses.forEach { it.validate() }
    }
}
