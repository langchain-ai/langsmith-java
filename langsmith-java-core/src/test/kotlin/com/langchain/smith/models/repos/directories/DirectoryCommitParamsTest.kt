// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryCommitParamsTest {

    @Test
    fun create() {
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
                                        "commit_id" to "0198f3ab-7c2d-7def-8a91-23456789abcd",
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
    }

    @Test
    fun pathParams() {
        val params = DirectoryCommitParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                                            "commit_id" to "0198f3ab-7c2d-7def-8a91-23456789abcd",
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

        val body = params._body()

        assertThat(body.files())
            .contains(
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
                                        "commit_id" to "0198f3ab-7c2d-7def-8a91-23456789abcd",
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
        assertThat(body.parentCommit()).contains("parent_commit")
        assertThat(body.skipWebhooks()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DirectoryCommitParams.builder().owner("owner").repo("repo").build()

        val body = params._body()
    }
}
