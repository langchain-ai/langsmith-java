// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.feedback.AppFeedbackSource
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackRetrieveParams
import com.langchain.smith.models.feedback.FeedbackUpdateParams
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
                    .correction(
                        FeedbackCreateSchema.Correction.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
                            .metadata(
                                AppFeedbackSource.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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
                    .correction(
                        FeedbackUpdateParams.Correction.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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

        val pageFuture = feedbackServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
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
}
