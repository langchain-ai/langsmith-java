// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotCreateResponseTest {

    @Test
    fun create() {
        val snapshotCreateResponse =
            SnapshotCreateResponse.builder()
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

        assertThat(snapshotCreateResponse.id()).contains("id")
        assertThat(snapshotCreateResponse.createdAt()).contains("created_at")
        assertThat(snapshotCreateResponse.createdBy()).contains("created_by")
        assertThat(snapshotCreateResponse.dockerImage()).contains("docker_image")
        assertThat(snapshotCreateResponse.fsCapacityBytes()).contains(0L)
        assertThat(snapshotCreateResponse.fsUsedBytes()).contains(0L)
        assertThat(snapshotCreateResponse.imageDigest()).contains("image_digest")
        assertThat(snapshotCreateResponse.memorySnapshotSizeBytes()).contains(0L)
        assertThat(snapshotCreateResponse.name()).contains("name")
        assertThat(snapshotCreateResponse.registryId()).contains("registry_id")
        assertThat(snapshotCreateResponse.sourceSandboxId()).contains("source_sandbox_id")
        assertThat(snapshotCreateResponse.status()).contains("status")
        assertThat(snapshotCreateResponse.statusMessage()).contains("status_message")
        assertThat(snapshotCreateResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotCreateResponse =
            SnapshotCreateResponse.builder()
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

        val roundtrippedSnapshotCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotCreateResponse),
                jacksonTypeRef<SnapshotCreateResponse>(),
            )

        assertThat(roundtrippedSnapshotCreateResponse).isEqualTo(snapshotCreateResponse)
    }
}
