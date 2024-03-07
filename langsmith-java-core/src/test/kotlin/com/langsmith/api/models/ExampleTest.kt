// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleTest {

    @Test
    fun createExample() {
        val example =
            Example.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .name("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .versionCount(123L)
                .versionList(listOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z")))
                .build()
        assertThat(example).isNotNull
        assertThat(example.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(example.name()).isEqualTo("string")
        assertThat(example.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(example.modifiedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(example._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(example.sourceRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(example.versionCount()).contains(123L)
        assertThat(example.versionList().get())
            .containsExactly(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
