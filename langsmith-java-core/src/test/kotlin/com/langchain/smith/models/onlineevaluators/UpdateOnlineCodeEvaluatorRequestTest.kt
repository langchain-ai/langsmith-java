// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateOnlineCodeEvaluatorRequestTest {

    @Test
    fun create() {
        val updateOnlineCodeEvaluatorRequest =
            UpdateOnlineCodeEvaluatorRequest.builder()
                .advancedFeaturesEnabled(true)
                .code("code")
                .dependencies("dependencies")
                .language("language")
                .build()

        assertThat(updateOnlineCodeEvaluatorRequest.advancedFeaturesEnabled()).contains(true)
        assertThat(updateOnlineCodeEvaluatorRequest.code()).contains("code")
        assertThat(updateOnlineCodeEvaluatorRequest.dependencies()).contains("dependencies")
        assertThat(updateOnlineCodeEvaluatorRequest.language()).contains("language")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateOnlineCodeEvaluatorRequest =
            UpdateOnlineCodeEvaluatorRequest.builder()
                .advancedFeaturesEnabled(true)
                .code("code")
                .dependencies("dependencies")
                .language("language")
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
