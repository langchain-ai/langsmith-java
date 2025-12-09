// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
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

        assertThat(commitWithLookups.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups.commitHash()).contains("commit_hash")
        assertThat(commitWithLookups.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitWithLookups.exampleRunIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups.fullName()).contains("full_name")
        assertThat(commitWithLookups._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(commitWithLookups.manifestSha().getOrNull()).containsExactly(0L)
        assertThat(commitWithLookups.numDownloads()).contains(0L)
        assertThat(commitWithLookups.numViews()).contains(0L)
        assertThat(commitWithLookups.parentCommitHash()).contains("parent_commit_hash")
        assertThat(commitWithLookups.parentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups.repoId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitWithLookups.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val roundtrippedCommitWithLookups =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitWithLookups),
                jacksonTypeRef<CommitWithLookups>(),
            )

        assertThat(roundtrippedCommitWithLookups).isEqualTo(commitWithLookups)
    }
}
