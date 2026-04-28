// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.github.luben.zstd.ZstdInputStream
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

@ResourceLock("langsmithDisableRunCompression")
internal class RunServiceTest {

    @Test
    fun ingestBatch_sendsStreamingZstdJsonBodyWhenSupported() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest)
        val runService = runService(httpClient)

        runService.ingestBatch(
            RunIngestBatchParams.builder().addPost(Run.builder().id("run-id").build()).build()
        )

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "batch")
        assertThat(request.headers.values("Content-Encoding")).containsExactly("zstd")
        assertThat(body.contentType()).isEqualTo("application/json")
        assertThat(body.contentLength()).isEqualTo(-1L)
        assertThat(body.repeatable()).isTrue()
        assertThat(decompress(body)).contains("\"post\":[{\"id\":\"run-id\"}")
    }

    @Test
    fun ingestBatch_sendsUncompressedJsonBodyWhenZstdUnsupported() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest, zstdCompressionEnabled = false)
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
    fun ingestBatch_sendsUncompressedJsonBodyWhenInfoRequestFails() {
        val capturedRequest = AtomicReference<HttpRequest>()
        val httpClient = capturingHttpClient(capturedRequest, failInfoRequest = true)
        val runService = runService(httpClient)

        runService.ingestBatch(
            RunIngestBatchParams.builder().addPost(Run.builder().id("run-id").build()).build()
        )

        val request = capturedRequest.get()
        val body = request.body!!
        assertThat(request.pathSegments).containsExactly("runs", "batch")
        assertThat(request.headers.values("Content-Encoding")).isEmpty()
        assertThat(readBody(body)).contains("\"post\":[{\"id\":\"run-id\"}")
    }

    @Test
    fun ingestBatch_sendsUncompressedJsonBodyWhenRunCompressionDisabled() {
        val previousValue = System.getProperty("langchain.langsmithDisableRunCompression")
        System.setProperty("langchain.langsmithDisableRunCompression", "true")
        try {
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
            assertThat(readBody(body)).contains("\"post\":[{\"id\":\"run-id\"}")
        } finally {
            if (previousValue == null) {
                System.clearProperty("langchain.langsmithDisableRunCompression")
            } else {
                System.setProperty("langchain.langsmithDisableRunCompression", previousValue)
            }
        }
    }

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

    private fun capturingHttpClient(
        capturedRequest: AtomicReference<HttpRequest>,
        zstdCompressionEnabled: Boolean = true,
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

    private fun infoResponse(zstdCompressionEnabled: Boolean): HttpResponse =
        jsonResponse(
            """{"version":"test","instance_flags":{"zstd_compression_enabled":$zstdCompressionEnabled}}"""
        )

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
