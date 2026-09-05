// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineCodeEvaluatorTest {

    @Test
    fun create() {
        val onlineCodeEvaluator =
            OnlineCodeEvaluator.builder()
                .code("code")
                .dependencies("dependencies")
                .evaluatorBuildError("evaluator_build_error")
                .evaluatorBuildStatus(OnlineCodeEvaluator.EvaluatorBuildStatus.ENQUEUED)
                .evaluatorId("evaluator_id")
                .language("language")
                .addWorkspaceSecretsKey("string")
                .build()

        assertThat(onlineCodeEvaluator.code()).contains("code")
        assertThat(onlineCodeEvaluator.dependencies()).contains("dependencies")
        assertThat(onlineCodeEvaluator.evaluatorBuildError()).contains("evaluator_build_error")
        assertThat(onlineCodeEvaluator.evaluatorBuildStatus())
            .contains(OnlineCodeEvaluator.EvaluatorBuildStatus.ENQUEUED)
        assertThat(onlineCodeEvaluator.evaluatorId()).contains("evaluator_id")
        assertThat(onlineCodeEvaluator.language()).contains("language")
        assertThat(onlineCodeEvaluator.workspaceSecretsKeys().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineCodeEvaluator =
            OnlineCodeEvaluator.builder()
                .code("code")
                .dependencies("dependencies")
                .evaluatorBuildError("evaluator_build_error")
                .evaluatorBuildStatus(OnlineCodeEvaluator.EvaluatorBuildStatus.ENQUEUED)
                .evaluatorId("evaluator_id")
                .language("language")
                .addWorkspaceSecretsKey("string")
                .build()

        val roundtrippedOnlineCodeEvaluator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineCodeEvaluator),
                jacksonTypeRef<OnlineCodeEvaluator>(),
            )

        assertThat(roundtrippedOnlineCodeEvaluator).isEqualTo(onlineCodeEvaluator)
    }
}
