// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexCreateResponseTest {

    @Test
    fun create() {
        val indexCreateResponse = IndexCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexCreateResponse = IndexCreateResponse.builder().build()

        val roundtrippedIndexCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexCreateResponse),
                jacksonTypeRef<IndexCreateResponse>(),
            )

        assertThat(roundtrippedIndexCreateResponse).isEqualTo(indexCreateResponse)
    }
}
