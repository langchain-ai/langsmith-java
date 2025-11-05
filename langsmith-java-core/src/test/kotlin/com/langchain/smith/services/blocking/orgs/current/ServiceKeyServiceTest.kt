// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ServiceKeyServiceTest {

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
        val serviceKeyService = client.orgs().current().serviceKeys()

        val apiKeyGetResponse = serviceKeyService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        apiKeyGetResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveServiceKeys() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val serviceKeyService = client.orgs().current().serviceKeys()

        val apiKeyGetResponses = serviceKeyService.retrieveServiceKeys()

        apiKeyGetResponses.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun serviceKeys() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val serviceKeyService = client.orgs().current().serviceKeys()

        val apiKeyCreateResponse =
            serviceKeyService.serviceKeys(
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
}
