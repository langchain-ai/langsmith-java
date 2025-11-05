// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.runs.BodyParamsForRunSchema
import com.langchain.smith.models.runs.RequestBodyForRunsGenerateQuery
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunDeleteParams
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestMultipartParams
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunRetrieveThreadPreviewParams
import com.langchain.smith.models.runs.RunStatsQueryParams
import com.langchain.smith.models.runs.RunTypeEnum
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunsFilterDataSourceTypeEnum
import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

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
        val runServiceAsync = client.runs()

        val runFuture =
            runServiceAsync.create(
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

        val run = runFuture.get()
        run.validate()
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
        val runServiceAsync = client.runs()

        val runSchemaFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .excludeS3StoredAttributes(true)
                    .excludeSerialized(true)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val runSchema = runSchemaFuture.get()
        runSchema.validate()
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
        val runServiceAsync = client.runs()

        val runFuture =
            runServiceAsync.update(
                RunUpdateParams.builder()
                    .runId(JsonValue.from(mapOf<String, Any>()))
                    .run(
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

        val run = runFuture.get()
        run.validate()
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
        val runServiceAsync = client.runs()

        val runFuture =
            runServiceAsync.delete(
                RunDeleteParams.builder()
                    .metadata(
                        RunDeleteParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun generateQuery() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.runs()

        val responseBodyForRunsGenerateQueryFuture =
            runServiceAsync.generateQuery(
                RequestBodyForRunsGenerateQuery.builder()
                    .query("query")
                    .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                    .build()
            )

        val responseBodyForRunsGenerateQuery = responseBodyForRunsGenerateQueryFuture.get()
        responseBodyForRunsGenerateQuery.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ingestBatch() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture =
            runServiceAsync.ingestBatch(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ingestMultipart() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture =
            runServiceAsync.ingestMultipart(
                RunIngestMultipartParams.builder()
                    .attachmentRunIdFilename("some content".byteInputStream())
                    .feedbackRunId("some content".byteInputStream())
                    .patchRunId("some content".byteInputStream())
                    .patchRunIdOutputs("some content".byteInputStream())
                    .postRunId("some content".byteInputStream())
                    .postRunIdInputs("some content".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture =
            runServiceAsync.query(
                BodyParamsForRunSchema.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .executionOrder(1L)
                    .filter("filter")
                    .isRoot(true)
                    .limit(1L)
                    .order(BodyParamsForRunSchema.Order.ASC)
                    .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("query")
                    .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runType(RunTypeEnum.TOOL)
                    .searchFilter("search_filter")
                    .addSelect(BodyParamsForRunSchema.Select.ID)
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveThreadPreview() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture =
            runServiceAsync.retrieveThreadPreview(
                RunRetrieveThreadPreviewParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSelect(RunRetrieveThreadPreviewParams.Select.ALL_MESSAGES)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stats() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update2() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.runs()

        val responseFuture = runServiceAsync.update2("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
