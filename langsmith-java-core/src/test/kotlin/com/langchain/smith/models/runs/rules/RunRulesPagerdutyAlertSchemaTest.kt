// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRulesPagerdutyAlertSchemaTest {

    @Test
    fun create() {
        val runRulesPagerdutyAlertSchema =
            RunRulesPagerdutyAlertSchema.builder()
                .routingKey("routing_key")
                .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                .summary("summary")
                .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                .build()

        assertThat(runRulesPagerdutyAlertSchema.routingKey()).isEqualTo("routing_key")
        assertThat(runRulesPagerdutyAlertSchema.severity())
            .contains(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
        assertThat(runRulesPagerdutyAlertSchema.summary()).contains("summary")
        assertThat(runRulesPagerdutyAlertSchema.type())
            .contains(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runRulesPagerdutyAlertSchema =
            RunRulesPagerdutyAlertSchema.builder()
                .routingKey("routing_key")
                .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                .summary("summary")
                .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                .build()

        val roundtrippedRunRulesPagerdutyAlertSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runRulesPagerdutyAlertSchema),
                jacksonTypeRef<RunRulesPagerdutyAlertSchema>(),
            )

        assertThat(roundtrippedRunRulesPagerdutyAlertSchema).isEqualTo(runRulesPagerdutyAlertSchema)
    }
}
