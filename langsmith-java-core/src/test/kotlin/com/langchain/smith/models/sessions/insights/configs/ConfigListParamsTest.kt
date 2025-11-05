// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigListParamsTest {

    @Test
    fun create() {
        ConfigListParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includePrebuilts(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConfigListParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConfigListParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includePrebuilts(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_prebuilts", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ConfigListParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
