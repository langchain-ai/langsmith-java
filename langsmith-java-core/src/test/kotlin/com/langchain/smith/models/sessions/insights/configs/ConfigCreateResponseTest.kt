// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigCreateResponseTest {

    @Test
    fun create() {
        val configCreateResponse =
            ConfigCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    ConfigCreateResponse.Config.builder()
                        .attributeSchemas(
                            ConfigCreateResponse.Config.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .filter("filter")
                        .addHierarchy(0L)
                        .model(ConfigCreateResponse.Config.Model.OPENAI)
                        .name("name")
                        .partitions(
                            ConfigCreateResponse.Config.Partitions.builder()
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
                            ConfigCreateResponse.Config.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .scheduleCron("schedule_cron")
                .build()

        assertThat(configCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configCreateResponse.config())
            .isEqualTo(
                ConfigCreateResponse.Config.builder()
                    .attributeSchemas(
                        ConfigCreateResponse.Config.AttributeSchemas.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .filter("filter")
                    .addHierarchy(0L)
                    .model(ConfigCreateResponse.Config.Model.OPENAI)
                    .name("name")
                    .partitions(
                        ConfigCreateResponse.Config.Partitions.builder()
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
                        ConfigCreateResponse.Config.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(configCreateResponse.description()).contains("description")
        assertThat(configCreateResponse.name()).isEqualTo("name")
        assertThat(configCreateResponse.scheduleCron()).contains("schedule_cron")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configCreateResponse =
            ConfigCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    ConfigCreateResponse.Config.builder()
                        .attributeSchemas(
                            ConfigCreateResponse.Config.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .filter("filter")
                        .addHierarchy(0L)
                        .model(ConfigCreateResponse.Config.Model.OPENAI)
                        .name("name")
                        .partitions(
                            ConfigCreateResponse.Config.Partitions.builder()
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
                            ConfigCreateResponse.Config.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .scheduleCron("schedule_cron")
                .build()

        val roundtrippedConfigCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configCreateResponse),
                jacksonTypeRef<ConfigCreateResponse>(),
            )

        assertThat(roundtrippedConfigCreateResponse).isEqualTo(configCreateResponse)
    }
}
