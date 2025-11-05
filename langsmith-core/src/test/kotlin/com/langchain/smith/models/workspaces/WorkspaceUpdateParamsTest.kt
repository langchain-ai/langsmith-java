// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceUpdateParamsTest {

    @Test
    fun create() {
        WorkspaceUpdateParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .displayName("display_name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WorkspaceUpdateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayName("display_name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WorkspaceUpdateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayName("display_name")
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
    }
}
