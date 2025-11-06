// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.runs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.runs.rules.CodeEvaluatorTopLevel
import com.langchain.smith.models.runs.rules.EvaluatorTopLevel
import com.langchain.smith.models.runs.rules.RuleCreateParams
import com.langchain.smith.models.runs.rules.RuleListParams
import com.langchain.smith.models.runs.rules.RuleRetrieveLogsParams
import com.langchain.smith.models.runs.rules.RuleUpdateParams
import com.langchain.smith.models.runs.rules.RunRulesPagerdutyAlertSchema
import com.langchain.smith.models.runs.rules.RunRulesWebhookSchema
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ruleService = client.runs().rules()

        val runRulesSchema =
            ruleService.create(
                RuleCreateParams.builder()
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
                    .groupBy(RuleCreateParams.GroupBy.THREAD_ID)
                    .includeExtendedStats(true)
                    .isEnabled(true)
                    .numFewShotExamples(0L)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .isTransient(true)
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
            )

        runRulesSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ruleService = client.runs().rules()

        val runRulesSchema =
            ruleService.update(
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
                    .isTransient(true)
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
            )

        runRulesSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ruleService = client.runs().rules()

        val runRulesSchemata =
            ruleService.list(
                RuleListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nameContains("name_contains")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(RuleListParams.Type.SESSION)
                    .build()
            )

        runRulesSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ruleService = client.runs().rules()

        val rule = ruleService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        rule.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLastApplied() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ruleService = client.runs().rules()

        val ruleLogSchema = ruleService.retrieveLastApplied("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        ruleLogSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLogs() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val ruleService = client.runs().rules()

        val ruleLogSchemata =
            ruleService.retrieveLogs(
                RuleRetrieveLogsParams.builder()
                    .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(100L)
                    .offset(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        ruleLogSchemata.forEach { it.validate() }
    }
}
