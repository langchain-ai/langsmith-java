// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.TaggingListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tags.ResourceType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TaggingServiceAsyncTest {

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
        val taggingServiceAsync = client.api().v1().workspaces().current().taggings()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val taggingServiceAsync = client.api().v1().workspaces().current().taggings()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val taggingServiceAsync = client.api().v1().workspaces().current().taggings()

        val taggingFuture = taggingServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagging = taggingFuture.get()
        tagging.validate()
    }
}
