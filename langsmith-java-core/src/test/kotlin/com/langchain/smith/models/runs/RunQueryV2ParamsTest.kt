// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.http.Headers
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunQueryV2ParamsTest {

    @Test
    fun create() {
        RunQueryV2Params.builder()
            .accept("Accept")
            .cursor(
                "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
            )
            .filter("and(eq(run_type, \"llm\"), gt(latency, 5))")
            .hasError(false)
            .addId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .addId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
            .isRoot(true)
            .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
            .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
            .pageSize(100L)
            .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .addProjectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
            .referenceDatasetId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .addReferenceExample("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
            .addReferenceExample("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
            .runType(RunType.LLM)
            .selects(
                listOf(
                    RunSelectField.ID,
                    RunSelectField.NAME,
                    RunSelectField.PROJECT_ID,
                    RunSelectField.START_TIME,
                    RunSelectField.RUN_TYPE,
                    RunSelectField.STATUS,
                )
            )
            .traceFilter("eq(status, \"success\")")
            .traceId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
            .treeFilter("has(tags, \"production\")")
            .build()
    }

    @Test
    fun headers() {
        val params =
            RunQueryV2Params.builder()
                .accept("Accept")
                .cursor(
                    "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
                )
                .filter("and(eq(run_type, \"llm\"), gt(latency, 5))")
                .hasError(false)
                .addId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .addId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .isRoot(true)
                .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .pageSize(100L)
                .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .addProjectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .referenceDatasetId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .addReferenceExample("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                .addReferenceExample("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                .runType(RunType.LLM)
                .selects(
                    listOf(
                        RunSelectField.ID,
                        RunSelectField.NAME,
                        RunSelectField.PROJECT_ID,
                        RunSelectField.START_TIME,
                        RunSelectField.RUN_TYPE,
                        RunSelectField.STATUS,
                    )
                )
                .traceFilter("eq(status, \"success\")")
                .traceId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .treeFilter("has(tags, \"production\")")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Accept", "Accept").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = RunQueryV2Params.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunQueryV2Params.builder()
                .accept("Accept")
                .cursor(
                    "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
                )
                .filter("and(eq(run_type, \"llm\"), gt(latency, 5))")
                .hasError(false)
                .addId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .addId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .isRoot(true)
                .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .pageSize(100L)
                .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .addProjectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .referenceDatasetId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .addReferenceExample("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                .addReferenceExample("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                .runType(RunType.LLM)
                .selects(
                    listOf(
                        RunSelectField.ID,
                        RunSelectField.NAME,
                        RunSelectField.PROJECT_ID,
                        RunSelectField.START_TIME,
                        RunSelectField.RUN_TYPE,
                        RunSelectField.STATUS,
                    )
                )
                .traceFilter("eq(status, \"success\")")
                .traceId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .treeFilter("has(tags, \"production\")")
                .build()

        val body = params._body()

        assertThat(body.cursor())
            .contains(
                "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
            )
        assertThat(body.filter()).contains("and(eq(run_type, \"llm\"), gt(latency, 5))")
        assertThat(body.hasError()).contains(false)
        assertThat(body.ids().getOrNull())
            .containsExactly(
                "018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327",
                "f47ac10b-58cc-4372-a567-0e02b2c3d479",
            )
        assertThat(body.isRoot()).contains(true)
        assertThat(body.maxStartTime()).contains(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
        assertThat(body.minStartTime()).contains(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(body.pageSize()).contains(100L)
        assertThat(body.projectIds().getOrNull())
            .containsExactly(
                "018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327",
                "0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328",
            )
        assertThat(body.referenceDatasetId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(body.referenceExamples().getOrNull())
            .containsExactly(
                "b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e",
                "c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f",
            )
        assertThat(body.runType()).contains(RunType.LLM)
        assertThat(body.selects().getOrNull())
            .containsExactly(
                RunSelectField.ID,
                RunSelectField.NAME,
                RunSelectField.PROJECT_ID,
                RunSelectField.START_TIME,
                RunSelectField.RUN_TYPE,
                RunSelectField.STATUS,
            )
        assertThat(body.traceFilter()).contains("eq(status, \"success\")")
        assertThat(body.traceId()).contains("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        assertThat(body.treeFilter()).contains("has(tags, \"production\")")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunQueryV2Params.builder().build()

        val body = params._body()
    }
}
