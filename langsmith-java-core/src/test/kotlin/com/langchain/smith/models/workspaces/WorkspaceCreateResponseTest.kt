// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceCreateResponseTest {

    @Test
    fun create() {
        val workspaceCreateResponse =
            WorkspaceCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .dataPlaneName("data_plane_name")
                .dataPlaneRegion("data_plane_region")
                .dataPlaneUrl("data_plane_url")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(workspaceCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceCreateResponse.displayName()).isEqualTo("display_name")
        assertThat(workspaceCreateResponse.isDeleted()).isEqualTo(true)
        assertThat(workspaceCreateResponse.isPersonal()).isEqualTo(true)
        assertThat(workspaceCreateResponse.dataPlaneName()).contains("data_plane_name")
        assertThat(workspaceCreateResponse.dataPlaneRegion()).contains("data_plane_region")
        assertThat(workspaceCreateResponse.dataPlaneUrl()).contains("data_plane_url")
        assertThat(workspaceCreateResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceCreateResponse.permissions().getOrNull()).containsExactly("string")
        assertThat(workspaceCreateResponse.readOnly()).contains(true)
        assertThat(workspaceCreateResponse.roleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceCreateResponse.roleName()).contains("role_name")
        assertThat(workspaceCreateResponse.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceCreateResponse =
            WorkspaceCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .dataPlaneName("data_plane_name")
                .dataPlaneRegion("data_plane_region")
                .dataPlaneUrl("data_plane_url")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedWorkspaceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceCreateResponse),
                jacksonTypeRef<WorkspaceCreateResponse>(),
            )

        assertThat(roundtrippedWorkspaceCreateResponse).isEqualTo(workspaceCreateResponse)
    }
}
