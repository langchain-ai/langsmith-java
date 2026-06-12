// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorTest {

    @Test
    fun create() {
        val evaluator =
            Evaluator.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .evaluatorVersion(0L)
                .samplingRate(0.0)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addWebhook(
                    EvaluatorWebhook.builder()
                        .url("url")
                        .headers(
                            EvaluatorWebhook.Headers.builder()
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
                    EvaluatorPagerdutyAlert.builder()
                        .routingKey("routing_key")
                        .severity(EvaluatorPagerdutyAlert.Severity.CRITICAL)
                        .summary("summary")
                        .type(EvaluatorPagerdutyAlert.Type.PAGERDUTY)
                        .build()
                )
                .alignmentAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backfillCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .backfillError("backfill_error")
                .backfillFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .backfillId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backfillProgress(0.0)
                .backfillStatus("backfill_status")
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
                                .model(
                                    EvaluatorTopLevel.Structured.Model.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPrompt(
                                    listOf(
                                        JsonValue.from(mapOf<String, Any>()),
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                )
                                .schema(
                                    EvaluatorTopLevel.Structured.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
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
                .extendEvaluatorTraceRetention(true)
                .extendOnly(true)
                .filter("filter")
                .groupBy(Evaluator.GroupBy.THREAD_ID)
                .includeExtendedStats(true)
                .isEnabled(true)
                .numFewShotExamples(0L)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionName("session_name")
                .spendLimit(
                    Evaluator.SpendLimit.builder()
                        .limitUsd("limit_usd")
                        .window(Evaluator.SpendLimit.Window.WEEKLY)
                        .build()
                )
                .spendUsd(0.0)
                .traceCount(0L)
                .traceFilter("trace_filter")
                .isTransient(true)
                .treeFilter("tree_filter")
                .useCorrectionsDataset(true)
                .build()

        assertThat(evaluator.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(evaluator.displayName()).isEqualTo("display_name")
        assertThat(evaluator.evaluatorVersion()).isEqualTo(0L)
        assertThat(evaluator.samplingRate()).isEqualTo(0.0)
        assertThat(evaluator.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(evaluator.webhooks().getOrNull())
            .containsExactly(
                EvaluatorWebhook.builder()
                    .url("url")
                    .headers(
                        EvaluatorWebhook.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(evaluator.addToAnnotationQueueId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.addToAnnotationQueueName()).contains("add_to_annotation_queue_name")
        assertThat(evaluator.addToDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.addToDatasetName()).contains("add_to_dataset_name")
        assertThat(evaluator.addToDatasetPreferCorrection()).contains(true)
        assertThat(evaluator.alerts().getOrNull())
            .containsExactly(
                EvaluatorPagerdutyAlert.builder()
                    .routingKey("routing_key")
                    .severity(EvaluatorPagerdutyAlert.Severity.CRITICAL)
                    .summary("summary")
                    .type(EvaluatorPagerdutyAlert.Type.PAGERDUTY)
                    .build()
            )
        assertThat(evaluator.alignmentAnnotationQueueId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.backfillCompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(evaluator.backfillError()).contains("backfill_error")
        assertThat(evaluator.backfillFrom())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(evaluator.backfillId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.backfillProgress()).contains(0.0)
        assertThat(evaluator.backfillStatus()).contains("backfill_status")
        assertThat(evaluator.codeEvaluators().getOrNull())
            .containsExactly(
                CodeEvaluatorTopLevel.builder()
                    .code("code")
                    .language(CodeEvaluatorTopLevel.Language.PYTHON)
                    .build()
            )
        assertThat(evaluator.correctionsDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.datasetName()).contains("dataset_name")
        assertThat(evaluator.evaluatorId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.evaluators().getOrNull())
            .containsExactly(
                EvaluatorTopLevel.builder()
                    .structured(
                        EvaluatorTopLevel.Structured.builder()
                            .hubRef("hub_ref")
                            .model(
                                EvaluatorTopLevel.Structured.Model.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addPrompt(
                                listOf(
                                    JsonValue.from(mapOf<String, Any>()),
                                    JsonValue.from(mapOf<String, Any>()),
                                )
                            )
                            .schema(
                                EvaluatorTopLevel.Structured.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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
        assertThat(evaluator.extendEvaluatorTraceRetention()).contains(true)
        assertThat(evaluator.extendOnly()).contains(true)
        assertThat(evaluator.filter()).contains("filter")
        assertThat(evaluator.groupBy()).contains(Evaluator.GroupBy.THREAD_ID)
        assertThat(evaluator.includeExtendedStats()).contains(true)
        assertThat(evaluator.isEnabled()).contains(true)
        assertThat(evaluator.numFewShotExamples()).contains(0L)
        assertThat(evaluator.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(evaluator.sessionName()).contains("session_name")
        assertThat(evaluator.spendLimit())
            .contains(
                Evaluator.SpendLimit.builder()
                    .limitUsd("limit_usd")
                    .window(Evaluator.SpendLimit.Window.WEEKLY)
                    .build()
            )
        assertThat(evaluator.spendUsd()).contains(0.0)
        assertThat(evaluator.traceCount()).contains(0L)
        assertThat(evaluator.traceFilter()).contains("trace_filter")
        assertThat(evaluator.isTransient()).contains(true)
        assertThat(evaluator.treeFilter()).contains("tree_filter")
        assertThat(evaluator.useCorrectionsDataset()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evaluator =
            Evaluator.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .evaluatorVersion(0L)
                .samplingRate(0.0)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addWebhook(
                    EvaluatorWebhook.builder()
                        .url("url")
                        .headers(
                            EvaluatorWebhook.Headers.builder()
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
                    EvaluatorPagerdutyAlert.builder()
                        .routingKey("routing_key")
                        .severity(EvaluatorPagerdutyAlert.Severity.CRITICAL)
                        .summary("summary")
                        .type(EvaluatorPagerdutyAlert.Type.PAGERDUTY)
                        .build()
                )
                .alignmentAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backfillCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .backfillError("backfill_error")
                .backfillFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .backfillId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backfillProgress(0.0)
                .backfillStatus("backfill_status")
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
                                .model(
                                    EvaluatorTopLevel.Structured.Model.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPrompt(
                                    listOf(
                                        JsonValue.from(mapOf<String, Any>()),
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                )
                                .schema(
                                    EvaluatorTopLevel.Structured.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
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
                .extendEvaluatorTraceRetention(true)
                .extendOnly(true)
                .filter("filter")
                .groupBy(Evaluator.GroupBy.THREAD_ID)
                .includeExtendedStats(true)
                .isEnabled(true)
                .numFewShotExamples(0L)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionName("session_name")
                .spendLimit(
                    Evaluator.SpendLimit.builder()
                        .limitUsd("limit_usd")
                        .window(Evaluator.SpendLimit.Window.WEEKLY)
                        .build()
                )
                .spendUsd(0.0)
                .traceCount(0L)
                .traceFilter("trace_filter")
                .isTransient(true)
                .treeFilter("tree_filter")
                .useCorrectionsDataset(true)
                .build()

        val roundtrippedEvaluator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluator),
                jacksonTypeRef<Evaluator>(),
            )

        assertThat(roundtrippedEvaluator).isEqualTo(evaluator)
    }
}
