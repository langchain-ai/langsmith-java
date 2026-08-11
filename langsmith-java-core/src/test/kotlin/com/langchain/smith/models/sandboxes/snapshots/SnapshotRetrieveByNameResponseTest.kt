// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotRetrieveByNameResponseTest {

    @Test
    fun create() {
        val snapshotRetrieveByNameResponse =
            SnapshotRetrieveByNameResponse.builder()
                .name("name")
                .addTag(
                    SnapshotRetrieveByNameResponse.Tag.builder()
                        .snapshotId("snapshot_id")
                        .tag("tag")
                        .build()
                )
                .build()

        assertThat(snapshotRetrieveByNameResponse.name()).contains("name")
        assertThat(snapshotRetrieveByNameResponse.tags().getOrNull())
            .containsExactly(
                SnapshotRetrieveByNameResponse.Tag.builder()
                    .snapshotId("snapshot_id")
                    .tag("tag")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotRetrieveByNameResponse =
            SnapshotRetrieveByNameResponse.builder()
                .name("name")
                .addTag(
                    SnapshotRetrieveByNameResponse.Tag.builder()
                        .snapshotId("snapshot_id")
                        .tag("tag")
                        .build()
                )
                .build()

        val roundtrippedSnapshotRetrieveByNameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotRetrieveByNameResponse),
                jacksonTypeRef<SnapshotRetrieveByNameResponse>(),
            )

        assertThat(roundtrippedSnapshotRetrieveByNameResponse)
            .isEqualTo(snapshotRetrieveByNameResponse)
    }
}
