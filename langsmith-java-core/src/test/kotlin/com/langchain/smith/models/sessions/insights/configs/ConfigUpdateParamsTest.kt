// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.insights.CreateRunClusteringJobRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigUpdateParamsTest {

    @Test
    fun create() {
        ConfigUpdateParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .config(
                CreateRunClusteringJobRequest.builder()
                    .attributeSchemas(
                        CreateRunClusteringJobRequest.AttributeSchemas.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .clusterModel("cluster_model")
                    .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .addHierarchy(0L)
                    .isScheduled(true)
                    .lastNHours(0L)
                    .model(CreateRunClusteringJobRequest.Model.OPENAI)
                    .name("name")
                    .partitions(
                        CreateRunClusteringJobRequest.Partitions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .sample(0.0)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .summaryModel("summary_model")
                    .summaryPrompt("summary_prompt")
                    .userContext(
                        CreateRunClusteringJobRequest.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .validateModelSecrets(true)
                    .build()
            )
            .description("description")
            .name("name")
            .scheduleCron("schedule_cron")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConfigUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConfigUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    CreateRunClusteringJobRequest.builder()
                        .attributeSchemas(
                            CreateRunClusteringJobRequest.AttributeSchemas.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .clusterModel("cluster_model")
                        .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filter("filter")
                        .addHierarchy(0L)
                        .isScheduled(true)
                        .lastNHours(0L)
                        .model(CreateRunClusteringJobRequest.Model.OPENAI)
                        .name("name")
                        .partitions(
                            CreateRunClusteringJobRequest.Partitions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .sample(0.0)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .summaryModel("summary_model")
                        .summaryPrompt("summary_prompt")
                        .userContext(
                            CreateRunClusteringJobRequest.UserContext.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .validateModelSecrets(true)
                        .build()
                )
                .description("description")
                .name("name")
                .scheduleCron("schedule_cron")
                .build()

        val body = params._body()

        assertThat(body.config())
            .contains(
                CreateRunClusteringJobRequest.builder()
                    .attributeSchemas(
                        CreateRunClusteringJobRequest.AttributeSchemas.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .clusterModel("cluster_model")
                    .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .addHierarchy(0L)
                    .isScheduled(true)
                    .lastNHours(0L)
                    .model(CreateRunClusteringJobRequest.Model.OPENAI)
                    .name("name")
                    .partitions(
                        CreateRunClusteringJobRequest.Partitions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .sample(0.0)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .summaryModel("summary_model")
                    .summaryPrompt("summary_prompt")
                    .userContext(
                        CreateRunClusteringJobRequest.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .validateModelSecrets(true)
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.scheduleCron()).contains("schedule_cron")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConfigUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
