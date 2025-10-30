// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.feedback.AppFeedbackSource
import com.langsmith_api.api.models.api.v1.feedback.FeedbackCreateSchema
import com.langsmith_api.api.models.api.v1.feedback.FeedbackLevel
import com.langsmith_api.api.models.api.v1.feedback.FeedbackListParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackRetrieveParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackUpdateParams
import com.langsmith_api.api.models.api.v1.feedback.SourceType
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.api().v1().feedback()

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
                        FeedbackConfig.builder()
                            .type(FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackConfig.Category.builder().value(0.0).label("x").build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type("type")
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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.api().v1().feedback()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.api().v1().feedback()

        val feedbackSchemaFuture =
            feedbackServiceAsync.update(
                FeedbackUpdateParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .feedbackConfig(
                        FeedbackConfig.builder()
                            .type(FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackConfig.Category.builder().value(0.0).label("x").build()
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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.api().v1().feedback()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.api().v1().feedback()

        val feedbackFuture = feedbackServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val feedback = feedbackFuture.get()
        feedback.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun eager() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackServiceAsync = client.api().v1().feedback()

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
                        FeedbackConfig.builder()
                            .type(FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackConfig.Category.builder().value(0.0).label("x").build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type("type")
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
}
