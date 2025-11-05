// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightDeleteResponseTest {

    @Test
    fun create() {
        val insightDeleteResponse =
            InsightDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .message("message")
                .build()

        assertThat(insightDeleteResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightDeleteResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightDeleteResponse =
            InsightDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .message("message")
                .build()

        val roundtrippedInsightDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightDeleteResponse),
                jacksonTypeRef<InsightDeleteResponse>(),
            )

        assertThat(roundtrippedInsightDeleteResponse).isEqualTo(insightDeleteResponse)
    }
}
