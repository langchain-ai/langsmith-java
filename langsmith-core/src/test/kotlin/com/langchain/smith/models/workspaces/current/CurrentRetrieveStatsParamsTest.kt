// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentRetrieveStatsParamsTest {

    @Test
    fun create() {
        CurrentRetrieveStatsParams.builder()
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CurrentRetrieveStatsParams.builder()
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "tag_value_id",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CurrentRetrieveStatsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
