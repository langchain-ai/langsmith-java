// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotRetrieveByNameParamsTest {

    @Test
    fun create() {
        SnapshotRetrieveByNameParams.builder().name("name").build()
    }

    @Test
    fun pathParams() {
        val params = SnapshotRetrieveByNameParams.builder().name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
