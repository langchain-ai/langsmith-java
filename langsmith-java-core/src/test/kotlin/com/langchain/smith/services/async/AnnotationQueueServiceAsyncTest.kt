// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.annotationqueues.AnnotationQueueAnnotationQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueCreateRunStatusParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueExportParams
import com.langchain.smith.models.annotationqueues.AnnotationQueuePopulateParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveRunParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveTotalArchivedParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRubricItemSchema
import com.langchain.smith.models.annotationqueues.AnnotationQueueUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AnnotationQueueServiceAsyncTest {

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
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueFuture =
            annotationQueueServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val annotationQueue = annotationQueueFuture.get()
        annotationQueue.validate()
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
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueFuture =
            annotationQueueServiceAsync.update(
                AnnotationQueueUpdateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .enableReservations(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .numReviewersPerItem(0L)
                    .reservationMinutes(0L)
                    .rubricInstructions("rubric_instructions")
                    .addRubricItem(
                        AnnotationQueueRubricItemSchema.builder()
                            .feedbackKey("feedback_key")
                            .description("description")
                            .scoreDescriptions(
                                AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .valueDescriptions(
                                AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val annotationQueue = annotationQueueFuture.get()
        annotationQueue.validate()
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
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueFuture =
            annotationQueueServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val annotationQueue = annotationQueueFuture.get()
        annotationQueue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun annotationQueues() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueSchemaFuture =
            annotationQueueServiceAsync.annotationQueues(
                AnnotationQueueAnnotationQueuesParams.builder()
                    .name("name")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .enableReservations(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .numReviewersPerItem(0L)
                    .reservationMinutes(0L)
                    .rubricInstructions("rubric_instructions")
                    .addRubricItem(
                        AnnotationQueueRubricItemSchema.builder()
                            .feedbackKey("feedback_key")
                            .description("description")
                            .scoreDescriptions(
                                AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .valueDescriptions(
                                AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val annotationQueueSchema = annotationQueueSchemaFuture.get()
        annotationQueueSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createRunStatus() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val responseFuture =
            annotationQueueServiceAsync.createRunStatus(
                AnnotationQueueCreateRunStatusParams.builder()
                    .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .overrideAddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status("status")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun export() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val responseFuture =
            annotationQueueServiceAsync.export(
                AnnotationQueueExportParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun populate() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val responseFuture =
            annotationQueueServiceAsync.populate(
                AnnotationQueuePopulateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAnnotationQueues() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val responseFuture =
            annotationQueueServiceAsync.retrieveAnnotationQueues(
                AnnotationQueueRetrieveAnnotationQueuesParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .queueType(AnnotationQueueRetrieveAnnotationQueuesParams.QueueType.SINGLE)
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveQueues() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueSchemataFuture =
            annotationQueueServiceAsync.retrieveQueues("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val annotationQueueSchemata = annotationQueueSchemataFuture.get()
        annotationQueueSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRun() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val runSchemaWithAnnotationQueueInfoFuture =
            annotationQueueServiceAsync.retrieveRun(
                AnnotationQueueRetrieveRunParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .index(0L)
                    .includeExtra(true)
                    .build()
            )

        val runSchemaWithAnnotationQueueInfo = runSchemaWithAnnotationQueueInfoFuture.get()
        runSchemaWithAnnotationQueueInfo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSize() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueSizeSchemaFuture =
            annotationQueueServiceAsync.retrieveSize("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val annotationQueueSizeSchema = annotationQueueSizeSchemaFuture.get()
        annotationQueueSizeSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTotalArchived() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueSizeSchemaFuture =
            annotationQueueServiceAsync.retrieveTotalArchived(
                AnnotationQueueRetrieveTotalArchivedParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val annotationQueueSizeSchema = annotationQueueSizeSchemaFuture.get()
        annotationQueueSizeSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTotalSize() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueServiceAsync = client.annotationQueues()

        val annotationQueueSizeSchemaFuture =
            annotationQueueServiceAsync.retrieveTotalSize("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val annotationQueueSizeSchema = annotationQueueSizeSchemaFuture.get()
        annotationQueueSizeSchema.validate()
    }
}
