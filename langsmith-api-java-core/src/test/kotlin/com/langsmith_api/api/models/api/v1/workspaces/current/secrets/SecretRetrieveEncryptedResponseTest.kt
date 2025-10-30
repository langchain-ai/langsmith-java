// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretRetrieveEncryptedResponseTest {

    @Test
    fun create() {
        val secretRetrieveEncryptedResponse =
            SecretRetrieveEncryptedResponse.builder().encryptedSecrets("encrypted_secrets").build()

        assertThat(secretRetrieveEncryptedResponse.encryptedSecrets())
            .isEqualTo("encrypted_secrets")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretRetrieveEncryptedResponse =
            SecretRetrieveEncryptedResponse.builder().encryptedSecrets("encrypted_secrets").build()

        val roundtrippedSecretRetrieveEncryptedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretRetrieveEncryptedResponse),
                jacksonTypeRef<SecretRetrieveEncryptedResponse>(),
            )

        assertThat(roundtrippedSecretRetrieveEncryptedResponse)
            .isEqualTo(secretRetrieveEncryptedResponse)
    }
}
