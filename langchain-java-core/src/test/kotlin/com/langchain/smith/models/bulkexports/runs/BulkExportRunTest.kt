// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.bulkexports.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkExportRunTest {

    @Test
    fun create() {
        val bulkExportRun =
            BulkExportRun.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    BulkExportRun.Metadata.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .prefix("prefix")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(
                            BulkExportRun.Metadata.Result.builder()
                                .exportPath("export_path")
                                .addExportedFile("string")
                                .latestCursor("latest_cursor")
                                .rowsWritten(0L)
                                .build()
                        )
                        .build()
                )
                .status(BulkExportRun.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errors(JsonValue.from(mapOf<String, Any>()))
                .retryNumber(0L)
                .build()

        assertThat(bulkExportRun.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExportRun.bulkExportId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExportRun.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExportRun.finishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExportRun.metadata())
            .isEqualTo(
                BulkExportRun.Metadata.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .prefix("prefix")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(
                        BulkExportRun.Metadata.Result.builder()
                            .exportPath("export_path")
                            .addExportedFile("string")
                            .latestCursor("latest_cursor")
                            .rowsWritten(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(bulkExportRun.status()).isEqualTo(BulkExportRun.Status.CANCELLED)
        assertThat(bulkExportRun.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExportRun._errors()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(bulkExportRun.retryNumber()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkExportRun =
            BulkExportRun.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    BulkExportRun.Metadata.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .prefix("prefix")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(
                            BulkExportRun.Metadata.Result.builder()
                                .exportPath("export_path")
                                .addExportedFile("string")
                                .latestCursor("latest_cursor")
                                .rowsWritten(0L)
                                .build()
                        )
                        .build()
                )
                .status(BulkExportRun.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errors(JsonValue.from(mapOf<String, Any>()))
                .retryNumber(0L)
                .build()

        val roundtrippedBulkExportRun =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkExportRun),
                jacksonTypeRef<BulkExportRun>(),
            )

        assertThat(roundtrippedBulkExportRun).isEqualTo(bulkExportRun)
    }
}
