// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VolumeListPageResponseTest {

    @Test
    fun create() {
        val volumeListPageResponse =
            VolumeListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(volumeListPageResponse.items().getOrNull())
            .containsExactly(
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
            )
        assertThat(volumeListPageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val volumeListPageResponse =
            VolumeListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedVolumeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(volumeListPageResponse),
                jacksonTypeRef<VolumeListPageResponse>(),
            )

        assertThat(roundtrippedVolumeListPageResponse).isEqualTo(volumeListPageResponse)
    }
}
