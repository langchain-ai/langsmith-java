// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolListResponseTest {

    @Test
    fun create() {
        val poolListResponse =
            PoolListResponse.builder()
                .offset(0L)
                .addPool(
                    PoolListResponse.Pool.builder()
                        .id("id")
                        .createdAt("created_at")
                        .name("name")
                        .replicas(0L)
                        .templateName("template_name")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(poolListResponse.offset()).contains(0L)
        assertThat(poolListResponse.pools().getOrNull())
            .containsExactly(
                PoolListResponse.Pool.builder()
                    .id("id")
                    .createdAt("created_at")
                    .name("name")
                    .replicas(0L)
                    .templateName("template_name")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poolListResponse =
            PoolListResponse.builder()
                .offset(0L)
                .addPool(
                    PoolListResponse.Pool.builder()
                        .id("id")
                        .createdAt("created_at")
                        .name("name")
                        .replicas(0L)
                        .templateName("template_name")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedPoolListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poolListResponse),
                jacksonTypeRef<PoolListResponse>(),
            )

        assertThat(roundtrippedPoolListResponse).isEqualTo(poolListResponse)
    }
}
