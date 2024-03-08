// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AnnotationQueueRunSchemaTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createAnnotationQueueRunSchema() { // templates/JavaSDK/entities/testing.ts:18:13
        val annotationQueueRunSchema =
            AnnotationQueueRunSchema.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(annotationQueueRunSchema).isNotNull
        assertThat(annotationQueueRunSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRunSchema.queueId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRunSchema.runId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(annotationQueueRunSchema.addedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(annotationQueueRunSchema.lastReviewedTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
