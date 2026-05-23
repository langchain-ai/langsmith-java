// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceListParamsTest {

    @Test
    fun create() {
        WorkspaceListParams.builder()
            .dataPlaneId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeDeleted(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WorkspaceListParams.builder()
                .dataPlaneId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeDeleted(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("data_plane_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("include_deleted", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkspaceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
