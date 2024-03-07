// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRunCreateParamsTest {

    @Test
    fun createDatasetRunCreateParams() {
        DatasetRunCreateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .filters(DatasetRunCreateParams.Filters.builder().build())
            .limit(123L)
            .offset(123L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetRunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .filters(DatasetRunCreateParams.Filters.builder().build())
                .limit(123L)
                .offset(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.sessionIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.filters()).isEqualTo(DatasetRunCreateParams.Filters.builder().build())
        assertThat(body.limit()).isEqualTo(123L)
        assertThat(body.offset()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetRunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.sessionIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetRunCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
