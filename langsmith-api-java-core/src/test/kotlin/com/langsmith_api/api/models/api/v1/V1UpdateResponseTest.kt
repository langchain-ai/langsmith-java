// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1UpdateResponseTest {

    @Test
    fun create() {
        val v1UpdateResponse = V1UpdateResponse.builder().likes(0L).build()

        assertThat(v1UpdateResponse.likes()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1UpdateResponse = V1UpdateResponse.builder().likes(0L).build()

        val roundtrippedV1UpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1UpdateResponse),
                jacksonTypeRef<V1UpdateResponse>(),
            )

        assertThat(roundtrippedV1UpdateResponse).isEqualTo(v1UpdateResponse)
    }
}
