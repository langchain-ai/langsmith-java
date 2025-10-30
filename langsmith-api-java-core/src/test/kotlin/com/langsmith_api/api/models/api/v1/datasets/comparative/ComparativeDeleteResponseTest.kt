// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.comparative

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeDeleteResponseTest {

    @Test
    fun create() {
        val comparativeDeleteResponse = ComparativeDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeDeleteResponse = ComparativeDeleteResponse.builder().build()

        val roundtrippedComparativeDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeDeleteResponse),
                jacksonTypeRef<ComparativeDeleteResponse>(),
            )

        assertThat(roundtrippedComparativeDeleteResponse).isEqualTo(comparativeDeleteResponse)
    }
}
