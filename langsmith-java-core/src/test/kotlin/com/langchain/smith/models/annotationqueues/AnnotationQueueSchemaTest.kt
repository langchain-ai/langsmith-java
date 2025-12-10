// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueSchemaTest {

    @Test
    fun create() {
        val annotationQueueSchema =
            AnnotationQueueSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .queueType(AnnotationQueueSchema.QueueType.SINGLE)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .metadata(
                    AnnotationQueueSchema.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .runRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(annotationQueueSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueSchema.name()).isEqualTo("name")
        assertThat(annotationQueueSchema.queueType())
            .isEqualTo(AnnotationQueueSchema.QueueType.SINGLE)
        assertThat(annotationQueueSchema.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(annotationQueueSchema.defaultDataset())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueSchema.description()).contains("description")
        assertThat(annotationQueueSchema.enableReservations()).contains(true)
        assertThat(annotationQueueSchema.metadata())
            .contains(
                AnnotationQueueSchema.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(annotationQueueSchema.numReviewersPerItem()).contains(0L)
        assertThat(annotationQueueSchema.reservationMinutes()).contains(0L)
        assertThat(annotationQueueSchema.runRuleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueSchema.sourceRuleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueSchema.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueSchema =
            AnnotationQueueSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .queueType(AnnotationQueueSchema.QueueType.SINGLE)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .metadata(
                    AnnotationQueueSchema.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .runRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAnnotationQueueSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueSchema),
                jacksonTypeRef<AnnotationQueueSchema>(),
            )

        assertThat(roundtrippedAnnotationQueueSchema).isEqualTo(annotationQueueSchema)
    }
}
