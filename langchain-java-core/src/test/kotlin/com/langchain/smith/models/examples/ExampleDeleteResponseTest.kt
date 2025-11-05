// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleDeleteResponseTest {

    @Test
    fun create() {
        val exampleDeleteResponse = ExampleDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleDeleteResponse = ExampleDeleteResponse.builder().build()

        val roundtrippedExampleDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleDeleteResponse),
                jacksonTypeRef<ExampleDeleteResponse>(),
            )

        assertThat(roundtrippedExampleDeleteResponse).isEqualTo(exampleDeleteResponse)
    }
}
