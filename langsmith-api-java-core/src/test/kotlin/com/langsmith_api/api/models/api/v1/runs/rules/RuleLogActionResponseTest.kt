// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleLogActionResponseTest {

    @Test
    fun create() {
        val ruleLogActionResponse =
            RuleLogActionResponse.builder()
                .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(ruleLogActionResponse.outcome()).isEqualTo(RuleLogActionResponse.Outcome.SUCCESS)
        assertThat(ruleLogActionResponse._payload()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleLogActionResponse =
            RuleLogActionResponse.builder()
                .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedRuleLogActionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleLogActionResponse),
                jacksonTypeRef<RuleLogActionResponse>(),
            )

        assertThat(roundtrippedRuleLogActionResponse).isEqualTo(ruleLogActionResponse)
    }
}
