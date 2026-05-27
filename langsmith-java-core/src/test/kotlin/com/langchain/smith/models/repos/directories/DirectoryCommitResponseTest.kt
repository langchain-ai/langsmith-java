// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryCommitResponseTest {

    @Test
    fun create() {
        val directoryCommitResponse =
            DirectoryCommitResponse.builder()
                .commit(
                    DirectoryCommitResponse.Commit.builder()
                        .id("id")
                        .commitHash("commit_hash")
                        .createdAt("created_at")
                        .build()
                )
                .build()

        assertThat(directoryCommitResponse.commit())
            .contains(
                DirectoryCommitResponse.Commit.builder()
                    .id("id")
                    .commitHash("commit_hash")
                    .createdAt("created_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryCommitResponse =
            DirectoryCommitResponse.builder()
                .commit(
                    DirectoryCommitResponse.Commit.builder()
                        .id("id")
                        .commitHash("commit_hash")
                        .createdAt("created_at")
                        .build()
                )
                .build()

        val roundtrippedDirectoryCommitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryCommitResponse),
                jacksonTypeRef<DirectoryCommitResponse>(),
            )

        assertThat(roundtrippedDirectoryCommitResponse).isEqualTo(directoryCommitResponse)
    }
}
