// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueRetrieveAnnotationQueuesResponseTest {

    @Test
    fun create() {
        val annotationQueueRetrieveAnnotationQueuesResponse =
            AnnotationQueueRetrieveAnnotationQueuesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .totalRuns(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .runRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.name()).isEqualTo("name")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.totalRuns()).isEqualTo(0L)
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.defaultDataset())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.description())
            .contains("description")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.enableReservations())
            .contains(true)
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.numReviewersPerItem())
            .contains(0L)
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.reservationMinutes())
            .contains(0L)
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.runRuleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.sourceRuleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRetrieveAnnotationQueuesResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueRetrieveAnnotationQueuesResponse =
            AnnotationQueueRetrieveAnnotationQueuesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .totalRuns(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .runRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAnnotationQueueRetrieveAnnotationQueuesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueRetrieveAnnotationQueuesResponse),
                jacksonTypeRef<AnnotationQueueRetrieveAnnotationQueuesResponse>(),
            )

        assertThat(roundtrippedAnnotationQueueRetrieveAnnotationQueuesResponse)
            .isEqualTo(annotationQueueRetrieveAnnotationQueuesResponse)
    }
}
