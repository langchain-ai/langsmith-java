// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorUpdateParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorUpdateParams.builder()
            .evaluatorId("evaluator_id")
            .updateOnlineEvaluatorRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OnlineEvaluatorUpdateParams.builder()
                .evaluatorId("evaluator_id")
                .updateOnlineEvaluatorRequest(UpdateOnlineEvaluatorRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("evaluator_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OnlineEvaluatorUpdateParams.builder()
                .evaluatorId("evaluator_id")
                .updateOnlineEvaluatorRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnlineEvaluatorUpdateParams.builder()
                .evaluatorId("evaluator_id")
                .updateOnlineEvaluatorRequest(UpdateOnlineEvaluatorRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateOnlineEvaluatorRequest.builder().build())
    }
}
