// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.servicekeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyGetResponseTest {

    @Test
    fun create() {
        val apiKeyGetResponse =
            ApiKeyGetResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .shortKey("short_key")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .readOnly(true)
                .addWorkspaceName("string")
                .build()

        assertThat(apiKeyGetResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyGetResponse.description()).isEqualTo("description")
        assertThat(apiKeyGetResponse.shortKey()).isEqualTo("short_key")
        assertThat(apiKeyGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyGetResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyGetResponse.lastUsedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyGetResponse.readOnly()).contains(true)
        assertThat(apiKeyGetResponse.workspaceNames().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyGetResponse =
            ApiKeyGetResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .shortKey("short_key")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .readOnly(true)
                .addWorkspaceName("string")
                .build()

        val roundtrippedApiKeyGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyGetResponse),
                jacksonTypeRef<ApiKeyGetResponse>(),
            )

        assertThat(roundtrippedApiKeyGetResponse).isEqualTo(apiKeyGetResponse)
    }
}
