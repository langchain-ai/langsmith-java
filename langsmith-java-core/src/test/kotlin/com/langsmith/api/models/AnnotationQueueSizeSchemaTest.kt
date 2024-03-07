// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AnnotationQueueSizeSchemaTest {

    @Test
    fun createAnnotationQueueSizeSchema() {
        val annotationQueueSizeSchema = AnnotationQueueSizeSchema.builder().size(123L).build()
        assertThat(annotationQueueSizeSchema).isNotNull
        assertThat(annotationQueueSizeSchema.size()).isEqualTo(123L)
    }
}
