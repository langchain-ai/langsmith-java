// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.sessions

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.sessions.insights.CreateRunClusteringJobRequest
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightCreateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightDeleteParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightListParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveRunsParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightUpdateParams
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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.api().v1().sessions().insights()

        val insightFuture =
            insightServiceAsync.create(
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

        val insight = insightFuture.get()
        insight.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.api().v1().sessions().insights()

        val insightFuture =
            insightServiceAsync.retrieve(
                InsightRetrieveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .clusterId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val insight = insightFuture.get()
        insight.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.api().v1().sessions().insights()

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
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.api().v1().sessions().insights()

        val insightsFuture =
            insightServiceAsync.list(
                InsightListParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .build()
            )

        val insights = insightsFuture.get()
        insights.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.api().v1().sessions().insights()

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
    fun retrieveRuns() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val insightServiceAsync = client.api().v1().sessions().insights()

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
