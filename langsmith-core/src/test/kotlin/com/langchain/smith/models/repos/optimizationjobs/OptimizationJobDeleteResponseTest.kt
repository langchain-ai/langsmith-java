// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptimizationJobDeleteResponseTest {

    @Test
    fun create() {
        val optimizationJobDeleteResponse = OptimizationJobDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optimizationJobDeleteResponse = OptimizationJobDeleteResponse.builder().build()

        val roundtrippedOptimizationJobDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optimizationJobDeleteResponse),
                jacksonTypeRef<OptimizationJobDeleteResponse>(),
            )

        assertThat(roundtrippedOptimizationJobDeleteResponse)
            .isEqualTo(optimizationJobDeleteResponse)
    }
}
