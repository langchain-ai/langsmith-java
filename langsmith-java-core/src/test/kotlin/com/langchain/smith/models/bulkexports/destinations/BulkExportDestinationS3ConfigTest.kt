// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.bulkexports.destinations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkExportDestinationS3ConfigTest {

    @Test
    fun create() {
        val bulkExportDestinationS3Config =
            BulkExportDestinationS3Config.builder()
                .bucketName("xxx")
                .endpointUrl("endpoint_url")
                .prefix("prefix")
                .region("x")
                .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(bulkExportDestinationS3Config.bucketName()).contains("xxx")
        assertThat(bulkExportDestinationS3Config.endpointUrl()).contains("endpoint_url")
        assertThat(bulkExportDestinationS3Config.prefix()).contains("prefix")
        assertThat(bulkExportDestinationS3Config.region()).contains("x")
        assertThat(bulkExportDestinationS3Config._s3AdditionalKwargs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkExportDestinationS3Config =
            BulkExportDestinationS3Config.builder()
                .bucketName("xxx")
                .endpointUrl("endpoint_url")
                .prefix("prefix")
                .region("x")
                .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedBulkExportDestinationS3Config =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkExportDestinationS3Config),
                jacksonTypeRef<BulkExportDestinationS3Config>(),
            )

        assertThat(roundtrippedBulkExportDestinationS3Config)
            .isEqualTo(bulkExportDestinationS3Config)
    }
}
