// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceRetrieveResponseTest {

    @Test
    fun create() {
        val workspaceRetrieveResponse =
            WorkspaceRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .dataPlaneUrl("data_plane_url")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(workspaceRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceRetrieveResponse.displayName()).isEqualTo("display_name")
        assertThat(workspaceRetrieveResponse.isDeleted()).isEqualTo(true)
        assertThat(workspaceRetrieveResponse.isPersonal()).isEqualTo(true)
        assertThat(workspaceRetrieveResponse.dataPlaneUrl()).contains("data_plane_url")
        assertThat(workspaceRetrieveResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceRetrieveResponse.permissions().getOrNull()).containsExactly("string")
        assertThat(workspaceRetrieveResponse.readOnly()).contains(true)
        assertThat(workspaceRetrieveResponse.roleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceRetrieveResponse.roleName()).contains("role_name")
        assertThat(workspaceRetrieveResponse.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceRetrieveResponse =
            WorkspaceRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .dataPlaneUrl("data_plane_url")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedWorkspaceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceRetrieveResponse),
                jacksonTypeRef<WorkspaceRetrieveResponse>(),
            )

        assertThat(roundtrippedWorkspaceRetrieveResponse).isEqualTo(workspaceRetrieveResponse)
    }
}
