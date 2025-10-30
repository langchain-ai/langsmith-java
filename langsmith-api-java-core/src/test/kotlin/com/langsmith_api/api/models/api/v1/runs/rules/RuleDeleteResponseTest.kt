// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleDeleteResponseTest {

    @Test
    fun create() {
        val ruleDeleteResponse = RuleDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleDeleteResponse = RuleDeleteResponse.builder().build()

        val roundtrippedRuleDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleDeleteResponse),
                jacksonTypeRef<RuleDeleteResponse>(),
            )

        assertThat(roundtrippedRuleDeleteResponse).isEqualTo(ruleDeleteResponse)
    }
}
