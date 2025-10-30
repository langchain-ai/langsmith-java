// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.bulkexports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkExportTest {

    @Test
    fun create() {
        val bulkExport =
            BulkExport.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bulkExportDestinationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BulkExport.Status.CANCELLED)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .compression(BulkExportCompression.NONE)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .format(BulkExportFormat.PARQUET)
                .intervalHours(0L)
                .sourceBulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(bulkExport.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExport.bulkExportDestinationId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExport.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExport.finishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExport.sessionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExport.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExport.status()).isEqualTo(BulkExport.Status.CANCELLED)
        assertThat(bulkExport.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExport.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExport.compression()).contains(BulkExportCompression.NONE)
        assertThat(bulkExport.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExport.filter()).contains("filter")
        assertThat(bulkExport.format()).contains(BulkExportFormat.PARQUET)
        assertThat(bulkExport.intervalHours()).contains(0L)
        assertThat(bulkExport.sourceBulkExportId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkExport =
            BulkExport.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bulkExportDestinationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BulkExport.Status.CANCELLED)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .compression(BulkExportCompression.NONE)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .format(BulkExportFormat.PARQUET)
                .intervalHours(0L)
                .sourceBulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedBulkExport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkExport),
                jacksonTypeRef<BulkExport>(),
            )

        assertThat(roundtrippedBulkExport).isEqualTo(bulkExport)
    }
}
