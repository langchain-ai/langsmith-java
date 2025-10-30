// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartSeriesFiltersTest {

    @Test
    fun create() {
        val customChartSeriesFilters =
            CustomChartSeriesFilters.builder()
                .filter("filter")
                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .build()

        assertThat(customChartSeriesFilters.filter()).contains("filter")
        assertThat(customChartSeriesFilters.session().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customChartSeriesFilters.traceFilter()).contains("trace_filter")
        assertThat(customChartSeriesFilters.treeFilter()).contains("tree_filter")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartSeriesFilters =
            CustomChartSeriesFilters.builder()
                .filter("filter")
                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .build()

        val roundtrippedCustomChartSeriesFilters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartSeriesFilters),
                jacksonTypeRef<CustomChartSeriesFilters>(),
            )

        assertThat(roundtrippedCustomChartSeriesFilters).isEqualTo(customChartSeriesFilters)
    }
}
