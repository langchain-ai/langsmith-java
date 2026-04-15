// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolUpdateParamsTest {

    @Test
    fun create() {
        PoolUpdateParams.builder().pathName("name").bodyName("name").replicas(0L).build()
    }

    @Test
    fun pathParams() {
        val params = PoolUpdateParams.builder().pathName("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PoolUpdateParams.builder().pathName("name").bodyName("name").replicas(0L).build()

        val body = params._body()

        assertThat(body.bodyName()).contains("name")
        assertThat(body.replicas()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PoolUpdateParams.builder().pathName("name").build()

        val body = params._body()
    }
}
