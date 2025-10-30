// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigListResponseTest {

    @Test
    fun create() {
        val configListResponse =
            ConfigListResponse.builder()
                .addConfig(
                    ConfigListResponse.Config.builder()
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
                                .build()
                        )
                        .name("name")
                        .prebuilt(true)
                        .description("description")
                        .build()
                )
                .build()

        assertThat(configListResponse.configs())
            .containsExactly(
                ConfigListResponse.Config.builder()
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
                            .build()
                    )
                    .name("name")
                    .prebuilt(true)
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configListResponse =
            ConfigListResponse.builder()
                .addConfig(
                    ConfigListResponse.Config.builder()
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
                                .build()
                        )
                        .name("name")
                        .prebuilt(true)
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedConfigListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configListResponse),
                jacksonTypeRef<ConfigListResponse>(),
            )

        assertThat(roundtrippedConfigListResponse).isEqualTo(configListResponse)
    }
}
