// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightListPageResponseTest {

    @Test
    fun create() {
        val insightListPageResponse =
            InsightListPageResponse.builder()
                .addClusteringJob(
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
                )
                .build()

        assertThat(insightListPageResponse.clusteringJobs())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightListPageResponse =
            InsightListPageResponse.builder()
                .addClusteringJob(
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
                )
                .build()

        val roundtrippedInsightListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightListPageResponse),
                jacksonTypeRef<InsightListPageResponse>(),
            )

        assertThat(roundtrippedInsightListPageResponse).isEqualTo(insightListPageResponse)
    }
}
