// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceListResponseTest {

    @Test
    fun create() {
        val workspaceListResponse =
            WorkspaceListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(workspaceListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceListResponse.displayName()).isEqualTo("display_name")
        assertThat(workspaceListResponse.isDeleted()).isEqualTo(true)
        assertThat(workspaceListResponse.isPersonal()).isEqualTo(true)
        assertThat(workspaceListResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceListResponse.permissions().getOrNull()).containsExactly("string")
        assertThat(workspaceListResponse.readOnly()).contains(true)
        assertThat(workspaceListResponse.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceListResponse.roleName()).contains("role_name")
        assertThat(workspaceListResponse.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceListResponse =
            WorkspaceListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedWorkspaceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceListResponse),
                jacksonTypeRef<WorkspaceListResponse>(),
            )

        assertThat(roundtrippedWorkspaceListResponse).isEqualTo(workspaceListResponse)
    }
}
