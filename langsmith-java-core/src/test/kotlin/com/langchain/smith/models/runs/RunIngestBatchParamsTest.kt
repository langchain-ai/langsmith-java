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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.patch().getOrNull())
            .containsExactly(
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
        assertThat(body.post().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunIngestBatchParams.builder().build()

        val body = params._body()
    }
}
