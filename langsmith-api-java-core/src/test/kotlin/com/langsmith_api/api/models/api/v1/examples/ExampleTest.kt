// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleTest {

    @Test
    fun create() {
        val example =
            Example.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(example.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(example.name()).isEqualTo("name")
        assertThat(example._attachmentUrls()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(example.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(example._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(example.modifiedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(example._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(example.sourceRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val example =
            Example.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedExample =
            jsonMapper.readValue(jsonMapper.writeValueAsString(example), jacksonTypeRef<Example>())

        assertThat(roundtrippedExample).isEqualTo(example)
    }
}
