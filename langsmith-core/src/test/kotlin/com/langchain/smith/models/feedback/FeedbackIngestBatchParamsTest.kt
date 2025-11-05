// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackIngestBatchParamsTest {

    @Test
    fun create() {
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
                                FeedbackIngestBatchParams.Body.FeedbackConfig.Category.builder()
                                    .label("x")
                                    .value(0.0)
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .type(FeedbackIngestBatchParams.Body.FeedbackConfig.Type.CONTINUOUS)
                            .build()
                    )
                    .feedbackGroupId("feedback_group_id")
                    .feedbackSource(
                        FeedbackIngestBatchParams.Body.FeedbackSource.builder()
                            .metadata(
                                FeedbackIngestBatchParams.Body.FeedbackSource.Metadata.builder()
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
    }

    @Test
    fun body() {
        val params =
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
                                    FeedbackIngestBatchParams.Body.FeedbackConfig.Category.builder()
                                        .label("x")
                                        .value(0.0)
                                        .build()
                                )
                                .max(0.0)
                                .min(0.0)
                                .type(FeedbackIngestBatchParams.Body.FeedbackConfig.Type.CONTINUOUS)
                                .build()
                        )
                        .feedbackGroupId("feedback_group_id")
                        .feedbackSource(
                            FeedbackIngestBatchParams.Body.FeedbackSource.builder()
                                .metadata(
                                    FeedbackIngestBatchParams.Body.FeedbackSource.Metadata.builder()
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
                                FeedbackIngestBatchParams.Body.FeedbackConfig.Category.builder()
                                    .label("x")
                                    .value(0.0)
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .type(FeedbackIngestBatchParams.Body.FeedbackConfig.Type.CONTINUOUS)
                            .build()
                    )
                    .feedbackGroupId("feedback_group_id")
                    .feedbackSource(
                        FeedbackIngestBatchParams.Body.FeedbackSource.builder()
                            .metadata(
                                FeedbackIngestBatchParams.Body.FeedbackSource.Metadata.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackIngestBatchParams.builder()
                .addBody(FeedbackIngestBatchParams.Body.builder().build())
                .build()

        val body = params._body()

        assertThat(body).containsExactly(FeedbackIngestBatchParams.Body.builder().build())
    }
}
