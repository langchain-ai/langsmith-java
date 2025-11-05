// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.servicekeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateResponseTest {

    @Test
    fun create() {
        val apiKeyCreateResponse =
            ApiKeyCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .key("key")
                .shortKey("short_key")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .readOnly(true)
                .addWorkspaceName("string")
                .build()

        assertThat(apiKeyCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateResponse.description()).isEqualTo("description")
        assertThat(apiKeyCreateResponse.key()).isEqualTo("key")
        assertThat(apiKeyCreateResponse.shortKey()).isEqualTo("short_key")
        assertThat(apiKeyCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyCreateResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyCreateResponse.lastUsedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyCreateResponse.readOnly()).contains(true)
        assertThat(apiKeyCreateResponse.workspaceNames().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyCreateResponse =
            ApiKeyCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .key("key")
                .shortKey("short_key")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .readOnly(true)
                .addWorkspaceName("string")
                .build()

        val roundtrippedApiKeyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyCreateResponse),
                jacksonTypeRef<ApiKeyCreateResponse>(),
            )

        assertThat(roundtrippedApiKeyCreateResponse).isEqualTo(apiKeyCreateResponse)
    }
}
