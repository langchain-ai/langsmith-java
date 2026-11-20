// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VolumeResponseTest {

    @Test
    fun create() {
        val volumeResponse =
            VolumeResponse.builder()
                .id("id")
                .addAttachment(
                    VolumeResponse.Attachment.builder()
                        .mountPath("mount_path")
                        .readOnly(true)
                        .sandboxId("sandbox_id")
                        .sandboxName("sandbox_name")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .description("description")
                .labels(
                    VolumeResponse.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .sizeBytes(0L)
                .sourceVolumeId("source_volume_id")
                .status("status")
                .statusMessage("status_message")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .build()

        assertThat(volumeResponse.id()).contains("id")
        assertThat(volumeResponse.attachments().getOrNull())
            .containsExactly(
                VolumeResponse.Attachment.builder()
                    .mountPath("mount_path")
                    .readOnly(true)
                    .sandboxId("sandbox_id")
                    .sandboxName("sandbox_name")
                    .build()
            )
        assertThat(volumeResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(volumeResponse.createdBy()).contains("created_by")
        assertThat(volumeResponse.description()).contains("description")
        assertThat(volumeResponse.labels())
            .contains(
                VolumeResponse.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(volumeResponse.name()).contains("name")
        assertThat(volumeResponse.sizeBytes()).contains(0L)
        assertThat(volumeResponse.sourceVolumeId()).contains("source_volume_id")
        assertThat(volumeResponse.status()).contains("status")
        assertThat(volumeResponse.statusMessage()).contains("status_message")
        assertThat(volumeResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(volumeResponse.updatedBy()).contains("updated_by")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val volumeResponse =
            VolumeResponse.builder()
                .id("id")
                .addAttachment(
                    VolumeResponse.Attachment.builder()
                        .mountPath("mount_path")
                        .readOnly(true)
                        .sandboxId("sandbox_id")
                        .sandboxName("sandbox_name")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .description("description")
                .labels(
                    VolumeResponse.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .sizeBytes(0L)
                .sourceVolumeId("source_volume_id")
                .status("status")
                .statusMessage("status_message")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .build()

        val roundtrippedVolumeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(volumeResponse),
                jacksonTypeRef<VolumeResponse>(),
            )

        assertThat(roundtrippedVolumeResponse).isEqualTo(volumeResponse)
    }
}
