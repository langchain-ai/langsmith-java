// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.members.basic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasicBatchParamsTest {

    @Test
    fun create() {
        BasicBatchParams.builder()
            .addBody(
                BasicBatchParams.Body.builder()
                    .email("email")
                    .fullName("full_name")
                    .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .password("password")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BasicBatchParams.builder()
                .addBody(
                    BasicBatchParams.Body.builder()
                        .email("email")
                        .fullName("full_name")
                        .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .password("password")
                        .readOnly(true)
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BasicBatchParams.Body.builder()
                    .email("email")
                    .fullName("full_name")
                    .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .password("password")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BasicBatchParams.builder()
                .addBody(BasicBatchParams.Body.builder().email("email").build())
                .build()

        val body = params._body()

        assertThat(body).containsExactly(BasicBatchParams.Body.builder().email("email").build())
    }
}
