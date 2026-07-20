// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetUrlResponseTest {

    @Test
    fun create() {
        val runGetUrlResponse = RunGetUrlResponse.builder().url("url").build()

        assertThat(runGetUrlResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runGetUrlResponse = RunGetUrlResponse.builder().url("url").build()

        val roundtrippedRunGetUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runGetUrlResponse),
                jacksonTypeRef<RunGetUrlResponse>(),
            )

        assertThat(roundtrippedRunGetUrlResponse).isEqualTo(runGetUrlResponse)
    }
}
