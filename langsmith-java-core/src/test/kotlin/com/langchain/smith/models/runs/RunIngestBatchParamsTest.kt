// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunIngestBatchParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.patch().getOrNull())
            .containsExactly(
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
        assertThat(body.post().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunIngestBatchParams.builder().build()

        val body = params._body()
    }
}
