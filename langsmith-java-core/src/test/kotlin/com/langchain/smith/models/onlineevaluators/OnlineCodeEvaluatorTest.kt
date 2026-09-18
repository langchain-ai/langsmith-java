// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineCodeEvaluatorTest {

    @Test
    fun create() {
        val onlineCodeEvaluator =
            OnlineCodeEvaluator.builder()
                .advancedFeaturesEnabled(true)
                .code("code")
                .dependencies("dependencies")
                .evaluatorBuildError("evaluator_build_error")
                .evaluatorBuildStatus(OnlineCodeEvaluator.EvaluatorBuildStatus.ENQUEUED)
                .evaluatorId("evaluator_id")
                .language("language")
                .managedCodeEvaluatorKey("managed_code_evaluator_key")
                .managedCodeEvaluatorSettings(
                    OnlineCodeEvaluator.ManagedCodeEvaluatorSettings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                        )
                        .build()
                )
                .build()

        assertThat(onlineCodeEvaluator.advancedFeaturesEnabled()).contains(true)
        assertThat(onlineCodeEvaluator.code()).contains("code")
        assertThat(onlineCodeEvaluator.dependencies()).contains("dependencies")
        assertThat(onlineCodeEvaluator.evaluatorBuildError()).contains("evaluator_build_error")
        assertThat(onlineCodeEvaluator.evaluatorBuildStatus())
            .contains(OnlineCodeEvaluator.EvaluatorBuildStatus.ENQUEUED)
        assertThat(onlineCodeEvaluator.evaluatorId()).contains("evaluator_id")
        assertThat(onlineCodeEvaluator.language()).contains("language")
        assertThat(onlineCodeEvaluator.managedCodeEvaluatorKey())
            .contains("managed_code_evaluator_key")
        assertThat(onlineCodeEvaluator.managedCodeEvaluatorSettings())
            .contains(
                OnlineCodeEvaluator.ManagedCodeEvaluatorSettings.builder()
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
        val onlineCodeEvaluator =
            OnlineCodeEvaluator.builder()
                .advancedFeaturesEnabled(true)
                .code("code")
                .dependencies("dependencies")
                .evaluatorBuildError("evaluator_build_error")
                .evaluatorBuildStatus(OnlineCodeEvaluator.EvaluatorBuildStatus.ENQUEUED)
                .evaluatorId("evaluator_id")
                .language("language")
                .managedCodeEvaluatorKey("managed_code_evaluator_key")
                .managedCodeEvaluatorSettings(
                    OnlineCodeEvaluator.ManagedCodeEvaluatorSettings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                        )
                        .build()
                )
                .build()

        val roundtrippedOnlineCodeEvaluator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineCodeEvaluator),
                jacksonTypeRef<OnlineCodeEvaluator>(),
            )

        assertThat(roundtrippedOnlineCodeEvaluator).isEqualTo(onlineCodeEvaluator)
    }
}
