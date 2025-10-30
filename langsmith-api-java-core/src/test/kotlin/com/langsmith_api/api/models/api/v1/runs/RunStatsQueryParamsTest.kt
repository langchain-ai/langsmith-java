// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.sessions.RunStatsGroupBy
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunStatsQueryParamsTest {

    @Test
    fun create() {
        val runStatsQueryParams =
            RunStatsQueryParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(true)
                .executionOrder(1L)
                .filter("filter")
                .groupBy(
                    RunStatsGroupBy.builder()
                        .attribute(RunStatsGroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .build()
                )
                .addGroup("string")
                .isRoot(true)
                .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("query")
                .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runType(RunTypeEnum.TOOL)
                .searchFilter("search_filter")
                .addSelect(RunStatsQueryParams.Select.RUN_COUNT)
                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .skipPagination(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .useExperimentalSearch(true)
                .build()

        assertThat(runStatsQueryParams.id().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runStatsQueryParams.dataSourceType())
            .contains(RunsFilterDataSourceTypeEnum.CURRENT)
        assertThat(runStatsQueryParams.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runStatsQueryParams.error()).contains(true)
        assertThat(runStatsQueryParams.executionOrder()).contains(1L)
        assertThat(runStatsQueryParams.filter()).contains("filter")
        assertThat(runStatsQueryParams.groupBy())
            .contains(
                RunStatsGroupBy.builder()
                    .attribute(RunStatsGroupBy.Attribute.NAME)
                    .maxGroups(0L)
                    .path("path")
                    .build()
            )
        assertThat(runStatsQueryParams.groups().getOrNull()).containsExactly("string")
        assertThat(runStatsQueryParams.isRoot()).contains(true)
        assertThat(runStatsQueryParams.parentRun()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runStatsQueryParams.query()).contains("query")
        assertThat(runStatsQueryParams.referenceExample().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runStatsQueryParams.runType()).contains(RunTypeEnum.TOOL)
        assertThat(runStatsQueryParams.searchFilter()).contains("search_filter")
        assertThat(runStatsQueryParams.select().getOrNull())
            .containsExactly(RunStatsQueryParams.Select.RUN_COUNT)
        assertThat(runStatsQueryParams.session().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runStatsQueryParams.skipPagination()).contains(true)
        assertThat(runStatsQueryParams.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runStatsQueryParams.trace()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runStatsQueryParams.traceFilter()).contains("trace_filter")
        assertThat(runStatsQueryParams.treeFilter()).contains("tree_filter")
        assertThat(runStatsQueryParams.useExperimentalSearch()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runStatsQueryParams =
            RunStatsQueryParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(true)
                .executionOrder(1L)
                .filter("filter")
                .groupBy(
                    RunStatsGroupBy.builder()
                        .attribute(RunStatsGroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .build()
                )
                .addGroup("string")
                .isRoot(true)
                .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("query")
                .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runType(RunTypeEnum.TOOL)
                .searchFilter("search_filter")
                .addSelect(RunStatsQueryParams.Select.RUN_COUNT)
                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .skipPagination(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .useExperimentalSearch(true)
                .build()

        val roundtrippedRunStatsQueryParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runStatsQueryParams),
                jacksonTypeRef<RunStatsQueryParams>(),
            )

        assertThat(roundtrippedRunStatsQueryParams).isEqualTo(runStatsQueryParams)
    }
}
