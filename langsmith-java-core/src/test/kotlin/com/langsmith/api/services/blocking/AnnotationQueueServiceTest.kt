// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AnnotationQueueServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val annotationQueueService = client.annotationQueues()
        val annotationQueueSchema =
            annotationQueueService.create(
                AnnotationQueueCreateParams.builder()
                    .name("string")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(annotationQueueSchema)
        annotationQueueSchema.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val annotationQueueService = client.annotationQueues()
        val annotationQueueUpdateResponse =
            annotationQueueService.update(
                AnnotationQueueUpdateParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(annotationQueueUpdateResponse)
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val annotationQueueService = client.annotationQueues()
        val annotationQueueListResponse =
            annotationQueueService.list(
                AnnotationQueueListParams.builder()
                    .ids(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .limit(123L)
                    .name("string")
                    .nameContains("string")
                    .offset(123L)
                    .build()
            )
        println(annotationQueueListResponse)
        for (annotationQueueSchema: AnnotationQueueSchema in annotationQueueListResponse) {
            annotationQueueSchema.validate()
        }
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val annotationQueueService = client.annotationQueues()
        val annotationQueueDeleteResponse =
            annotationQueueService.delete(
                AnnotationQueueDeleteParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(annotationQueueDeleteResponse)
    }

    @Test
    fun callSizeRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val annotationQueueService = client.annotationQueues()
        val annotationQueueSizeSchema =
            annotationQueueService.sizeRetrieve(
                AnnotationQueueSizeRetrieveParams.builder()
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(annotationQueueSizeSchema)
        annotationQueueSizeSchema.validate()
    }
}
