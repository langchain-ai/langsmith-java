// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.ace

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AceExecuteParamsTest {

    @Test
    fun create() {
        AceExecuteParams.builder()
            .addArg(JsonValue.from(mapOf<String, Any>()))
            .code("code")
            .language("language")
            .build()
    }

    @Test
    fun body() {
        val params =
            AceExecuteParams.builder()
                .addArg(JsonValue.from(mapOf<String, Any>()))
                .code("code")
                .language("language")
                .build()

        val body = params._body()

        assertThat(body.args()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.code()).isEqualTo("code")
        assertThat(body.language()).isEqualTo("language")
    }
}
