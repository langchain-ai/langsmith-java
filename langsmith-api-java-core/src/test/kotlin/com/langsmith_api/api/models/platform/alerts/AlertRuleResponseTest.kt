// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.alerts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertRuleResponseTest {

    @Test
    fun create() {
        val alertRuleResponse =
            AlertRuleResponse.builder()
                .addAction(
                    AlertRuleResponse.Action.builder()
                        .config(JsonValue.from(mapOf<String, Any>()))
                        .target(AlertRuleResponse.Action.Target.PAGERDUTY)
                        .id("id")
                        .alertRuleId("alert_rule_id")
                        .createdAt("created_at")
                        .updatedAt("updated_at")
                        .build()
                )
                .rule(
                    AlertRuleResponse.Rule.builder()
                        .aggregation(AlertRuleResponse.Rule.Aggregation.AVG)
                        .attribute(AlertRuleResponse.Rule.Attribute.LATENCY)
                        .description("description")
                        .name("name")
                        .operator(AlertRuleResponse.Rule.Operator.GTE)
                        .type(AlertRuleResponse.Rule.Type.THRESHOLD)
                        .windowMinutes(15L)
                        .id("id")
                        .createdAt("created_at")
                        .denominatorFilter("denominator_filter")
                        .filter("filter")
                        .threshold(0.0)
                        .thresholdMultiplier(0.0)
                        .thresholdWindowMinutes(60L)
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(alertRuleResponse.actions().getOrNull())
            .containsExactly(
                AlertRuleResponse.Action.builder()
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .target(AlertRuleResponse.Action.Target.PAGERDUTY)
                    .id("id")
                    .alertRuleId("alert_rule_id")
                    .createdAt("created_at")
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(alertRuleResponse.rule())
            .contains(
                AlertRuleResponse.Rule.builder()
                    .aggregation(AlertRuleResponse.Rule.Aggregation.AVG)
                    .attribute(AlertRuleResponse.Rule.Attribute.LATENCY)
                    .description("description")
                    .name("name")
                    .operator(AlertRuleResponse.Rule.Operator.GTE)
                    .type(AlertRuleResponse.Rule.Type.THRESHOLD)
                    .windowMinutes(15L)
                    .id("id")
                    .createdAt("created_at")
                    .denominatorFilter("denominator_filter")
                    .filter("filter")
                    .threshold(0.0)
                    .thresholdMultiplier(0.0)
                    .thresholdWindowMinutes(60L)
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alertRuleResponse =
            AlertRuleResponse.builder()
                .addAction(
                    AlertRuleResponse.Action.builder()
                        .config(JsonValue.from(mapOf<String, Any>()))
                        .target(AlertRuleResponse.Action.Target.PAGERDUTY)
                        .id("id")
                        .alertRuleId("alert_rule_id")
                        .createdAt("created_at")
                        .updatedAt("updated_at")
                        .build()
                )
                .rule(
                    AlertRuleResponse.Rule.builder()
                        .aggregation(AlertRuleResponse.Rule.Aggregation.AVG)
                        .attribute(AlertRuleResponse.Rule.Attribute.LATENCY)
                        .description("description")
                        .name("name")
                        .operator(AlertRuleResponse.Rule.Operator.GTE)
                        .type(AlertRuleResponse.Rule.Type.THRESHOLD)
                        .windowMinutes(15L)
                        .id("id")
                        .createdAt("created_at")
                        .denominatorFilter("denominator_filter")
                        .filter("filter")
                        .threshold(0.0)
                        .thresholdMultiplier(0.0)
                        .thresholdWindowMinutes(60L)
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedAlertRuleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alertRuleResponse),
                jacksonTypeRef<AlertRuleResponse>(),
            )

        assertThat(roundtrippedAlertRuleResponse).isEqualTo(alertRuleResponse)
    }
}
