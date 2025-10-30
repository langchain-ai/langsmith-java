// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueExportResponseTest {

    @Test
    fun create() {
        val annotationQueueExportResponse = AnnotationQueueExportResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueExportResponse = AnnotationQueueExportResponse.builder().build()

        val roundtrippedAnnotationQueueExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueExportResponse),
                jacksonTypeRef<AnnotationQueueExportResponse>(),
            )

        assertThat(roundtrippedAnnotationQueueExportResponse)
            .isEqualTo(annotationQueueExportResponse)
    }
}
