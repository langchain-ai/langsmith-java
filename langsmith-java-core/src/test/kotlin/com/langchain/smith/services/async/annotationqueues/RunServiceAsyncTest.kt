// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.annotationqueues.runs.RunCreateParams
import com.langchain.smith.models.annotationqueues.runs.RunDeleteAllParams
import com.langchain.smith.models.annotationqueues.runs.RunDeleteQueueParams
import com.langchain.smith.models.annotationqueues.runs.RunListParams
import com.langchain.smith.models.annotationqueues.runs.RunUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

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
        val runServiceAsync = client.annotationQueues().runs()

        val runsFuture =
            runServiceAsync.create(
                RunCreateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .bodyOfRunUuidList(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )

        val runs = runsFuture.get()
        runs.forEach { it.validate() }
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
        val runServiceAsync = client.annotationQueues().runs()

        val runFuture =
            runServiceAsync.update(
                RunUpdateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val run = runFuture.get()
        run.validate()
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
        val runServiceAsync = client.annotationQueues().runs()

        val runSchemaWithAnnotationQueueInfosFuture =
            runServiceAsync.list(
                RunListParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .archived(true)
                    .includeStats(true)
                    .limit(1L)
                    .offset(0L)
                    .build()
            )

        val runSchemaWithAnnotationQueueInfos = runSchemaWithAnnotationQueueInfosFuture.get()
        runSchemaWithAnnotationQueueInfos.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.annotationQueues().runs()

        val responseFuture =
            runServiceAsync.deleteAll(
                RunDeleteAllParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deleteAll(true)
                    .addExcludeRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteQueue() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.annotationQueues().runs()

        val responseFuture =
            runServiceAsync.deleteQueue(
                RunDeleteQueueParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
