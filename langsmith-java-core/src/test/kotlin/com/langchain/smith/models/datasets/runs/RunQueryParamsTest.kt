// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryParamsTest {

    @Test
    fun create() {
        RunQueryParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .format(RunQueryParams.Format.CSV)
            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filters(
                RunQueryParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
            .includeAnnotatorDetail(true)
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
    }

    @Test
    fun pathParams() {
        val params =
            RunQueryParams.builder()
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
            RunQueryParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .format(RunQueryParams.Format.CSV)
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    RunQueryParams.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .includeAnnotatorDetail(true)
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("format", "csv").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunQueryParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunQueryParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .format(RunQueryParams.Format.CSV)
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    RunQueryParams.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .includeAnnotatorDetail(true)
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

        val body = params._body()

        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.comparativeExperimentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.exampleIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.filters())
            .contains(
                RunQueryParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(body.includeAnnotatorDetail()).contains(true)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunQueryParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
