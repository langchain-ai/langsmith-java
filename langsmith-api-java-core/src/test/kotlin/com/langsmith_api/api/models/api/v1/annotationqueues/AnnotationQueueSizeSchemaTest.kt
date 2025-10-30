// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueSizeSchemaTest {

    @Test
    fun create() {
        val annotationQueueSizeSchema = AnnotationQueueSizeSchema.builder().size(0L).build()

        assertThat(annotationQueueSizeSchema.size()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueSizeSchema = AnnotationQueueSizeSchema.builder().size(0L).build()

        val roundtrippedAnnotationQueueSizeSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueSizeSchema),
                jacksonTypeRef<AnnotationQueueSizeSchema>(),
            )

        assertThat(roundtrippedAnnotationQueueSizeSchema).isEqualTo(annotationQueueSizeSchema)
    }
}
