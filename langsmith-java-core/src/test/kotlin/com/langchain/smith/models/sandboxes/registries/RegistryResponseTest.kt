// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.registries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegistryResponseTest {

    @Test
    fun create() {
        val registryResponse =
            RegistryResponse.builder()
                .id("id")
                .createdAt("created_at")
                .createdBy("created_by")
                .name("name")
                .updatedAt("updated_at")
                .updatedBy("updated_by")
                .url("url")
                .build()

        assertThat(registryResponse.id()).contains("id")
        assertThat(registryResponse.createdAt()).contains("created_at")
        assertThat(registryResponse.createdBy()).contains("created_by")
        assertThat(registryResponse.name()).contains("name")
        assertThat(registryResponse.updatedAt()).contains("updated_at")
        assertThat(registryResponse.updatedBy()).contains("updated_by")
        assertThat(registryResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val registryResponse =
            RegistryResponse.builder()
                .id("id")
                .createdAt("created_at")
                .createdBy("created_by")
                .name("name")
                .updatedAt("updated_at")
                .updatedBy("updated_by")
                .url("url")
                .build()

        val roundtrippedRegistryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(registryResponse),
                jacksonTypeRef<RegistryResponse>(),
            )

        assertThat(roundtrippedRegistryResponse).isEqualTo(registryResponse)
    }
}
