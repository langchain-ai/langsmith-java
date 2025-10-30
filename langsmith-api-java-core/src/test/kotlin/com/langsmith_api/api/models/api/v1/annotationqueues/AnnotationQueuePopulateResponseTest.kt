// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueuePopulateResponseTest {

    @Test
    fun create() {
        val annotationQueuePopulateResponse = AnnotationQueuePopulateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueuePopulateResponse = AnnotationQueuePopulateResponse.builder().build()

        val roundtrippedAnnotationQueuePopulateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueuePopulateResponse),
                jacksonTypeRef<AnnotationQueuePopulateResponse>(),
            )

        assertThat(roundtrippedAnnotationQueuePopulateResponse)
            .isEqualTo(annotationQueuePopulateResponse)
    }
}
