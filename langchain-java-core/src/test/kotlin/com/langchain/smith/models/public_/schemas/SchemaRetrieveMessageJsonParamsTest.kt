// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.schemas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaRetrieveMessageJsonParamsTest {

    @Test
    fun create() {
        SchemaRetrieveMessageJsonParams.builder().version("version").build()
    }

    @Test
    fun pathParams() {
        val params = SchemaRetrieveMessageJsonParams.builder().version("version").build()

        assertThat(params._pathParam(0)).isEqualTo("version")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
