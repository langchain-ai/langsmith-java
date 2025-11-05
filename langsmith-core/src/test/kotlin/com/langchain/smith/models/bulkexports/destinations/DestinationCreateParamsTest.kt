// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.bulkexports.destinations

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationCreateParamsTest {

    @Test
    fun create() {
        DestinationCreateParams.builder()
            .config(
                BulkExportDestinationS3Config.builder()
                    .bucketName("xxx")
                    .endpointUrl("endpoint_url")
                    .prefix("prefix")
                    .region("x")
                    .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .displayName("display_name")
            .credentials(
                DestinationCreateParams.Credentials.builder()
                    .accessKeyId("x")
                    .secretAccessKey("x")
                    .sessionToken("session_token")
                    .build()
            )
            .destinationType(BulkExportDestinationType.S3)
            .build()
    }

    @Test
    fun body() {
        val params =
            DestinationCreateParams.builder()
                .config(
                    BulkExportDestinationS3Config.builder()
                        .bucketName("xxx")
                        .endpointUrl("endpoint_url")
                        .prefix("prefix")
                        .region("x")
                        .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .displayName("display_name")
                .credentials(
                    DestinationCreateParams.Credentials.builder()
                        .accessKeyId("x")
                        .secretAccessKey("x")
                        .sessionToken("session_token")
                        .build()
                )
                .destinationType(BulkExportDestinationType.S3)
                .build()

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                BulkExportDestinationS3Config.builder()
                    .bucketName("xxx")
                    .endpointUrl("endpoint_url")
                    .prefix("prefix")
                    .region("x")
                    .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.credentials())
            .contains(
                DestinationCreateParams.Credentials.builder()
                    .accessKeyId("x")
                    .secretAccessKey("x")
                    .sessionToken("session_token")
                    .build()
            )
        assertThat(body.destinationType()).contains(BulkExportDestinationType.S3)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DestinationCreateParams.builder()
                .config(BulkExportDestinationS3Config.builder().build())
                .displayName("display_name")
                .build()

        val body = params._body()

        assertThat(body.config()).isEqualTo(BulkExportDestinationS3Config.builder().build())
        assertThat(body.displayName()).isEqualTo("display_name")
    }
}
