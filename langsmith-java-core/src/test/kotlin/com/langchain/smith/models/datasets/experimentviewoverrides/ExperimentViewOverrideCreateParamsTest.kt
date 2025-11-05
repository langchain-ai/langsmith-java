// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentviewoverrides

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentViewOverrideCreateParamsTest {

    @Test
    fun create() {
        ExperimentViewOverrideCreateParams.builder()
            .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
            .addColumnOverride(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExperimentViewOverrideCreateParams.builder()
                .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                .addColumnOverride(ColumnOverride.builder().column("column").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("\"550e8400-e29b-41d4-a716-446655440000\"")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExperimentViewOverrideCreateParams.builder()
                .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                .addColumnOverride(
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
                )
                .build()

        val body = params._body()

        assertThat(body.columnOverrides())
            .containsExactly(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExperimentViewOverrideCreateParams.builder()
                .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                .addColumnOverride(ColumnOverride.builder().column("column").build())
                .build()

        val body = params._body()

        assertThat(body.columnOverrides())
            .containsExactly(ColumnOverride.builder().column("column").build())
    }
}
