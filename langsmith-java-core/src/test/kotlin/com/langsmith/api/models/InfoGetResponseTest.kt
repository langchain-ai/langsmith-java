// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InfoGetResponseTest {

    @Test
    fun createInfoGetResponse() {
        val infoGetResponse =
            InfoGetResponse.builder()
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
                InfoGetResponse.BatchIngestConfig.builder()
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
