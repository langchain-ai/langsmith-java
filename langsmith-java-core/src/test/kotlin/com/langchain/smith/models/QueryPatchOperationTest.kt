// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryPatchOperationTest {

    @Test
    fun create() {
        val queryPatchOperation =
            QueryPatchOperation.builder()
                .op(QueryPatchOperation.Op.ADD)
                .path("path")
                .value(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(queryPatchOperation.op()).isEqualTo(QueryPatchOperation.Op.ADD)
        assertThat(queryPatchOperation.path()).isEqualTo("path")
        assertThat(queryPatchOperation._value()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryPatchOperation =
            QueryPatchOperation.builder()
                .op(QueryPatchOperation.Op.ADD)
                .path("path")
                .value(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedQueryPatchOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryPatchOperation),
                jacksonTypeRef<QueryPatchOperation>(),
            )

        assertThat(roundtrippedQueryPatchOperation).isEqualTo(queryPatchOperation)
    }
}
