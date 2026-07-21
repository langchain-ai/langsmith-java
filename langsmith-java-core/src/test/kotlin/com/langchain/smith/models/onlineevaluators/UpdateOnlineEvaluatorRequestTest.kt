// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateOnlineEvaluatorRequestTest {

    @Test
    fun create() {
        val updateOnlineEvaluatorRequest =
            UpdateOnlineEvaluatorRequest.builder()
                .codeEvaluator(
                    UpdateOnlineCodeEvaluatorRequest.builder()
                        .code("code")
                        .language("language")
                        .build()
                )
                .llmEvaluator(
                    UpdateOnlineLlmEvaluatorRequest.builder()
                        .commitHashOrTag("commit_hash_or_tag")
                        .numFewShotExamples(0L)
                        .playgroundSettingsId("playground_settings_id")
                        .promptRepoHandle("prompt_repo_handle")
                        .useCorrectionsDataset(true)
                        .variableMapping(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .name("name")
                .build()

        assertThat(updateOnlineEvaluatorRequest.codeEvaluator())
            .contains(
                UpdateOnlineCodeEvaluatorRequest.builder().code("code").language("language").build()
            )
        assertThat(updateOnlineEvaluatorRequest.llmEvaluator())
            .contains(
                UpdateOnlineLlmEvaluatorRequest.builder()
                    .commitHashOrTag("commit_hash_or_tag")
                    .numFewShotExamples(0L)
                    .playgroundSettingsId("playground_settings_id")
                    .promptRepoHandle("prompt_repo_handle")
                    .useCorrectionsDataset(true)
                    .variableMapping(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(updateOnlineEvaluatorRequest.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateOnlineEvaluatorRequest =
            UpdateOnlineEvaluatorRequest.builder()
                .codeEvaluator(
                    UpdateOnlineCodeEvaluatorRequest.builder()
                        .code("code")
                        .language("language")
                        .build()
                )
                .llmEvaluator(
                    UpdateOnlineLlmEvaluatorRequest.builder()
                        .commitHashOrTag("commit_hash_or_tag")
                        .numFewShotExamples(0L)
                        .playgroundSettingsId("playground_settings_id")
                        .promptRepoHandle("prompt_repo_handle")
                        .useCorrectionsDataset(true)
                        .variableMapping(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .name("name")
                .build()

        val roundtrippedUpdateOnlineEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateOnlineEvaluatorRequest),
                jacksonTypeRef<UpdateOnlineEvaluatorRequest>(),
            )

        assertThat(roundtrippedUpdateOnlineEvaluatorRequest).isEqualTo(updateOnlineEvaluatorRequest)
    }
}
