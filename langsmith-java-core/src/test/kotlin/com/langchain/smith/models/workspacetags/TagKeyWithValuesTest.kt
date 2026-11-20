// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacetags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.workspacetags.keys.values.TagValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagKeyWithValuesTest {

    @Test
    fun create() {
        val tagKeyWithValues =
            TagKeyWithValues.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .description("description")
                .build()

        assertThat(tagKeyWithValues.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tagKeyWithValues.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagKeyWithValues.key()).isEqualTo("x")
        assertThat(tagKeyWithValues.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagKeyWithValues.values())
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
        assertThat(tagKeyWithValues.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagKeyWithValues =
            TagKeyWithValues.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .description("description")
                .build()

        val roundtrippedTagKeyWithValues =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagKeyWithValues),
                jacksonTypeRef<TagKeyWithValues>(),
            )

        assertThat(roundtrippedTagKeyWithValues).isEqualTo(tagKeyWithValues)
    }
}
