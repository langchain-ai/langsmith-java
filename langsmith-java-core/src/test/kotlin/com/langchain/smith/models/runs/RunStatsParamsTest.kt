// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunStatsParamsTest {

    @Test
    fun create() {
        RunStatsParams.builder()
            .runStatsQueryParams(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RunStatsParams.builder()
                .runStatsQueryParams(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunStatsParams.builder()
                .runStatsQueryParams(RunStatsQueryParams.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RunStatsQueryParams.builder().build())
    }
}
