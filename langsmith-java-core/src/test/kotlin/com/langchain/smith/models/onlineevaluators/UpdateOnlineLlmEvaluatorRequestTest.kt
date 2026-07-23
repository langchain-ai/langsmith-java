// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateOnlineLlmEvaluatorRequestTest {

    @Test
    fun create() {
        val updateOnlineLlmEvaluatorRequest =
            UpdateOnlineLlmEvaluatorRequest.builder()
                .commitHashOrTag("commit_hash_or_tag")
                .numFewShotExamples(0L)
                .playgroundSettingsId("playground_settings_id")
                .promptRepoHandle("prompt_repo_handle")
                .useCorrectionsDataset(true)
                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(updateOnlineLlmEvaluatorRequest.commitHashOrTag()).contains("commit_hash_or_tag")
        assertThat(updateOnlineLlmEvaluatorRequest.numFewShotExamples()).contains(0L)
        assertThat(updateOnlineLlmEvaluatorRequest.playgroundSettingsId())
            .contains("playground_settings_id")
        assertThat(updateOnlineLlmEvaluatorRequest.promptRepoHandle())
            .contains("prompt_repo_handle")
        assertThat(updateOnlineLlmEvaluatorRequest.useCorrectionsDataset()).contains(true)
        assertThat(updateOnlineLlmEvaluatorRequest._variableMapping())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateOnlineLlmEvaluatorRequest =
            UpdateOnlineLlmEvaluatorRequest.builder()
                .commitHashOrTag("commit_hash_or_tag")
                .numFewShotExamples(0L)
                .playgroundSettingsId("playground_settings_id")
                .promptRepoHandle("prompt_repo_handle")
                .useCorrectionsDataset(true)
                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedUpdateOnlineLlmEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateOnlineLlmEvaluatorRequest),
                jacksonTypeRef<UpdateOnlineLlmEvaluatorRequest>(),
            )

        assertThat(roundtrippedUpdateOnlineLlmEvaluatorRequest)
            .isEqualTo(updateOnlineLlmEvaluatorRequest)
    }
}
