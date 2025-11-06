// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateParamsTest {

    @Test
    fun create() {
        RunCreateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .format("format")
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
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
    fun queryParams() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .format("format")
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("format", "format").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryExampleSchemaWithRuns(
                    QueryExampleSchemaWithRuns.builder()
                        .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .format("format")
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
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
