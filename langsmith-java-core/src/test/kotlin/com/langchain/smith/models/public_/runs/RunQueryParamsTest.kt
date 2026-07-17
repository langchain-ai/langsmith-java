// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.runs

import com.langchain.smith.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryParamsTest {

    @Test
    fun create() {
        RunQueryParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accept("Accept")
            .selects(
                listOf(
                    RunQueryParams.Select.ID,
                    RunQueryParams.Select.NAME,
                    RunQueryParams.Select.PROJECT_ID,
                    RunQueryParams.Select.START_TIME,
                    RunQueryParams.Select.RUN_TYPE,
                    RunQueryParams.Select.STATUS,
                    RunQueryParams.Select.INPUTS_PREVIEW,
                    RunQueryParams.Select.OUTPUTS_PREVIEW,
                    RunQueryParams.Select.METADATA,
                )
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunQueryParams.builder().shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            RunQueryParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accept("Accept")
                .selects(
                    listOf(
                        RunQueryParams.Select.ID,
                        RunQueryParams.Select.NAME,
                        RunQueryParams.Select.PROJECT_ID,
                        RunQueryParams.Select.START_TIME,
                        RunQueryParams.Select.RUN_TYPE,
                        RunQueryParams.Select.STATUS,
                        RunQueryParams.Select.INPUTS_PREVIEW,
                        RunQueryParams.Select.OUTPUTS_PREVIEW,
                        RunQueryParams.Select.METADATA,
                    )
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Accept", "Accept").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            RunQueryParams.builder().shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunQueryParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accept("Accept")
                .selects(
                    listOf(
                        RunQueryParams.Select.ID,
                        RunQueryParams.Select.NAME,
                        RunQueryParams.Select.PROJECT_ID,
                        RunQueryParams.Select.START_TIME,
                        RunQueryParams.Select.RUN_TYPE,
                        RunQueryParams.Select.STATUS,
                        RunQueryParams.Select.INPUTS_PREVIEW,
                        RunQueryParams.Select.OUTPUTS_PREVIEW,
                        RunQueryParams.Select.METADATA,
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.selects().getOrNull())
            .containsExactly(
                RunQueryParams.Select.ID,
                RunQueryParams.Select.NAME,
                RunQueryParams.Select.PROJECT_ID,
                RunQueryParams.Select.START_TIME,
                RunQueryParams.Select.RUN_TYPE,
                RunQueryParams.Select.STATUS,
                RunQueryParams.Select.INPUTS_PREVIEW,
                RunQueryParams.Select.OUTPUTS_PREVIEW,
                RunQueryParams.Select.METADATA,
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunQueryParams.builder().shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
