// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.schemas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaRetrieveTooldefJsonParamsTest {

    @Test
    fun create() {
        SchemaRetrieveTooldefJsonParams.builder().version("version").build()
    }

    @Test
    fun pathParams() {
        val params = SchemaRetrieveTooldefJsonParams.builder().version("version").build()

        assertThat(params._pathParam(0)).isEqualTo("version")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
