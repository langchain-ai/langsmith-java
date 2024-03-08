// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantMembersTest {

    @Test
    fun createTenantMembers() {
        val tenantMembers =
            TenantMembers.builder()
                .members(
                    listOf(
                        TenantMembers.Member.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .readOnly(true)
                            .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .avatarUrl("string")
                            .email("string")
                            .fullName("string")
                            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .pending(
                    listOf(
                        PendingIdentity.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .email("string")
                            .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .readOnly(true)
                            .build()
                    )
                )
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(tenantMembers).isNotNull
        assertThat(tenantMembers.members())
            .containsExactly(
                TenantMembers.Member.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .readOnly(true)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .avatarUrl("string")
                    .email("string")
                    .fullName("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(tenantMembers.pending())
            .containsExactly(
                PendingIdentity.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("string")
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .build()
            )
        assertThat(tenantMembers.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
