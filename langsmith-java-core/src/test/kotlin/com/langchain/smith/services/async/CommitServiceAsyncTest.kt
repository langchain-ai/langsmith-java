// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.commits.CommitCreateParams
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commitServiceAsync = client.commits()

        val commitFuture =
            commitServiceAsync.create(
                CommitCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .parentCommit("parent_commit")
                    .skipWebhooks(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val commit = commitFuture.get()
        commit.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commitServiceAsync = client.commits()

        val commitFuture =
            commitServiceAsync.retrieve(
                CommitRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .commit("commit")
                    .getExamples(true)
                    .includeModel(true)
                    .isView(true)
                    .build()
            )

        val commit = commitFuture.get()
        commit.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commitServiceAsync = client.commits()

        val pageFuture =
            commitServiceAsync.list(CommitListParams.builder().owner("owner").repo("repo").build())

        val page = pageFuture.get()
        page.response().validate()
    }
}
