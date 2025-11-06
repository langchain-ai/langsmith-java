// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.examples

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.runs.QueryExampleSchemaWithRuns
import com.langchain.smith.models.datasets.runs.SortParamsForRunsComparisonView
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleRunsParamsTest {

    @Test
    fun create() {
        ExampleRunsParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .queryExampleSchemaWithRuns(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExampleRunsParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryExampleSchemaWithRuns(
                    QueryExampleSchemaWithRuns.builder()
                        .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExampleRunsParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryExampleSchemaWithRuns(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExampleRunsParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryExampleSchemaWithRuns(
                    QueryExampleSchemaWithRuns.builder()
                        .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                QueryExampleSchemaWithRuns.builder()
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
