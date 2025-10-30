// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CodeEvaluatorTopLevelTest {

    @Test
    fun create() {
        val codeEvaluatorTopLevel =
            CodeEvaluatorTopLevel.builder()
                .code("code")
                .language(CodeEvaluatorTopLevel.Language.PYTHON)
                .build()

        assertThat(codeEvaluatorTopLevel.code()).isEqualTo("code")
        assertThat(codeEvaluatorTopLevel.language()).contains(CodeEvaluatorTopLevel.Language.PYTHON)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val codeEvaluatorTopLevel =
            CodeEvaluatorTopLevel.builder()
                .code("code")
                .language(CodeEvaluatorTopLevel.Language.PYTHON)
                .build()

        val roundtrippedCodeEvaluatorTopLevel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(codeEvaluatorTopLevel),
                jacksonTypeRef<CodeEvaluatorTopLevel>(),
            )

        assertThat(roundtrippedCodeEvaluatorTopLevel).isEqualTo(codeEvaluatorTopLevel)
    }
}
