// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.alerts

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertUpdateParamsTest {

    @Test
    fun create() {
        AlertUpdateParams.builder()
            .sessionId(JsonValue.from(mapOf<String, Any>()))
            .alertRuleId(JsonValue.from(mapOf<String, Any>()))
            .addAction(
                AlertActionBase.builder()
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .target(AlertActionBase.Target.PAGERDUTY)
                    .id("id")
                    .alertRuleId("alert_rule_id")
                    .build()
            )
            .rule(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertUpdateParams.builder()
                .sessionId(JsonValue.from(mapOf<String, Any>()))
                .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                .addAction(
                    AlertActionBase.builder()
                        .config(JsonValue.from(mapOf<String, Any>()))
                        .target(AlertActionBase.Target.PAGERDUTY)
                        .build()
                )
                .rule(
                    AlertRuleBase.builder()
                        .aggregation(AlertRuleBase.Aggregation.AVG)
                        .attribute(AlertRuleBase.Attribute.LATENCY)
                        .description("description")
                        .name("name")
                        .operator(AlertRuleBase.Operator.GTE)
                        .type(AlertRuleBase.Type.THRESHOLD)
                        .windowMinutes(15L)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        assertThat(params._pathParam(1)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AlertUpdateParams.builder()
                .sessionId(JsonValue.from(mapOf<String, Any>()))
                .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                .addAction(
                    AlertActionBase.builder()
                        .config(JsonValue.from(mapOf<String, Any>()))
                        .target(AlertActionBase.Target.PAGERDUTY)
                        .id("id")
                        .alertRuleId("alert_rule_id")
                        .build()
                )
                .rule(
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
                )
                .build()

        val body = params._body()

        assertThat(body.actions())
            .containsExactly(
                AlertActionBase.builder()
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .target(AlertActionBase.Target.PAGERDUTY)
                    .id("id")
                    .alertRuleId("alert_rule_id")
                    .build()
            )
        assertThat(body.rule())
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertUpdateParams.builder()
                .sessionId(JsonValue.from(mapOf<String, Any>()))
                .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                .addAction(
                    AlertActionBase.builder()
                        .config(JsonValue.from(mapOf<String, Any>()))
                        .target(AlertActionBase.Target.PAGERDUTY)
                        .build()
                )
                .rule(
                    AlertRuleBase.builder()
                        .aggregation(AlertRuleBase.Aggregation.AVG)
                        .attribute(AlertRuleBase.Attribute.LATENCY)
                        .description("description")
                        .name("name")
                        .operator(AlertRuleBase.Operator.GTE)
                        .type(AlertRuleBase.Type.THRESHOLD)
                        .windowMinutes(15L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.actions())
            .containsExactly(
                AlertActionBase.builder()
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .target(AlertActionBase.Target.PAGERDUTY)
                    .build()
            )
        assertThat(body.rule())
            .isEqualTo(
                AlertRuleBase.builder()
                    .aggregation(AlertRuleBase.Aggregation.AVG)
                    .attribute(AlertRuleBase.Attribute.LATENCY)
                    .description("description")
                    .name("name")
                    .operator(AlertRuleBase.Operator.GTE)
                    .type(AlertRuleBase.Type.THRESHOLD)
                    .windowMinutes(15L)
                    .build()
            )
    }
}
