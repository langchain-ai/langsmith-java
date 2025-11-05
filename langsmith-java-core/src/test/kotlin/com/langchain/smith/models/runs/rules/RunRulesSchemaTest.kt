// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRulesSchemaTest {

    @Test
    fun create() {
        val runRulesSchema =
            RunRulesSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .evaluatorVersion(0L)
                .samplingRate(0.0)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addWebhook(
                    RunRulesWebhookSchema.builder()
                        .url("url")
                        .headers(
                            RunRulesWebhookSchema.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addToAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addToAnnotationQueueName("add_to_annotation_queue_name")
                .addToDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addToDatasetName("add_to_dataset_name")
                .addToDatasetPreferCorrection(true)
                .addAlert(
                    RunRulesPagerdutyAlertSchema.builder()
                        .routingKey("routing_key")
                        .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                        .summary("summary")
                        .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                        .build()
                )
                .alignmentAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backfillFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCodeEvaluator(
                    CodeEvaluatorTopLevel.builder()
                        .code("code")
                        .language(CodeEvaluatorTopLevel.Language.PYTHON)
                        .build()
                )
                .correctionsDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetName("dataset_name")
                .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvaluator(
                    EvaluatorTopLevel.builder()
                        .structured(
                            EvaluatorTopLevel.Structured.builder()
                                .hubRef("hub_ref")
                                .model(JsonValue.from(mapOf<String, Any>()))
                                .addPrompt(
                                    listOf(
                                        JsonValue.from(mapOf<String, Any>()),
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                )
                                .schema(JsonValue.from(mapOf<String, Any>()))
                                .templateFormat("template_format")
                                .variableMapping(
                                    EvaluatorTopLevel.Structured.VariableMapping.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .extendOnly(true)
                .filter("filter")
                .groupBy(RunRulesSchema.GroupBy.THREAD_ID)
                .includeExtendedStats(true)
                .isEnabled(true)
                .numFewShotExamples(0L)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionName("session_name")
                .traceFilter("trace_filter")
                .transient_(true)
                .treeFilter("tree_filter")
                .useCorrectionsDataset(true)
                .build()

        assertThat(runRulesSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runRulesSchema.displayName()).isEqualTo("display_name")
        assertThat(runRulesSchema.evaluatorVersion()).isEqualTo(0L)
        assertThat(runRulesSchema.samplingRate()).isEqualTo(0.0)
        assertThat(runRulesSchema.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runRulesSchema.webhooks().getOrNull())
            .containsExactly(
                RunRulesWebhookSchema.builder()
                    .url("url")
                    .headers(
                        RunRulesWebhookSchema.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(runRulesSchema.addToAnnotationQueueId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.addToAnnotationQueueName())
            .contains("add_to_annotation_queue_name")
        assertThat(runRulesSchema.addToDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.addToDatasetName()).contains("add_to_dataset_name")
        assertThat(runRulesSchema.addToDatasetPreferCorrection()).contains(true)
        assertThat(runRulesSchema.alerts().getOrNull())
            .containsExactly(
                RunRulesPagerdutyAlertSchema.builder()
                    .routingKey("routing_key")
                    .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                    .summary("summary")
                    .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                    .build()
            )
        assertThat(runRulesSchema.alignmentAnnotationQueueId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.backfillFrom())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runRulesSchema.codeEvaluators().getOrNull())
            .containsExactly(
                CodeEvaluatorTopLevel.builder()
                    .code("code")
                    .language(CodeEvaluatorTopLevel.Language.PYTHON)
                    .build()
            )
        assertThat(runRulesSchema.correctionsDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.datasetName()).contains("dataset_name")
        assertThat(runRulesSchema.evaluatorId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.evaluators().getOrNull())
            .containsExactly(
                EvaluatorTopLevel.builder()
                    .structured(
                        EvaluatorTopLevel.Structured.builder()
                            .hubRef("hub_ref")
                            .model(JsonValue.from(mapOf<String, Any>()))
                            .addPrompt(
                                listOf(
                                    JsonValue.from(mapOf<String, Any>()),
                                    JsonValue.from(mapOf<String, Any>()),
                                )
                            )
                            .schema(JsonValue.from(mapOf<String, Any>()))
                            .templateFormat("template_format")
                            .variableMapping(
                                EvaluatorTopLevel.Structured.VariableMapping.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(runRulesSchema.extendOnly()).contains(true)
        assertThat(runRulesSchema.filter()).contains("filter")
        assertThat(runRulesSchema.groupBy()).contains(RunRulesSchema.GroupBy.THREAD_ID)
        assertThat(runRulesSchema.includeExtendedStats()).contains(true)
        assertThat(runRulesSchema.isEnabled()).contains(true)
        assertThat(runRulesSchema.numFewShotExamples()).contains(0L)
        assertThat(runRulesSchema.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runRulesSchema.sessionName()).contains("session_name")
        assertThat(runRulesSchema.traceFilter()).contains("trace_filter")
        assertThat(runRulesSchema.transient_()).contains(true)
        assertThat(runRulesSchema.treeFilter()).contains("tree_filter")
        assertThat(runRulesSchema.useCorrectionsDataset()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runRulesSchema =
            RunRulesSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .evaluatorVersion(0L)
                .samplingRate(0.0)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addWebhook(
                    RunRulesWebhookSchema.builder()
                        .url("url")
                        .headers(
                            RunRulesWebhookSchema.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addToAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addToAnnotationQueueName("add_to_annotation_queue_name")
                .addToDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addToDatasetName("add_to_dataset_name")
                .addToDatasetPreferCorrection(true)
                .addAlert(
                    RunRulesPagerdutyAlertSchema.builder()
                        .routingKey("routing_key")
                        .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                        .summary("summary")
                        .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                        .build()
                )
                .alignmentAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backfillFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCodeEvaluator(
                    CodeEvaluatorTopLevel.builder()
                        .code("code")
                        .language(CodeEvaluatorTopLevel.Language.PYTHON)
                        .build()
                )
                .correctionsDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetName("dataset_name")
                .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvaluator(
                    EvaluatorTopLevel.builder()
                        .structured(
                            EvaluatorTopLevel.Structured.builder()
                                .hubRef("hub_ref")
                                .model(JsonValue.from(mapOf<String, Any>()))
                                .addPrompt(
                                    listOf(
                                        JsonValue.from(mapOf<String, Any>()),
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                )
                                .schema(JsonValue.from(mapOf<String, Any>()))
                                .templateFormat("template_format")
                                .variableMapping(
                                    EvaluatorTopLevel.Structured.VariableMapping.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .extendOnly(true)
                .filter("filter")
                .groupBy(RunRulesSchema.GroupBy.THREAD_ID)
                .includeExtendedStats(true)
                .isEnabled(true)
                .numFewShotExamples(0L)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionName("session_name")
                .traceFilter("trace_filter")
                .transient_(true)
                .treeFilter("tree_filter")
                .useCorrectionsDataset(true)
                .build()

        val roundtrippedRunRulesSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runRulesSchema),
                jacksonTypeRef<RunRulesSchema>(),
            )

        assertThat(roundtrippedRunRulesSchema).isEqualTo(runRulesSchema)
    }
}
