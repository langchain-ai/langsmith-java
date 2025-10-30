// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedbackconfigs

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackConfigRetrieveFeedbackConfigsParamsTest {

    @Test
    fun create() {
        FeedbackConfigRetrieveFeedbackConfigsParams.builder()
            .addKey("string")
            .readAfterWrite(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FeedbackConfigRetrieveFeedbackConfigsParams.builder()
                .addKey("string")
                .readAfterWrite(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", listOf("string").joinToString(","))
                    .put("read_after_write", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FeedbackConfigRetrieveFeedbackConfigsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
