// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SessionServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.sessions()
        val tracerSessionWithoutVirtualFields =
            sessionService.create(
                SessionCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .name("string")
                    .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .upsert(true)
                    .build()
            )
        println(tracerSessionWithoutVirtualFields)
        tracerSessionWithoutVirtualFields.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.sessions()
        val tracerSession =
            sessionService.retrieve(
                SessionRetrieveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeStats(true)
                    .build()
            )
        println(tracerSession)
        tracerSession.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.sessions()
        val tracerSessionWithoutVirtualFields =
            sessionService.update(
                SessionUpdateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .name("string")
                    .build()
            )
        println(tracerSessionWithoutVirtualFields)
        tracerSessionWithoutVirtualFields.validate()
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.sessions()
        val sessionListResponse =
            sessionService.list(
                SessionListParams.builder()
                    .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .facets(true)
                    .limit(123L)
                    .name("string")
                    .nameContains("string")
                    .offset(123L)
                    .referenceDataset(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .referenceFree(true)
                    .sortBy(SessionListParams.SortBy.NAME)
                    .sortByDesc(true)
                    .sortByFeedbackKey("string")
                    .build()
            )
        println(sessionListResponse)
        for (tracerSession: TracerSession in sessionListResponse) {
            tracerSession.validate()
        }
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.sessions()
        val sessionDeleteResponse =
            sessionService.delete(
                SessionDeleteParams.builder()
                    .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(sessionDeleteResponse)
    }
}
