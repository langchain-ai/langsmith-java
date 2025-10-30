// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueAnnotationQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueExportParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueuePopulateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveTotalArchivedParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRubricItemSchema
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueUpdateParams
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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

        val runSchemaWithAnnotationQueueInfo =
            annotationQueueService.retrieve(
                AnnotationQueueRetrieveParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .index(0L)
                    .includeExtra(true)
                    .build()
            )

        runSchemaWithAnnotationQueueInfo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

        val annotationQueue =
            annotationQueueService.update(
                AnnotationQueueUpdateParams.builder()
                    .annotationQueueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .overrideAddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status("status")
                    .build()
            )

        annotationQueue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

        val annotationQueue = annotationQueueService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun annotationQueues() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

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
    fun export() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

        val annotationQueueSchemata =
            annotationQueueService.retrieveQueues("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueueSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSize() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

        val annotationQueueSizeSchema =
            annotationQueueService.retrieveSize("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueueSizeSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTotalArchived() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val annotationQueueService = client.api().v1().annotationQueues()

        val annotationQueueSizeSchema =
            annotationQueueService.retrieveTotalSize("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        annotationQueueSizeSchema.validate()
    }
}
