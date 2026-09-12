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
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .files(
                    DirectoryListResponse.Files.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("content" to "content", "type" to "file")),
                        )
                        .build()
                )
                .build()

        assertThat(directoryListResponse.commitHash()).isEqualTo("commit_hash")
        assertThat(directoryListResponse.commitId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(directoryListResponse.files())
            .isEqualTo(
                DirectoryListResponse.Files.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("content" to "content", "type" to "file")),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryListResponse =
            DirectoryListResponse.builder()
                .commitHash("commit_hash")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .files(
                    DirectoryListResponse.Files.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("content" to "content", "type" to "file")),
                        )
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
