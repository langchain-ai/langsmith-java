// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.issues.IssueRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IssueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val issueService = client.issues()

        val issue =
            issueService.retrieve(
                IssueRetrieveParams.builder().id("id").includeLinearContext(true).build()
            )

        issue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val issueService = client.issues()

        val page = issueService.list()

        page.items().forEach { it.validate() }
    }
}
