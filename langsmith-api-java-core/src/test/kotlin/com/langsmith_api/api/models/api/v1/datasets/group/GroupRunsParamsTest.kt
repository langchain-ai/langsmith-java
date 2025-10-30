// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.group

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupRunsParamsTest {

    @Test
    fun create() {
        GroupRunsParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .groupBy(GroupRunsParams.GroupBy.RUN_METADATA)
            .metadataKey("metadata_key")
            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .offset(0L)
            .perGroupLimit(1L)
            .preview(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupRunsParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupBy(GroupRunsParams.GroupBy.RUN_METADATA)
                .metadataKey("metadata_key")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupRunsParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupBy(GroupRunsParams.GroupBy.RUN_METADATA)
                .metadataKey("metadata_key")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .offset(0L)
                .perGroupLimit(1L)
                .preview(true)
                .build()

        val body = params._body()

        assertThat(body.groupBy()).isEqualTo(GroupRunsParams.GroupBy.RUN_METADATA)
        assertThat(body.metadataKey()).isEqualTo("metadata_key")
        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.limit()).contains(1L)
        assertThat(body.offset()).contains(0L)
        assertThat(body.perGroupLimit()).contains(1L)
        assertThat(body.preview()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupRunsParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupBy(GroupRunsParams.GroupBy.RUN_METADATA)
                .metadataKey("metadata_key")
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.groupBy()).isEqualTo(GroupRunsParams.GroupBy.RUN_METADATA)
        assertThat(body.metadataKey()).isEqualTo("metadata_key")
        assertThat(body.sessionIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
