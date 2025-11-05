// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartResponseTest {

    @Test
    fun create() {
        val customChartResponse =
            CustomChartResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chartType(CustomChartType.LINE)
                .index(0L)
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSeries(
                    CustomChartSeries.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metric(CustomChartMetric.RUN_COUNT)
                        .name("name")
                        .feedbackKey("feedback_key")
                        .filters(
                            CustomChartSeriesFilters.builder()
                                .filter("filter")
                                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .traceFilter("trace_filter")
                                .treeFilter("tree_filter")
                                .build()
                        )
                        .groupBy(
                            CustomChartSeries.GroupBy.builder()
                                .attribute(CustomChartSeries.GroupBy.Attribute.NAME)
                                .maxGroups(0L)
                                .path("path")
                                .setBy(CustomChartSeries.GroupBy.SetBy.SECTION)
                                .build()
                        )
                        .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .title("title")
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(customChartResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customChartResponse.chartType()).isEqualTo(CustomChartType.LINE)
        assertThat(customChartResponse.index()).isEqualTo(0L)
        assertThat(customChartResponse.sectionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customChartResponse.series().getOrNull())
            .containsExactly(
                CustomChartSeries.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metric(CustomChartMetric.RUN_COUNT)
                    .name("name")
                    .feedbackKey("feedback_key")
                    .filters(
                        CustomChartSeriesFilters.builder()
                            .filter("filter")
                            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .traceFilter("trace_filter")
                            .treeFilter("tree_filter")
                            .build()
                    )
                    .groupBy(
                        CustomChartSeries.GroupBy.builder()
                            .attribute(CustomChartSeries.GroupBy.Attribute.NAME)
                            .maxGroups(0L)
                            .path("path")
                            .setBy(CustomChartSeries.GroupBy.SetBy.SECTION)
                            .build()
                    )
                    .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(customChartResponse.title()).isEqualTo("title")
        assertThat(customChartResponse.description()).contains("description")
        assertThat(customChartResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartResponse =
            CustomChartResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chartType(CustomChartType.LINE)
                .index(0L)
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSeries(
                    CustomChartSeries.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metric(CustomChartMetric.RUN_COUNT)
                        .name("name")
                        .feedbackKey("feedback_key")
                        .filters(
                            CustomChartSeriesFilters.builder()
                                .filter("filter")
                                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .traceFilter("trace_filter")
                                .treeFilter("tree_filter")
                                .build()
                        )
                        .groupBy(
                            CustomChartSeries.GroupBy.builder()
                                .attribute(CustomChartSeries.GroupBy.Attribute.NAME)
                                .maxGroups(0L)
                                .path("path")
                                .setBy(CustomChartSeries.GroupBy.SetBy.SECTION)
                                .build()
                        )
                        .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .title("title")
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedCustomChartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartResponse),
                jacksonTypeRef<CustomChartResponse>(),
            )

        assertThat(roundtrippedCustomChartResponse).isEqualTo(customChartResponse)
    }
}
