// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts.section

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsSectionResponseTest {

    @Test
    fun create() {
        val customChartsSectionResponse =
            CustomChartsSectionResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .title("title")
                .chartCount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .index(0L)
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(customChartsSectionResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customChartsSectionResponse.title()).isEqualTo("title")
        assertThat(customChartsSectionResponse.chartCount()).contains(0L)
        assertThat(customChartsSectionResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsSectionResponse.description()).contains("description")
        assertThat(customChartsSectionResponse.index()).contains(0L)
        assertThat(customChartsSectionResponse.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsSectionResponse =
            CustomChartsSectionResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .title("title")
                .chartCount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .index(0L)
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCustomChartsSectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsSectionResponse),
                jacksonTypeRef<CustomChartsSectionResponse>(),
            )

        assertThat(roundtrippedCustomChartsSectionResponse).isEqualTo(customChartsSectionResponse)
    }
}
