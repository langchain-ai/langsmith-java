// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sql

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqlQueryResponseTest {

    @Test
    fun create() {
        val sqlQueryResponse =
            SqlQueryResponse.builder()
                .addColumn(
                    SqlQueryResponse.Column.builder()
                        .dataType(SqlQueryResponse.Column.DataType.UUID)
                        .name("name")
                        .build()
                )
                .executionTimeMs(0.0)
                .isTruncated(true)
                .rowCount(0L)
                .addRow(listOf(JsonValue.from(mapOf<String, Any>())))
                .truncationReason(SqlQueryResponse.TruncationReason.ROW_LIMIT)
                .addWarning("string")
                .build()

        assertThat(sqlQueryResponse.columns().getOrNull())
            .containsExactly(
                SqlQueryResponse.Column.builder()
                    .dataType(SqlQueryResponse.Column.DataType.UUID)
                    .name("name")
                    .build()
            )
        assertThat(sqlQueryResponse.executionTimeMs()).contains(0.0)
        assertThat(sqlQueryResponse.isTruncated()).contains(true)
        assertThat(sqlQueryResponse.rowCount()).contains(0L)
        assertThat(sqlQueryResponse.rows().getOrNull())
            .containsExactly(listOf(JsonValue.from(mapOf<String, Any>())))
        assertThat(sqlQueryResponse.truncationReason())
            .contains(SqlQueryResponse.TruncationReason.ROW_LIMIT)
        assertThat(sqlQueryResponse.warnings().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sqlQueryResponse =
            SqlQueryResponse.builder()
                .addColumn(
                    SqlQueryResponse.Column.builder()
                        .dataType(SqlQueryResponse.Column.DataType.UUID)
                        .name("name")
                        .build()
                )
                .executionTimeMs(0.0)
                .isTruncated(true)
                .rowCount(0L)
                .addRow(listOf(JsonValue.from(mapOf<String, Any>())))
                .truncationReason(SqlQueryResponse.TruncationReason.ROW_LIMIT)
                .addWarning("string")
                .build()

        val roundtrippedSqlQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sqlQueryResponse),
                jacksonTypeRef<SqlQueryResponse>(),
            )

        assertThat(roundtrippedSqlQueryResponse).isEqualTo(sqlQueryResponse)
    }
}
