// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members.pending

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingListParamsTest {

    @Test
    fun create() {
        PendingListParams.builder().addEmail("string").limit(1L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = PendingListParams.builder().addEmail("string").limit(1L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emails", listOf("string").joinToString(","))
                    .put("limit", "1")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PendingListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
