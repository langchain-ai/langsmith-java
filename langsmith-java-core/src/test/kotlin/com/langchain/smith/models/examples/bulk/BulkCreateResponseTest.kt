// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples.bulk

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkCreateResponseTest {

    @Test
    fun create() {
        val bulkCreateResponse = BulkCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkCreateResponse = BulkCreateResponse.builder().build()

        val roundtrippedBulkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkCreateResponse),
                jacksonTypeRef<BulkCreateResponse>(),
            )

        assertThat(roundtrippedBulkCreateResponse).isEqualTo(bulkCreateResponse)
    }
}
