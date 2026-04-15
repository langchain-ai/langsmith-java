// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolCreateResponseTest {

    @Test
    fun create() {
        val poolCreateResponse =
            PoolCreateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .name("name")
                .replicas(0L)
                .templateName("template_name")
                .updatedAt("updated_at")
                .build()

        assertThat(poolCreateResponse.id()).contains("id")
        assertThat(poolCreateResponse.createdAt()).contains("created_at")
        assertThat(poolCreateResponse.name()).contains("name")
        assertThat(poolCreateResponse.replicas()).contains(0L)
        assertThat(poolCreateResponse.templateName()).contains("template_name")
        assertThat(poolCreateResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poolCreateResponse =
            PoolCreateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .name("name")
                .replicas(0L)
                .templateName("template_name")
                .updatedAt("updated_at")
                .build()

        val roundtrippedPoolCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poolCreateResponse),
                jacksonTypeRef<PoolCreateResponse>(),
            )

        assertThat(roundtrippedPoolCreateResponse).isEqualTo(poolCreateResponse)
    }
}
