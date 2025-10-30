// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1UpdateParamsTest {

    @Test
    fun create() {
        V1UpdateParams.builder().owner("owner").repo("repo").like(true).build()
    }

    @Test
    fun pathParams() {
        val params = V1UpdateParams.builder().owner("owner").repo("repo").like(true).build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = V1UpdateParams.builder().owner("owner").repo("repo").like(true).build()

        val body = params._body()

        assertThat(body.like()).isEqualTo(true)
    }
}
