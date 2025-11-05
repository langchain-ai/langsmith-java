// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexSyncResponseTest {

    @Test
    fun create() {
        val indexSyncResponse = IndexSyncResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexSyncResponse = IndexSyncResponse.builder().build()

        val roundtrippedIndexSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexSyncResponse),
                jacksonTypeRef<IndexSyncResponse>(),
            )

        assertThat(roundtrippedIndexSyncResponse).isEqualTo(indexSyncResponse)
    }
}
