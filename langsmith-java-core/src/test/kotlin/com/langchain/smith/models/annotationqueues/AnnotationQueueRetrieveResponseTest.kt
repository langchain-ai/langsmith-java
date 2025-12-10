// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueRetrieveResponseTest {

    @Test
    fun create() {
        val annotationQueueRetrieveResponse =
            AnnotationQueueRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .queueType(AnnotationQueueRetrieveResponse.QueueType.SINGLE)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .metadata(
                    AnnotationQueueRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .rubricInstructions("rubric_instructions")
                .addRubricItem(
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
                )
                .runRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(annotationQueueRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveResponse.name()).isEqualTo("name")
        assertThat(annotationQueueRetrieveResponse.queueType())
            .isEqualTo(AnnotationQueueRetrieveResponse.QueueType.SINGLE)
        assertThat(annotationQueueRetrieveResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(annotationQueueRetrieveResponse.defaultDataset())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveResponse.description()).contains("description")
        assertThat(annotationQueueRetrieveResponse.enableReservations()).contains(true)
        assertThat(annotationQueueRetrieveResponse.metadata())
            .contains(
                AnnotationQueueRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(annotationQueueRetrieveResponse.numReviewersPerItem()).contains(0L)
        assertThat(annotationQueueRetrieveResponse.reservationMinutes()).contains(0L)
        assertThat(annotationQueueRetrieveResponse.rubricInstructions())
            .contains("rubric_instructions")
        assertThat(annotationQueueRetrieveResponse.rubricItems().getOrNull())
            .containsExactly(
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
            )
        assertThat(annotationQueueRetrieveResponse.runRuleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveResponse.sourceRuleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueRetrieveResponse =
            AnnotationQueueRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .queueType(AnnotationQueueRetrieveResponse.QueueType.SINGLE)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .metadata(
                    AnnotationQueueRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .rubricInstructions("rubric_instructions")
                .addRubricItem(
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
                )
                .runRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAnnotationQueueRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueRetrieveResponse),
                jacksonTypeRef<AnnotationQueueRetrieveResponse>(),
            )

        assertThat(roundtrippedAnnotationQueueRetrieveResponse)
            .isEqualTo(annotationQueueRetrieveResponse)
    }
}
