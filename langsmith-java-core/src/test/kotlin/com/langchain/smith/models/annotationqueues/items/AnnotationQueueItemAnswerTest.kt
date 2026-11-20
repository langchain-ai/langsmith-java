// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueItemAnswerTest {

    @Test
    fun create() {
        val annotationQueueItemAnswer =
            AnnotationQueueItemAnswer.builder()
                .score(0.0)
                .addScore(0.0)
                .value("value")
                .addValue("string")
                .build()

        assertThat(annotationQueueItemAnswer.score()).contains(0.0)
        assertThat(annotationQueueItemAnswer.scores().getOrNull()).containsExactly(0.0)
        assertThat(annotationQueueItemAnswer.value()).contains("value")
        assertThat(annotationQueueItemAnswer.values().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueItemAnswer =
            AnnotationQueueItemAnswer.builder()
                .score(0.0)
                .addScore(0.0)
                .value("value")
                .addValue("string")
                .build()

        val roundtrippedAnnotationQueueItemAnswer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueItemAnswer),
                jacksonTypeRef<AnnotationQueueItemAnswer>(),
            )

        assertThat(roundtrippedAnnotationQueueItemAnswer).isEqualTo(annotationQueueItemAnswer)
    }
}
