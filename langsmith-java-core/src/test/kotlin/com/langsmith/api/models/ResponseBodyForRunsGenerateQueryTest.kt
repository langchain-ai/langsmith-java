// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponseBodyForRunsGenerateQueryTest {

    @Test
    fun createResponseBodyForRunsGenerateQuery() {
        val responseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery.builder().filter("string").build()
        assertThat(responseBodyForRunsGenerateQuery).isNotNull
        assertThat(responseBodyForRunsGenerateQuery.filter()).isEqualTo("string")
    }
}
