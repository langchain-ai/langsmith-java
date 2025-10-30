// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.index

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexListResponseTest {

    @Test
    fun create() {
        val indexListResponse =
            IndexListResponse.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastUpdatedVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tag("tag")
                .build()

        assertThat(indexListResponse.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(indexListResponse.lastUpdatedVersion())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexListResponse.tag()).contains("tag")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexListResponse =
            IndexListResponse.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastUpdatedVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tag("tag")
                .build()

        val roundtrippedIndexListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexListResponse),
                jacksonTypeRef<IndexListResponse>(),
            )

        assertThat(roundtrippedIndexListResponse).isEqualTo(indexListResponse)
    }
}
