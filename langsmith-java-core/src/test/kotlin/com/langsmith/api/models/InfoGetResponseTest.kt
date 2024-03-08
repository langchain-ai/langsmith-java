// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InfoGetResponseTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createInfoGetResponse() { // templates/JavaSDK/entities/testing.ts:18:13
        val infoGetResponse =
            InfoGetResponse.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .version("string")
                .batchIngestConfig(
                    InfoGetResponse.BatchIngestConfig.builder()
                        .scaleDownNemptyTrigger(123L)
                        .scaleUpNthreadsLimit(123L)
                        .scaleUpQsizeTrigger(123L)
                        .sizeLimit(123L)
                        .build()
                )
                .licenseExpirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(infoGetResponse).isNotNull
        assertThat(infoGetResponse.version()).isEqualTo("string")
        assertThat(infoGetResponse.batchIngestConfig())
            .contains(
                InfoGetResponse.BatchIngestConfig
                    .builder() // templates/JavaSDK/entities/objects.ts:717:13
                    .scaleDownNemptyTrigger(123L)
                    .scaleUpNthreadsLimit(123L)
                    .scaleUpQsizeTrigger(123L)
                    .sizeLimit(123L)
                    .build()
            )
        assertThat(infoGetResponse.licenseExpirationTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
