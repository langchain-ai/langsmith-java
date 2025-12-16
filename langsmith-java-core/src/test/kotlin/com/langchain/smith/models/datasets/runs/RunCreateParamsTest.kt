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
            .format(RunCreateParams.Format.CSV)
            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filters(
                RunCreateParams.Filters.builder()
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
            .stream(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .format(RunCreateParams.Format.CSV)
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    RunCreateParams.Filters.builder()
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
                .stream(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("format", "csv").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .format(RunCreateParams.Format.CSV)
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    RunCreateParams.Filters.builder()
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
                .stream(true)
                .build()

        val body = params._body()

        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.comparativeExperimentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.filters())
            .contains(
                RunCreateParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(body.limit()).contains(1L)
        assertThat(body.offset()).contains(0L)
        assertThat(body.preview()).contains(true)
        assertThat(body.sortParams())
            .contains(
                SortParamsForRunsComparisonView.builder()
                    .sortBy("sort_by")
                    .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                    .build()
            )
        assertThat(body.stream()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
