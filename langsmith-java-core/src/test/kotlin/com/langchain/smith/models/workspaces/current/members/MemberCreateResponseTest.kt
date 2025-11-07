// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberCreateResponseTest {

    @Test
    fun create() {
        val memberCreateResponse =
            MemberCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accessScope(MemberCreateResponse.AccessScope.ORGANIZATION)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(memberCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(memberCreateResponse.lsUserId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberCreateResponse.organizationId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberCreateResponse.readOnly()).isEqualTo(true)
        assertThat(memberCreateResponse.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberCreateResponse.accessScope())
            .contains(MemberCreateResponse.AccessScope.ORGANIZATION)
        assertThat(memberCreateResponse.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(memberCreateResponse.roleName()).contains("role_name")
        assertThat(memberCreateResponse.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberCreateResponse =
            MemberCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accessScope(MemberCreateResponse.AccessScope.ORGANIZATION)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedMemberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberCreateResponse),
                jacksonTypeRef<MemberCreateResponse>(),
            )

        assertThat(roundtrippedMemberCreateResponse).isEqualTo(memberCreateResponse)
    }
}
