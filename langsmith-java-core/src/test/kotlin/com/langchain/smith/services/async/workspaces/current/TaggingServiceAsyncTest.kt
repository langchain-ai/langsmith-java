// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspaces.current.taggings.TaggingCreateParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingListParams
import com.langchain.smith.models.workspaces.current.tags.ResourceType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TaggingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val taggingServiceAsync = client.workspaces().current().taggings()

        val taggingFuture =
            taggingServiceAsync.create(
                TaggingCreateParams.builder()
                    .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resourceType(ResourceType.PROMPT)
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val tagging = taggingFuture.get()
        tagging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val taggingServiceAsync = client.workspaces().current().taggings()

        val taggingsFuture =
            taggingServiceAsync.list(
                TaggingListParams.builder()
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val taggings = taggingsFuture.get()
        taggings.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val taggingServiceAsync = client.workspaces().current().taggings()

        val taggingFuture = taggingServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagging = taggingFuture.get()
        tagging.validate()
    }
}
