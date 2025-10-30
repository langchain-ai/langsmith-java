// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretRetrieveEncryptedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val secretService = client.api().v1().workspaces().current().secrets()

        val secret =
            secretService.create(
                SecretCreateParams.builder()
                    .addBody(SecretCreateParams.Body.builder().key("key").value("value").build())
                    .build()
            )

        secret.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val secretService = client.api().v1().workspaces().current().secrets()

        val secrets = secretService.list()

        secrets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveEncrypted() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val secretService = client.api().v1().workspaces().current().secrets()

        val response =
            secretService.retrieveEncrypted(
                SecretRetrieveEncryptedParams.builder()
                    .service(SecretRetrieveEncryptedParams.Service.AGENT_BUILDER)
                    .build()
            )

        response.validate()
    }
}
