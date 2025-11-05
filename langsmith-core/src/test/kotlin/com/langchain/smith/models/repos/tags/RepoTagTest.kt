// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoTagTest {

    @Test
    fun create() {
        val repoTag =
            RepoTag.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commitHash("commit_hash")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagName("tag_name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(repoTag.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(repoTag.commitHash()).isEqualTo("commit_hash")
        assertThat(repoTag.commitId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(repoTag.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(repoTag.repoId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(repoTag.tagName()).isEqualTo("tag_name")
        assertThat(repoTag.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val repoTag =
            RepoTag.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commitHash("commit_hash")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .repoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagName("tag_name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRepoTag =
            jsonMapper.readValue(jsonMapper.writeValueAsString(repoTag), jacksonTypeRef<RepoTag>())

        assertThat(roundtrippedRepoTag).isEqualTo(repoTag)
    }
}
