// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.bulkexports.destinations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkExportDestinationTest {

    @Test
    fun create() {
        val bulkExportDestination =
            BulkExportDestination.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    BulkExportDestinationS3Config.builder()
                        .bucketName("xxx")
                        .endpointUrl("endpoint_url")
                        .prefix("prefix")
                        .region("x")
                        .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCredentialsKey("string")
                .displayName("display_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .destinationType(BulkExportDestinationType.S3)
                .build()

        assertThat(bulkExportDestination.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExportDestination.config())
            .isEqualTo(
                BulkExportDestinationS3Config.builder()
                    .bucketName("xxx")
                    .endpointUrl("endpoint_url")
                    .prefix("prefix")
                    .region("x")
                    .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(bulkExportDestination.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExportDestination.credentialsKeys()).containsExactly("string")
        assertThat(bulkExportDestination.displayName()).isEqualTo("display_name")
        assertThat(bulkExportDestination.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkExportDestination.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkExportDestination.destinationType()).contains(BulkExportDestinationType.S3)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkExportDestination =
            BulkExportDestination.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    BulkExportDestinationS3Config.builder()
                        .bucketName("xxx")
                        .endpointUrl("endpoint_url")
                        .prefix("prefix")
                        .region("x")
                        .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCredentialsKey("string")
                .displayName("display_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .destinationType(BulkExportDestinationType.S3)
                .build()

        val roundtrippedBulkExportDestination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkExportDestination),
                jacksonTypeRef<BulkExportDestination>(),
            )

        assertThat(roundtrippedBulkExportDestination).isEqualTo(bulkExportDestination)
    }
}
