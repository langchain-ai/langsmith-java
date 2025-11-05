// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunTest {

    @Test
    fun create() {
        val run =
            Run.builder()
                .id("id")
                .dottedOrder("dotted_order")
                .endTime("end_time")
                .error("error")
                .addEvent(
                    Run.Event.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .extra(
                    Run.Extra.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .inputAttachments(
                    Run.InputAttachments.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .inputs(
                    Run.Inputs.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
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

        assertThat(run.id()).contains("id")
        assertThat(run.dottedOrder()).contains("dotted_order")
        assertThat(run.endTime()).contains("end_time")
        assertThat(run.error()).contains("error")
        assertThat(run.events().getOrNull())
            .containsExactly(
                Run.Event.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(run.extra())
            .contains(
                Run.Extra.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(run.inputAttachments())
            .contains(
                Run.InputAttachments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(run.inputs())
            .contains(
                Run.Inputs.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(run.name()).contains("name")
        assertThat(run.outputAttachments())
            .contains(
                Run.OutputAttachments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(run.outputs())
            .contains(
                Run.Outputs.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(run.parentRunId()).contains("parent_run_id")
        assertThat(run.referenceExampleId()).contains("reference_example_id")
        assertThat(run.runType()).contains(Run.RunType.TOOL)
        assertThat(run.serialized())
            .contains(
                Run.Serialized.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(run.sessionId()).contains("session_id")
        assertThat(run.sessionName()).contains("session_name")
        assertThat(run.startTime()).contains("start_time")
        assertThat(run.status()).contains("status")
        assertThat(run.tags().getOrNull()).containsExactly("string")
        assertThat(run.traceId()).contains("trace_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val run =
            Run.builder()
                .id("id")
                .dottedOrder("dotted_order")
                .endTime("end_time")
                .error("error")
                .addEvent(
                    Run.Event.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .extra(
                    Run.Extra.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .inputAttachments(
                    Run.InputAttachments.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .inputs(
                    Run.Inputs.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
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

        val roundtrippedRun =
            jsonMapper.readValue(jsonMapper.writeValueAsString(run), jacksonTypeRef<Run>())

        assertThat(roundtrippedRun).isEqualTo(run)
    }
}
