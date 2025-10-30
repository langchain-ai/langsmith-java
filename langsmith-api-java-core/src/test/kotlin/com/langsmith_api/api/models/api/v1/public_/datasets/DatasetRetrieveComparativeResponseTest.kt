// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.datasets.comparative.SimpleExperimentInfo
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveComparativeResponseTest {

    @Test
    fun create() {
        val datasetRetrieveComparativeResponse =
            DatasetRetrieveComparativeResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExperimentsInfo(
                    SimpleExperimentInfo.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        assertThat(datasetRetrieveComparativeResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetRetrieveComparativeResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetRetrieveComparativeResponse.experimentsInfo())
            .containsExactly(
                SimpleExperimentInfo.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(datasetRetrieveComparativeResponse.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetRetrieveComparativeResponse.description()).contains("description")
        assertThat(datasetRetrieveComparativeResponse._extra())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(datasetRetrieveComparativeResponse._feedbackStats())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(datasetRetrieveComparativeResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRetrieveComparativeResponse =
            DatasetRetrieveComparativeResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExperimentsInfo(
                    SimpleExperimentInfo.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        val roundtrippedDatasetRetrieveComparativeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRetrieveComparativeResponse),
                jacksonTypeRef<DatasetRetrieveComparativeResponse>(),
            )

        assertThat(roundtrippedDatasetRetrieveComparativeResponse)
            .isEqualTo(datasetRetrieveComparativeResponse)
    }
}
