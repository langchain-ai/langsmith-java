// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogDeleteResponseTest {

    @Test
    fun create() {
        val logDeleteResponse = LogDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logDeleteResponse = LogDeleteResponse.builder().build()

        val roundtrippedLogDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logDeleteResponse),
                jacksonTypeRef<LogDeleteResponse>(),
            )

        assertThat(roundtrippedLogDeleteResponse).isEqualTo(logDeleteResponse)
    }
}
