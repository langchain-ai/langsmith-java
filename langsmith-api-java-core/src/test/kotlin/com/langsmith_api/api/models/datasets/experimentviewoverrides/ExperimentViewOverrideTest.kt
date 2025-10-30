// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.datasets.experimentviewoverrides

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentViewOverrideTest {

    @Test
    fun create() {
        val experimentViewOverride =
            ExperimentViewOverride.builder()
                .id("id")
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
                .createdAt("created_at")
                .datasetId("dataset_id")
                .modifiedAt("modified_at")
                .build()

        assertThat(experimentViewOverride.id()).contains("id")
        assertThat(experimentViewOverride.columnOverrides().getOrNull())
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
        assertThat(experimentViewOverride.createdAt()).contains("created_at")
        assertThat(experimentViewOverride.datasetId()).contains("dataset_id")
        assertThat(experimentViewOverride.modifiedAt()).contains("modified_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val experimentViewOverride =
            ExperimentViewOverride.builder()
                .id("id")
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
                .createdAt("created_at")
                .datasetId("dataset_id")
                .modifiedAt("modified_at")
                .build()

        val roundtrippedExperimentViewOverride =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(experimentViewOverride),
                jacksonTypeRef<ExperimentViewOverride>(),
            )

        assertThat(roundtrippedExperimentViewOverride).isEqualTo(experimentViewOverride)
    }
}
