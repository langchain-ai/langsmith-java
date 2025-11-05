// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.taggings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.workspaces.current.tags.ResourceType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaggingTest {

    @Test
    fun create() {
        val tagging =
            Tagging.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceType(ResourceType.PROMPT)
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(tagging.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tagging.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagging.resourceId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tagging.resourceType()).isEqualTo(ResourceType.PROMPT)
        assertThat(tagging.tagValueId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagging =
            Tagging.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceType(ResourceType.PROMPT)
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTagging =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tagging), jacksonTypeRef<Tagging>())

        assertThat(roundtrippedTagging).isEqualTo(tagging)
    }
}
