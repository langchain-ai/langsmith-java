// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxCreateSnapshotResponseTest {

    @Test
    fun create() {
        val boxCreateSnapshotResponse =
            BoxCreateSnapshotResponse.builder()
                .id("id")
                .createdAt("created_at")
                .createdBy("created_by")
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .fsUsedBytes(0L)
                .imageDigest("image_digest")
                .name("name")
                .registryId("registry_id")
                .sourceSandboxId("source_sandbox_id")
                .status("status")
                .statusMessage("status_message")
                .updatedAt("updated_at")
                .build()

        assertThat(boxCreateSnapshotResponse.id()).contains("id")
        assertThat(boxCreateSnapshotResponse.createdAt()).contains("created_at")
        assertThat(boxCreateSnapshotResponse.createdBy()).contains("created_by")
        assertThat(boxCreateSnapshotResponse.dockerImage()).contains("docker_image")
        assertThat(boxCreateSnapshotResponse.fsCapacityBytes()).contains(0L)
        assertThat(boxCreateSnapshotResponse.fsUsedBytes()).contains(0L)
        assertThat(boxCreateSnapshotResponse.imageDigest()).contains("image_digest")
        assertThat(boxCreateSnapshotResponse.name()).contains("name")
        assertThat(boxCreateSnapshotResponse.registryId()).contains("registry_id")
        assertThat(boxCreateSnapshotResponse.sourceSandboxId()).contains("source_sandbox_id")
        assertThat(boxCreateSnapshotResponse.status()).contains("status")
        assertThat(boxCreateSnapshotResponse.statusMessage()).contains("status_message")
        assertThat(boxCreateSnapshotResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boxCreateSnapshotResponse =
            BoxCreateSnapshotResponse.builder()
                .id("id")
                .createdAt("created_at")
                .createdBy("created_by")
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .fsUsedBytes(0L)
                .imageDigest("image_digest")
                .name("name")
                .registryId("registry_id")
                .sourceSandboxId("source_sandbox_id")
                .status("status")
                .statusMessage("status_message")
                .updatedAt("updated_at")
                .build()

        val roundtrippedBoxCreateSnapshotResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boxCreateSnapshotResponse),
                jacksonTypeRef<BoxCreateSnapshotResponse>(),
            )

        assertThat(roundtrippedBoxCreateSnapshotResponse).isEqualTo(boxCreateSnapshotResponse)
    }
}
