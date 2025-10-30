// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretListResponseTest {

    @Test
    fun create() {
        val secretListResponse = SecretListResponse.builder().key("key").build()

        assertThat(secretListResponse.key()).isEqualTo("key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretListResponse = SecretListResponse.builder().key("key").build()

        val roundtrippedSecretListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretListResponse),
                jacksonTypeRef<SecretListResponse>(),
            )

        assertThat(roundtrippedSecretListResponse).isEqualTo(secretListResponse)
    }
}
