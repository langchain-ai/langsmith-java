// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkDeleteEvaluatorFailedItemTest {

    @Test
    fun create() {
        val bulkDeleteEvaluatorFailedItem =
            BulkDeleteEvaluatorFailedItem.builder().id("id").error("error").build()

        assertThat(bulkDeleteEvaluatorFailedItem.id()).contains("id")
        assertThat(bulkDeleteEvaluatorFailedItem.error()).contains("error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkDeleteEvaluatorFailedItem =
            BulkDeleteEvaluatorFailedItem.builder().id("id").error("error").build()

        val roundtrippedBulkDeleteEvaluatorFailedItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkDeleteEvaluatorFailedItem),
                jacksonTypeRef<BulkDeleteEvaluatorFailedItem>(),
            )

        assertThat(roundtrippedBulkDeleteEvaluatorFailedItem)
            .isEqualTo(bulkDeleteEvaluatorFailedItem)
    }
}
