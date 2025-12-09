// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitRetrieveResponseTest {

    @Test
    fun create() {
        val commitRetrieveResponse =
            CommitRetrieveResponse.builder()
                .commitHash("commit_hash")
                .addExample(
                    CommitRetrieveResponse.Example.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime("start_time")
                        .build()
                )
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(commitRetrieveResponse.commitHash()).contains("commit_hash")
        assertThat(commitRetrieveResponse.examples().getOrNull())
            .containsExactly(
                CommitRetrieveResponse.Example.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime("start_time")
                    .build()
            )
        assertThat(commitRetrieveResponse._manifest())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitRetrieveResponse =
            CommitRetrieveResponse.builder()
                .commitHash("commit_hash")
                .addExample(
                    CommitRetrieveResponse.Example.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime("start_time")
                        .build()
                )
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedCommitRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitRetrieveResponse),
                jacksonTypeRef<CommitRetrieveResponse>(),
            )

        assertThat(roundtrippedCommitRetrieveResponse).isEqualTo(commitRetrieveResponse)
    }
}
