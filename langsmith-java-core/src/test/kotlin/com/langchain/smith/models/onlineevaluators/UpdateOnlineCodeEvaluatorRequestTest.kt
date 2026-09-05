// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateOnlineCodeEvaluatorRequestTest {

    @Test
    fun create() {
        val updateOnlineCodeEvaluatorRequest =
            UpdateOnlineCodeEvaluatorRequest.builder()
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .addWorkspaceSecretsKey("string")
                .build()

        assertThat(updateOnlineCodeEvaluatorRequest.code()).contains("code")
        assertThat(updateOnlineCodeEvaluatorRequest.dependencies()).contains("dependencies")
        assertThat(updateOnlineCodeEvaluatorRequest.language()).contains("language")
        assertThat(updateOnlineCodeEvaluatorRequest.workspaceSecretsKeys().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateOnlineCodeEvaluatorRequest =
            UpdateOnlineCodeEvaluatorRequest.builder()
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .addWorkspaceSecretsKey("string")
                .build()

        val roundtrippedUpdateOnlineCodeEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateOnlineCodeEvaluatorRequest),
                jacksonTypeRef<UpdateOnlineCodeEvaluatorRequest>(),
            )

        assertThat(roundtrippedUpdateOnlineCodeEvaluatorRequest)
            .isEqualTo(updateOnlineCodeEvaluatorRequest)
    }
}
