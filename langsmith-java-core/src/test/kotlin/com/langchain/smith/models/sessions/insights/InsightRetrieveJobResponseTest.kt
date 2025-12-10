// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightRetrieveJobResponseTest {

    @Test
    fun create() {
        val insightRetrieveJobResponse =
            InsightRetrieveJobResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCluster(
                    InsightRetrieveJobResponse.Cluster.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .level(0L)
                        .name("name")
                        .numRuns(0L)
                        .stats(
                            InsightRetrieveJobResponse.Cluster.Stats.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parentName("parent_name")
                        .build()
                )
                .name("name")
                .status("status")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .metadata(
                    InsightRetrieveJobResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .shape(
                    InsightRetrieveJobResponse.Shape.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(insightRetrieveJobResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightRetrieveJobResponse.clusters())
            .containsExactly(
                InsightRetrieveJobResponse.Cluster.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .level(0L)
                    .name("name")
                    .numRuns(0L)
                    .stats(
                        InsightRetrieveJobResponse.Cluster.Stats.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parentName("parent_name")
                    .build()
            )
        assertThat(insightRetrieveJobResponse.name()).isEqualTo("name")
        assertThat(insightRetrieveJobResponse.status()).isEqualTo("status")
        assertThat(insightRetrieveJobResponse.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insightRetrieveJobResponse.error()).contains("error")
        assertThat(insightRetrieveJobResponse.metadata())
            .contains(
                InsightRetrieveJobResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(insightRetrieveJobResponse.shape())
            .contains(
                InsightRetrieveJobResponse.Shape.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(insightRetrieveJobResponse.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightRetrieveJobResponse =
            InsightRetrieveJobResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCluster(
                    InsightRetrieveJobResponse.Cluster.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .level(0L)
                        .name("name")
                        .numRuns(0L)
                        .stats(
                            InsightRetrieveJobResponse.Cluster.Stats.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parentName("parent_name")
                        .build()
                )
                .name("name")
                .status("status")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .metadata(
                    InsightRetrieveJobResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .shape(
                    InsightRetrieveJobResponse.Shape.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInsightRetrieveJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightRetrieveJobResponse),
                jacksonTypeRef<InsightRetrieveJobResponse>(),
            )

        assertThat(roundtrippedInsightRetrieveJobResponse).isEqualTo(insightRetrieveJobResponse)
    }
}
