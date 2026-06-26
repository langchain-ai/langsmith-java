// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.registries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegistryListResponseTest {

    @Test
    fun create() {
        val registryListResponse =
            RegistryListResponse.builder()
                .offset(0L)
                .addRegistry(
                    RegistryResponse.builder()
                        .id("id")
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .name("name")
                        .updatedAt("updated_at")
                        .updatedBy("updated_by")
                        .url("url")
                        .build()
                )
                .build()

        assertThat(registryListResponse.offset()).contains(0L)
        assertThat(registryListResponse.registries().getOrNull())
            .containsExactly(
                RegistryResponse.builder()
                    .id("id")
                    .createdAt("created_at")
                    .createdBy("created_by")
                    .name("name")
                    .updatedAt("updated_at")
                    .updatedBy("updated_by")
                    .url("url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val registryListResponse =
            RegistryListResponse.builder()
                .offset(0L)
                .addRegistry(
                    RegistryResponse.builder()
                        .id("id")
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .name("name")
                        .updatedAt("updated_at")
                        .updatedBy("updated_by")
                        .url("url")
                        .build()
                )
                .build()

        val roundtrippedRegistryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(registryListResponse),
                jacksonTypeRef<RegistryListResponse>(),
            )

        assertThat(roundtrippedRegistryListResponse).isEqualTo(registryListResponse)
    }
}
