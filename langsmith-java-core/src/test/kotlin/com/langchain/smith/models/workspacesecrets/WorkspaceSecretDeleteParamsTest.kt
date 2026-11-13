// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceSecretDeleteParamsTest {

    @Test
    fun create() {
        WorkspaceSecretDeleteParams.builder().key("key").build()
    }

    @Test
    fun pathParams() {
        val params = WorkspaceSecretDeleteParams.builder().key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
