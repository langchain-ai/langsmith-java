// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryParamsTest {

    @Test
    fun create() {
        RunQueryParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .dataSourceType(RunQueryParams.DataSourceType.CURRENT)
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .error(true)
            .executionOrder(1L)
            .filter("filter")
            .isRoot(true)
            .limit(1L)
            .order(RunQueryParams.Order.ASC)
            .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .query("query")
            .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .runType(RunQueryParams.RunType.TOOL)
            .searchFilter("search_filter")
            .addSelect(RunQueryParams.Select.ID)
            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .skipPagination(true)
            .skipPrevCursor(true)
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .traceFilter("trace_filter")
            .treeFilter("tree_filter")
            .useExperimentalSearch(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            RunQueryParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .dataSourceType(RunQueryParams.DataSourceType.CURRENT)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(true)
                .executionOrder(1L)
                .filter("filter")
                .isRoot(true)
                .limit(1L)
                .order(RunQueryParams.Order.ASC)
                .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("query")
                .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runType(RunQueryParams.RunType.TOOL)
                .searchFilter("search_filter")
                .addSelect(RunQueryParams.Select.ID)
                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .skipPagination(true)
                .skipPrevCursor(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .useExperimentalSearch(true)
                .build()

        val body = params._body()

        assertThat(body.id().getOrNull()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.cursor()).contains("cursor")
        assertThat(body.dataSourceType()).contains(RunQueryParams.DataSourceType.CURRENT)
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.error()).contains(true)
        assertThat(body.executionOrder()).contains(1L)
        assertThat(body.filter()).contains("filter")
        assertThat(body.isRoot()).contains(true)
        assertThat(body.limit()).contains(1L)
        assertThat(body.order()).contains(RunQueryParams.Order.ASC)
        assertThat(body.parentRun()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.query()).contains("query")
        assertThat(body.referenceExample().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.runType()).contains(RunQueryParams.RunType.TOOL)
        assertThat(body.searchFilter()).contains("search_filter")
        assertThat(body.select().getOrNull()).containsExactly(RunQueryParams.Select.ID)
        assertThat(body.session().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.skipPagination()).contains(true)
        assertThat(body.skipPrevCursor()).contains(true)
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.trace()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.traceFilter()).contains("trace_filter")
        assertThat(body.treeFilter()).contains("tree_filter")
        assertThat(body.useExperimentalSearch()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunQueryParams.builder().build()

        val body = params._body()
    }
}
