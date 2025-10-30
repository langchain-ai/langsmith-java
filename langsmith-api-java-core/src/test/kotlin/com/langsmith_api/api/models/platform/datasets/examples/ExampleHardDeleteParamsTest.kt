// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.datasets.examples

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleHardDeleteParamsTest {

    @Test
    fun create() {
        ExampleHardDeleteParams.builder().addExampleId("string").hardDelete(true).build()
    }

    @Test
    fun body() {
        val params =
            ExampleHardDeleteParams.builder().addExampleId("string").hardDelete(true).build()

        val body = params._body()

        assertThat(body.exampleIds()).containsExactly("string")
        assertThat(body.hardDelete()).isEqualTo(true)
    }
}
