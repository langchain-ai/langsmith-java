// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortParamsForRunsComparisonViewTest {

    @Test
    fun create() {
        val sortParamsForRunsComparisonView =
            SortParamsForRunsComparisonView.builder()
                .sortBy("sort_by")
                .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                .build()

        assertThat(sortParamsForRunsComparisonView.sortBy()).isEqualTo("sort_by")
        assertThat(sortParamsForRunsComparisonView.sortOrder())
            .contains(SortParamsForRunsComparisonView.SortOrder.ASC)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sortParamsForRunsComparisonView =
            SortParamsForRunsComparisonView.builder()
                .sortBy("sort_by")
                .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                .build()

        val roundtrippedSortParamsForRunsComparisonView =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sortParamsForRunsComparisonView),
                jacksonTypeRef<SortParamsForRunsComparisonView>(),
            )

        assertThat(roundtrippedSortParamsForRunsComparisonView)
            .isEqualTo(sortParamsForRunsComparisonView)
    }
}
