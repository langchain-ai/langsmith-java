// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.datasets.experimentviewoverrides

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ColumnOverrideTest {

    @Test
    fun create() {
        val columnOverride =
            ColumnOverride.builder()
                .column("column")
                .addColorGradient(listOf(JsonValue.from(mapOf<String, Any>())))
                .colorMap(
                    ColumnOverride.ColorMap.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .hide(true)
                .precision(1L)
                .build()

        assertThat(columnOverride.column()).isEqualTo("column")
        assertThat(columnOverride.colorGradient().getOrNull())
            .containsExactly(listOf(JsonValue.from(mapOf<String, Any>())))
        assertThat(columnOverride.colorMap())
            .contains(
                ColumnOverride.ColorMap.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(columnOverride.hide()).contains(true)
        assertThat(columnOverride.precision()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val columnOverride =
            ColumnOverride.builder()
                .column("column")
                .addColorGradient(listOf(JsonValue.from(mapOf<String, Any>())))
                .colorMap(
                    ColumnOverride.ColorMap.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .hide(true)
                .precision(1L)
                .build()

        val roundtrippedColumnOverride =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(columnOverride),
                jacksonTypeRef<ColumnOverride>(),
            )

        assertThat(roundtrippedColumnOverride).isEqualTo(columnOverride)
    }
}
