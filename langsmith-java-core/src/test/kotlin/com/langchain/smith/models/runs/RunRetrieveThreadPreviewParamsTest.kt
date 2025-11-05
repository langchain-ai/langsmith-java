// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveThreadPreviewParamsTest {

    @Test
    fun create() {
        RunRetrieveThreadPreviewParams.builder()
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addSelect(RunRetrieveThreadPreviewParams.Select.ALL_MESSAGES)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunRetrieveThreadPreviewParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RunRetrieveThreadPreviewParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSelect(RunRetrieveThreadPreviewParams.Select.ALL_MESSAGES)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("session_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("select", listOf("all_messages").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunRetrieveThreadPreviewParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("session_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
