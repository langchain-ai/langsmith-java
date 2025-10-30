// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunDeleteResponseTest {

    @Test
    fun create() {
        val runDeleteResponse = RunDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runDeleteResponse = RunDeleteResponse.builder().build()

        val roundtrippedRunDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runDeleteResponse),
                jacksonTypeRef<RunDeleteResponse>(),
            )

        assertThat(roundtrippedRunDeleteResponse).isEqualTo(runDeleteResponse)
    }
}
