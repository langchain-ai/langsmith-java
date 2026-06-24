// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkDeleteEvaluatorsResponseTest {

    @Test
    fun create() {
        val bulkDeleteEvaluatorsResponse =
            BulkDeleteEvaluatorsResponse.builder()
                .addFailed(BulkDeleteEvaluatorFailedItem.builder().id("id").error("error").build())
                .addSucceeded("string")
                .build()

        assertThat(bulkDeleteEvaluatorsResponse.failed().getOrNull())
            .containsExactly(
                BulkDeleteEvaluatorFailedItem.builder().id("id").error("error").build()
            )
        assertThat(bulkDeleteEvaluatorsResponse.succeeded().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkDeleteEvaluatorsResponse =
            BulkDeleteEvaluatorsResponse.builder()
                .addFailed(BulkDeleteEvaluatorFailedItem.builder().id("id").error("error").build())
                .addSucceeded("string")
                .build()

        val roundtrippedBulkDeleteEvaluatorsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkDeleteEvaluatorsResponse),
                jacksonTypeRef<BulkDeleteEvaluatorsResponse>(),
            )

        assertThat(roundtrippedBulkDeleteEvaluatorsResponse).isEqualTo(bulkDeleteEvaluatorsResponse)
    }
}
