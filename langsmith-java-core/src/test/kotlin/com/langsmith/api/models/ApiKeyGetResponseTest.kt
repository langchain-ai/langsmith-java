// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApiKeyGetResponseTest {

    @Test
    fun createApiKeyGetResponse() {
        val apiKeyGetResponse =
            ApiKeyGetResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .shortKey("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(apiKeyGetResponse).isNotNull
        assertThat(apiKeyGetResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyGetResponse.readOnly()).isEqualTo(true)
        assertThat(apiKeyGetResponse.shortKey()).isEqualTo("string")
        assertThat(apiKeyGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
