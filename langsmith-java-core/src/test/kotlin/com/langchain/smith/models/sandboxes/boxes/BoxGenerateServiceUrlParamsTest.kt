// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxGenerateServiceUrlParamsTest {

    @Test
    fun create() {
        BoxGenerateServiceUrlParams.builder().name("name").expiresInSeconds(0L).port(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BoxGenerateServiceUrlParams.builder().name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BoxGenerateServiceUrlParams.builder().name("name").expiresInSeconds(0L).port(0L).build()

        val body = params._body()

        assertThat(body.expiresInSeconds()).contains(0L)
        assertThat(body.port()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxGenerateServiceUrlParams.builder().name("name").build()

        val body = params._body()
    }
}
