// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BodyParamsForRunSchemaTest {

    @Test
    fun create() {
        val bodyParamsForRunSchema =
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

        assertThat(bodyParamsForRunSchema.id().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bodyParamsForRunSchema.cursor()).contains("cursor")
        assertThat(bodyParamsForRunSchema.dataSourceType())
            .contains(RunsFilterDataSourceTypeEnum.CURRENT)
        assertThat(bodyParamsForRunSchema.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bodyParamsForRunSchema.error()).contains(true)
        assertThat(bodyParamsForRunSchema.executionOrder()).contains(1L)
        assertThat(bodyParamsForRunSchema.filter()).contains("filter")
        assertThat(bodyParamsForRunSchema.isRoot()).contains(true)
        assertThat(bodyParamsForRunSchema.limit()).contains(1L)
        assertThat(bodyParamsForRunSchema.order()).contains(BodyParamsForRunSchema.Order.ASC)
        assertThat(bodyParamsForRunSchema.parentRun())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bodyParamsForRunSchema.query()).contains("query")
        assertThat(bodyParamsForRunSchema.referenceExample().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bodyParamsForRunSchema.runType()).contains(RunTypeEnum.TOOL)
        assertThat(bodyParamsForRunSchema.searchFilter()).contains("search_filter")
        assertThat(bodyParamsForRunSchema.select().getOrNull())
            .containsExactly(BodyParamsForRunSchema.Select.ID)
        assertThat(bodyParamsForRunSchema.session().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bodyParamsForRunSchema.skipPagination()).contains(true)
        assertThat(bodyParamsForRunSchema.skipPrevCursor()).contains(true)
        assertThat(bodyParamsForRunSchema.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bodyParamsForRunSchema.trace()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bodyParamsForRunSchema.traceFilter()).contains("trace_filter")
        assertThat(bodyParamsForRunSchema.treeFilter()).contains("tree_filter")
        assertThat(bodyParamsForRunSchema.useExperimentalSearch()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bodyParamsForRunSchema =
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

        val roundtrippedBodyParamsForRunSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bodyParamsForRunSchema),
                jacksonTypeRef<BodyParamsForRunSchema>(),
            )

        assertThat(roundtrippedBodyParamsForRunSchema).isEqualTo(bodyParamsForRunSchema)
    }
}
