// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts.section

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsSectionUpdateTest {

    @Test
    fun create() {
        val customChartsSectionUpdate =
            CustomChartsSectionUpdate.builder()
                .description("string")
                .index(0L)
                .title("string")
                .build()

        assertThat(customChartsSectionUpdate.description())
            .contains(CustomChartsSectionUpdate.Description.ofString("string"))
        assertThat(customChartsSectionUpdate.index())
            .contains(CustomChartsSectionUpdate.Index.ofInteger(0L))
        assertThat(customChartsSectionUpdate.title())
            .contains(CustomChartsSectionUpdate.Title.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsSectionUpdate =
            CustomChartsSectionUpdate.builder()
                .description("string")
                .index(0L)
                .title("string")
                .build()

        val roundtrippedCustomChartsSectionUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsSectionUpdate),
                jacksonTypeRef<CustomChartsSectionUpdate>(),
            )

        assertThat(roundtrippedCustomChartsSectionUpdate).isEqualTo(customChartsSectionUpdate)
    }
}
