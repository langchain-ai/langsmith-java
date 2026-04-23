// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorPagerdutyAlertTest {

    @Test
    fun create() {
        val evaluatorPagerdutyAlert =
            EvaluatorPagerdutyAlert.builder()
                .routingKey("routing_key")
                .severity(EvaluatorPagerdutyAlert.Severity.CRITICAL)
                .summary("summary")
                .type(EvaluatorPagerdutyAlert.Type.PAGERDUTY)
                .build()

        assertThat(evaluatorPagerdutyAlert.routingKey()).isEqualTo("routing_key")
        assertThat(evaluatorPagerdutyAlert.severity())
            .contains(EvaluatorPagerdutyAlert.Severity.CRITICAL)
        assertThat(evaluatorPagerdutyAlert.summary()).contains("summary")
        assertThat(evaluatorPagerdutyAlert.type()).contains(EvaluatorPagerdutyAlert.Type.PAGERDUTY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evaluatorPagerdutyAlert =
            EvaluatorPagerdutyAlert.builder()
                .routingKey("routing_key")
                .severity(EvaluatorPagerdutyAlert.Severity.CRITICAL)
                .summary("summary")
                .type(EvaluatorPagerdutyAlert.Type.PAGERDUTY)
                .build()

        val roundtrippedEvaluatorPagerdutyAlert =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluatorPagerdutyAlert),
                jacksonTypeRef<EvaluatorPagerdutyAlert>(),
            )

        assertThat(roundtrippedEvaluatorPagerdutyAlert).isEqualTo(evaluatorPagerdutyAlert)
    }
}
