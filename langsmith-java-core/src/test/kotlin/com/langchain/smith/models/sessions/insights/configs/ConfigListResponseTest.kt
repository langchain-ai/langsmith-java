// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigListResponseTest {

    @Test
    fun create() {
        val configListResponse =
            ConfigListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    ConfigListResponse.Config.builder()
                        .attributeSchemas(
                            ConfigListResponse.Config.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .filter("filter")
                        .addHierarchy(0L)
                        .model(ConfigListResponse.Config.Model.OPENAI)
                        .name("name")
                        .partitions(
                            ConfigListResponse.Config.Partitions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .sample(0.0)
                        .summaryPrompt("summary_prompt")
                        .clusterModel("cluster_model")
                        .endTime("end_time")
                        .lastNHours(0L)
                        .startTime("start_time")
                        .summaryModel("summary_model")
                        .userContext(
                            ConfigListResponse.Config.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .name("name")
                .prebuilt(true)
                .description("description")
                .scheduleCron("schedule_cron")
                .build()

        assertThat(configListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configListResponse.config())
            .isEqualTo(
                ConfigListResponse.Config.builder()
                    .attributeSchemas(
                        ConfigListResponse.Config.AttributeSchemas.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .filter("filter")
                    .addHierarchy(0L)
                    .model(ConfigListResponse.Config.Model.OPENAI)
                    .name("name")
                    .partitions(
                        ConfigListResponse.Config.Partitions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .sample(0.0)
                    .summaryPrompt("summary_prompt")
                    .clusterModel("cluster_model")
                    .endTime("end_time")
                    .lastNHours(0L)
                    .startTime("start_time")
                    .summaryModel("summary_model")
                    .userContext(
                        ConfigListResponse.Config.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(configListResponse.name()).isEqualTo("name")
        assertThat(configListResponse.prebuilt()).isEqualTo(true)
        assertThat(configListResponse.description()).contains("description")
        assertThat(configListResponse.scheduleCron()).contains("schedule_cron")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configListResponse =
            ConfigListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    ConfigListResponse.Config.builder()
                        .attributeSchemas(
                            ConfigListResponse.Config.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .filter("filter")
                        .addHierarchy(0L)
                        .model(ConfigListResponse.Config.Model.OPENAI)
                        .name("name")
                        .partitions(
                            ConfigListResponse.Config.Partitions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .sample(0.0)
                        .summaryPrompt("summary_prompt")
                        .clusterModel("cluster_model")
                        .endTime("end_time")
                        .lastNHours(0L)
                        .startTime("start_time")
                        .summaryModel("summary_model")
                        .userContext(
                            ConfigListResponse.Config.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .name("name")
                .prebuilt(true)
                .description("description")
                .scheduleCron("schedule_cron")
                .build()

        val roundtrippedConfigListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configListResponse),
                jacksonTypeRef<ConfigListResponse>(),
            )

        assertThat(roundtrippedConfigListResponse).isEqualTo(configListResponse)
    }
}
