// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples.bulk

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
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
