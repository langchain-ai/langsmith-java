// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingIdentityCreateTest {

    @Test
    fun create() {
        val pendingIdentityCreate =
            PendingIdentityCreate.builder()
                .email("email")
                .fullName("full_name")
                .password("password")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(pendingIdentityCreate.email()).isEqualTo("email")
        assertThat(pendingIdentityCreate.fullName()).contains("full_name")
        assertThat(pendingIdentityCreate.password()).contains("password")
        assertThat(pendingIdentityCreate.readOnly()).contains(true)
        assertThat(pendingIdentityCreate.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentityCreate.workspaceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingIdentityCreate.workspaceRoleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingIdentityCreate =
            PendingIdentityCreate.builder()
                .email("email")
                .fullName("full_name")
                .password("password")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPendingIdentityCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingIdentityCreate),
                jacksonTypeRef<PendingIdentityCreate>(),
            )

        assertThat(roundtrippedPendingIdentityCreate).isEqualTo(pendingIdentityCreate)
    }
}
