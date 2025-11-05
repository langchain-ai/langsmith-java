// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueDeleteResponseTest {

    @Test
    fun create() {
        val annotationQueueDeleteResponse = AnnotationQueueDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueDeleteResponse = AnnotationQueueDeleteResponse.builder().build()

        val roundtrippedAnnotationQueueDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueDeleteResponse),
                jacksonTypeRef<AnnotationQueueDeleteResponse>(),
            )

        assertThat(roundtrippedAnnotationQueueDeleteResponse)
            .isEqualTo(annotationQueueDeleteResponse)
    }
}
