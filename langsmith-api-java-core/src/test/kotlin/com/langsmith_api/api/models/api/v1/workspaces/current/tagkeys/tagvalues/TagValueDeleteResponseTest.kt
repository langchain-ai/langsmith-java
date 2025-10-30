// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagValueDeleteResponseTest {

    @Test
    fun create() {
        val tagValueDeleteResponse = TagValueDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagValueDeleteResponse = TagValueDeleteResponse.builder().build()

        val roundtrippedTagValueDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagValueDeleteResponse),
                jacksonTypeRef<TagValueDeleteResponse>(),
            )

        assertThat(roundtrippedTagValueDeleteResponse).isEqualTo(tagValueDeleteResponse)
    }
}
