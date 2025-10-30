// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.bulkexports

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkExportBulkExportsParamsTest {

    @Test
    fun create() {
        BulkExportBulkExportsParams.builder()
            .bulkExportDestinationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .compression(BulkExportCompression.NONE)
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filter("filter")
            .format(BulkExportFormat.PARQUET)
            .intervalHours(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            BulkExportBulkExportsParams.builder()
                .bulkExportDestinationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .compression(BulkExportCompression.NONE)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .format(BulkExportFormat.PARQUET)
                .intervalHours(0L)
                .build()

        val body = params._body()

        assertThat(body.bulkExportDestinationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.sessionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.compression()).contains(BulkExportCompression.NONE)
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.filter()).contains("filter")
        assertThat(body.format()).contains(BulkExportFormat.PARQUET)
        assertThat(body.intervalHours()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BulkExportBulkExportsParams.builder()
                .bulkExportDestinationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.bulkExportDestinationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.sessionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
