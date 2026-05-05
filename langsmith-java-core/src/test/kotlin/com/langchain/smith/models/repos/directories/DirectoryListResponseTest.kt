// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryListResponseTest {

    @Test
    fun create() {
        val directoryListResponse =
            DirectoryListResponse.builder()
                .commitHash("commit_hash")
                .commitId("commit_id")
                .files(
                    DirectoryListResponse.Files.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(directoryListResponse.commitHash()).contains("commit_hash")
        assertThat(directoryListResponse.commitId()).contains("commit_id")
        assertThat(directoryListResponse.files())
            .contains(
                DirectoryListResponse.Files.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryListResponse =
            DirectoryListResponse.builder()
                .commitHash("commit_hash")
                .commitId("commit_id")
                .files(
                    DirectoryListResponse.Files.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedDirectoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryListResponse),
                jacksonTypeRef<DirectoryListResponse>(),
            )

        assertThat(roundtrippedDirectoryListResponse).isEqualTo(directoryListResponse)
    }
}
