// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolRetrieveResponseTest {

    @Test
    fun create() {
        val poolRetrieveResponse =
            PoolRetrieveResponse.builder()
                .id("id")
                .createdAt("created_at")
                .name("name")
                .replicas(0L)
                .templateName("template_name")
                .updatedAt("updated_at")
                .build()

        assertThat(poolRetrieveResponse.id()).contains("id")
        assertThat(poolRetrieveResponse.createdAt()).contains("created_at")
        assertThat(poolRetrieveResponse.name()).contains("name")
        assertThat(poolRetrieveResponse.replicas()).contains(0L)
        assertThat(poolRetrieveResponse.templateName()).contains("template_name")
        assertThat(poolRetrieveResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poolRetrieveResponse =
            PoolRetrieveResponse.builder()
                .id("id")
                .createdAt("created_at")
                .name("name")
                .replicas(0L)
                .templateName("template_name")
                .updatedAt("updated_at")
                .build()

        val roundtrippedPoolRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poolRetrieveResponse),
                jacksonTypeRef<PoolRetrieveResponse>(),
            )

        assertThat(roundtrippedPoolRetrieveResponse).isEqualTo(poolRetrieveResponse)
    }
}
