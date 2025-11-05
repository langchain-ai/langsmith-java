// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightCreateResponseTest {

    @Test
    fun create() {
        val insightCreateResponse =
            InsightCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .status("status")
                .error("error")
                .build()

        assertThat(insightCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightCreateResponse.name()).isEqualTo("name")
        assertThat(insightCreateResponse.status()).isEqualTo("status")
        assertThat(insightCreateResponse.error()).contains("error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightCreateResponse =
            InsightCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .status("status")
                .error("error")
                .build()

        val roundtrippedInsightCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightCreateResponse),
                jacksonTypeRef<InsightCreateResponse>(),
            )

        assertThat(roundtrippedInsightCreateResponse).isEqualTo(insightCreateResponse)
    }
}
