// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.registries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegistryCreateParamsTest {

    @Test
    fun create() {
        RegistryCreateParams.builder()
            .name("name")
            .password("password")
            .url("url")
            .username("username")
            .build()
    }

    @Test
    fun body() {
        val params =
            RegistryCreateParams.builder()
                .name("name")
                .password("password")
                .url("url")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.password()).isEqualTo("password")
        assertThat(body.url()).isEqualTo("url")
        assertThat(body.username()).isEqualTo("username")
    }
}
