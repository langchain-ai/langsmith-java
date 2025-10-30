// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagDeleteResponseTest {

    @Test
    fun create() {
        val tagDeleteResponse = TagDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagDeleteResponse = TagDeleteResponse.builder().build()

        val roundtrippedTagDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagDeleteResponse),
                jacksonTypeRef<TagDeleteResponse>(),
            )

        assertThat(roundtrippedTagDeleteResponse).isEqualTo(tagDeleteResponse)
    }
}
