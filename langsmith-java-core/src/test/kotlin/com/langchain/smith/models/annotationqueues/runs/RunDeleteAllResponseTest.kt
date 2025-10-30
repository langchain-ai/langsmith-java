// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunDeleteAllResponseTest {

    @Test
    fun create() {
        val runDeleteAllResponse = RunDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runDeleteAllResponse = RunDeleteAllResponse.builder().build()

        val roundtrippedRunDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runDeleteAllResponse),
                jacksonTypeRef<RunDeleteAllResponse>(),
            )

        assertThat(roundtrippedRunDeleteAllResponse).isEqualTo(runDeleteAllResponse)
    }
}
