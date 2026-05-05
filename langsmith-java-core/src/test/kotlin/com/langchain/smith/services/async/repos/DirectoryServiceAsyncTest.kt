// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.repos.directories.DirectoryCommitParams
import com.langchain.smith.models.repos.directories.DirectoryDeleteParams
import com.langchain.smith.models.repos.directories.DirectoryListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DirectoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val directoryServiceAsync = client.repos().directories()

        val directoriesFuture =
            directoryServiceAsync.list(
                DirectoryListParams.builder().owner("owner").repo("repo").commit("commit").build()
            )

        val directories = directoriesFuture.get()
        directories.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val directoryServiceAsync = client.repos().directories()

        val future =
            directoryServiceAsync.delete(
                DirectoryDeleteParams.builder().owner("owner").repo("repo").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun commit() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val directoryServiceAsync = client.repos().directories()

        val responseFuture =
            directoryServiceAsync.commit(
                DirectoryCommitParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .files(
                        DirectoryCommitParams.Files.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .parentCommit("parent_commit")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
