// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            RunUpdateParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runIngest(RunIngest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
        val params =
            RunUpdateParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runIngest(RunIngest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RunIngest.builder().build())
    }
}
