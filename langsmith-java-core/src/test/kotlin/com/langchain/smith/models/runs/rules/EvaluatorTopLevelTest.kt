// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorTopLevelTest {

    @Test
    fun create() {
        val evaluatorTopLevel =
            EvaluatorTopLevel.builder()
                .structured(
                    EvaluatorTopLevel.Structured.builder()
                        .hubRef("hub_ref")
                        .model(JsonValue.from(mapOf<String, Any>()))
                        .addPrompt(
                            listOf(
                                JsonValue.from(mapOf<String, Any>()),
                                JsonValue.from(mapOf<String, Any>()),
                            )
                        )
                        .schema(JsonValue.from(mapOf<String, Any>()))
                        .templateFormat("template_format")
                        .variableMapping(
                            EvaluatorTopLevel.Structured.VariableMapping.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(evaluatorTopLevel.structured())
            .isEqualTo(
                EvaluatorTopLevel.Structured.builder()
                    .hubRef("hub_ref")
                    .model(JsonValue.from(mapOf<String, Any>()))
                    .addPrompt(
                        listOf(
                            JsonValue.from(mapOf<String, Any>()),
                            JsonValue.from(mapOf<String, Any>()),
                        )
                    )
                    .schema(JsonValue.from(mapOf<String, Any>()))
                    .templateFormat("template_format")
                    .variableMapping(
                        EvaluatorTopLevel.Structured.VariableMapping.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evaluatorTopLevel =
            EvaluatorTopLevel.builder()
                .structured(
                    EvaluatorTopLevel.Structured.builder()
                        .hubRef("hub_ref")
                        .model(JsonValue.from(mapOf<String, Any>()))
                        .addPrompt(
                            listOf(
                                JsonValue.from(mapOf<String, Any>()),
                                JsonValue.from(mapOf<String, Any>()),
                            )
                        )
                        .schema(JsonValue.from(mapOf<String, Any>()))
                        .templateFormat("template_format")
                        .variableMapping(
                            EvaluatorTopLevel.Structured.VariableMapping.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEvaluatorTopLevel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluatorTopLevel),
                jacksonTypeRef<EvaluatorTopLevel>(),
            )

        assertThat(roundtrippedEvaluatorTopLevel).isEqualTo(evaluatorTopLevel)
    }
}
