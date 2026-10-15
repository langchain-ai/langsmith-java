// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.configs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigDeleteParamsTest {

    @Test
    fun create() {
        ConfigDeleteParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .feedbackKey("feedback_key")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConfigDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackKey("feedback_key")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("feedback_key", "feedback_key")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConfigDeleteParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
