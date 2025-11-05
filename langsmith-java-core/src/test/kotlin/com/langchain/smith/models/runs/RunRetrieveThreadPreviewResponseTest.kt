// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveThreadPreviewResponseTest {

    @Test
    fun create() {
        val runRetrieveThreadPreviewResponse =
            RunRetrieveThreadPreviewResponse.builder()
                .previews(
                    RunRetrieveThreadPreviewResponse.Previews.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(runRetrieveThreadPreviewResponse.previews())
            .isEqualTo(
                RunRetrieveThreadPreviewResponse.Previews.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runRetrieveThreadPreviewResponse =
            RunRetrieveThreadPreviewResponse.builder()
                .previews(
                    RunRetrieveThreadPreviewResponse.Previews.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedRunRetrieveThreadPreviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runRetrieveThreadPreviewResponse),
                jacksonTypeRef<RunRetrieveThreadPreviewResponse>(),
            )

        assertThat(roundtrippedRunRetrieveThreadPreviewResponse)
            .isEqualTo(runRetrieveThreadPreviewResponse)
    }
}
