// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorCreateDecisionModelParamsTest {

    @Test
    fun create() {
        EvaluatorCreateDecisionModelParams.builder()
            .displayName("display_name")
            .addPrompt(
                listOf(JsonValue.from(mapOf<String, Any>()), JsonValue.from(mapOf<String, Any>()))
            )
            .questions(
                EvaluatorCreateDecisionModelParams.Questions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "instructions" to "instructions",
                                "type" to "noul",
                                "levels" to listOf("string"),
                                "no" to "no",
                                "options" to listOf("string"),
                                "yes" to "yes",
                            )
                        ),
                    )
                    .build()
            )
            .baseUrl("base_url")
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter("filter")
            .maxRetries(0L)
            .model("model")
            .modelHeaders(
                EvaluatorCreateDecisionModelParams.ModelHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .playgroundSettingsId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .provider(EvaluatorCreateDecisionModelParams.Provider.TYPESAFE)
            .samplingRate(0.0)
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .templateFormat(EvaluatorCreateDecisionModelParams.TemplateFormat.MUSTACHE)
            .timeoutSeconds(0L)
            .variableMapping(
                EvaluatorCreateDecisionModelParams.VariableMapping.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EvaluatorCreateDecisionModelParams.builder()
                .displayName("display_name")
                .addPrompt(
                    listOf(
                        JsonValue.from(mapOf<String, Any>()),
                        JsonValue.from(mapOf<String, Any>()),
                    )
                )
                .questions(
                    EvaluatorCreateDecisionModelParams.Questions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "instructions" to "instructions",
                                    "type" to "noul",
                                    "levels" to listOf("string"),
                                    "no" to "no",
                                    "options" to listOf("string"),
                                    "yes" to "yes",
                                )
                            ),
                        )
                        .build()
                )
                .baseUrl("base_url")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter("filter")
                .maxRetries(0L)
                .model("model")
                .modelHeaders(
                    EvaluatorCreateDecisionModelParams.ModelHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .playgroundSettingsId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .provider(EvaluatorCreateDecisionModelParams.Provider.TYPESAFE)
                .samplingRate(0.0)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .templateFormat(EvaluatorCreateDecisionModelParams.TemplateFormat.MUSTACHE)
                .timeoutSeconds(0L)
                .variableMapping(
                    EvaluatorCreateDecisionModelParams.VariableMapping.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.prompt())
            .containsExactly(
                listOf(JsonValue.from(mapOf<String, Any>()), JsonValue.from(mapOf<String, Any>()))
            )
        assertThat(body.questions())
            .isEqualTo(
                EvaluatorCreateDecisionModelParams.Questions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "instructions" to "instructions",
                                "type" to "noul",
                                "levels" to listOf("string"),
                                "no" to "no",
                                "options" to listOf("string"),
                                "yes" to "yes",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.baseUrl()).contains("base_url")
        assertThat(body.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.filter()).contains("filter")
        assertThat(body.maxRetries()).contains(0L)
        assertThat(body.model()).contains("model")
        assertThat(body.modelHeaders())
            .contains(
                EvaluatorCreateDecisionModelParams.ModelHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.playgroundSettingsId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.provider()).contains(EvaluatorCreateDecisionModelParams.Provider.TYPESAFE)
        assertThat(body.samplingRate()).contains(0.0)
        assertThat(body.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.templateFormat())
            .contains(EvaluatorCreateDecisionModelParams.TemplateFormat.MUSTACHE)
        assertThat(body.timeoutSeconds()).contains(0L)
        assertThat(body.variableMapping())
            .contains(
                EvaluatorCreateDecisionModelParams.VariableMapping.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EvaluatorCreateDecisionModelParams.builder()
                .displayName("display_name")
                .addPrompt(
                    listOf(
                        JsonValue.from(mapOf<String, Any>()),
                        JsonValue.from(mapOf<String, Any>()),
                    )
                )
                .questions(
                    EvaluatorCreateDecisionModelParams.Questions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf("instructions" to "instructions", "type" to "noul")
                            ),
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.prompt())
            .containsExactly(
                listOf(JsonValue.from(mapOf<String, Any>()), JsonValue.from(mapOf<String, Any>()))
            )
        assertThat(body.questions())
            .isEqualTo(
                EvaluatorCreateDecisionModelParams.Questions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("instructions" to "instructions", "type" to "noul")),
                    )
                    .build()
            )
    }
}
