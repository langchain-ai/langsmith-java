// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs

import com.langsmith_api.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunDeleteParamsTest {

    @Test
    fun create() {
        RunDeleteParams.builder()
            .metadata(
                RunDeleteParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            RunDeleteParams.builder()
                .metadata(
                    RunDeleteParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                RunDeleteParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.traceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunDeleteParams.builder().build()

        val body = params._body()
    }
}
