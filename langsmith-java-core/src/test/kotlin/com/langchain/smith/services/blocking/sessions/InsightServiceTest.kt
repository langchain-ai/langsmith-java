// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.insights.CreateRunClusteringJobRequest
import com.langchain.smith.models.sessions.insights.InsightCreateParams
import com.langchain.smith.models.sessions.insights.InsightDeleteParams
import com.langchain.smith.models.sessions.insights.InsightListParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsParams
import com.langchain.smith.models.sessions.insights.InsightUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightServiceTest {

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
        val insightService = client.sessions().insights()

        val insight =
            insightService.create(
                InsightCreateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createRunClusteringJobRequest(
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
                    .build()
            )

        insight.validate()
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
        val insightService = client.sessions().insights()

        val insight =
            insightService.update(
                InsightUpdateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        insight.validate()
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
        val insightService = client.sessions().insights()

        val insights =
            insightService.list(
                InsightListParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .build()
            )

        insights.validate()
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
        val insightService = client.sessions().insights()

        val insight =
            insightService.delete(
                InsightDeleteParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        insight.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveJob() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightService = client.sessions().insights()

        val response =
            insightService.retrieveJob(
                InsightRetrieveJobParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRuns() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightService = client.sessions().insights()

        val response =
            insightService.retrieveRuns(
                InsightRetrieveRunsParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .attributeSortKey("attribute_sort_key")
                    .attributeSortOrder(InsightRetrieveRunsParams.AttributeSortOrder.ASC)
                    .clusterId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .build()
            )

        response.validate()
    }
}
