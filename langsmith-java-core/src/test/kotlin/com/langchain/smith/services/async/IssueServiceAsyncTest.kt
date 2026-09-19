// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.issues.IssueRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IssueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val issueServiceAsync = client.issues()

        val issueFuture =
            issueServiceAsync.retrieve(
                IssueRetrieveParams.builder().id("id").includeLinearContext(true).build()
            )

        val issue = issueFuture.get()
        issue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val issueServiceAsync = client.issues()

        val pageFuture = issueServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
