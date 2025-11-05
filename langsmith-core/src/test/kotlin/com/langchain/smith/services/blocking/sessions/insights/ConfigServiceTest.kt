// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions.insights

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.insights.CreateRunClusteringJobRequest
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteParams
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigListParams
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val configService = client.sessions().insights().configs()

        val createClusteringJobConfigResponse =
            configService.create(
                ConfigCreateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .config(
                        CreateRunClusteringJobRequest.builder()
                            .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .filter("filter")
                            .addHierarchy(0L)
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
                    .build()
            )

        createClusteringJobConfigResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val configService = client.sessions().insights().configs()

        val createClusteringJobConfigResponse =
            configService.update(
                ConfigUpdateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .config(
                        CreateRunClusteringJobRequest.builder()
                            .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .filter("filter")
                            .addHierarchy(0L)
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
                    .build()
            )

        createClusteringJobConfigResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val configService = client.sessions().insights().configs()

        val configs =
            configService.list(
                ConfigListParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includePrebuilts(true)
                    .build()
            )

        configs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun generate() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val configService = client.sessions().insights().configs()

        val response =
            configService.generate(
                ConfigGenerateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userContext(
                        ConfigGenerateParams.UserContext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .model(ConfigGenerateParams.Model.OPENAI)
                    .build()
            )

        response.validate()
    }
}
