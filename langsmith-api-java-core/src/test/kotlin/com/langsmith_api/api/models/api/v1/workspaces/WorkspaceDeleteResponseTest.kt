// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
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
