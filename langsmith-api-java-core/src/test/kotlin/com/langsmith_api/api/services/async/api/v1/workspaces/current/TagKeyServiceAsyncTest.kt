// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyTagKeysParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagKeyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyServiceAsync = client.api().v1().workspaces().current().tagKeys()

        val tagKeyFuture = tagKeyServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyServiceAsync = client.api().v1().workspaces().current().tagKeys()

        val tagKeyFuture =
            tagKeyServiceAsync.update(
                TagKeyUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .key("x")
                    .build()
            )

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }

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
        val tagKeyServiceAsync = client.api().v1().workspaces().current().tagKeys()

        val tagKeyFuture = tagKeyServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTagKeys() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyServiceAsync = client.api().v1().workspaces().current().tagKeys()

        val tagKeysFuture = tagKeyServiceAsync.retrieveTagKeys()

        val tagKeys = tagKeysFuture.get()
        tagKeys.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun tagKeys() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagKeyServiceAsync = client.api().v1().workspaces().current().tagKeys()

        val tagKeyFuture =
            tagKeyServiceAsync.tagKeys(
                TagKeyTagKeysParams.builder().key("x").description("description").build()
            )

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }
}
