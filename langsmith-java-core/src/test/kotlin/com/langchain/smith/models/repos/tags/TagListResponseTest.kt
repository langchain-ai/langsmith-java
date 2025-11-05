// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagListResponseTest {

    @Test
    fun create() {
        val tagListResponse =
            TagListResponse.builder()
                .addTag(TagListResponse.Tag.builder().count(0L).tag("tag").build())
                .build()

        assertThat(tagListResponse.tags())
            .containsExactly(TagListResponse.Tag.builder().count(0L).tag("tag").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagListResponse =
            TagListResponse.builder()
                .addTag(TagListResponse.Tag.builder().count(0L).tag("tag").build())
                .build()

        val roundtrippedTagListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagListResponse),
                jacksonTypeRef<TagListResponse>(),
            )

        assertThat(roundtrippedTagListResponse).isEqualTo(tagListResponse)
    }
}
