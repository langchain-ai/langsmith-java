// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.alerts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertRuleBaseTest {

    @Test
    fun create() {
        val alertRuleBase =
            AlertRuleBase.builder()
                .aggregation(AlertRuleBase.Aggregation.AVG)
                .attribute(AlertRuleBase.Attribute.LATENCY)
                .description("description")
                .name("name")
                .operator(AlertRuleBase.Operator.GTE)
                .type(AlertRuleBase.Type.THRESHOLD)
                .windowMinutes(15L)
                .id("id")
                .denominatorFilter("denominator_filter")
                .filter("filter")
                .threshold(0.0)
                .thresholdMultiplier(0.0)
                .thresholdWindowMinutes(60L)
                .build()

        assertThat(alertRuleBase.aggregation()).isEqualTo(AlertRuleBase.Aggregation.AVG)
        assertThat(alertRuleBase.attribute()).isEqualTo(AlertRuleBase.Attribute.LATENCY)
        assertThat(alertRuleBase.description()).isEqualTo("description")
        assertThat(alertRuleBase.name()).isEqualTo("name")
        assertThat(alertRuleBase.operator()).isEqualTo(AlertRuleBase.Operator.GTE)
        assertThat(alertRuleBase.type()).isEqualTo(AlertRuleBase.Type.THRESHOLD)
        assertThat(alertRuleBase.windowMinutes()).isEqualTo(15L)
        assertThat(alertRuleBase.id()).contains("id")
        assertThat(alertRuleBase.denominatorFilter()).contains("denominator_filter")
        assertThat(alertRuleBase.filter()).contains("filter")
        assertThat(alertRuleBase.threshold()).contains(0.0)
        assertThat(alertRuleBase.thresholdMultiplier()).contains(0.0)
        assertThat(alertRuleBase.thresholdWindowMinutes()).contains(60L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alertRuleBase =
            AlertRuleBase.builder()
                .aggregation(AlertRuleBase.Aggregation.AVG)
                .attribute(AlertRuleBase.Attribute.LATENCY)
                .description("description")
                .name("name")
                .operator(AlertRuleBase.Operator.GTE)
                .type(AlertRuleBase.Type.THRESHOLD)
                .windowMinutes(15L)
                .id("id")
                .denominatorFilter("denominator_filter")
                .filter("filter")
                .threshold(0.0)
                .thresholdMultiplier(0.0)
                .thresholdWindowMinutes(60L)
                .build()

        val roundtrippedAlertRuleBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alertRuleBase),
                jacksonTypeRef<AlertRuleBase>(),
            )

        assertThat(roundtrippedAlertRuleBase).isEqualTo(alertRuleBase)
    }
}
