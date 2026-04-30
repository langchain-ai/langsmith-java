// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceDeleteResponseTest {

    @Test
    fun create() {
        val workspaceDeleteResponse = WorkspaceDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceDeleteResponse = WorkspaceDeleteResponse.builder().build()

        val roundtrippedWorkspaceDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceDeleteResponse),
                jacksonTypeRef<WorkspaceDeleteResponse>(),
            )

        assertThat(roundtrippedWorkspaceDeleteResponse).isEqualTo(workspaceDeleteResponse)
    }
}
