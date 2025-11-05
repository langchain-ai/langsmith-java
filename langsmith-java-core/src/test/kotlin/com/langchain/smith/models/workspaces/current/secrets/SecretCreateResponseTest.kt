// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretCreateResponseTest {

    @Test
    fun create() {
        val secretCreateResponse = SecretCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretCreateResponse = SecretCreateResponse.builder().build()

        val roundtrippedSecretCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretCreateResponse),
                jacksonTypeRef<SecretCreateResponse>(),
            )

        assertThat(roundtrippedSecretCreateResponse).isEqualTo(secretCreateResponse)
    }
}
