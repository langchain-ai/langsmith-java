// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunIngestTest {

    @Test
    fun create() {
        val runIngest =
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

        assertThat(runIngest.id()).contains("id")
        assertThat(runIngest.dottedOrder()).contains("dotted_order")
        assertThat(runIngest.endTime()).contains("end_time")
        assertThat(runIngest.error()).contains("error")
        assertThat(runIngest.events().getOrNull())
            .containsExactly(
                RunIngest.Event.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.extra())
            .contains(
                RunIngest.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.inputAttachments())
            .contains(
                RunIngest.InputAttachments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.inputs())
            .contains(
                RunIngest.Inputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.name()).contains("name")
        assertThat(runIngest.outputAttachments())
            .contains(
                RunIngest.OutputAttachments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.outputs())
            .contains(
                RunIngest.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.parentRunId()).contains("parent_run_id")
        assertThat(runIngest.referenceExampleId()).contains("reference_example_id")
        assertThat(runIngest.runType()).contains(RunIngest.RunType.TOOL)
        assertThat(runIngest.serialized())
            .contains(
                RunIngest.Serialized.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runIngest.sessionId()).contains("session_id")
        assertThat(runIngest.sessionName()).contains("session_name")
        assertThat(runIngest.startTime()).contains("start_time")
        assertThat(runIngest.status()).contains("status")
        assertThat(runIngest.tags().getOrNull()).containsExactly("string")
        assertThat(runIngest.traceId()).contains("trace_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runIngest =
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

        val roundtrippedRunIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runIngest),
                jacksonTypeRef<RunIngest>(),
            )

        assertThat(roundtrippedRunIngest).isEqualTo(runIngest)
    }
}
