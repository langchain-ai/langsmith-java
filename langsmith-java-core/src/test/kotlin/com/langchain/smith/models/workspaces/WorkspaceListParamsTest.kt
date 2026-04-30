// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceListParamsTest {

    @Test
    fun create() {
        WorkspaceListParams.builder().includeDeleted(true).build()
    }

    @Test
    fun queryParams() {
        val params = WorkspaceListParams.builder().includeDeleted(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_deleted", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkspaceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
