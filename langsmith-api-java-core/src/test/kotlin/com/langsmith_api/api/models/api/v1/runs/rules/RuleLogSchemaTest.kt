// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleLogSchemaTest {

    @Test
    fun create() {
        val ruleLogSchema =
            RuleLogSchema.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addToAnnotationQueue(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addToDataset(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .alerts(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .applicationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .evaluators(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .runName("run_name")
                .runSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runType("run_type")
                .threadId("thread_id")
                .webhooks(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(ruleLogSchema.endTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleLogSchema.ruleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleLogSchema.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleLogSchema.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleLogSchema.addToAnnotationQueue())
            .contains(
                RuleLogActionResponse.builder()
                    .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(ruleLogSchema.addToDataset())
            .contains(
                RuleLogActionResponse.builder()
                    .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(ruleLogSchema.alerts())
            .contains(
                RuleLogActionResponse.builder()
                    .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(ruleLogSchema.applicationTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleLogSchema.evaluators())
            .contains(
                RuleLogActionResponse.builder()
                    .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(ruleLogSchema.runName()).contains("run_name")
        assertThat(ruleLogSchema.runSessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleLogSchema.runType()).contains("run_type")
        assertThat(ruleLogSchema.threadId()).contains("thread_id")
        assertThat(ruleLogSchema.webhooks())
            .contains(
                RuleLogActionResponse.builder()
                    .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleLogSchema =
            RuleLogSchema.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addToAnnotationQueue(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addToDataset(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .alerts(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .applicationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .evaluators(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .runName("run_name")
                .runSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runType("run_type")
                .threadId("thread_id")
                .webhooks(
                    RuleLogActionResponse.builder()
                        .outcome(RuleLogActionResponse.Outcome.SUCCESS)
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedRuleLogSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleLogSchema),
                jacksonTypeRef<RuleLogSchema>(),
            )

        assertThat(roundtrippedRuleLogSchema).isEqualTo(ruleLogSchema)
    }
}
