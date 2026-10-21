// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListParamsTest {

    @Test
    fun create() {
        AgentListParams.builder()
            .addId("string")
            .cursor("cursor")
            .name("name")
            .pageSize(1L)
            .sortBy(AgentListParams.SortBy.LAST_RUN_START_TIME)
            .sortOrder(AgentListParams.SortOrder.ASC)
            .sourceType(AgentListParams.SourceType.LSD)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentListParams.builder()
                .addId("string")
                .cursor("cursor")
                .name("name")
                .pageSize(1L)
                .sortBy(AgentListParams.SortBy.LAST_RUN_START_TIME)
                .sortOrder(AgentListParams.SortOrder.ASC)
                .sourceType(AgentListParams.SourceType.LSD)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "string")
                    .put("cursor", "cursor")
                    .put("name", "name")
                    .put("page_size", "1")
                    .put("sort_by", "last_run_start_time")
                    .put("sort_order", "asc")
                    .put("source_type", "LSD")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
