// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacetags.keys.values

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValueCreateParamsTest {

    @Test
    fun create() {
        ValueCreateParams.builder()
            .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .value("x")
            .description("description")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ValueCreateParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ValueCreateParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value("x")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.value()).isEqualTo("x")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ValueCreateParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value("x")
                .build()

        val body = params._body()

        assertThat(body.value()).isEqualTo("x")
    }
}
