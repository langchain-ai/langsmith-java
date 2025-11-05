// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUpdateResponseTest {

    @Test
    fun create() {
        val exampleUpdateResponse = ExampleUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleUpdateResponse = ExampleUpdateResponse.builder().build()

        val roundtrippedExampleUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleUpdateResponse),
                jacksonTypeRef<ExampleUpdateResponse>(),
            )

        assertThat(roundtrippedExampleUpdateResponse).isEqualTo(exampleUpdateResponse)
    }
}
