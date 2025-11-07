// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.CustomChartsSectionRequest
import com.langchain.smith.models.sessions.RunStatsGroupBy
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.SessionDeleteAllParams
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionRetrieveMetadataParams
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionSortableColumns
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

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
        val sessionServiceAsync = client.sessions()

        val tracerSessionWithoutVirtualFieldsFuture =
            sessionServiceAsync.create(
                SessionCreateParams.builder()
                    .upsert(true)
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceTier(SessionCreateParams.TraceTier.LONGLIVED)
                    .build()
            )

        val tracerSessionWithoutVirtualFields = tracerSessionWithoutVirtualFieldsFuture.get()
        tracerSessionWithoutVirtualFields.validate()
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
        val sessionServiceAsync = client.sessions()

        val tracerSessionFuture =
            sessionServiceAsync.retrieve(
                SessionRetrieveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeStats(true)
                    .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accept("accept")
                    .build()
            )

        val tracerSession = tracerSessionFuture.get()
        tracerSession.validate()
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
        val sessionServiceAsync = client.sessions()

        val tracerSessionWithoutVirtualFieldsFuture =
            sessionServiceAsync.update(
                SessionUpdateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .traceTier(SessionUpdateParams.TraceTier.LONGLIVED)
                    .build()
            )

        val tracerSessionWithoutVirtualFields = tracerSessionWithoutVirtualFieldsFuture.get()
        tracerSessionWithoutVirtualFields.validate()
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
        val sessionServiceAsync = client.sessions()

        val tracerSessionsFuture =
            sessionServiceAsync.list(
                SessionListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .facets(true)
                    .filter("filter")
                    .includeStats(true)
                    .limit(1L)
                    .metadata("metadata")
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .addReferenceDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .referenceFree(true)
                    .sortBy(SessionSortableColumns.NAME)
                    .sortByDesc(true)
                    .sortByFeedbackKey("sort_by_feedback_key")
                    .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .useApproxStats(true)
                    .accept("accept")
                    .build()
            )

        val tracerSessions = tracerSessionsFuture.get()
        tracerSessions.forEach { it.validate() }
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
        val sessionServiceAsync = client.sessions()

        val sessionFuture = sessionServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val session = sessionFuture.get()
        session.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun dashboard() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sessionServiceAsync = client.sessions()

        val customChartsSectionFuture =
            sessionServiceAsync.dashboard(
                SessionDashboardParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accept("accept")
                    .customChartsSectionRequest(
                        CustomChartsSectionRequest.builder()
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .groupBy(
                                RunStatsGroupBy.builder()
                                    .attribute(RunStatsGroupBy.Attribute.NAME)
                                    .maxGroups(0L)
                                    .path("path")
                                    .build()
                            )
                            .omitData(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                            .timezone("timezone")
                            .build()
                    )
                    .build()
            )

        val customChartsSection = customChartsSectionFuture.get()
        customChartsSection.validate()
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
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.deleteAll(
                SessionDeleteAllParams.builder()
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveMetadata() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.retrieveMetadata(
                SessionRetrieveMetadataParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .k(1L)
                    .addMetadataKey("string")
                    .rootRunsOnly(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
