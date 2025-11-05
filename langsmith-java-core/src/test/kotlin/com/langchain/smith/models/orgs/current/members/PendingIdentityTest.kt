// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingIdentityTest {

    @Test
    fun create() {
        val pendingIdentity =
            PendingIdentity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .accessScope(AccessScope.ORGANIZATION)
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

        assertThat(pendingIdentity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingIdentity.email()).isEqualTo("email")
        assertThat(pendingIdentity.accessScope()).contains(AccessScope.ORGANIZATION)
        assertThat(pendingIdentity.fullName()).contains("full_name")
        assertThat(pendingIdentity.orgRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.orgRoleName()).contains("org_role_name")
        assertThat(pendingIdentity.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.password()).contains("password")
        assertThat(pendingIdentity.readOnly()).contains(true)
        assertThat(pendingIdentity.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.roleName()).contains("role_name")
        assertThat(pendingIdentity.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.workspaceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentity.workspaceRoleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingIdentity =
            PendingIdentity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .accessScope(AccessScope.ORGANIZATION)
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

        val roundtrippedPendingIdentity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingIdentity),
                jacksonTypeRef<PendingIdentity>(),
            )

        assertThat(roundtrippedPendingIdentity).isEqualTo(pendingIdentity)
    }
}
