// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.annotationQueues

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RunServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunCreateResponse =
            runService.create(
                AnnotationQueueRunCreateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(annotationQueueRunCreateResponse)
        for (annotationQueueRunSchema: AnnotationQueueRunSchema in
            annotationQueueRunCreateResponse) {
            annotationQueueRunSchema.validate()
        }
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunUpdateResponse =
            runService.update(
                AnnotationQueueRunUpdateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(annotationQueueRunUpdateResponse)
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunListResponse =
            runService.list(
                AnnotationQueueRunListParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(annotationQueueRunListResponse)
        for (runSchemaWithAnnotationQueueInfo: RunSchemaWithAnnotationQueueInfo in
            annotationQueueRunListResponse) {
            runSchemaWithAnnotationQueueInfo.validate()
        }
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunDeleteResponse =
            runService.delete(
                AnnotationQueueRunDeleteParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(annotationQueueRunDeleteResponse)
    }
}
