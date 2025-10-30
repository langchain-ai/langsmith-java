// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langsmith_api.api.client.LangsmithApiClient
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.errors.BadRequestException
import com.langsmith_api.api.errors.InternalServerException
import com.langsmith_api.api.errors.LangsmithApiException
import com.langsmith_api.api.errors.NotFoundException
import com.langsmith_api.api.errors.PermissionDeniedException
import com.langsmith_api.api.errors.RateLimitException
import com.langsmith_api.api.errors.UnauthorizedException
import com.langsmith_api.api.errors.UnexpectedStatusCodeException
import com.langsmith_api.api.errors.UnprocessableEntityException
import com.langsmith_api.api.models.api.v1.sessions.CustomChartsSectionRequest
import com.langsmith_api.api.models.api.v1.sessions.RunStatsGroupBy
import com.langsmith_api.api.models.api.v1.sessions.SessionDashboardParams
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: LangsmithApiClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
    }

    @Test
    fun sessionsDashboard400() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard400WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard401() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard401WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard403() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard403WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard404() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard404WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard422() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard422WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard429() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard429WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard500() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard500WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard999() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboard999WithRawResponse() {
        val sessionService = client.api().v1().sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsDashboardInvalidJsonBody() {
        val sessionService = client.api().v1().sessions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LangsmithApiException> {
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
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
