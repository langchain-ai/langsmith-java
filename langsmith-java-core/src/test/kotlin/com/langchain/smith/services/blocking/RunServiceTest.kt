// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.github.luben.zstd.ZstdInputStream
import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.containing
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunStatsQueryParams
import com.langchain.smith.models.runs.RunTypeEnum
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunsFilterDataSourceTypeEnum
import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.io.ByteArrayInputStream
import java.time.OffsetDateTime
import java.util.concurrent.CompletableFuture
import java.util.concurrent.atomic.AtomicReference
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class RunServiceTest {

    @Test
    fun `auto batch queue uses server batch ingest size limit`(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":2,"size_limit_bytes":20971520,"use_multipart_endpoint":false}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/batch")).willReturn(okJson("{}")))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.create(testRun("r1"))
            runService.create(testRun("r2"))
            runService.create(testRun("r3"))
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(2, postRequestedFor(urlPathEqualTo("/runs/batch")))
            verify(0, postRequestedFor(urlPathEqualTo("/runs/multipart")))
        } finally {
            client.close()
        }
    }

    @Test
    fun `auto batch queue defaults to multipart when info omits multipart flag`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/multipart")).willReturn(okJson("{}")))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.create(testRun("r1"))
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(1, postRequestedFor(urlPathEqualTo("/runs/multipart")))
            verify(0, postRequestedFor(urlPathEqualTo("/runs/batch")))
        } finally {
            client.close()
        }
    }

    @Test
    fun `auto batch queue uses server multipart ingest endpoint`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520,"use_multipart_endpoint":true},"instance_flags":{"zstd_compression_enabled":false}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/multipart")).willReturn(okJson("{}")))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.create(
                testRun("r1")
                    .toBuilder()
                    .inputs(
                        Run.Inputs.builder()
                            .putAdditionalProperty("question", JsonValue.from("hello"))
                            .build()
                    )
                    .events(
                        listOf(
                            Run.Event.builder()
                                .putAdditionalProperty("event", JsonValue.from("started"))
                                .build()
                        )
                    )
                    .extra(
                        Run.Extra.builder()
                            .putAdditionalProperty("metadata", JsonValue.from("value"))
                            .build()
                    )
                    .error("boom")
                    .serialized(
                        Run.Serialized.builder()
                            .putAdditionalProperty("lc", JsonValue.from(1))
                            .build()
                    )
                    .build()
            )
            runService.update(
                RunUpdateParams.builder()
                    .runId("r1")
                    .run(
                        Run.builder()
                            .traceId("r1")
                            .dottedOrder("order")
                            .outputs(
                                Run.Outputs.builder()
                                    .putAdditionalProperty("answer", JsonValue.from("world"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(
                1,
                postRequestedFor(urlPathEqualTo("/runs/multipart"))
                    .withHeader("Content-Type", containing("multipart/form-data"))
                    .withRequestBody(containing("Content-Type: application/json; length="))
                    .withRequestBody(containing("name=\"post.r1\""))
                    .withRequestBody(containing("name=\"post.r1.inputs\""))
                    .withRequestBody(containing("name=\"post.r1.outputs\""))
                    .withRequestBody(containing("name=\"post.r1.events\""))
                    .withRequestBody(containing("name=\"post.r1.extra\""))
                    .withRequestBody(containing("name=\"post.r1.error\""))
                    .withRequestBody(containing("name=\"post.r1.serialized\"")),
            )
            verify(0, postRequestedFor(urlPathEqualTo("/runs/batch")))
        } finally {
            client.close()
        }
    }

    @Test
    fun `auto batch queue uses multipart patch parts for updates`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520,"use_multipart_endpoint":true},"instance_flags":{"zstd_compression_enabled":false}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/multipart")).willReturn(okJson("{}")))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.update(
                RunUpdateParams.builder()
                    .runId("r1")
                    .run(
                        Run.builder()
                            .traceId("r1")
                            .dottedOrder("order")
                            .outputs(
                                Run.Outputs.builder()
                                    .putAdditionalProperty("answer", JsonValue.from("world"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(
                1,
                postRequestedFor(urlPathEqualTo("/runs/multipart"))
                    .withHeader("Content-Type", containing("multipart/form-data"))
                    .withRequestBody(containing("name=\"patch.r1\""))
                    .withRequestBody(containing("name=\"patch.r1.outputs\"")),
            )
            verify(0, postRequestedFor(urlPathEqualTo("/runs/batch")))
        } finally {
            client.close()
        }
    }

    @Test
    fun `auto batch queue falls back to json batch when multipart required fields are missing`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520,"use_multipart_endpoint":true},"instance_flags":{"zstd_compression_enabled":false}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/batch")).willReturn(okJson("{}")))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.create(
                Run.builder().id("r1").name("missing required multipart fields").build()
            )
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(0, postRequestedFor(urlPathEqualTo("/runs/multipart")))
            verify(1, postRequestedFor(urlPathEqualTo("/runs/batch")))
        } finally {
            client.close()
        }
    }

    @Test
    fun `auto batch queue does not treat json batch fallback 404 as multipart 404`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520,"use_multipart_endpoint":true},"instance_flags":{"zstd_compression_enabled":false}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/batch")).willReturn(aResponse().withStatus(404)))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.create(
                Run.builder().id("r1").name("missing required multipart fields").build()
            )
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(0, postRequestedFor(urlPathEqualTo("/runs/multipart")))
            verify(1, postRequestedFor(urlPathEqualTo("/runs/batch")))
        } finally {
            client.close()
        }
    }

    @Test
    fun `auto batch queue falls back when multipart ingest endpoint is missing`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            get(urlPathEqualTo("/info"))
                .willReturn(
                    okJson(
                        """
                        {"batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520,"use_multipart_endpoint":true},"instance_flags":{"zstd_compression_enabled":false}}
                        """
                            .trimIndent()
                    )
                )
        )
        stubFor(post(urlPathEqualTo("/runs/multipart")).willReturn(aResponse().withStatus(404)))
        stubFor(post(urlPathEqualTo("/runs/batch")).willReturn(okJson("{}")))
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .build()
        val runService = client.runs()

        try {
            runService.create(testRun("r1"))
            runService.flush()
            runService.create(testRun("r2"))
            runService.flush()

            verify(1, getRequestedFor(urlPathEqualTo("/info")))
            verify(1, postRequestedFor(urlPathEqualTo("/runs/multipart")))
            verify(2, postRequestedFor(urlPathEqualTo("/runs/batch")))
        } finally {
            client.close()
        }
    }

    @Test
    fun ingestBatch_sendsUncompressedJsonBodyWhenCompressionSupported() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest)
        val runService = runService(httpClient)

        runService.ingestBatch(
            RunIngestBatchParams.builder().addPost(Run.builder().id("run-id").build()).build()
        )

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "batch")
        assertThat(request.headers.values("Content-Encoding")).isEmpty()
        assertThat(body.contentType()).isEqualTo("application/json")
        assertThat(body.repeatable()).isTrue()
        assertThat(readBody(body)).contains("\"post\":[{\"id\":\"run-id\"}")
    }

    @Test
    fun `auto batch queue sends streaming zstd multipart body by default`() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest)
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id"))
        runService.flush()

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "multipart")
        assertThat(request.headers.values("Content-Encoding")).containsExactly("zstd")
        assertThat(body.contentType()).startsWith("multipart/form-data")
        assertThat(body.contentLength()).isEqualTo(-1L)
        assertThat(body.repeatable()).isTrue()
        assertThat(decompress(body)).contains("name=\"post.run-id\"")
    }

    @Test
    fun `auto batch queue sends uncompressed multipart body when server disables zstd`() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest, zstdCompressionEnabled = false)
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id"))
        runService.flush()

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "multipart")
        assertThat(request.headers.values("Content-Encoding")).isEmpty()
        assertThat(body.contentType()).startsWith("multipart/form-data")
        assertThat(body.repeatable()).isTrue()
        assertThat(readBody(body)).contains("name=\"post.run-id\"")
    }

    @Test
    fun `auto batch queue sends streaming zstd multipart body when info request fails`() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest, failInfoRequest = true)
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id"))
        runService.flush()

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "multipart")
        assertThat(request.headers.values("Content-Encoding")).containsExactly("zstd")
        assertThat(decompress(body)).contains("name=\"post.run-id\"")
    }

    private fun testRun(id: String): Run =
        Run.builder().id(id).traceId(id).dottedOrder("order").name("test").build()

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.runs()

        val runSchema =
            runService.retrieve(
                RunRetrieveParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .excludeS3StoredAttributes(true)
                    .excludeSerialized(true)
                    .includeMessages(true)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        runSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun ingestBatch() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.runs()

        val response =
            runService.ingestBatch(
                RunIngestBatchParams.builder()
                    .addPatch(
                        Run.builder()
                            .id("id")
                            .dottedOrder("dotted_order")
                            .endTime("end_time")
                            .error("error")
                            .addEvent(
                                Run.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .extra(
                                Run.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputAttachments(
                                Run.InputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputs(
                                Run.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .outputAttachments(
                                Run.OutputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                Run.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("parent_run_id")
                            .referenceExampleId("reference_example_id")
                            .runType(Run.RunType.TOOL)
                            .serialized(
                                Run.Serialized.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .sessionId("session_id")
                            .sessionName("session_name")
                            .startTime("start_time")
                            .status("status")
                            .addTag("string")
                            .traceId("trace_id")
                            .build()
                    )
                    .addPost(
                        Run.builder()
                            .id("id")
                            .dottedOrder("dotted_order")
                            .endTime("end_time")
                            .error("error")
                            .addEvent(
                                Run.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .extra(
                                Run.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputAttachments(
                                Run.InputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputs(
                                Run.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .outputAttachments(
                                Run.OutputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                Run.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("parent_run_id")
                            .referenceExampleId("reference_example_id")
                            .runType(Run.RunType.TOOL)
                            .serialized(
                                Run.Serialized.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .sessionId("session_id")
                            .sessionName("session_name")
                            .startTime("start_time")
                            .status("status")
                            .addTag("string")
                            .traceId("trace_id")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.runs()

        val response =
            runService.query(
                RunQueryParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .executionOrder(1L)
                    .filter("filter")
                    .isRoot(true)
                    .limit(1L)
                    .order(RunQueryParams.Order.ASC)
                    .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("query")
                    .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runType(RunTypeEnum.TOOL)
                    .searchFilter("search_filter")
                    .addSelect(RunQueryParams.Select.ID)
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .skipPagination(true)
                    .skipPrevCursor(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .useExperimentalSearch(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stats() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.runs()

        val response =
            runService.stats(
                RunStatsQueryParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .executionOrder(1L)
                    .filter("filter")
                    .groupBy(
                        RunStatsGroupBy.builder()
                            .attribute(RunStatsGroupBy.Attribute.NAME)
                            .maxGroups(0L)
                            .path("path")
                            .build()
                    )
                    .addGroup("string")
                    .isRoot(true)
                    .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("query")
                    .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runType(RunTypeEnum.TOOL)
                    .searchFilter("search_filter")
                    .addSelect(RunStatsQueryParams.Select.RUN_COUNT)
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .skipPagination(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .useExperimentalSearch(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update2() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.runs()

        val response = runService.update2("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    private fun runService(httpClient: HttpClient): RunService.WithRawResponse =
        RunServiceImpl(
                ClientOptions.builder()
                    .httpClient(httpClient)
                    .baseUrl("https://example.com")
                    .checkJacksonVersionCompatibility(false)
                    .build()
            )
            .withRawResponse()

    private fun autoBatchRunService(httpClient: HttpClient): RunService =
        RunServiceImpl(
            ClientOptions.builder()
                .httpClient(httpClient)
                .baseUrl("https://example.com")
                .checkJacksonVersionCompatibility(false)
                .build()
        )

    private fun capturingHttpClient(
        capturedRequest: AtomicReference<HttpRequest>,
        zstdCompressionEnabled: Boolean? = null,
        failInfoRequest: Boolean = false,
    ): HttpClient =
        object : HttpClient {
            override fun execute(
                request: HttpRequest,
                requestOptions: RequestOptions,
            ): HttpResponse {
                if (request.pathSegments == listOf("info")) {
                    if (failInfoRequest) {
                        throw RuntimeException("failed to fetch info")
                    }
                    return infoResponse(zstdCompressionEnabled)
                }
                capturedRequest.set(request)
                return okResponse()
            }

            override fun executeAsync(
                request: HttpRequest,
                requestOptions: RequestOptions,
            ): CompletableFuture<HttpResponse> {
                if (request.pathSegments == listOf("info")) {
                    if (failInfoRequest) {
                        val future = CompletableFuture<HttpResponse>()
                        future.completeExceptionally(RuntimeException("failed to fetch info"))
                        return future
                    }
                    return CompletableFuture.completedFuture(infoResponse(zstdCompressionEnabled))
                }
                capturedRequest.set(request)
                return CompletableFuture.completedFuture(okResponse())
            }

            override fun close() {}
        }

    private fun infoResponse(zstdCompressionEnabled: Boolean?): HttpResponse {
        val instanceFlags =
            zstdCompressionEnabled?.let { ",\"instance_flags\":{\"zstd_compression_enabled\":$it}" }
                ?: ""
        return jsonResponse(
            """{"version":"test","batch_ingest_config":{"size_limit":100,"size_limit_bytes":20971520}$instanceFlags}"""
        )
    }

    private fun okResponse(): HttpResponse = jsonResponse("{}")

    private fun jsonResponse(json: String): HttpResponse =
        object : HttpResponse {
            override fun statusCode(): Int = 200

            override fun headers(): Headers = Headers.builder().build()

            override fun body(): ByteArrayInputStream = json.byteInputStream()

            override fun close() {}
        }

    private fun decompress(body: com.langchain.smith.core.http.HttpRequestBody): String {
        val output = java.io.ByteArrayOutputStream()
        body.writeTo(output)
        return ZstdInputStream(ByteArrayInputStream(output.toByteArray()))
            .bufferedReader(Charsets.UTF_8)
            .use { it.readText() }
    }

    private fun readBody(body: com.langchain.smith.core.http.HttpRequestBody): String {
        val output = java.io.ByteArrayOutputStream()
        body.writeTo(output)
        return output.toString("UTF-8")
    }
}
