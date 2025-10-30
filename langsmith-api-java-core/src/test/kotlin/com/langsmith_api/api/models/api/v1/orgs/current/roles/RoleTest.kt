// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.roles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgs.current.members.AccessScope
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleTest {

    @Test
    fun create() {
        val role =
            Role.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .displayName("display_name")
                .name("name")
                .addPermission("string")
                .accessScope(AccessScope.ORGANIZATION)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(role.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(role.description()).isEqualTo("description")
        assertThat(role.displayName()).isEqualTo("display_name")
        assertThat(role.name()).isEqualTo("name")
        assertThat(role.permissions()).containsExactly("string")
        assertThat(role.accessScope()).contains(AccessScope.ORGANIZATION)
        assertThat(role.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val role =
            Role.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .displayName("display_name")
                .name("name")
                .addPermission("string")
                .accessScope(AccessScope.ORGANIZATION)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedRole =
            jsonMapper.readValue(jsonMapper.writeValueAsString(role), jacksonTypeRef<Role>())

        assertThat(roundtrippedRole).isEqualTo(role)
    }
}
