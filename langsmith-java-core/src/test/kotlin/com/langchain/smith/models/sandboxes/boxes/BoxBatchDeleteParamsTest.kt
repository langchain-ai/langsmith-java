// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxBatchDeleteParamsTest {

    @Test
    fun create() {
        BoxBatchDeleteParams.builder().addName("string").build()
    }

    @Test
    fun body() {
        val params = BoxBatchDeleteParams.builder().addName("string").build()

        val body = params._body()

        assertThat(body.names().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxBatchDeleteParams.builder().build()

        val body = params._body()
    }
}
