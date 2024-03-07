// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApiKeyCreateResponseTest {

    @Test
    fun createApiKeyCreateResponse() {
        val apiKeyCreateResponse =
            ApiKeyCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("string")
                .readOnly(true)
                .shortKey("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(apiKeyCreateResponse).isNotNull
        assertThat(apiKeyCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateResponse.key()).isEqualTo("string")
        assertThat(apiKeyCreateResponse.readOnly()).isEqualTo(true)
        assertThat(apiKeyCreateResponse.shortKey()).isEqualTo("string")
        assertThat(apiKeyCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
