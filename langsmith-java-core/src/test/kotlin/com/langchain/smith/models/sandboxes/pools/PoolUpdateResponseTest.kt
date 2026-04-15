// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolUpdateResponseTest {

    @Test
    fun create() {
        val poolUpdateResponse =
            PoolUpdateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .name("name")
                .replicas(0L)
                .templateName("template_name")
                .updatedAt("updated_at")
                .build()

        assertThat(poolUpdateResponse.id()).contains("id")
        assertThat(poolUpdateResponse.createdAt()).contains("created_at")
        assertThat(poolUpdateResponse.name()).contains("name")
        assertThat(poolUpdateResponse.replicas()).contains(0L)
        assertThat(poolUpdateResponse.templateName()).contains("template_name")
        assertThat(poolUpdateResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poolUpdateResponse =
            PoolUpdateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .name("name")
                .replicas(0L)
                .templateName("template_name")
                .updatedAt("updated_at")
                .build()

        val roundtrippedPoolUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poolUpdateResponse),
                jacksonTypeRef<PoolUpdateResponse>(),
            )

        assertThat(roundtrippedPoolUpdateResponse).isEqualTo(poolUpdateResponse)
    }
}
