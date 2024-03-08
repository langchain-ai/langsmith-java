// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking.annotationQueues

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    TestServerExtension::class
) // templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15 //
// templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15
class RunServiceTest {

    @Test // templates/JavaSDK/entities/testing.ts:18:13 // templates/JavaSDK/services.ts:298:15
    fun callCreate() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunCreateResponse =
            runService.create(
                AnnotationQueueRunCreateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(
            annotationQueueRunCreateResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (annotationQueueRunSchema: AnnotationQueueRunSchema in
            annotationQueueRunCreateResponse) { // templates/JavaSDK/services.ts:509:10
            annotationQueueRunSchema.validate()
        }
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callUpdate() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunUpdateResponse =
            runService.update(
                AnnotationQueueRunUpdateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(annotationQueueRunUpdateResponse)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callList() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunListResponse =
            runService.list(
                AnnotationQueueRunListParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(
            annotationQueueRunListResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (runSchemaWithAnnotationQueueInfo: RunSchemaWithAnnotationQueueInfo in
            annotationQueueRunListResponse) { // templates/JavaSDK/services.ts:509:10
            runSchemaWithAnnotationQueueInfo.validate()
        }
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callDelete() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val runService = client.annotationQueues().runs()
        val annotationQueueRunDeleteResponse =
            runService.delete(
                AnnotationQueueRunDeleteParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queueRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(annotationQueueRunDeleteResponse)
    }
}
