// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.taggings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceTest {

    @Test
    fun create() {
        val resource =
            Resource.builder()
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceName("resource_name")
                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(resource.resourceId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(resource.resourceName()).isEqualTo("resource_name")
        assertThat(resource.taggingId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resource =
            Resource.builder()
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceName("resource_name")
                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resource),
                jacksonTypeRef<Resource>(),
            )

        assertThat(roundtrippedResource).isEqualTo(resource)
    }
}
