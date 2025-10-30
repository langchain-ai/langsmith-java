// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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
internal class AnnotationQueueServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val annotationQueue =
            annotationQueueService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueue.validate()
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
        val annotationQueueService = client.annotationQueues()

        val annotationQueue =
            annotationQueueService.update(
                AnnotationQueueUpdateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .enableReservations(true)
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

        annotationQueue.validate()
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
        val annotationQueueService = client.annotationQueues()

        val annotationQueue = annotationQueueService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun annotationQueues() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val annotationQueueSchema =
            annotationQueueService.annotationQueues(
                AnnotationQueueAnnotationQueuesParams.builder()
                    .name("name")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .enableReservations(true)
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

        annotationQueueSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createRunStatus() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val response =
            annotationQueueService.createRunStatus(
                AnnotationQueueCreateRunStatusParams.builder()
                    .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .overrideAddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status("status")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun export() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val response =
            annotationQueueService.export(
                AnnotationQueueExportParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun populate() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val response =
            annotationQueueService.populate(
                AnnotationQueuePopulateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAnnotationQueues() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val response =
            annotationQueueService.retrieveAnnotationQueues(
                AnnotationQueueRetrieveAnnotationQueuesParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveQueues() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val annotationQueueSchemata =
            annotationQueueService.retrieveQueues("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueueSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRun() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val runSchemaWithAnnotationQueueInfo =
            annotationQueueService.retrieveRun(
                AnnotationQueueRetrieveRunParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .index(0L)
                    .includeExtra(true)
                    .build()
            )

        runSchemaWithAnnotationQueueInfo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSize() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val annotationQueueSizeSchema =
            annotationQueueService.retrieveSize("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueueSizeSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTotalArchived() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val annotationQueueSizeSchema =
            annotationQueueService.retrieveTotalArchived(
                AnnotationQueueRetrieveTotalArchivedParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        annotationQueueSizeSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTotalSize() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.annotationQueues()

        val annotationQueueSizeSchema =
            annotationQueueService.retrieveTotalSize("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueueSizeSchema.validate()
    }
}
