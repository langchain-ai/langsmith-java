// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleDeleteAllResponseTest {

    @Test
    fun create() {
        val exampleDeleteAllResponse = ExampleDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exampleDeleteAllResponse = ExampleDeleteAllResponse.builder().build()

        val roundtrippedExampleDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exampleDeleteAllResponse),
                jacksonTypeRef<ExampleDeleteAllResponse>(),
            )

        assertThat(roundtrippedExampleDeleteAllResponse).isEqualTo(exampleDeleteAllResponse)
    }
}
