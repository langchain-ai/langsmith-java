// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.insights.CreateRunClusteringJobRequest
import com.langchain.smith.models.sessions.insights.InsightCreateParams
import com.langchain.smith.models.sessions.insights.InsightDeleteParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsParams
import com.langchain.smith.models.sessions.insights.InsightUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.sessions().insights()

        val insightFuture =
            insightServiceAsync.create(
                InsightCreateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createRunClusteringJobRequest(
                        CreateRunClusteringJobRequest.builder()
                            .attributeSchemas(
                                CreateRunClusteringJobRequest.AttributeSchemas.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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

        val insight = insightFuture.get()
        insight.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.sessions().insights()

        val insightFuture =
            insightServiceAsync.update(
                InsightUpdateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        val insight = insightFuture.get()
        insight.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.sessions().insights()

        val insightFuture =
            insightServiceAsync.delete(
                InsightDeleteParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val insight = insightFuture.get()
        insight.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveJob() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.sessions().insights()

        val responseFuture =
            insightServiceAsync.retrieveJob(
                InsightRetrieveJobParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRuns() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.sessions().insights()

        val responseFuture =
            insightServiceAsync.retrieveRuns(
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

        val response = responseFuture.get()
        response.validate()
    }
}
