// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.alerts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertActionBaseTest {

    @Test
    fun create() {
        val alertActionBase =
            AlertActionBase.builder()
                .config(JsonValue.from(mapOf<String, Any>()))
                .target(AlertActionBase.Target.PAGERDUTY)
                .id("id")
                .alertRuleId("alert_rule_id")
                .build()

        assertThat(alertActionBase._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(alertActionBase.target()).isEqualTo(AlertActionBase.Target.PAGERDUTY)
        assertThat(alertActionBase.id()).contains("id")
        assertThat(alertActionBase.alertRuleId()).contains("alert_rule_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alertActionBase =
            AlertActionBase.builder()
                .config(JsonValue.from(mapOf<String, Any>()))
                .target(AlertActionBase.Target.PAGERDUTY)
                .id("id")
                .alertRuleId("alert_rule_id")
                .build()

        val roundtrippedAlertActionBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alertActionBase),
                jacksonTypeRef<AlertActionBase>(),
            )

        assertThat(roundtrippedAlertActionBase).isEqualTo(alertActionBase)
    }
}
