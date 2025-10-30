// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.tokens

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenListParamsTest {

    @Test
    fun create() {
        TokenListParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
    }

    @Test
    fun queryParams() {
        val params = TokenListParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("run_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
    }
}
