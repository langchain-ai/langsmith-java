// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacetags

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceTagListParamsTest {

    @Test
    fun create() {
        WorkspaceTagListParams.builder()
            .resourceType(WorkspaceTagListParams.ResourceType.AGENT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WorkspaceTagListParams.builder()
                .resourceType(WorkspaceTagListParams.ResourceType.AGENT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("resource_type", "agent").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkspaceTagListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
