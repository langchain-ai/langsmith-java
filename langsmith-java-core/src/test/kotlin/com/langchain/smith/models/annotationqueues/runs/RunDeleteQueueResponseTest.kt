// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunDeleteQueueResponseTest {

    @Test
    fun create() {
        val runDeleteQueueResponse = RunDeleteQueueResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runDeleteQueueResponse = RunDeleteQueueResponse.builder().build()

        val roundtrippedRunDeleteQueueResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runDeleteQueueResponse),
                jacksonTypeRef<RunDeleteQueueResponse>(),
            )

        assertThat(roundtrippedRunDeleteQueueResponse).isEqualTo(runDeleteQueueResponse)
    }
}
