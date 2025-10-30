// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.info

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoRetrieveHealthResponseTest {

    @Test
    fun create() {
        val infoRetrieveHealthResponse =
            InfoRetrieveHealthResponse.builder().clickhouseDiskFreePct(0.0).build()

        assertThat(infoRetrieveHealthResponse.clickhouseDiskFreePct()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoRetrieveHealthResponse =
            InfoRetrieveHealthResponse.builder().clickhouseDiskFreePct(0.0).build()

        val roundtrippedInfoRetrieveHealthResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoRetrieveHealthResponse),
                jacksonTypeRef<InfoRetrieveHealthResponse>(),
            )

        assertThat(roundtrippedInfoRetrieveHealthResponse).isEqualTo(infoRetrieveHealthResponse)
    }
}
