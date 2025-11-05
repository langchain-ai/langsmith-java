// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.secrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretCreateParamsTest {

    @Test
    fun create() {
        SecretCreateParams.builder()
            .addBody(SecretCreateParams.Body.builder().key("key").value("value").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            SecretCreateParams.builder()
                .addBody(SecretCreateParams.Body.builder().key("key").value("value").build())
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(SecretCreateParams.Body.builder().key("key").value("value").build())
    }
}
