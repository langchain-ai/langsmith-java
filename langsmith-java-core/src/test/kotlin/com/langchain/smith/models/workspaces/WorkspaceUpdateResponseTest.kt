// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceUpdateResponseTest {

    @Test
    fun create() {
        val workspaceUpdateResponse =
            WorkspaceUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(workspaceUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceUpdateResponse.displayName()).isEqualTo("display_name")
        assertThat(workspaceUpdateResponse.isDeleted()).isEqualTo(true)
        assertThat(workspaceUpdateResponse.isPersonal()).isEqualTo(true)
        assertThat(workspaceUpdateResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceUpdateResponse.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceUpdateResponse =
            WorkspaceUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedWorkspaceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceUpdateResponse),
                jacksonTypeRef<WorkspaceUpdateResponse>(),
            )

        assertThat(roundtrippedWorkspaceUpdateResponse).isEqualTo(workspaceUpdateResponse)
    }
}
