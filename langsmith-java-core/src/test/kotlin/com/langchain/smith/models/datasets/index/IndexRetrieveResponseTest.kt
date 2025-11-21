// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexRetrieveResponseTest {

    @Test
    fun create() {
        val indexRetrieveResponse =
            IndexRetrieveResponse.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastUpdatedVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tag("tag")
                .build()

        assertThat(indexRetrieveResponse.datasetId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(indexRetrieveResponse.lastUpdatedVersion())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexRetrieveResponse.tag()).contains("tag")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexRetrieveResponse =
            IndexRetrieveResponse.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastUpdatedVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tag("tag")
                .build()

        val roundtrippedIndexRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexRetrieveResponse),
                jacksonTypeRef<IndexRetrieveResponse>(),
            )

        assertThat(roundtrippedIndexRetrieveResponse).isEqualTo(indexRetrieveResponse)
    }
}
