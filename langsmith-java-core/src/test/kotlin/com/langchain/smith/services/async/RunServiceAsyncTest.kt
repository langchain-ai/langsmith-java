// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.github.luben.zstd.ZstdInputStream
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunRetrieveV1Params
import com.langchain.smith.models.runs.RunRetrieveV2Params
import com.langchain.smith.models.runs.RunStatsQueryParams
import com.langchain.smith.models.runs.RunTypeEnum
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunsFilterDataSourceTypeEnum
import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.io.ByteArrayInputStream
import java.time.OffsetDateTime
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicReference
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Test
    fun ingestBatch_sendsUncompressedJsonBodyWhenCompressionSupported() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest)
        val runService = runService(httpClient)

        runService
            .ingestBatch(
                RunIngestBatchParams.builder()
                    .addPost(RunIngest.builder().id("run-id").build())
                    .build()
            )
            .get()

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "batch")
        assertThat(request.headers.values("Content-Encoding")).isEmpty()
        assertThat(body.contentType()).isEqualTo("application/json")
        assertThat(body.repeatable()).isTrue()
        assertThat(readBody(body)).contains("\"post\":[{\"id\":\"run-id\"}")
    }

    @Test
    fun autoBatch_sendsStreamingZstdMultipartBodyByDefault() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest)
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id")).get()
        runService.flush().get()

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
    fun autoBatch_sendsUncompressedMultipartBodyWhenZstdUnsupported() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest, zstdCompressionEnabled = false)
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id")).get()
        runService.flush().get()

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "multipart")
        assertThat(request.headers.values("Content-Encoding")).isEmpty()
        assertThat(body.contentType()).startsWith("multipart/form-data")
        assertThat(body.repeatable()).isTrue()
        assertThat(readBody(body)).contains("name=\"post.run-id\"")
    }

    @Test
    fun autoBatch_sendsStreamingZstdMultipartBodyWhenInfoRequestFails() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest, failInfoRequest = true)
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id")).get()
        runService.flush().get()

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "multipart")
        assertThat(request.headers.values("Content-Encoding")).containsExactly("zstd")
        assertThat(decompress(body)).contains("name=\"post.run-id\"")
    }

    @Test
    fun autoBatch_ignoresLegacyRunCompressionDisableProperty() {
        val previousValue = System.getProperty("langchain.langsmithDisableRunCompression")
        System.setProperty("langchain.langsmithDisableRunCompression", "true")
        try {
            val capturedRequest = AtomicReference<HttpRequest>()
            val httpClient = capturingHttpClient(capturedRequest)
            val runService = autoBatchRunService(httpClient)

            runService.create(testRun("run-id")).get()
            runService.flush().get()

            val request = capturedRequest.get()
            val body = request.body!!
            assertThat(request.pathSegments).containsExactly("runs", "multipart")
            assertThat(request.headers.values("Content-Encoding")).containsExactly("zstd")
            assertThat(decompress(body)).contains("name=\"post.run-id\"")
        } finally {
            if (previousValue == null) {
                System.clearProperty("langchain.langsmithDisableRunCompression")
            } else {
                System.setProperty("langchain.langsmithDisableRunCompression", previousValue)
            }
        }
    }

    @Test
    fun autoBatch_fallsBackToJsonBatchWhenMultipartEndpointIsMissing() {
        val requests = ConcurrentLinkedQueue<List<String>>()
        val httpClient =
            object : HttpClient {
                override fun execute(
                    request: HttpRequest,
                    requestOptions: RequestOptions,
                ): HttpResponse = error("Unexpected blocking request")

                override fun executeAsync(
                    request: HttpRequest,
                    requestOptions: RequestOptions,
                ): CompletableFuture<HttpResponse> {
                    if (request.pathSegments == listOf("info")) {
                        return CompletableFuture.completedFuture(infoResponse(false))
                    }
                    requests.add(request.pathSegments)
                    return CompletableFuture.completedFuture(
                        if (request.pathSegments == listOf("runs", "multipart")) {
                            jsonResponse("{}", statusCode = 404)
                        } else {
                            okResponse()
                        }
                    )
                }

                override fun close() {}
            }
        val runService = autoBatchRunService(httpClient)

        runService.create(testRun("run-id")).get()
        runService.flush().get()

        assertThat(requests).containsExactly(listOf("runs", "multipart"), listOf("runs", "batch"))
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val runFuture =
            runServiceAsync.create(
                RunIngest.builder()
                    .id("id")
                    .dottedOrder("dotted_order")
                    .endTime("end_time")
                    .error("error")
                    .addEvent(
                        RunIngest.Event.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .extra(
                        RunIngest.Extra.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .inputAttachments(
                        RunIngest.InputAttachments.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .inputs(
                        RunIngest.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .outputAttachments(
                        RunIngest.OutputAttachments.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputs(
                        RunIngest.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .parentRunId("parent_run_id")
                    .referenceExampleId("reference_example_id")
                    .runType(RunIngest.RunType.TOOL)
                    .serialized(
                        RunIngest.Serialized.builder()
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

        runFuture.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val runFuture =
            runServiceAsync.update(
                RunUpdateParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runIngest(
                        RunIngest.builder()
                            .id("id")
                            .dottedOrder("dotted_order")
                            .endTime("end_time")
                            .error("error")
                            .addEvent(
                                RunIngest.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .extra(
                                RunIngest.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputAttachments(
                                RunIngest.InputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputs(
                                RunIngest.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .outputAttachments(
                                RunIngest.OutputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                RunIngest.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("parent_run_id")
                            .referenceExampleId("reference_example_id")
                            .runType(RunIngest.RunType.TOOL)
                            .serialized(
                                RunIngest.Serialized.builder()
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

        runFuture.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun ingestBatch() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture =
            runServiceAsync.ingestBatch(
                RunIngestBatchParams.builder()
                    .addPatch(
                        RunIngest.builder()
                            .id("id")
                            .dottedOrder("dotted_order")
                            .endTime("end_time")
                            .error("error")
                            .addEvent(
                                RunIngest.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .extra(
                                RunIngest.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputAttachments(
                                RunIngest.InputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputs(
                                RunIngest.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .outputAttachments(
                                RunIngest.OutputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                RunIngest.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("parent_run_id")
                            .referenceExampleId("reference_example_id")
                            .runType(RunIngest.RunType.TOOL)
                            .serialized(
                                RunIngest.Serialized.builder()
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
                        RunIngest.builder()
                            .id("id")
                            .dottedOrder("dotted_order")
                            .endTime("end_time")
                            .error("error")
                            .addEvent(
                                RunIngest.Event.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .extra(
                                RunIngest.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputAttachments(
                                RunIngest.InputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .inputs(
                                RunIngest.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .outputAttachments(
                                RunIngest.OutputAttachments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                RunIngest.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentRunId("parent_run_id")
                            .referenceExampleId("reference_example_id")
                            .runType(RunIngest.RunType.TOOL)
                            .serialized(
                                RunIngest.Serialized.builder()
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun queryV1() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val pageFuture = runServiceAsync.queryV1()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun queryV2() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val pageFuture = runServiceAsync.queryV2()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveV1() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val runSchemaFuture =
            runServiceAsync.retrieveV1(
                RunRetrieveV1Params.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .excludeS3StoredAttributes(true)
                    .excludeSerialized(true)
                    .includeMessages(true)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val runSchema = runSchemaFuture.get()
        runSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveV2() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val runFuture =
            runServiceAsync.retrieveV2(
                RunRetrieveV2Params.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSelect(RunRetrieveV2Params.Select.ID)
                    .accept("Accept")
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stats() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture =
            runServiceAsync.stats(
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
                    .includeDetails(true)
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update2() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture = runServiceAsync.update2("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val runSchemaFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .excludeS3StoredAttributes(true)
                    .excludeSerialized(true)
                    .includeMessages(true)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val runSchema = runSchemaFuture.get()
        runSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.runs()

        val pageFuture = runServiceAsync.query()

        val page = pageFuture.get()
        page.response().validate()
    }

    private fun runService(httpClient: HttpClient): RunServiceAsync.WithRawResponse =
        RunServiceAsyncImpl(
                ClientOptions.builder()
                    .httpClient(httpClient)
                    .baseUrl("https://example.com")
                    .checkJacksonVersionCompatibility(false)
                    .build()
            )
            .withRawResponse()

    private fun autoBatchRunService(httpClient: HttpClient): RunServiceAsync =
        RunServiceAsyncImpl(
            ClientOptions.builder()
                .httpClient(httpClient)
                .baseUrl("https://example.com")
                .checkJacksonVersionCompatibility(false)
                .build()
        )

    private fun testRun(id: String): RunIngest =
        RunIngest.builder().id(id).traceId(id).dottedOrder("order").name("test").build()

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

    private fun jsonResponse(json: String, statusCode: Int = 200): HttpResponse =
        object : HttpResponse {
            override fun statusCode(): Int = statusCode

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
