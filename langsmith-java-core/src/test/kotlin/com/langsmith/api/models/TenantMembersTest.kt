// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantMembersTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createTenantMembers() { // templates/JavaSDK/entities/testing.ts:18:13
        val tenantMembers =
            TenantMembers.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .members(
                    listOf(
                        TenantMembers.TenantMemberIdentity.builder()
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
                TenantMembers.TenantMemberIdentity
                    .builder() // templates/JavaSDK/entities/objects.ts:717:13
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
                PendingIdentity.builder() // templates/JavaSDK/entities/objects.ts:717:13
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
