// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.runs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveParamsTest {

    @Test
    fun create() {
        RunRetrieveParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .excludeS3StoredAttributes(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunRetrieveParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RunRetrieveParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .excludeS3StoredAttributes(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("exclude_s3_stored_attributes", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunRetrieveParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
