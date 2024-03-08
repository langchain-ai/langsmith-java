// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunGenerateQueryCreateParamsTest {

    @Test
    fun createRunGenerateQueryCreateParams() {
        RunGenerateQueryCreateParams.builder().query("string").build()
    }

    @Test
    fun getBody() {
        val params = RunGenerateQueryCreateParams.builder().query("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.query()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = RunGenerateQueryCreateParams.builder().query("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.query()).isEqualTo("string")
    }
}
