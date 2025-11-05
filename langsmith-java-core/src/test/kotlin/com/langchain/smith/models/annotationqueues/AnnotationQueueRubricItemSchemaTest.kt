// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueRubricItemSchemaTest {

    @Test
    fun create() {
        val annotationQueueRubricItemSchema =
            AnnotationQueueRubricItemSchema.builder()
                .feedbackKey("feedback_key")
                .description("description")
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
