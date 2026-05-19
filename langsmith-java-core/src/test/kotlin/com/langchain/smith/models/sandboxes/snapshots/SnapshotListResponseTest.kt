// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotListResponseTest {

    @Test
    fun create() {
        val snapshotListResponse =
            SnapshotListResponse.builder()
                .offset(0L)
                .addSnapshot(
                    SnapshotListResponse.Snapshot.builder()
                        .id("id")
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .dockerImage("docker_image")
                        .fsCapacityBytes(0L)
                        .fsUsedBytes(0L)
                        .imageDigest("image_digest")
                        .memorySnapshotSizeBytes(0L)
                        .name("name")
                        .registryId("registry_id")
                        .sourceSandboxId("source_sandbox_id")
                        .status("status")
                        .statusMessage("status_message")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(snapshotListResponse.offset()).contains(0L)
        assertThat(snapshotListResponse.snapshots().getOrNull())
            .containsExactly(
                SnapshotListResponse.Snapshot.builder()
                    .id("id")
                    .createdAt("created_at")
                    .createdBy("created_by")
                    .dockerImage("docker_image")
                    .fsCapacityBytes(0L)
                    .fsUsedBytes(0L)
                    .imageDigest("image_digest")
                    .memorySnapshotSizeBytes(0L)
                    .name("name")
                    .registryId("registry_id")
                    .sourceSandboxId("source_sandbox_id")
                    .status("status")
                    .statusMessage("status_message")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotListResponse =
            SnapshotListResponse.builder()
                .offset(0L)
                .addSnapshot(
                    SnapshotListResponse.Snapshot.builder()
                        .id("id")
                        .createdAt("created_at")
                        .createdBy("created_by")
                        .dockerImage("docker_image")
                        .fsCapacityBytes(0L)
                        .fsUsedBytes(0L)
                        .imageDigest("image_digest")
                        .memorySnapshotSizeBytes(0L)
                        .name("name")
                        .registryId("registry_id")
                        .sourceSandboxId("source_sandbox_id")
                        .status("status")
                        .statusMessage("status_message")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedSnapshotListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotListResponse),
                jacksonTypeRef<SnapshotListResponse>(),
            )

        assertThat(roundtrippedSnapshotListResponse).isEqualTo(snapshotListResponse)
    }
}
