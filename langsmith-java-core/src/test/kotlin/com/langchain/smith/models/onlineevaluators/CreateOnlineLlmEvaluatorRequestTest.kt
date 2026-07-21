// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOnlineLlmEvaluatorRequestTest {

    @Test
    fun create() {
        val createOnlineLlmEvaluatorRequest =
            CreateOnlineLlmEvaluatorRequest.builder()
                .commitHashOrTag("commit_hash_or_tag")
                .playgroundSettingsId("playground_settings_id")
                .promptRepoHandle("prompt_repo_handle")
                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(createOnlineLlmEvaluatorRequest.commitHashOrTag()).contains("commit_hash_or_tag")
        assertThat(createOnlineLlmEvaluatorRequest.playgroundSettingsId())
            .contains("playground_settings_id")
        assertThat(createOnlineLlmEvaluatorRequest.promptRepoHandle())
            .contains("prompt_repo_handle")
        assertThat(createOnlineLlmEvaluatorRequest._variableMapping())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOnlineLlmEvaluatorRequest =
            CreateOnlineLlmEvaluatorRequest.builder()
                .commitHashOrTag("commit_hash_or_tag")
                .playgroundSettingsId("playground_settings_id")
                .promptRepoHandle("prompt_repo_handle")
                .variableMapping(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedCreateOnlineLlmEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createOnlineLlmEvaluatorRequest),
                jacksonTypeRef<CreateOnlineLlmEvaluatorRequest>(),
            )

        assertThat(roundtrippedCreateOnlineLlmEvaluatorRequest)
            .isEqualTo(createOnlineLlmEvaluatorRequest)
    }
}
