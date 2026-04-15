// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotRetrieveResponseTest {

    @Test
    fun create() {
        val snapshotRetrieveResponse =
            SnapshotRetrieveResponse.builder()
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

        assertThat(snapshotRetrieveResponse.id()).contains("id")
        assertThat(snapshotRetrieveResponse.createdAt()).contains("created_at")
        assertThat(snapshotRetrieveResponse.createdBy()).contains("created_by")
        assertThat(snapshotRetrieveResponse.dockerImage()).contains("docker_image")
        assertThat(snapshotRetrieveResponse.fsCapacityBytes()).contains(0L)
        assertThat(snapshotRetrieveResponse.fsUsedBytes()).contains(0L)
        assertThat(snapshotRetrieveResponse.imageDigest()).contains("image_digest")
        assertThat(snapshotRetrieveResponse.name()).contains("name")
        assertThat(snapshotRetrieveResponse.registryId()).contains("registry_id")
        assertThat(snapshotRetrieveResponse.sourceSandboxId()).contains("source_sandbox_id")
        assertThat(snapshotRetrieveResponse.status()).contains("status")
        assertThat(snapshotRetrieveResponse.statusMessage()).contains("status_message")
        assertThat(snapshotRetrieveResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotRetrieveResponse =
            SnapshotRetrieveResponse.builder()
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

        val roundtrippedSnapshotRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotRetrieveResponse),
                jacksonTypeRef<SnapshotRetrieveResponse>(),
            )

        assertThat(roundtrippedSnapshotRetrieveResponse).isEqualTo(snapshotRetrieveResponse)
    }
}
