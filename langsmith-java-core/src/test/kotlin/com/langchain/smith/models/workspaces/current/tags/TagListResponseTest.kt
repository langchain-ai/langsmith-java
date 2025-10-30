// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagListResponseTest {

    @Test
    fun create() {
        val tagListResponse =
            TagListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addValue(
                    TagValue.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("x")
                        .description("description")
                        .build()
                )
                .build()

        assertThat(tagListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tagListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagListResponse.key()).isEqualTo("x")
        assertThat(tagListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagListResponse.description()).contains("description")
        assertThat(tagListResponse.values().getOrNull())
            .containsExactly(
                TagValue.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value("x")
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagListResponse =
            TagListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addValue(
                    TagValue.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("x")
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedTagListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagListResponse),
                jacksonTypeRef<TagListResponse>(),
            )

        assertThat(roundtrippedTagListResponse).isEqualTo(tagListResponse)
    }
}
