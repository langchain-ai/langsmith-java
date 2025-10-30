// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.tags.ResourceType
import com.langsmith_api.api.models.api.v1.workspaces.current.tags.TagResourcesParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tags.TagRetrieveResourceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagServiceAsyncTest {

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
        val tagServiceAsync = client.api().v1().workspaces().current().tags()

        val tagsFuture = tagServiceAsync.list()

        val tags = tagsFuture.get()
        tags.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resources() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagServiceAsync = client.api().v1().workspaces().current().tags()

        val responseFuture =
            tagServiceAsync.resources(
                TagResourcesParams.builder()
                    .addBody(
                        TagResourcesParams.Body.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceType(ResourceType.PROMPT)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveResource() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagServiceAsync = client.api().v1().workspaces().current().tags()

        val responseFuture =
            tagServiceAsync.retrieveResource(
                TagRetrieveResourceParams.builder()
                    .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resourceType(ResourceType.PROMPT)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
