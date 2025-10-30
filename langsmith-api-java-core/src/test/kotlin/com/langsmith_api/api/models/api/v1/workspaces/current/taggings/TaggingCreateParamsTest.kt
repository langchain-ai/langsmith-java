// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.taggings

import com.langsmith_api.api.models.api.v1.workspaces.current.tags.ResourceType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaggingCreateParamsTest {

    @Test
    fun create() {
        TaggingCreateParams.builder()
            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .resourceType(ResourceType.PROMPT)
            .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            TaggingCreateParams.builder()
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceType(ResourceType.PROMPT)
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.resourceId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.resourceType()).isEqualTo(ResourceType.PROMPT)
        assertThat(body.tagValueId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
