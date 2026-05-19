// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxCreateSnapshotParamsTest {

    @Test
    fun create() {
        BoxCreateSnapshotParams.builder()
            .pathName("name")
            .bodyName("name")
            .checkpoint("checkpoint")
            .includeMemory(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BoxCreateSnapshotParams.builder().pathName("name").bodyName("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BoxCreateSnapshotParams.builder()
                .pathName("name")
                .bodyName("name")
                .checkpoint("checkpoint")
                .includeMemory(true)
                .build()

        val body = params._body()

        assertThat(body.bodyName()).isEqualTo("name")
        assertThat(body.checkpoint()).contains("checkpoint")
        assertThat(body.includeMemory()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxCreateSnapshotParams.builder().pathName("name").bodyName("name").build()

        val body = params._body()

        assertThat(body.bodyName()).isEqualTo("name")
    }
}
