// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueuePopulateParamsTest {

    @Test
    fun create() {
        AnnotationQueuePopulateParams.builder()
            .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            AnnotationQueuePopulateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.queueId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
