// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceSecretListParamsTest {

    @Test
    fun create() {
        WorkspaceSecretListParams.builder().includeConfigs(true).build()
    }

    @Test
    fun queryParams() {
        val params = WorkspaceSecretListParams.builder().includeConfigs(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_configs", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkspaceSecretListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
