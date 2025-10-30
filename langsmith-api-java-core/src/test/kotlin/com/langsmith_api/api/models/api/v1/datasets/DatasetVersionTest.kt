// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetVersionTest {

    @Test
    fun create() {
        val datasetVersion =
            DatasetVersion.builder()
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTag("string")
                .build()

        assertThat(datasetVersion.asOf())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetVersion.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetVersion =
            DatasetVersion.builder()
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTag("string")
                .build()

        val roundtrippedDatasetVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetVersion),
                jacksonTypeRef<DatasetVersion>(),
            )

        assertThat(roundtrippedDatasetVersion).isEqualTo(datasetVersion)
    }
}
