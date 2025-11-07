// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.feedback.AppFeedbackSource
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackIngestBatchParams
import com.langchain.smith.models.feedback.FeedbackLevel
import com.langchain.smith.models.feedback.FeedbackListParams
import com.langchain.smith.models.feedback.FeedbackRetrieveParams
import com.langchain.smith.models.feedback.FeedbackUpdateParams
import com.langchain.smith.models.feedback.SourceType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FeedbackServiceAsyncTest {

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
        val feedbackServiceAsync = client.feedback()

        val feedbackSchemaFuture =
            feedbackServiceAsync.create(
                FeedbackCreateSchema.builder()
                    .key("key")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .feedbackConfig(
                        FeedbackCreateSchema.FeedbackConfig.builder()
                            .type(FeedbackCreateSchema.FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackCreateSchema.FeedbackConfig.Category.builder()
                                    .value(0.0)
                                    .label("x")
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type(AppFeedbackSource.Type.APP)
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .score(0.0)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value(0.0)
                    .build()
            )

        val feedbackSchema = feedbackSchemaFuture.get()
        feedbackSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.feedback()

        val feedbackSchemaFuture =
            feedbackServiceAsync.retrieve(
                FeedbackRetrieveParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeUserNames(true)
                    .build()
            )

        val feedbackSchema = feedbackSchemaFuture.get()
        feedbackSchema.validate()
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
        val feedbackServiceAsync = client.feedback()

        val feedbackSchemaFuture =
            feedbackServiceAsync.update(
                FeedbackUpdateParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .feedbackConfig(
                        FeedbackUpdateParams.FeedbackConfig.builder()
                            .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackUpdateParams.FeedbackConfig.Category.builder()
                                    .value(0.0)
                                    .label("x")
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .score(0.0)
                    .value(0.0)
                    .build()
            )

        val feedbackSchema = feedbackSchemaFuture.get()
        feedbackSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.feedback()

        val feedbackSchemataFuture =
            feedbackServiceAsync.list(
                FeedbackListParams.builder()
                    .hasComment(true)
                    .hasScore(true)
                    .includeUserNames(true)
                    .addKey("string")
                    .level(FeedbackLevel.RUN)
                    .limit(1L)
                    .maxCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .offset(0L)
                    .addRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSource(SourceType.API)
                    .addUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val feedbackSchemata = feedbackSchemataFuture.get()
        feedbackSchemata.forEach { it.validate() }
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
        val feedbackServiceAsync = client.feedback()

        val feedbackFuture = feedbackServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val feedback = feedbackFuture.get()
        feedback.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun eager() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.feedback()

        val feedbackSchemaFuture =
            feedbackServiceAsync.eager(
                FeedbackCreateSchema.builder()
                    .key("key")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .feedbackConfig(
                        FeedbackCreateSchema.FeedbackConfig.builder()
                            .type(FeedbackCreateSchema.FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackCreateSchema.FeedbackConfig.Category.builder()
                                    .value(0.0)
                                    .label("x")
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type(AppFeedbackSource.Type.APP)
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .score(0.0)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value(0.0)
                    .build()
            )

        val feedbackSchema = feedbackSchemaFuture.get()
        feedbackSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ingestBatch() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.feedback()

        val responseFuture =
            feedbackServiceAsync.ingestBatch(
                FeedbackIngestBatchParams.builder()
                    .addBody(
                        FeedbackIngestBatchParams.Body.builder()
                            .id("id")
                            .comment("comment")
                            .comparativeExperimentId("comparative_experiment_id")
                            .correction(JsonValue.from(mapOf<String, Any>()))
                            .createdAt("created_at")
                            .error(true)
                            .feedbackConfig(
                                FeedbackIngestBatchParams.Body.FeedbackConfig.builder()
                                    .addCategory(
                                        FeedbackIngestBatchParams.Body.FeedbackConfig.Category
                                            .builder()
                                            .label("x")
                                            .value(0.0)
                                            .build()
                                    )
                                    .max(0.0)
                                    .min(0.0)
                                    .type(
                                        FeedbackIngestBatchParams.Body.FeedbackConfig.Type
                                            .CONTINUOUS
                                    )
                                    .build()
                            )
                            .feedbackGroupId("feedback_group_id")
                            .feedbackSource(
                                FeedbackIngestBatchParams.Body.FeedbackSource.builder()
                                    .metadata(
                                        FeedbackIngestBatchParams.Body.FeedbackSource.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .type("type")
                                    .build()
                            )
                            .key("key")
                            .modifiedAt("modified_at")
                            .runId("run_id")
                            .score(JsonValue.from(mapOf<String, Any>()))
                            .sessionId("session_id")
                            .traceId("trace_id")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
