// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueRetrieveParamsTest {

    @Test
    fun create() {
        AnnotationQueueRetrieveParams.builder()
            .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .index(0L)
            .includeExtra(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AnnotationQueueRetrieveParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .index(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AnnotationQueueRetrieveParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .index(0L)
                .includeExtra(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_extra", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AnnotationQueueRetrieveParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .index(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
