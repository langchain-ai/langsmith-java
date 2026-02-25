// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunUpdate2ResponseTest {

    @Test
    fun create() {
        val runUpdate2Response = RunUpdate2Response.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runUpdate2Response = RunUpdate2Response.builder().build()

        val roundtrippedRunUpdate2Response =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runUpdate2Response),
                jacksonTypeRef<RunUpdate2Response>(),
            )

        assertThat(roundtrippedRunUpdate2Response).isEqualTo(runUpdate2Response)
    }
}
