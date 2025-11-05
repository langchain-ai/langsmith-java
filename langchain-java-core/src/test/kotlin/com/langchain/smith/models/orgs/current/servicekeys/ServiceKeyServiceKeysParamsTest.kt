// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.servicekeys

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceKeyServiceKeysParamsTest {

    @Test
    fun create() {
        ServiceKeyServiceKeysParams.builder()
            .apiKeyCreateRequest(
                ApiKeyCreateRequest.builder()
                    .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ServiceKeyServiceKeysParams.builder()
                .apiKeyCreateRequest(
                    ApiKeyCreateRequest.builder()
                        .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .readOnly(true)
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addWorkspace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ApiKeyCreateRequest.builder()
                    .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWorkspace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ServiceKeyServiceKeysParams.builder()
                .apiKeyCreateRequest(ApiKeyCreateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ApiKeyCreateRequest.builder().build())
    }
}
