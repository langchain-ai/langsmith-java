// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolCreateParamsTest {

    @Test
    fun create() {
        PoolCreateParams.builder()
            .name("name")
            .replicas(1L)
            .templateName("template_name")
            .timeout(0L)
            .waitForReady(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            PoolCreateParams.builder()
                .name("name")
                .replicas(1L)
                .templateName("template_name")
                .timeout(0L)
                .waitForReady(true)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.replicas()).isEqualTo(1L)
        assertThat(body.templateName()).isEqualTo("template_name")
        assertThat(body.timeout()).contains(0L)
        assertThat(body.waitForReady()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PoolCreateParams.builder()
                .name("name")
                .replicas(1L)
                .templateName("template_name")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.replicas()).isEqualTo(1L)
        assertThat(body.templateName()).isEqualTo("template_name")
    }
}
