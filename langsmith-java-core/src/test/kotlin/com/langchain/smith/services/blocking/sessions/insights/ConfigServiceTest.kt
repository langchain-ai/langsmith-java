// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions.insights

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.insights.CreateRunClusteringJobRequest
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteParams
import com.langchain.smith.models.sessions.insights.configs.ConfigListParams
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val configService = client.sessions().insights().configs()

        val config =
            configService.create(
                ConfigCreateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .name("name")
                    .description("description")
                    .scheduleCron("schedule_cron")
                    .build()
            )

        config.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val configService = client.sessions().insights().configs()

        val config =
            configService.update(
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
            )

        config.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val configService = client.sessions().insights().configs()

        val configs =
            configService.list(
                ConfigListParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includePrebuilts(true)
                    .build()
            )

        configs.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val configService = client.sessions().insights().configs()

        val config =
            configService.delete(
                ConfigDeleteParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        config.validate()
    }
}
