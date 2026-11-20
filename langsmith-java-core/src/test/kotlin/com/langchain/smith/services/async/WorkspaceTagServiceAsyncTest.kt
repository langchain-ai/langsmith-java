// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspacetags.WorkspaceTagListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspaceTagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceTagServiceAsync = client.workspaceTags()

        val tagKeyWithValuesFuture =
            workspaceTagServiceAsync.list(
                WorkspaceTagListParams.builder()
                    .resourceType(WorkspaceTagListParams.ResourceType.AGENT)
                    .build()
            )

        val tagKeyWithValues = tagKeyWithValuesFuture.get()
        tagKeyWithValues.forEach { it.validate() }
    }
}
