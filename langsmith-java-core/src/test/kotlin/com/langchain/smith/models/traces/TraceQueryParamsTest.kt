// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TraceQueryParamsTest {

    @Test
    fun create() {
        TraceQueryParams.builder()
            .cursor("cursor")
            .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
            .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
            .pageSize(20L)
            .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .selects(
                listOf(
                    TraceQueryParams.Select.ID,
                    TraceQueryParams.Select.NAME,
                    TraceQueryParams.Select.START_TIME,
                    TraceQueryParams.Select.STATUS,
                    TraceQueryParams.Select.TOTAL_TOKENS,
                    TraceQueryParams.Select.TOTAL_COST,
                    TraceQueryParams.Select.FIRST_TOKEN_TIME,
                )
            )
            .traceFilter("eq(status, \"error\")")
            .addTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .treeFilter("has(tags, \"production\")")
            .build()
    }

    @Test
    fun body() {
        val params =
            TraceQueryParams.builder()
                .cursor("cursor")
                .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .pageSize(20L)
                .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .selects(
                    listOf(
                        TraceQueryParams.Select.ID,
                        TraceQueryParams.Select.NAME,
                        TraceQueryParams.Select.START_TIME,
                        TraceQueryParams.Select.STATUS,
                        TraceQueryParams.Select.TOTAL_TOKENS,
                        TraceQueryParams.Select.TOTAL_COST,
                        TraceQueryParams.Select.FIRST_TOKEN_TIME,
                    )
                )
                .traceFilter("eq(status, \"error\")")
                .addTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .treeFilter("has(tags, \"production\")")
                .build()

        val body = params._body()

        assertThat(body.cursor()).contains("cursor")
        assertThat(body.maxStartTime()).contains(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
        assertThat(body.minStartTime()).contains(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(body.pageSize()).contains(20L)
        assertThat(body.projectId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(body.selects().getOrNull())
            .containsExactly(
                TraceQueryParams.Select.ID,
                TraceQueryParams.Select.NAME,
                TraceQueryParams.Select.START_TIME,
                TraceQueryParams.Select.STATUS,
                TraceQueryParams.Select.TOTAL_TOKENS,
                TraceQueryParams.Select.TOTAL_COST,
                TraceQueryParams.Select.FIRST_TOKEN_TIME,
            )
        assertThat(body.traceFilter()).contains("eq(status, \"error\")")
        assertThat(body.traceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.treeFilter()).contains("has(tags, \"production\")")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TraceQueryParams.builder().build()

        val body = params._body()
    }
}
