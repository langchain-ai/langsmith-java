// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.views

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewDeleteResponseTest {

    @Test
    fun create() {
        val viewDeleteResponse = ViewDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val viewDeleteResponse = ViewDeleteResponse.builder().build()

        val roundtrippedViewDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(viewDeleteResponse),
                jacksonTypeRef<ViewDeleteResponse>(),
            )

        assertThat(roundtrippedViewDeleteResponse).isEqualTo(viewDeleteResponse)
    }
}
