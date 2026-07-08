// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadListTracesParamsTest {

    @Test
    fun create() {
        ThreadListTracesParams.builder()
            .threadId("thread_id")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .filter("filter")
            .pageSize(1L)
            .addSelect(ThreadListTracesParams.Select.THREAD_ID)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ThreadListTracesParams.builder()
                .threadId("thread_id")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("thread_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ThreadListTracesParams.builder()
                .threadId("thread_id")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .filter("filter")
                .pageSize(1L)
                .addSelect(ThreadListTracesParams.Select.THREAD_ID)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("cursor", "cursor")
                    .put("filter", "filter")
                    .put("page_size", "1")
                    .put("selects", "THREAD_ID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ThreadListTracesParams.builder()
                .threadId("thread_id")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
