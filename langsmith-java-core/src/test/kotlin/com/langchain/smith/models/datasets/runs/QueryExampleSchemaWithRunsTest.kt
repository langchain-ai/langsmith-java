// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryExampleSchemaWithRunsTest {

    @Test
    fun create() {
        val queryExampleSchemaWithRuns =
            QueryExampleSchemaWithRuns.builder()
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    QueryExampleSchemaWithRuns.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .limit(1L)
                .offset(0L)
                .preview(true)
                .sortParams(
                    SortParamsForRunsComparisonView.builder()
                        .sortBy("sort_by")
                        .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                        .build()
                )
                .build()

        assertThat(queryExampleSchemaWithRuns.sessionIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(queryExampleSchemaWithRuns.comparativeExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(queryExampleSchemaWithRuns.filters())
            .contains(
                QueryExampleSchemaWithRuns.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(queryExampleSchemaWithRuns.limit()).contains(1L)
        assertThat(queryExampleSchemaWithRuns.offset()).contains(0L)
        assertThat(queryExampleSchemaWithRuns.preview()).contains(true)
        assertThat(queryExampleSchemaWithRuns.sortParams())
            .contains(
                SortParamsForRunsComparisonView.builder()
                    .sortBy("sort_by")
                    .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryExampleSchemaWithRuns =
            QueryExampleSchemaWithRuns.builder()
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    QueryExampleSchemaWithRuns.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .limit(1L)
                .offset(0L)
                .preview(true)
                .sortParams(
                    SortParamsForRunsComparisonView.builder()
                        .sortBy("sort_by")
                        .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                        .build()
                )
                .build()

        val roundtrippedQueryExampleSchemaWithRuns =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryExampleSchemaWithRuns),
                jacksonTypeRef<QueryExampleSchemaWithRuns>(),
            )

        assertThat(roundtrippedQueryExampleSchemaWithRuns).isEqualTo(queryExampleSchemaWithRuns)
    }
}
