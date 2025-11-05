// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateClusteringJobConfigResponseTest {

    @Test
    fun create() {
        val createClusteringJobConfigResponse =
            CreateClusteringJobConfigResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    SavedRunClusteringJobRequest.builder()
                        .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                        .filter("filter")
                        .addHierarchy(0L)
                        .lastNHours(0L)
                        .model(SavedRunClusteringJobRequest.Model.OPENAI)
                        .name("name")
                        .partitions(
                            SavedRunClusteringJobRequest.Partitions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .sample(0.0)
                        .summaryPrompt("summary_prompt")
                        .userContext(
                            SavedRunClusteringJobRequest.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .build()

        assertThat(createClusteringJobConfigResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createClusteringJobConfigResponse.config())
            .isEqualTo(
                SavedRunClusteringJobRequest.builder()
                    .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                    .filter("filter")
                    .addHierarchy(0L)
                    .lastNHours(0L)
                    .model(SavedRunClusteringJobRequest.Model.OPENAI)
                    .name("name")
                    .partitions(
                        SavedRunClusteringJobRequest.Partitions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .sample(0.0)
                    .summaryPrompt("summary_prompt")
                    .userContext(
                        SavedRunClusteringJobRequest.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(createClusteringJobConfigResponse.description()).contains("description")
        assertThat(createClusteringJobConfigResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createClusteringJobConfigResponse =
            CreateClusteringJobConfigResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    SavedRunClusteringJobRequest.builder()
                        .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                        .filter("filter")
                        .addHierarchy(0L)
                        .lastNHours(0L)
                        .model(SavedRunClusteringJobRequest.Model.OPENAI)
                        .name("name")
                        .partitions(
                            SavedRunClusteringJobRequest.Partitions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .sample(0.0)
                        .summaryPrompt("summary_prompt")
                        .userContext(
                            SavedRunClusteringJobRequest.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .build()

        val roundtrippedCreateClusteringJobConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createClusteringJobConfigResponse),
                jacksonTypeRef<CreateClusteringJobConfigResponse>(),
            )

        assertThat(roundtrippedCreateClusteringJobConfigResponse)
            .isEqualTo(createClusteringJobConfigResponse)
    }
}
