// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.repos.directories.DirectoryCommitParams
import com.langchain.smith.models.repos.directories.DirectoryDeleteParams
import com.langchain.smith.models.repos.directories.DirectoryListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DirectoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val directoryService = client.repos().directories()

        val directories =
            directoryService.list(
                DirectoryListParams.builder().owner("owner").repo("repo").commit("commit").build()
            )

        directories.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val directoryService = client.repos().directories()

        directoryService.delete(
            DirectoryDeleteParams.builder()
                .owner("owner")
                .repo("repo")
                .repoType(DirectoryDeleteParams.RepoType.AGENT)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun commit() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val directoryService = client.repos().directories()

        val response =
            directoryService.commit(
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

        response.validate()
    }
}
