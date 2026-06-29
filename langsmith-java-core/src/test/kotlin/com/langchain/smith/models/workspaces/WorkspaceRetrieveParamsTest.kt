// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceRetrieveParamsTest {

    @Test
    fun create() {
        WorkspaceRetrieveParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dataPlaneId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeDeleted(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WorkspaceRetrieveParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            WorkspaceRetrieveParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        val params =
            WorkspaceRetrieveParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
