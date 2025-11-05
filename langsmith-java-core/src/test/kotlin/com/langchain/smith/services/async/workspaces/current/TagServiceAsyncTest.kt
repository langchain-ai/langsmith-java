// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspaces.current.tags.ResourceType
import com.langchain.smith.models.workspaces.current.tags.TagResourcesParams
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagServiceAsyncTest {

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
        val tagServiceAsync = client.workspaces().current().tags()

        val tagsFuture = tagServiceAsync.list()

        val tags = tagsFuture.get()
        tags.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resources() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagServiceAsync = client.workspaces().current().tags()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagServiceAsync = client.workspaces().current().tags()

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
