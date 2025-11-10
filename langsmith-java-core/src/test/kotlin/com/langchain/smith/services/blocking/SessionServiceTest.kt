// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.CustomChartsSectionRequest
import com.langchain.smith.models.sessions.RunStatsGroupBy
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionSortableColumns
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sessionService = client.sessions()

        val tracerSessionWithoutVirtualFields =
            sessionService.create(
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

        tracerSessionWithoutVirtualFields.validate()
    }

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
        val sessionService = client.sessions()

        val tracerSession =
            sessionService.retrieve(
                SessionRetrieveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeStats(true)
                    .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accept("accept")
                    .build()
            )

        tracerSession.validate()
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
        val sessionService = client.sessions()

        val tracerSessionWithoutVirtualFields =
            sessionService.update(
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

        tracerSessionWithoutVirtualFields.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sessionService = client.sessions()

        val tracerSessions =
            sessionService.list(
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

        tracerSessions.forEach { it.validate() }
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
        val sessionService = client.sessions()

        val session = sessionService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        session.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun dashboard() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sessionService = client.sessions()

        val customChartsSection =
            sessionService.dashboard(
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

        customChartsSection.validate()
    }
}
