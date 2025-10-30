// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.feedback.FeedbackIngestBatchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FeedbackServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun ingestBatch() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackService = client.feedback()

        val response =
            feedbackService.ingestBatch(
                FeedbackIngestBatchParams.builder()
                    .addBody(
                        FeedbackIngestBatchParams.Body.builder()
                            .id("id")
                            .comment("comment")
                            .comparativeExperimentId("comparative_experiment_id")
                            .correction(JsonValue.from(mapOf<String, Any>()))
                            .createdAt("created_at")
                            .error(true)
                            .feedbackConfig(
                                FeedbackIngestBatchParams.Body.FeedbackConfig.builder()
                                    .addCategory(
                                        FeedbackIngestBatchParams.Body.FeedbackConfig.Category
                                            .builder()
                                            .label("x")
                                            .value(0.0)
                                            .build()
                                    )
                                    .max(0.0)
                                    .min(0.0)
                                    .type(
                                        FeedbackIngestBatchParams.Body.FeedbackConfig.Type
                                            .CONTINUOUS
                                    )
                                    .build()
                            )
                            .feedbackGroupId("feedback_group_id")
                            .feedbackSource(
                                FeedbackIngestBatchParams.Body.FeedbackSource.builder()
                                    .metadata(
                                        FeedbackIngestBatchParams.Body.FeedbackSource.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .type("type")
                                    .build()
                            )
                            .key("key")
                            .modifiedAt("modified_at")
                            .runId("run_id")
                            .score(JsonValue.from(mapOf<String, Any>()))
                            .sessionId("session_id")
                            .traceId("trace_id")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
