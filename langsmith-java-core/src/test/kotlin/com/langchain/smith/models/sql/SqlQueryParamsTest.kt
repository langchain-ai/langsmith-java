// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sql

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqlQueryParamsTest {

    @Test
    fun create() {
        SqlQueryParams.builder()
            .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .query("query")
            .build()
    }

    @Test
    fun body() {
        val params =
            SqlQueryParams.builder()
                .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("query")
                .build()

        val body = params._body()

        assertThat(body.projectIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.query()).isEqualTo("query")
    }
}
