// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOnlineEvaluatorRequestTest {

    @Test
    fun create() {
        val createOnlineEvaluatorRequest =
            CreateOnlineEvaluatorRequest.builder()
                .codeEvaluator(
                    CreateOnlineCodeEvaluatorRequest.builder()
                        .advancedFeaturesEnabled(true)
                        .code("code")
                        .dependencies("dependencies")
                        .language("language")
                        .managedCodeEvaluatorKey(
                            CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorKey.VOICE_METRICS
                        )
                        .managedCodeEvaluatorSettings(
                            CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("is_enabled" to true, "key_name" to "key_name")
                                    ),
                                )
                                .build()
                        )
                        .requireAttachments(true)
                        .build()
                )
                .llmEvaluator(
                    CreateOnlineLlmEvaluatorRequest.builder()
                        .commitHashOrTag("commit_hash_or_tag")
                        .playgroundSettingsId("playground_settings_id")
                        .promptRepoHandle("prompt_repo_handle")
                        .variableMapping(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .name("name")
                .type(OnlineEvaluatorType.LLM)
                .build()

        assertThat(createOnlineEvaluatorRequest.codeEvaluator())
            .contains(
                CreateOnlineCodeEvaluatorRequest.builder()
                    .advancedFeaturesEnabled(true)
                    .code("code")
                    .dependencies("dependencies")
                    .language("language")
                    .managedCodeEvaluatorKey(
                        CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorKey.VOICE_METRICS
                    )
                    .managedCodeEvaluatorSettings(
                        CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf("is_enabled" to true, "key_name" to "key_name")
                                ),
                            )
                            .build()
                    )
                    .requireAttachments(true)
                    .build()
            )
        assertThat(createOnlineEvaluatorRequest.llmEvaluator())
            .contains(
                CreateOnlineLlmEvaluatorRequest.builder()
                    .commitHashOrTag("commit_hash_or_tag")
                    .playgroundSettingsId("playground_settings_id")
                    .promptRepoHandle("prompt_repo_handle")
                    .variableMapping(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(createOnlineEvaluatorRequest.name()).contains("name")
        assertThat(createOnlineEvaluatorRequest.type()).contains(OnlineEvaluatorType.LLM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOnlineEvaluatorRequest =
            CreateOnlineEvaluatorRequest.builder()
                .codeEvaluator(
                    CreateOnlineCodeEvaluatorRequest.builder()
                        .advancedFeaturesEnabled(true)
                        .code("code")
                        .dependencies("dependencies")
                        .language("language")
                        .managedCodeEvaluatorKey(
                            CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorKey.VOICE_METRICS
                        )
                        .managedCodeEvaluatorSettings(
                            CreateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("is_enabled" to true, "key_name" to "key_name")
                                    ),
                                )
                                .build()
                        )
                        .requireAttachments(true)
                        .build()
                )
                .llmEvaluator(
                    CreateOnlineLlmEvaluatorRequest.builder()
                        .commitHashOrTag("commit_hash_or_tag")
                        .playgroundSettingsId("playground_settings_id")
                        .promptRepoHandle("prompt_repo_handle")
                        .variableMapping(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .name("name")
                .type(OnlineEvaluatorType.LLM)
                .build()

        val roundtrippedCreateOnlineEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createOnlineEvaluatorRequest),
                jacksonTypeRef<CreateOnlineEvaluatorRequest>(),
            )

        assertThat(roundtrippedCreateOnlineEvaluatorRequest).isEqualTo(createOnlineEvaluatorRequest)
    }
}
