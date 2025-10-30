// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.serviceaccounts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceAccountServiceAccountsParamsTest {

    @Test
    fun create() {
        ServiceAccountServiceAccountsParams.builder()
            .name("name")
            .addWorkspace(
                ServiceAccountServiceAccountsParams.Workspace.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ServiceAccountServiceAccountsParams.builder()
                .name("name")
                .addWorkspace(
                    ServiceAccountServiceAccountsParams.Workspace.builder()
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.workspaces().getOrNull())
            .containsExactly(
                ServiceAccountServiceAccountsParams.Workspace.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ServiceAccountServiceAccountsParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
