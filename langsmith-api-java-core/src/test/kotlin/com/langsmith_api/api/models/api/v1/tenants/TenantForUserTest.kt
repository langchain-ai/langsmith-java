// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.tenants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantForUserTest {

    @Test
    fun create() {
        val tenantForUser =
            TenantForUser.builder()
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

        assertThat(tenantForUser.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenantForUser.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenantForUser.displayName()).isEqualTo("display_name")
        assertThat(tenantForUser.isDeleted()).isEqualTo(true)
        assertThat(tenantForUser.isPersonal()).isEqualTo(true)
        assertThat(tenantForUser.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenantForUser.permissions().getOrNull()).containsExactly("string")
        assertThat(tenantForUser.readOnly()).contains(true)
        assertThat(tenantForUser.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenantForUser.roleName()).contains("role_name")
        assertThat(tenantForUser.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenantForUser =
            TenantForUser.builder()
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

        val roundtrippedTenantForUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenantForUser),
                jacksonTypeRef<TenantForUser>(),
            )

        assertThat(roundtrippedTenantForUser).isEqualTo(tenantForUser)
    }
}
