// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionListV2ParamsTest {

    @Test
    fun create() {
        SessionListV2Params.builder()
            .addId("string")
            .cursor("cursor")
            .datasetVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filter("filter")
            .includeFacets(true)
            .includeStats(true)
            .metadata("metadata")
            .name("name")
            .nameContains("name_contains")
            .pageSize(1L)
            .addReferenceDatasetId("string")
            .referenceFree(true)
            .sortBy(SessionListV2Params.SortBy.NAME)
            .sortByFeedbackKey("sort_by_feedback_key")
            .sortByFeedbackSource(SessionListV2Params.SortByFeedbackSource.RUN)
            .sortOrder(SessionListV2Params.SortOrder.ASC)
            .statsFilter("stats_filter")
            .addStatsSelect("string")
            .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addTagValueId("string")
            .useApproxStats(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SessionListV2Params.builder()
                .addId("string")
                .cursor("cursor")
                .datasetVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .includeFacets(true)
                .includeStats(true)
                .metadata("metadata")
                .name("name")
                .nameContains("name_contains")
                .pageSize(1L)
                .addReferenceDatasetId("string")
                .referenceFree(true)
                .sortBy(SessionListV2Params.SortBy.NAME)
                .sortByFeedbackKey("sort_by_feedback_key")
                .sortByFeedbackSource(SessionListV2Params.SortByFeedbackSource.RUN)
                .sortOrder(SessionListV2Params.SortOrder.ASC)
                .statsFilter("stats_filter")
                .addStatsSelect("string")
                .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagValueId("string")
                .useApproxStats(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "string")
                    .put("cursor", "cursor")
                    .put("dataset_version", "2019-12-27T18:11:19.117Z")
                    .put("filter", "filter")
                    .put("include_facets", "true")
                    .put("include_stats", "true")
                    .put("metadata", "metadata")
                    .put("name", "name")
                    .put("name_contains", "name_contains")
                    .put("page_size", "1")
                    .put("reference_dataset_id", "string")
                    .put("reference_free", "true")
                    .put("sort_by", "NAME")
                    .put("sort_by_feedback_key", "sort_by_feedback_key")
                    .put("sort_by_feedback_source", "RUN")
                    .put("sort_order", "asc")
                    .put("stats_filter", "stats_filter")
                    .put("stats_select", "string")
                    .put("stats_start_time", "2019-12-27T18:11:19.117Z")
                    .put("tag_value_id", "string")
                    .put("use_approx_stats", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SessionListV2Params.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
