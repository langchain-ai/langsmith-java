// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryParamsTest {

    @Test
    fun create() {
        RunQueryParams.builder()
            .bodyParamsForRunSchema(
                BodyParamsForRunSchema.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .executionOrder(1L)
                    .filter("filter")
                    .isRoot(true)
                    .limit(1L)
                    .order(BodyParamsForRunSchema.Order.ASC)
                    .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("query")
                    .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runType(RunTypeEnum.TOOL)
                    .searchFilter("search_filter")
                    .addSelect(BodyParamsForRunSchema.Select.ID)
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .skipPagination(true)
                    .skipPrevCursor(true)
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
            RunQueryParams.builder()
                .bodyParamsForRunSchema(
                    BodyParamsForRunSchema.builder()
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cursor("cursor")
                        .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error(true)
                        .executionOrder(1L)
                        .filter("filter")
                        .isRoot(true)
                        .limit(1L)
                        .order(BodyParamsForRunSchema.Order.ASC)
                        .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .query("query")
                        .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runType(RunTypeEnum.TOOL)
                        .searchFilter("search_filter")
                        .addSelect(BodyParamsForRunSchema.Select.ID)
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .skipPagination(true)
                        .skipPrevCursor(true)
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
                BodyParamsForRunSchema.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .executionOrder(1L)
                    .filter("filter")
                    .isRoot(true)
                    .limit(1L)
                    .order(BodyParamsForRunSchema.Order.ASC)
                    .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("query")
                    .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runType(RunTypeEnum.TOOL)
                    .searchFilter("search_filter")
                    .addSelect(BodyParamsForRunSchema.Select.ID)
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .skipPagination(true)
                    .skipPrevCursor(true)
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
            RunQueryParams.builder()
                .bodyParamsForRunSchema(BodyParamsForRunSchema.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BodyParamsForRunSchema.builder().build())
    }
}
