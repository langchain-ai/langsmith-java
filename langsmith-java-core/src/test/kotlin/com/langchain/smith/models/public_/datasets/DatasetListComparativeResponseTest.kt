// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.datasets.comparative.SimpleExperimentInfo
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetListComparativeResponseTest {

    @Test
    fun create() {
        val datasetListComparativeResponse =
            DatasetListComparativeResponse.builder()
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
                .extra(
                    DatasetListComparativeResponse.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackStats(
                    DatasetListComparativeResponse.FeedbackStats.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .build()

        assertThat(datasetListComparativeResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetListComparativeResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetListComparativeResponse.experimentsInfo())
            .containsExactly(
                SimpleExperimentInfo.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(datasetListComparativeResponse.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetListComparativeResponse.description()).contains("description")
        assertThat(datasetListComparativeResponse.extra())
            .contains(
                DatasetListComparativeResponse.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(datasetListComparativeResponse.feedbackStats())
            .contains(
                DatasetListComparativeResponse.FeedbackStats.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(datasetListComparativeResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetListComparativeResponse =
            DatasetListComparativeResponse.builder()
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
                .extra(
                    DatasetListComparativeResponse.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .feedbackStats(
                    DatasetListComparativeResponse.FeedbackStats.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .build()

        val roundtrippedDatasetListComparativeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetListComparativeResponse),
                jacksonTypeRef<DatasetListComparativeResponse>(),
            )

        assertThat(roundtrippedDatasetListComparativeResponse)
            .isEqualTo(datasetListComparativeResponse)
    }
}
