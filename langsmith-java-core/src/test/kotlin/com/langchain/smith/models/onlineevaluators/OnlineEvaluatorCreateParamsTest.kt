// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorCreateParamsTest {

    @Test
    fun create() {
        OnlineEvaluatorCreateParams.builder()
            .createOnlineEvaluatorRequest(
                CreateOnlineEvaluatorRequest.builder()
                    .codeEvaluator(
                        CreateOnlineCodeEvaluatorRequest.builder()
                            .code("code")
                            .language("language")
                            .build()
                    )
                    .llmEvaluator(
                        CreateOnlineLlmEvaluatorRequest.builder()
                            .commitHashOrTag("commit_hash_or_tag")
                            .promptRepoHandle("prompt_repo_handle")
                            .variableMapping(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .type(OnlineEvaluatorType.LLM)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OnlineEvaluatorCreateParams.builder()
                .createOnlineEvaluatorRequest(
                    CreateOnlineEvaluatorRequest.builder()
                        .codeEvaluator(
                            CreateOnlineCodeEvaluatorRequest.builder()
                                .code("code")
                                .language("language")
                                .build()
                        )
                        .llmEvaluator(
                            CreateOnlineLlmEvaluatorRequest.builder()
                                .commitHashOrTag("commit_hash_or_tag")
                                .promptRepoHandle("prompt_repo_handle")
                                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .name("name")
                        .type(OnlineEvaluatorType.LLM)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateOnlineEvaluatorRequest.builder()
                    .codeEvaluator(
                        CreateOnlineCodeEvaluatorRequest.builder()
                            .code("code")
                            .language("language")
                            .build()
                    )
                    .llmEvaluator(
                        CreateOnlineLlmEvaluatorRequest.builder()
                            .commitHashOrTag("commit_hash_or_tag")
                            .promptRepoHandle("prompt_repo_handle")
                            .variableMapping(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .type(OnlineEvaluatorType.LLM)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnlineEvaluatorCreateParams.builder()
                .createOnlineEvaluatorRequest(CreateOnlineEvaluatorRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CreateOnlineEvaluatorRequest.builder().build())
    }
}
