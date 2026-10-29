// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.evaluators.EvaluatorCreateDecisionModelParams
import com.langchain.smith.models.evaluators.EvaluatorListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EvaluatorServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val evaluatorServiceAsync = client.evaluators()

        val evaluatorsFuture =
            evaluatorServiceAsync.list(
                EvaluatorListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeBackfillProgress(true)
                    .nameContains("name_contains")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(EvaluatorListParams.Type.SESSION)
                    .build()
            )

        val evaluators = evaluatorsFuture.get()
        evaluators.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDecisionModel() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val evaluatorServiceAsync = client.evaluators()

        val evaluatorFuture =
            evaluatorServiceAsync.createDecisionModel(
                EvaluatorCreateDecisionModelParams.builder()
                    .displayName("display_name")
                    .addPrompt(
                        listOf(
                            JsonValue.from(mapOf<String, Any>()),
                            JsonValue.from(mapOf<String, Any>()),
                        )
                    )
                    .questions(
                        EvaluatorCreateDecisionModelParams.Questions.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "instructions" to "instructions",
                                        "type" to "noul",
                                        "levels" to listOf("string"),
                                        "no" to "no",
                                        "options" to listOf("string"),
                                        "yes" to "yes",
                                    )
                                ),
                            )
                            .build()
                    )
                    .baseUrl("base_url")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter("filter")
                    .maxRetries(0L)
                    .model("model")
                    .modelHeaders(
                        EvaluatorCreateDecisionModelParams.ModelHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .playgroundSettingsId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .provider(EvaluatorCreateDecisionModelParams.Provider.TYPESAFE)
                    .samplingRate(0.0)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .templateFormat(EvaluatorCreateDecisionModelParams.TemplateFormat.MUSTACHE)
                    .timeoutSeconds(0L)
                    .variableMapping(
                        EvaluatorCreateDecisionModelParams.VariableMapping.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val evaluator = evaluatorFuture.get()
        evaluator.validate()
    }
}
