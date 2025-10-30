// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagResourcesParamsTest {

    @Test
    fun create() {
        TagResourcesParams.builder()
            .addBody(
                TagResourcesParams.Body.builder()
                    .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resourceType(ResourceType.PROMPT)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TagResourcesParams.builder()
                .addBody(
                    TagResourcesParams.Body.builder()
                        .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resourceType(ResourceType.PROMPT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                TagResourcesParams.Body.builder()
                    .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resourceType(ResourceType.PROMPT)
                    .build()
            )
    }
}
