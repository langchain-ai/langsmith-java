// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberBatchResponseTest {

    @Test
    fun create() {
        val memberBatchResponse =
            MemberBatchResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .accessScope(MemberBatchResponse.AccessScope.ORGANIZATION)
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

        assertThat(memberBatchResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(memberBatchResponse.email()).isEqualTo("email")
        assertThat(memberBatchResponse.accessScope())
            .contains(MemberBatchResponse.AccessScope.ORGANIZATION)
        assertThat(memberBatchResponse.fullName()).contains("full_name")
        assertThat(memberBatchResponse.orgRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.orgRoleName()).contains("org_role_name")
        assertThat(memberBatchResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.password()).contains("password")
        assertThat(memberBatchResponse.readOnly()).contains(true)
        assertThat(memberBatchResponse.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.roleName()).contains("role_name")
        assertThat(memberBatchResponse.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.workspaceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberBatchResponse.workspaceRoleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberBatchResponse =
            MemberBatchResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .accessScope(MemberBatchResponse.AccessScope.ORGANIZATION)
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

        val roundtrippedMemberBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberBatchResponse),
                jacksonTypeRef<MemberBatchResponse>(),
            )

        assertThat(roundtrippedMemberBatchResponse).isEqualTo(memberBatchResponse)
    }
}
