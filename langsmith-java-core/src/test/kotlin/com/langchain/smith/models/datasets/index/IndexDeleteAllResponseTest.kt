// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexDeleteAllResponseTest {

    @Test
    fun create() {
        val indexDeleteAllResponse = IndexDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexDeleteAllResponse = IndexDeleteAllResponse.builder().build()

        val roundtrippedIndexDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexDeleteAllResponse),
                jacksonTypeRef<IndexDeleteAllResponse>(),
            )

        assertThat(roundtrippedIndexDeleteAllResponse).isEqualTo(indexDeleteAllResponse)
    }
}
