// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DemoConfigTest {

    @Test
    fun create() {
        val demoConfig =
            DemoConfig.builder()
                .addExample(
                    DemoConfig.Example.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .messageIndex(0L)
                .metaprompt(
                    DemoConfig.Metaprompt.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .overallFeedback("overall_feedback")
                .build()

        assertThat(demoConfig.examples())
            .containsExactly(
                DemoConfig.Example.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(demoConfig.messageIndex()).isEqualTo(0L)
        assertThat(demoConfig.metaprompt())
            .isEqualTo(
                DemoConfig.Metaprompt.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(demoConfig.overallFeedback()).contains("overall_feedback")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val demoConfig =
            DemoConfig.builder()
                .addExample(
                    DemoConfig.Example.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .messageIndex(0L)
                .metaprompt(
                    DemoConfig.Metaprompt.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
