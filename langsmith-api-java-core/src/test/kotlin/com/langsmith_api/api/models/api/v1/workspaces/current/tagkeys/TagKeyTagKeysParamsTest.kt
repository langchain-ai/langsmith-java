// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagKeyTagKeysParamsTest {

    @Test
    fun create() {
        TagKeyTagKeysParams.builder().key("x").description("description").build()
    }

    @Test
    fun body() {
        val params = TagKeyTagKeysParams.builder().key("x").description("description").build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("x")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TagKeyTagKeysParams.builder().key("x").build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("x")
    }
}
