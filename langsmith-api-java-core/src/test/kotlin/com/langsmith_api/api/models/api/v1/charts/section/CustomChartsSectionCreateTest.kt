// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts.section

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsSectionCreateTest {

    @Test
    fun create() {
        val customChartsSectionCreate =
            CustomChartsSectionCreate.builder()
                .title("title")
                .description("description")
                .index(0L)
                .build()

        assertThat(customChartsSectionCreate.title()).isEqualTo("title")
        assertThat(customChartsSectionCreate.description()).contains("description")
        assertThat(customChartsSectionCreate.index()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsSectionCreate =
            CustomChartsSectionCreate.builder()
                .title("title")
                .description("description")
                .index(0L)
                .build()

        val roundtrippedCustomChartsSectionCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsSectionCreate),
                jacksonTypeRef<CustomChartsSectionCreate>(),
            )

        assertThat(roundtrippedCustomChartsSectionCreate).isEqualTo(customChartsSectionCreate)
    }
}
