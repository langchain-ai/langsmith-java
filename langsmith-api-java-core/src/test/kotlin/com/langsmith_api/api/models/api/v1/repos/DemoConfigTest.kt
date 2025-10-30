// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DemoConfigTest {

    @Test
    fun create() {
        val demoConfig =
            DemoConfig.builder()
                .addExample(JsonValue.from(mapOf<String, Any>()))
                .messageIndex(0L)
                .metaprompt(JsonValue.from(mapOf<String, Any>()))
                .overallFeedback("overall_feedback")
                .build()

        assertThat(demoConfig.examples()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(demoConfig.messageIndex()).isEqualTo(0L)
        assertThat(demoConfig._metaprompt()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(demoConfig.overallFeedback()).contains("overall_feedback")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val demoConfig =
            DemoConfig.builder()
                .addExample(JsonValue.from(mapOf<String, Any>()))
                .messageIndex(0L)
                .metaprompt(JsonValue.from(mapOf<String, Any>()))
                .overallFeedback("overall_feedback")
                .build()

        val roundtrippedDemoConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(demoConfig),
                jacksonTypeRef<DemoConfig>(),
            )

        assertThat(roundtrippedDemoConfig).isEqualTo(demoConfig)
    }
}
