// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.workspacetags.WorkspaceTagListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspaceTagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val workspaceTagService = client.workspaceTags()

        val tagKeyWithValues =
            workspaceTagService.list(
                WorkspaceTagListParams.builder()
                    .resourceType(WorkspaceTagListParams.ResourceType.AGENT)
                    .build()
            )

        tagKeyWithValues.forEach { it.validate() }
    }
}
