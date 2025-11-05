// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueUpdateResponseTest {

    @Test
    fun create() {
        val annotationQueueUpdateResponse = AnnotationQueueUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueUpdateResponse = AnnotationQueueUpdateResponse.builder().build()

        val roundtrippedAnnotationQueueUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueUpdateResponse),
                jacksonTypeRef<AnnotationQueueUpdateResponse>(),
            )

        assertThat(roundtrippedAnnotationQueueUpdateResponse)
            .isEqualTo(annotationQueueUpdateResponse)
    }
}
