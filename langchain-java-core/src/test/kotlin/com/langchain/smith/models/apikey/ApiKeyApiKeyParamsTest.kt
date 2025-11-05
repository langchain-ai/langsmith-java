// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.apikey

import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateRequest
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyApiKeyParamsTest {

    @Test
    fun create() {
        ApiKeyApiKeyParams.builder()
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
            ApiKeyApiKeyParams.builder()
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

        val body = params._body().getOrNull()

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
        val params = ApiKeyApiKeyParams.builder().build()

        val body = params._body().getOrNull()
    }
}
