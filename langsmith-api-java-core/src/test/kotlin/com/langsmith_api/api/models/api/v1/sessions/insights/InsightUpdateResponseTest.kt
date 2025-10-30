// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightUpdateResponseTest {

    @Test
    fun create() {
        val insightUpdateResponse =
            InsightUpdateResponse.builder().name("name").status("status").build()

        assertThat(insightUpdateResponse.name()).isEqualTo("name")
        assertThat(insightUpdateResponse.status()).isEqualTo("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightUpdateResponse =
            InsightUpdateResponse.builder().name("name").status("status").build()

        val roundtrippedInsightUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightUpdateResponse),
                jacksonTypeRef<InsightUpdateResponse>(),
            )

        assertThat(roundtrippedInsightUpdateResponse).isEqualTo(insightUpdateResponse)
    }
}
