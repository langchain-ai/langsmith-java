// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules.trigger

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TriggerCreateResponseTest {

    @Test
    fun create() {
        val triggerCreateResponse = TriggerCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val triggerCreateResponse = TriggerCreateResponse.builder().build()

        val roundtrippedTriggerCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(triggerCreateResponse),
                jacksonTypeRef<TriggerCreateResponse>(),
            )

        assertThat(roundtrippedTriggerCreateResponse).isEqualTo(triggerCreateResponse)
    }
}
