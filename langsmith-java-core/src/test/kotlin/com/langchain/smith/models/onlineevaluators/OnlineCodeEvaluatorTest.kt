// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineCodeEvaluatorTest {

    @Test
    fun create() {
        val onlineCodeEvaluator =
            OnlineCodeEvaluator.builder()
                .code("code")
                .evaluatorId("evaluator_id")
                .language("language")
                .build()

        assertThat(onlineCodeEvaluator.code()).contains("code")
        assertThat(onlineCodeEvaluator.evaluatorId()).contains("evaluator_id")
        assertThat(onlineCodeEvaluator.language()).contains("language")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineCodeEvaluator =
            OnlineCodeEvaluator.builder()
                .code("code")
                .evaluatorId("evaluator_id")
                .language("language")
                .build()

        val roundtrippedOnlineCodeEvaluator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineCodeEvaluator),
                jacksonTypeRef<OnlineCodeEvaluator>(),
            )

        assertThat(roundtrippedOnlineCodeEvaluator).isEqualTo(onlineCodeEvaluator)
    }
}
