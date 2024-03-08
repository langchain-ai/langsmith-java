// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApiKeyCreateParamsTest {

    @Test
    fun createApiKeyCreateParams() {
        ApiKeyCreateParams.builder().readOnly(true).build()
    }

    @Test
    fun getBody() {
        val params = ApiKeyCreateParams.builder().readOnly(true).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.readOnly()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ApiKeyCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
