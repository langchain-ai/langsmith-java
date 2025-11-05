// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.tags

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagRetrieveResourceParamsTest {

    @Test
    fun create() {
        TagRetrieveResourceParams.builder()
            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .resourceType(ResourceType.PROMPT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TagRetrieveResourceParams.builder()
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceType(ResourceType.PROMPT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("resource_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("resource_type", "prompt")
                    .build()
            )
    }
}
