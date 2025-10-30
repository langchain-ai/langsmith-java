// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretRetrieveEncryptedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceAsyncTest {

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
        val secretServiceAsync = client.api().v1().workspaces().current().secrets()

        val secretFuture =
            secretServiceAsync.create(
                SecretCreateParams.builder()
                    .addBody(SecretCreateParams.Body.builder().key("key").value("value").build())
                    .build()
            )

        val secret = secretFuture.get()
        secret.validate()
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
        val secretServiceAsync = client.api().v1().workspaces().current().secrets()

        val secretsFuture = secretServiceAsync.list()

        val secrets = secretsFuture.get()
        secrets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveEncrypted() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val secretServiceAsync = client.api().v1().workspaces().current().secrets()

        val responseFuture =
            secretServiceAsync.retrieveEncrypted(
                SecretRetrieveEncryptedParams.builder()
                    .service(SecretRetrieveEncryptedParams.Service.AGENT_BUILDER)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
