// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.errors.BadRequestException
import com.langchain.smith.errors.InternalServerException
import com.langchain.smith.errors.LangChainException
import com.langchain.smith.errors.NotFoundException
import com.langchain.smith.errors.PermissionDeniedException
import com.langchain.smith.errors.RateLimitException
import com.langchain.smith.errors.UnauthorizedException
import com.langchain.smith.errors.UnexpectedStatusCodeException
import com.langchain.smith.errors.UnprocessableEntityException
import com.langchain.smith.models.sessions.SessionCreateParams
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

    private lateinit var client: LangsmithClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LangsmithOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
    }

    @Test
    fun sessionsCreate400() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate400WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate401() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate401WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate403() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate403WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate404() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate404WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate422() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate422WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate429() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate429WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate500() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate500WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate999() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreate999WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsCreateInvalidJsonBody() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LangChainException> {
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
