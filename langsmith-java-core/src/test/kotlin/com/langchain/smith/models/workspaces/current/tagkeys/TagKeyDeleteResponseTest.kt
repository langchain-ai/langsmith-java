// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.tagkeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagKeyDeleteResponseTest {

    @Test
    fun create() {
        val tagKeyDeleteResponse = TagKeyDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagKeyDeleteResponse = TagKeyDeleteResponse.builder().build()

        val roundtrippedTagKeyDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagKeyDeleteResponse),
                jacksonTypeRef<TagKeyDeleteResponse>(),
            )

        assertThat(roundtrippedTagKeyDeleteResponse).isEqualTo(tagKeyDeleteResponse)
    }
}
