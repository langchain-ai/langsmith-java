// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.taggings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
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
