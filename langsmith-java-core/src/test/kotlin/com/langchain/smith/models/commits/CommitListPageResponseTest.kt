// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitListPageResponseTest {

    @Test
    fun create() {
        val commitListPageResponse =
            CommitListPageResponse.builder()
                .addCommit(
                    CommitWithLookups.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commitHash("commit_hash")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fullName("full_name")
                        .manifest(JsonValue.from(mapOf<String, Any>()))
                        .addManifestSha(0L)
                        .numDownloads(0L)
                        .numViews(0L)
                        .parentCommitHash("parent_commit_hash")
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0L)
                .build()

        assertThat(commitListPageResponse.commits().getOrNull())
            .containsExactly(
                CommitWithLookups.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commitHash("commit_hash")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fullName("full_name")
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .addManifestSha(0L)
                    .numDownloads(0L)
                    .numViews(0L)
                    .parentCommitHash("parent_commit_hash")
                    .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(commitListPageResponse.total()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitListPageResponse =
            CommitListPageResponse.builder()
                .addCommit(
                    CommitWithLookups.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commitHash("commit_hash")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fullName("full_name")
                        .manifest(JsonValue.from(mapOf<String, Any>()))
                        .addManifestSha(0L)
                        .numDownloads(0L)
                        .numViews(0L)
                        .parentCommitHash("parent_commit_hash")
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0L)
                .build()

        val roundtrippedCommitListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitListPageResponse),
                jacksonTypeRef<CommitListPageResponse>(),
            )

        assertThat(roundtrippedCommitListPageResponse).isEqualTo(commitListPageResponse)
    }
}
