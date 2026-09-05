// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOnlineCodeEvaluatorRequestTest {

    @Test
    fun create() {
        val createOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest.builder()
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .addWorkspaceSecretsKey("string")
                .build()

        assertThat(createOnlineCodeEvaluatorRequest.code()).contains("code")
        assertThat(createOnlineCodeEvaluatorRequest.dependencies()).contains("dependencies")
        assertThat(createOnlineCodeEvaluatorRequest.language()).contains("language")
        assertThat(createOnlineCodeEvaluatorRequest.workspaceSecretsKeys().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest.builder()
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .addWorkspaceSecretsKey("string")
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
