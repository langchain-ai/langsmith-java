// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileEntryTest {

    @Test
    fun create() {
        val fileEntry = FileEntry.builder().content("content").type(FileEntry.Type.FILE).build()

        assertThat(fileEntry.content()).isEqualTo("content")
        assertThat(fileEntry.type()).isEqualTo(FileEntry.Type.FILE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileEntry = FileEntry.builder().content("content").type(FileEntry.Type.FILE).build()

        val roundtrippedFileEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileEntry),
                jacksonTypeRef<FileEntry>(),
            )

        assertThat(roundtrippedFileEntry).isEqualTo(fileEntry)
    }
}
