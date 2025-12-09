// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.configs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigDeleteParamsTest {

    @Test
    fun create() {
        ConfigDeleteParams.builder().feedbackKey("feedback_key").build()
    }

    @Test
    fun queryParams() {
        val params = ConfigDeleteParams.builder().feedbackKey("feedback_key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("feedback_key", "feedback_key").build())
    }
}
