// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotRetrieveParamsTest {

    @Test
    fun create() {
        SnapshotRetrieveParams.builder().snapshotId("snapshot_id").build()
    }

    @Test
    fun pathParams() {
        val params = SnapshotRetrieveParams.builder().snapshotId("snapshot_id").build()

        assertThat(params._pathParam(0)).isEqualTo("snapshot_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
