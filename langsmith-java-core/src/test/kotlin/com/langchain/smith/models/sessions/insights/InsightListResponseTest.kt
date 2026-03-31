// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightListResponseTest {

    @Test
    fun create() {
        val insightListResponse =
            InsightListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .status("status")
                .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .metadata(
                    InsightListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .shape(
                    InsightListResponse.Shape.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(insightListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insightListResponse.name()).isEqualTo("name")
        assertThat(insightListResponse.status()).isEqualTo("status")
        assertThat(insightListResponse.configId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightListResponse.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insightListResponse.error()).contains("error")
        assertThat(insightListResponse.metadata())
            .contains(
                InsightListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(insightListResponse.shape())
            .contains(
                InsightListResponse.Shape.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(insightListResponse.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightListResponse =
            InsightListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .status("status")
                .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .metadata(
                    InsightListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .shape(
                    InsightListResponse.Shape.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInsightListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightListResponse),
                jacksonTypeRef<InsightListResponse>(),
            )

        assertThat(roundtrippedInsightListResponse).isEqualTo(insightListResponse)
    }
}
