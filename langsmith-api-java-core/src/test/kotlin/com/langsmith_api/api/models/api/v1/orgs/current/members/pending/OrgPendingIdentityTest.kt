// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.members.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgs.current.members.AccessScope
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgPendingIdentityTest {

    @Test
    fun create() {
        val orgPendingIdentity =
            OrgPendingIdentity.builder()
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
                .addTenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(orgPendingIdentity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(orgPendingIdentity.email()).isEqualTo("email")
        assertThat(orgPendingIdentity.accessScope()).contains(AccessScope.ORGANIZATION)
        assertThat(orgPendingIdentity.fullName()).contains("full_name")
        assertThat(orgPendingIdentity.orgRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.orgRoleName()).contains("org_role_name")
        assertThat(orgPendingIdentity.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.password()).contains("password")
        assertThat(orgPendingIdentity.readOnly()).contains(true)
        assertThat(orgPendingIdentity.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.roleName()).contains("role_name")
        assertThat(orgPendingIdentity.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.tenantIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.workspaceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgPendingIdentity.workspaceRoleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgPendingIdentity =
            OrgPendingIdentity.builder()
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
                .addTenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedOrgPendingIdentity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgPendingIdentity),
                jacksonTypeRef<OrgPendingIdentity>(),
            )

        assertThat(roundtrippedOrgPendingIdentity).isEqualTo(orgPendingIdentity)
    }
}
