// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitManifestResponseTest {

    @Test
    fun create() {
        val commitManifestResponse =
            CommitManifestResponse.builder()
                .commitHash("commit_hash")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .addExample(
                    CommitManifestResponse.Example.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(commitManifestResponse.commitHash()).isEqualTo("commit_hash")
        assertThat(commitManifestResponse._manifest())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(commitManifestResponse.examples().getOrNull())
            .containsExactly(
                CommitManifestResponse.Example.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitManifestResponse =
            CommitManifestResponse.builder()
                .commitHash("commit_hash")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .addExample(
                    CommitManifestResponse.Example.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCommitManifestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitManifestResponse),
                jacksonTypeRef<CommitManifestResponse>(),
            )

        assertThat(roundtrippedCommitManifestResponse).isEqualTo(commitManifestResponse)
    }
}
