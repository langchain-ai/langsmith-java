// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.views

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewUpdateParamsTest {

    @Test
    fun create() {
        ViewUpdateParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .displayName("display_name")
            .filterString("filter_string")
            .traceFilterString("trace_filter_string")
            .treeFilterString("tree_filter_string")
            .type(FilterViewType.RUNS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ViewUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ViewUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .displayName("display_name")
                .filterString("filter_string")
                .traceFilterString("trace_filter_string")
                .treeFilterString("tree_filter_string")
                .type(FilterViewType.RUNS)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("display_name")
        assertThat(body.filterString()).contains("filter_string")
        assertThat(body.traceFilterString()).contains("trace_filter_string")
        assertThat(body.treeFilterString()).contains("tree_filter_string")
        assertThat(body.type()).contains(FilterViewType.RUNS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ViewUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
