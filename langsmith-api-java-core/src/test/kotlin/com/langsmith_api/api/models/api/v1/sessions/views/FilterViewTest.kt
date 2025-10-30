// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.views

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterViewTest {

    @Test
    fun create() {
        val filterView =
            FilterView.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .filterString("filter_string")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilterString("trace_filter_string")
                .treeFilterString("tree_filter_string")
                .type(FilterViewType.RUNS)
                .build()

        assertThat(filterView.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(filterView.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(filterView.displayName()).isEqualTo("display_name")
        assertThat(filterView.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(filterView.description()).contains("description")
        assertThat(filterView.filterString()).contains("filter_string")
        assertThat(filterView.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(filterView.traceFilterString()).contains("trace_filter_string")
        assertThat(filterView.treeFilterString()).contains("tree_filter_string")
        assertThat(filterView.type()).contains(FilterViewType.RUNS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterView =
            FilterView.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .filterString("filter_string")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilterString("trace_filter_string")
                .treeFilterString("tree_filter_string")
                .type(FilterViewType.RUNS)
                .build()

        val roundtrippedFilterView =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterView),
                jacksonTypeRef<FilterView>(),
            )

        assertThat(roundtrippedFilterView).isEqualTo(filterView)
    }
}
