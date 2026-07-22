// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotResponseTest {

    @Test
    fun create() {
        val snapshotResponse =
            SnapshotResponse.builder()
                .id("id")
                .createdAt("created_at")
                .createdBy("created_by")
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .fsUsedBytes(0L)
                .imageDigest("image_digest")
                .labels(
                    SnapshotResponse.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .memorySnapshotSizeBytes(0L)
                .name("name")
                .registryId("registry_id")
                .sourceSandboxId("source_sandbox_id")
                .status("status")
                .statusMessage("status_message")
                .updatedAt("updated_at")
                .build()

        assertThat(snapshotResponse.id()).contains("id")
        assertThat(snapshotResponse.createdAt()).contains("created_at")
        assertThat(snapshotResponse.createdBy()).contains("created_by")
        assertThat(snapshotResponse.dockerImage()).contains("docker_image")
        assertThat(snapshotResponse.fsCapacityBytes()).contains(0L)
        assertThat(snapshotResponse.fsUsedBytes()).contains(0L)
        assertThat(snapshotResponse.imageDigest()).contains("image_digest")
        assertThat(snapshotResponse.labels())
            .contains(
                SnapshotResponse.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(snapshotResponse.memorySnapshotSizeBytes()).contains(0L)
        assertThat(snapshotResponse.name()).contains("name")
        assertThat(snapshotResponse.registryId()).contains("registry_id")
        assertThat(snapshotResponse.sourceSandboxId()).contains("source_sandbox_id")
        assertThat(snapshotResponse.status()).contains("status")
        assertThat(snapshotResponse.statusMessage()).contains("status_message")
        assertThat(snapshotResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotResponse =
            SnapshotResponse.builder()
                .id("id")
                .createdAt("created_at")
                .createdBy("created_by")
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .fsUsedBytes(0L)
                .imageDigest("image_digest")
                .labels(
                    SnapshotResponse.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .memorySnapshotSizeBytes(0L)
                .name("name")
                .registryId("registry_id")
                .sourceSandboxId("source_sandbox_id")
                .status("status")
                .statusMessage("status_message")
                .updatedAt("updated_at")
                .build()

        val roundtrippedSnapshotResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotResponse),
                jacksonTypeRef<SnapshotResponse>(),
            )

        assertThat(roundtrippedSnapshotResponse).isEqualTo(snapshotResponse)
    }
}
