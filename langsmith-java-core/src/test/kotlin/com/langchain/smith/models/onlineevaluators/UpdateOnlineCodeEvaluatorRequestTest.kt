// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
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
                .managedCodeEvaluatorSettings(
                    UpdateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                        )
                        .build()
                )
                .build()

        assertThat(updateOnlineCodeEvaluatorRequest.advancedFeaturesEnabled()).contains(true)
        assertThat(updateOnlineCodeEvaluatorRequest.code()).contains("code")
        assertThat(updateOnlineCodeEvaluatorRequest.dependencies()).contains("dependencies")
        assertThat(updateOnlineCodeEvaluatorRequest.language()).contains("language")
        assertThat(updateOnlineCodeEvaluatorRequest.managedCodeEvaluatorSettings())
            .contains(
                UpdateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                    )
                    .build()
            )
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
                .managedCodeEvaluatorSettings(
                    UpdateOnlineCodeEvaluatorRequest.ManagedCodeEvaluatorSettings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("is_enabled" to true, "key_name" to "key_name")),
                        )
                        .build()
                )
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
