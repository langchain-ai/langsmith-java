// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitWithLookupsTest {

    @Test
    fun create() {
        val commitWithLookups =
            CommitWithLookups.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commitHash("commit_hash")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .numDownloads(0L)
                .numViews(0L)
                .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fullName("full_name")
                .parentCommitHash("parent_commit_hash")
                .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(commitWithLookups.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups.commitHash()).isEqualTo("commit_hash")
        assertThat(commitWithLookups.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitWithLookups.exampleRunIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(commitWithLookups.numDownloads()).isEqualTo(0L)
        assertThat(commitWithLookups.numViews()).isEqualTo(0L)
        assertThat(commitWithLookups.repoId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitWithLookups.fullName()).contains("full_name")
        assertThat(commitWithLookups.parentCommitHash()).contains("parent_commit_hash")
        assertThat(commitWithLookups.parentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitWithLookups =
            CommitWithLookups.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commitHash("commit_hash")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .numDownloads(0L)
                .numViews(0L)
                .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fullName("full_name")
                .parentCommitHash("parent_commit_hash")
                .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCommitWithLookups =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitWithLookups),
                jacksonTypeRef<CommitWithLookups>(),
            )

        assertThat(roundtrippedCommitWithLookups).isEqualTo(commitWithLookups)
    }
}
