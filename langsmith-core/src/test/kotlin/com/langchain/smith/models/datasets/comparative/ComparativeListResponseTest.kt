// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeListResponseTest {

    @Test
    fun create() {
        val comparativeListResponse =
            ComparativeListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExperimentsInfo(
                    SimpleExperimentInfo.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        assertThat(comparativeListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comparativeListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(comparativeListResponse.experimentsInfo())
            .containsExactly(
                SimpleExperimentInfo.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(comparativeListResponse.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(comparativeListResponse.referenceDatasetId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comparativeListResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comparativeListResponse.description()).contains("description")
        assertThat(comparativeListResponse._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(comparativeListResponse._feedbackStats())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(comparativeListResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeListResponse =
            ComparativeListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExperimentsInfo(
                    SimpleExperimentInfo.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        val roundtrippedComparativeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeListResponse),
                jacksonTypeRef<ComparativeListResponse>(),
            )

        assertThat(roundtrippedComparativeListResponse).isEqualTo(comparativeListResponse)
    }
}
