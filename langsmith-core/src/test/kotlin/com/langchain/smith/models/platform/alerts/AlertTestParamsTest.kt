// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.alerts

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertTestParamsTest {

    @Test
    fun create() {
        AlertTestParams.builder().sessionId(JsonValue.from(mapOf<String, Any>())).build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertTestParams.builder().sessionId(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
