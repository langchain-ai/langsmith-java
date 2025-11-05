// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberBatchParamsTest {

    @Test
    fun create() {
        MemberBatchParams.builder()
            .addBody(
                PendingIdentityCreate.builder()
                    .email("email")
                    .fullName("full_name")
                    .password("password")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MemberBatchParams.builder()
                .addBody(
                    PendingIdentityCreate.builder()
                        .email("email")
                        .fullName("full_name")
                        .password("password")
                        .readOnly(true)
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                PendingIdentityCreate.builder()
                    .email("email")
                    .fullName("full_name")
                    .password("password")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MemberBatchParams.builder()
                .addBody(PendingIdentityCreate.builder().email("email").build())
                .build()

        val body = params._body()

        assertThat(body).containsExactly(PendingIdentityCreate.builder().email("email").build())
    }
}
