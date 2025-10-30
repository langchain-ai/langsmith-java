// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.taggings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaggingDeleteResponseTest {

    @Test
    fun create() {
        val taggingDeleteResponse = TaggingDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taggingDeleteResponse = TaggingDeleteResponse.builder().build()

        val roundtrippedTaggingDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taggingDeleteResponse),
                jacksonTypeRef<TaggingDeleteResponse>(),
            )

        assertThat(roundtrippedTaggingDeleteResponse).isEqualTo(taggingDeleteResponse)
    }
}
