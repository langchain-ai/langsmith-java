// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.alerts

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertRetrieveParamsTest {

    @Test
    fun create() {
        AlertRetrieveParams.builder()
            .sessionId(JsonValue.from(mapOf<String, Any>()))
            .alertRuleId(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertRetrieveParams.builder()
                .sessionId(JsonValue.from(mapOf<String, Any>()))
                .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        assertThat(params._pathParam(1)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
