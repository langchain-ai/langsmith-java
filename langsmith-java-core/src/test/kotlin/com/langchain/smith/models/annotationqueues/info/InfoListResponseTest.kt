// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.info

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoListResponseTest {

    @Test
    fun create() {
        val infoListResponse =
            InfoListResponse.builder()
                .version("version")
                .batchIngestConfig(
                    InfoListResponse.BatchIngestConfig.builder()
                        .scaleDownNemptyTrigger(0L)
                        .scaleUpNthreadsLimit(0L)
                        .scaleUpQsizeTrigger(0L)
                        .sizeLimit(0L)
                        .sizeLimitBytes(0L)
                        .useMultipartEndpoint(true)
                        .build()
                )
                .customerInfo(
                    InfoListResponse.CustomerInfo.builder()
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .build()
                )
                .instanceFlags(
                    InfoListResponse.InstanceFlags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .licenseExpirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(infoListResponse.version()).isEqualTo("version")
        assertThat(infoListResponse.batchIngestConfig())
            .contains(
                InfoListResponse.BatchIngestConfig.builder()
                    .scaleDownNemptyTrigger(0L)
                    .scaleUpNthreadsLimit(0L)
                    .scaleUpQsizeTrigger(0L)
                    .sizeLimit(0L)
                    .sizeLimitBytes(0L)
                    .useMultipartEndpoint(true)
                    .build()
            )
        assertThat(infoListResponse.customerInfo())
            .contains(
                InfoListResponse.CustomerInfo.builder()
                    .customerId("customer_id")
                    .customerName("customer_name")
                    .build()
            )
        assertThat(infoListResponse.instanceFlags())
            .contains(
                InfoListResponse.InstanceFlags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(infoListResponse.licenseExpirationTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoListResponse =
            InfoListResponse.builder()
                .version("version")
                .batchIngestConfig(
                    InfoListResponse.BatchIngestConfig.builder()
                        .scaleDownNemptyTrigger(0L)
                        .scaleUpNthreadsLimit(0L)
                        .scaleUpQsizeTrigger(0L)
                        .sizeLimit(0L)
                        .sizeLimitBytes(0L)
                        .useMultipartEndpoint(true)
                        .build()
                )
                .customerInfo(
                    InfoListResponse.CustomerInfo.builder()
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .build()
                )
                .instanceFlags(
                    InfoListResponse.InstanceFlags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .licenseExpirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInfoListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoListResponse),
                jacksonTypeRef<InfoListResponse>(),
            )

        assertThat(roundtrippedInfoListResponse).isEqualTo(infoListResponse)
    }
}
