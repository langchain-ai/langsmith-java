// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitUpdateResponseTest {

    @Test
    fun create() {
        val commitUpdateResponse =
            CommitUpdateResponse.builder()
                .commit(
                    CommitWithLookups.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commitHash("commit_hash")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .manifest(
                            CommitWithLookups.Manifest.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numDownloads(0L)
                        .numViews(0L)
                        .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullName("full_name")
                        .parentCommitHash("parent_commit_hash")
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(commitUpdateResponse.commit())
            .isEqualTo(
                CommitWithLookups.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commitHash("commit_hash")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .manifest(
                        CommitWithLookups.Manifest.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .numDownloads(0L)
                    .numViews(0L)
                    .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fullName("full_name")
                    .parentCommitHash("parent_commit_hash")
                    .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitUpdateResponse =
            CommitUpdateResponse.builder()
                .commit(
                    CommitWithLookups.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commitHash("commit_hash")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .manifest(
                            CommitWithLookups.Manifest.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numDownloads(0L)
                        .numViews(0L)
                        .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullName("full_name")
                        .parentCommitHash("parent_commit_hash")
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCommitUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitUpdateResponse),
                jacksonTypeRef<CommitUpdateResponse>(),
            )

        assertThat(roundtrippedCommitUpdateResponse).isEqualTo(commitUpdateResponse)
    }
}
