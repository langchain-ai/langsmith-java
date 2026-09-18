// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOnlineCodeEvaluatorRequestTest {

    @Test
    fun create() {
        val createOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest.builder()
                .advancedFeaturesEnabled(true)
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .managedCodeEvaluatorKey("managed_code_evaluator_key")
                .managedCodeEvaluatorSettings(
                    CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                        )
                        .build()
                )
                .build()

        assertThat(createOnlineCodeEvaluatorRequest.advancedFeaturesEnabled()).contains(true)
        assertThat(createOnlineCodeEvaluatorRequest.code()).contains("code")
        assertThat(createOnlineCodeEvaluatorRequest.dependencies()).contains("dependencies")
        assertThat(createOnlineCodeEvaluatorRequest.language()).contains("language")
        assertThat(createOnlineCodeEvaluatorRequest.managedCodeEvaluatorKey())
            .contains("managed_code_evaluator_key")
        assertThat(createOnlineCodeEvaluatorRequest.managedCodeEvaluatorSettings())
            .contains(
                CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest.builder()
                .advancedFeaturesEnabled(true)
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .managedCodeEvaluatorKey("managed_code_evaluator_key")
                .managedCodeEvaluatorSettings(
                    CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                        )
                        .build()
                )
                .build()

        val roundtrippedCreateOnlineCodeEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createOnlineCodeEvaluatorRequest),
                jacksonTypeRef<CreateOnlineCodeEvaluatorRequest>(),
            )

        assertThat(roundtrippedCreateOnlineCodeEvaluatorRequest)
            .isEqualTo(createOnlineCodeEvaluatorRequest)
    }
}
