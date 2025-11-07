// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingListResponseTest {

    @Test
    fun create() {
        val pendingListResponse =
            PendingListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .accessScope(PendingListResponse.AccessScope.ORGANIZATION)
                .fullName("full_name")
                .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgRoleName("org_role_name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .password("password")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(pendingListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingListResponse.email()).isEqualTo("email")
        assertThat(pendingListResponse.accessScope())
            .contains(PendingListResponse.AccessScope.ORGANIZATION)
        assertThat(pendingListResponse.fullName()).contains("full_name")
        assertThat(pendingListResponse.orgRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.orgRoleName()).contains("org_role_name")
        assertThat(pendingListResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.password()).contains("password")
        assertThat(pendingListResponse.readOnly()).contains(true)
        assertThat(pendingListResponse.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.roleName()).contains("role_name")
        assertThat(pendingListResponse.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.workspaceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.workspaceRoleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingListResponse =
            PendingListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .accessScope(PendingListResponse.AccessScope.ORGANIZATION)
                .fullName("full_name")
                .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgRoleName("org_role_name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .password("password")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPendingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingListResponse),
                jacksonTypeRef<PendingListResponse>(),
            )

        assertThat(roundtrippedPendingListResponse).isEqualTo(pendingListResponse)
    }
}
