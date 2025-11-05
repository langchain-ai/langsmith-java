// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveSessionsBulkParamsTest {

    @Test
    fun create() {
        DatasetRetrieveSessionsBulkParams.builder().addShareToken("string").build()
    }

    @Test
    fun queryParams() {
        val params = DatasetRetrieveSessionsBulkParams.builder().addShareToken("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("share_tokens", listOf("string").joinToString(","))
                    .build()
            )
    }
}
