// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.servicekeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateRequestTest {

    @Test
    fun create() {
        val apiKeyCreateRequest =
            ApiKeyCreateRequest.builder()
                .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(apiKeyCreateRequest.defaultWorkspaceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateRequest.description()).contains("description")
        assertThat(apiKeyCreateRequest.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyCreateRequest.orgRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateRequest.readOnly()).contains(true)
        assertThat(apiKeyCreateRequest.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateRequest.workspaces().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyCreateRequest =
            ApiKeyCreateRequest.builder()
                .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWorkspace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedApiKeyCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyCreateRequest),
                jacksonTypeRef<ApiKeyCreateRequest>(),
            )

        assertThat(roundtrippedApiKeyCreateRequest).isEqualTo(apiKeyCreateRequest)
    }
}
