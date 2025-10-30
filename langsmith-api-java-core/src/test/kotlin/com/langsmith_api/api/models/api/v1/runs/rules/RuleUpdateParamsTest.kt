// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.langsmith_api.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleUpdateParamsTest {

    @Test
    fun create() {
        RuleUpdateParams.builder()
            .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .displayName("display_name")
            .samplingRate(0.0)
            .addToAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addToDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addToDatasetPreferCorrection(true)
            .addAlert(
                RunRulesPagerdutyAlertSchema.builder()
                    .routingKey("routing_key")
                    .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                    .summary("summary")
                    .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                    .build()
            )
            .backfillFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addCodeEvaluator(
                CodeEvaluatorTopLevel.builder()
                    .code("code")
                    .language(CodeEvaluatorTopLevel.Language.PYTHON)
                    .build()
            )
            .createAlignmentQueue(true)
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .evaluatorVersion(0L)
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
            .includeExtendedStats(true)
            .isEnabled(true)
            .numFewShotExamples(0L)
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .traceFilter("trace_filter")
            .transient_(true)
            .treeFilter("tree_filter")
            .useCorrectionsDataset(true)
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleUpdateParams.builder()
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayName("display_name")
                .samplingRate(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RuleUpdateParams.builder()
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayName("display_name")
                .samplingRate(0.0)
                .addToAnnotationQueueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addToDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addToDatasetPreferCorrection(true)
                .addAlert(
                    RunRulesPagerdutyAlertSchema.builder()
                        .routingKey("routing_key")
                        .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                        .summary("summary")
                        .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                        .build()
                )
                .backfillFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCodeEvaluator(
                    CodeEvaluatorTopLevel.builder()
                        .code("code")
                        .language(CodeEvaluatorTopLevel.Language.PYTHON)
                        .build()
                )
                .createAlignmentQueue(true)
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluatorVersion(0L)
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
                .includeExtendedStats(true)
                .isEnabled(true)
                .numFewShotExamples(0L)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .traceFilter("trace_filter")
                .transient_(true)
                .treeFilter("tree_filter")
                .useCorrectionsDataset(true)
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
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.samplingRate()).isEqualTo(0.0)
        assertThat(body.addToAnnotationQueueId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.addToDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.addToDatasetPreferCorrection()).contains(true)
        assertThat(body.alerts().getOrNull())
            .containsExactly(
                RunRulesPagerdutyAlertSchema.builder()
                    .routingKey("routing_key")
                    .severity(RunRulesPagerdutyAlertSchema.Severity.CRITICAL)
                    .summary("summary")
                    .type(RunRulesPagerdutyAlertSchema.Type.PAGERDUTY)
                    .build()
            )
        assertThat(body.backfillFrom()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.codeEvaluators().getOrNull())
            .containsExactly(
                CodeEvaluatorTopLevel.builder()
                    .code("code")
                    .language(CodeEvaluatorTopLevel.Language.PYTHON)
                    .build()
            )
        assertThat(body.createAlignmentQueue()).contains(true)
        assertThat(body.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.evaluatorVersion()).contains(0L)
        assertThat(body.evaluators().getOrNull())
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
        assertThat(body.extendOnly()).contains(true)
        assertThat(body.filter()).contains("filter")
        assertThat(body.includeExtendedStats()).contains(true)
        assertThat(body.isEnabled()).contains(true)
        assertThat(body.numFewShotExamples()).contains(0L)
        assertThat(body.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.traceFilter()).contains("trace_filter")
        assertThat(body.transient_()).contains(true)
        assertThat(body.treeFilter()).contains("tree_filter")
        assertThat(body.useCorrectionsDataset()).contains(true)
        assertThat(body.webhooks().getOrNull())
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuleUpdateParams.builder()
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .displayName("display_name")
                .samplingRate(0.0)
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.samplingRate()).isEqualTo(0.0)
    }
}
