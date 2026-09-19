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
                DirectoryDeleteParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .repoType(DirectoryDeleteParams.RepoType.AGENT)
                    .build()
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
                            .putAdditionalProperty(
                                "agents/pinned",
                                JsonValue.from(
                                    mapOf(
                                        "repo_handle" to "review-agent",
                                        "type" to "agent",
                                        "commit_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                        "selector" to
                                            mapOf(
                                                "commit_id" to
                                                    "0198f3ab-7c2d-7def-8a91-23456789abcd",
                                                "type" to "COMMIT",
                                            ),
                                    )
                                ),
                            )
                            .putAdditionalProperty(
                                "skills/current",
                                JsonValue.from(
                                    mapOf(
                                        "repo_handle" to "shared-skill",
                                        "type" to "skill",
                                        "commit_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                        "selector" to mapOf("type" to "LATEST"),
                                    )
                                ),
                            )
                            .build()
                    )
                    .parentCommit("parent_commit")
                    .skipWebhooks(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
