// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions

import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionListParamsTest {

    @Test
    fun create() {
        SessionListParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetVersion("dataset_version")
            .facets(true)
            .filter("filter")
            .includeStats(true)
            .limit(1L)
            .metadata("metadata")
            .name("name")
            .nameContains("name_contains")
            .offset(0L)
            .addReferenceDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .referenceFree(true)
            .sortBy(SessionSortableColumns.NAME)
            .sortByDesc(true)
            .sortByFeedbackKey("sort_by_feedback_key")
            .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .useApproxStats(true)
            .accept("accept")
            .build()
    }

    @Test
    fun headers() {
        val params =
            SessionListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetVersion("dataset_version")
                .facets(true)
                .filter("filter")
                .includeStats(true)
                .limit(1L)
                .metadata("metadata")
                .name("name")
                .nameContains("name_contains")
                .offset(0L)
                .addReferenceDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceFree(true)
                .sortBy(SessionSortableColumns.NAME)
                .sortByDesc(true)
                .sortByFeedbackKey("sort_by_feedback_key")
                .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .useApproxStats(true)
                .accept("accept")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("accept", "accept").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = SessionListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            SessionListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetVersion("dataset_version")
                .facets(true)
                .filter("filter")
                .includeStats(true)
                .limit(1L)
                .metadata("metadata")
                .name("name")
                .nameContains("name_contains")
                .offset(0L)
                .addReferenceDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceFree(true)
                .sortBy(SessionSortableColumns.NAME)
                .sortByDesc(true)
                .sortByFeedbackKey("sort_by_feedback_key")
                .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .useApproxStats(true)
                .accept("accept")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("dataset_version", "dataset_version")
                    .put("facets", "true")
                    .put("filter", "filter")
                    .put("include_stats", "true")
                    .put("limit", "1")
                    .put("metadata", "metadata")
                    .put("name", "name")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .put(
                        "reference_dataset",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("reference_free", "true")
                    .put("sort_by", "name")
                    .put("sort_by_desc", "true")
                    .put("sort_by_feedback_key", "sort_by_feedback_key")
                    .put("stats_start_time", "2019-12-27T18:11:19.117Z")
                    .put(
                        "tag_value_id",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("use_approx_stats", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SessionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
