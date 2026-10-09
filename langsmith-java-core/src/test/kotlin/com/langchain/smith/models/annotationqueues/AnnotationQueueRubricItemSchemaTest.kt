// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueRubricItemSchemaTest {

    @Test
    fun create() {
        val annotationQueueRubricItemSchema =
            AnnotationQueueRubricItemSchema.builder()
                .feedbackKey("feedback_key")
                .description("description")
                .feedbackConfig(
                    AnnotationQueueRubricItemSchema.FeedbackConfig.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .feedbackConfig(
                            AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig
                                .builder()
                                .type(
                                    AnnotationQueueRubricItemSchema.FeedbackConfig
                                        .InnerFeedbackConfig
                                        .Type
                                        .CONTINUOUS
                                )
                                .addCategory(
                                    AnnotationQueueRubricItemSchema.FeedbackConfig
                                        .InnerFeedbackConfig
                                        .Category
                                        .builder()
                                        .value(0.0)
                                        .label("x")
                                        .build()
                                )
                                .max(0.0)
                                .min(0.0)
                                .build()
                        )
                        .feedbackKey("feedback_key")
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .isLowerScoreBetter(true)
                        .build()
                )
                .feedbackConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isAssertion(true)
                .isRequired(true)
                .regexValidator("string")
                .scoreDescriptions(
                    AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .valueDescriptions(
                    AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(annotationQueueRubricItemSchema.feedbackKey()).isEqualTo("feedback_key")
        assertThat(annotationQueueRubricItemSchema.description()).contains("description")
        assertThat(annotationQueueRubricItemSchema.feedbackConfig())
            .contains(
                AnnotationQueueRubricItemSchema.FeedbackConfig.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackConfig(
                        AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig.builder()
                            .type(
                                AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig
                                    .Type
                                    .CONTINUOUS
                            )
                            .addCategory(
                                AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig
                                    .Category
                                    .builder()
                                    .value(0.0)
                                    .label("x")
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackKey("feedback_key")
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isLowerScoreBetter(true)
                    .build()
            )
        assertThat(annotationQueueRubricItemSchema.feedbackConfigId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRubricItemSchema.isAssertion()).contains(true)
        assertThat(annotationQueueRubricItemSchema.isRequired()).contains(true)
        assertThat(annotationQueueRubricItemSchema.regexValidator())
            .contains(AnnotationQueueRubricItemSchema.RegexValidator.ofString("string"))
        assertThat(annotationQueueRubricItemSchema.scoreDescriptions())
            .contains(
                AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(annotationQueueRubricItemSchema.valueDescriptions())
            .contains(
                AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueRubricItemSchema =
            AnnotationQueueRubricItemSchema.builder()
                .feedbackKey("feedback_key")
                .description("description")
                .feedbackConfig(
                    AnnotationQueueRubricItemSchema.FeedbackConfig.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .feedbackConfig(
                            AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig
                                .builder()
                                .type(
                                    AnnotationQueueRubricItemSchema.FeedbackConfig
                                        .InnerFeedbackConfig
                                        .Type
                                        .CONTINUOUS
                                )
                                .addCategory(
                                    AnnotationQueueRubricItemSchema.FeedbackConfig
                                        .InnerFeedbackConfig
                                        .Category
                                        .builder()
                                        .value(0.0)
                                        .label("x")
                                        .build()
                                )
                                .max(0.0)
                                .min(0.0)
                                .build()
                        )
                        .feedbackKey("feedback_key")
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .isLowerScoreBetter(true)
                        .build()
                )
                .feedbackConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isAssertion(true)
                .isRequired(true)
                .regexValidator("string")
                .scoreDescriptions(
                    AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .valueDescriptions(
                    AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedAnnotationQueueRubricItemSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueRubricItemSchema),
                jacksonTypeRef<AnnotationQueueRubricItemSchema>(),
            )

        assertThat(roundtrippedAnnotationQueueRubricItemSchema)
            .isEqualTo(annotationQueueRubricItemSchema)
    }
}
