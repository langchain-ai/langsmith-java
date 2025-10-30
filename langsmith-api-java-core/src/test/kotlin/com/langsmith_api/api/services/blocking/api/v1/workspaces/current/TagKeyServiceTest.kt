// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyTagKeysParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagKeyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyService = client.api().v1().workspaces().current().tagKeys()

        val tagKey = tagKeyService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tagKey.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyService = client.api().v1().workspaces().current().tagKeys()

        val tagKey =
            tagKeyService.update(
                TagKeyUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .key("x")
                    .build()
            )

        tagKey.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyService = client.api().v1().workspaces().current().tagKeys()

        val tagKey = tagKeyService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tagKey.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTagKeys() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyService = client.api().v1().workspaces().current().tagKeys()

        val tagKeys = tagKeyService.retrieveTagKeys()

        tagKeys.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun tagKeys() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyService = client.api().v1().workspaces().current().tagKeys()

        val tagKey =
            tagKeyService.tagKeys(
                TagKeyTagKeysParams.builder().key("x").description("description").build()
            )

        tagKey.validate()
    }
}
