// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightListResponseTest {

    @Test
    fun create() {
        val insightListResponse =
            InsightListResponse.builder()
                .addClusteringJob(
                    InsightListResponse.ClusteringJob.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .status("status")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .addShape(0L)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(insightListResponse.clusteringJobs())
            .containsExactly(
                InsightListResponse.ClusteringJob.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .status("status")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error("error")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .addShape(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightListResponse =
            InsightListResponse.builder()
                .addClusteringJob(
                    InsightListResponse.ClusteringJob.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .status("status")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .addShape(0L)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedInsightListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightListResponse),
                jacksonTypeRef<InsightListResponse>(),
            )

        assertThat(roundtrippedInsightListResponse).isEqualTo(insightListResponse)
    }
}
