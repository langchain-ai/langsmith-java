// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.registries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegistryUpdateParamsTest {

    @Test
    fun create() {
        RegistryUpdateParams.builder()
            .pathName("name")
            .bodyName("name")
            .password("password")
            .url("url")
            .username("username")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RegistryUpdateParams.builder().pathName("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RegistryUpdateParams.builder()
                .pathName("name")
                .bodyName("name")
                .password("password")
                .url("url")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.bodyName()).contains("name")
        assertThat(body.password()).contains("password")
        assertThat(body.url()).contains("url")
        assertThat(body.username()).contains("username")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RegistryUpdateParams.builder().pathName("name").build()

        val body = params._body()
    }
}
