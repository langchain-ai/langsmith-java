// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.ace

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AceExecuteResponseTest {

    @Test
    fun create() {
        val aceExecuteResponse = AceExecuteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aceExecuteResponse = AceExecuteResponse.builder().build()

        val roundtrippedAceExecuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aceExecuteResponse),
                jacksonTypeRef<AceExecuteResponse>(),
            )

        assertThat(roundtrippedAceExecuteResponse).isEqualTo(aceExecuteResponse)
    }
}
