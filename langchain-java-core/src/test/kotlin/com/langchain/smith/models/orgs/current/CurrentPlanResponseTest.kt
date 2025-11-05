// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentPlanResponseTest {

    @Test
    fun create() {
        val currentPlanResponse = CurrentPlanResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentPlanResponse = CurrentPlanResponse.builder().build()

        val roundtrippedCurrentPlanResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentPlanResponse),
                jacksonTypeRef<CurrentPlanResponse>(),
            )

        assertThat(roundtrippedCurrentPlanResponse).isEqualTo(currentPlanResponse)
    }
}
