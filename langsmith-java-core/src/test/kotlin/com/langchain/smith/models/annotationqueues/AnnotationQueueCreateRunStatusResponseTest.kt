// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueCreateRunStatusResponseTest {

    @Test
    fun create() {
        val annotationQueueCreateRunStatusResponse =
            AnnotationQueueCreateRunStatusResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueCreateRunStatusResponse =
            AnnotationQueueCreateRunStatusResponse.builder().build()

        val roundtrippedAnnotationQueueCreateRunStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueCreateRunStatusResponse),
                jacksonTypeRef<AnnotationQueueCreateRunStatusResponse>(),
            )

        assertThat(roundtrippedAnnotationQueueCreateRunStatusResponse)
            .isEqualTo(annotationQueueCreateRunStatusResponse)
    }
}
