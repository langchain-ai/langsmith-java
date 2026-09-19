// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigUpdateResponseTest {

    @Test
    fun create() {
        val configUpdateResponse =
            ConfigUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    ConfigUpdateResponse.Config.builder()
                        .attributeSchemas(
                            ConfigUpdateResponse.Config.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .filter("filter")
                        .addHierarchy(0L)
                        .model(ConfigUpdateResponse.Config.Model.OPENAI)
                        .name("name")
                        .partitions(
                            ConfigUpdateResponse.Config.Partitions.builder()
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
                            ConfigUpdateResponse.Config.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .scheduleCron("schedule_cron")
                .build()

        assertThat(configUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configUpdateResponse.config())
            .isEqualTo(
                ConfigUpdateResponse.Config.builder()
                    .attributeSchemas(
                        ConfigUpdateResponse.Config.AttributeSchemas.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .filter("filter")
                    .addHierarchy(0L)
                    .model(ConfigUpdateResponse.Config.Model.OPENAI)
                    .name("name")
                    .partitions(
                        ConfigUpdateResponse.Config.Partitions.builder()
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
                        ConfigUpdateResponse.Config.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(configUpdateResponse.description()).contains("description")
        assertThat(configUpdateResponse.name()).isEqualTo("name")
        assertThat(configUpdateResponse.scheduleCron()).contains("schedule_cron")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configUpdateResponse =
            ConfigUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    ConfigUpdateResponse.Config.builder()
                        .attributeSchemas(
                            ConfigUpdateResponse.Config.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .filter("filter")
                        .addHierarchy(0L)
                        .model(ConfigUpdateResponse.Config.Model.OPENAI)
                        .name("name")
                        .partitions(
                            ConfigUpdateResponse.Config.Partitions.builder()
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
                            ConfigUpdateResponse.Config.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .scheduleCron("schedule_cron")
                .build()

        val roundtrippedConfigUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configUpdateResponse),
                jacksonTypeRef<ConfigUpdateResponse>(),
            )

        assertThat(roundtrippedConfigUpdateResponse).isEqualTo(configUpdateResponse)
    }
}
