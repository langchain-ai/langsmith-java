// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightRetrieveResponseTest {

    @Test
    fun create() {
        val insightRetrieveResponse =
            InsightRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .level(0L)
                .name("name")
                .numChildren(0L)
                .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(insightRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightRetrieveResponse.description()).isEqualTo("description")
        assertThat(insightRetrieveResponse.level()).isEqualTo(0L)
        assertThat(insightRetrieveResponse.name()).isEqualTo("name")
        assertThat(insightRetrieveResponse.numChildren()).isEqualTo(0L)
        assertThat(insightRetrieveResponse.parentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightRetrieveResponse =
            InsightRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .level(0L)
                .name("name")
                .numChildren(0L)
                .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedInsightRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightRetrieveResponse),
                jacksonTypeRef<InsightRetrieveResponse>(),
            )

        assertThat(roundtrippedInsightRetrieveResponse).isEqualTo(insightRetrieveResponse)
    }
}
