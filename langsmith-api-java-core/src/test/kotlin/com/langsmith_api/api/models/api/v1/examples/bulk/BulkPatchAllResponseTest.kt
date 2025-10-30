// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples.bulk

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkPatchAllResponseTest {

    @Test
    fun create() {
        val bulkPatchAllResponse = BulkPatchAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkPatchAllResponse = BulkPatchAllResponse.builder().build()

        val roundtrippedBulkPatchAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkPatchAllResponse),
                jacksonTypeRef<BulkPatchAllResponse>(),
            )

        assertThat(roundtrippedBulkPatchAllResponse).isEqualTo(bulkPatchAllResponse)
    }
}
