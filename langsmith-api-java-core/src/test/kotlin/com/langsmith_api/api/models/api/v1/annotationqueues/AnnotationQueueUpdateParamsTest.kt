// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueUpdateParamsTest {

    @Test
    fun create() {
        AnnotationQueueUpdateParams.builder()
            .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .overrideAddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status("status")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AnnotationQueueUpdateParams.builder()
                .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AnnotationQueueUpdateParams.builder()
                .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .overrideAddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status("status")
                .build()

        val body = params._body()

        assertThat(body.overrideAddedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.status()).contains("status")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AnnotationQueueUpdateParams.builder()
                .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
