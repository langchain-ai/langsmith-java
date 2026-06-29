// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentRunCreateParamsTest {

    @Test
    fun create() {
        ExperimentRunCreateParams.builder()
            .datasetId("dataset_id")
            .comparativeExperimentId("comparative_experiment_id")
            .cursor("cursor")
            .addExampleId("string")
            .addExperimentId("string")
            .filters(
                ExperimentRunCreateParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
            .pageSize(0L)
            .addSelect(ExperimentRunCreateParams.Select.ID)
            .sort(ExperimentRunCreateParams.Sort.builder().by("by").order("order").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExperimentRunCreateParams.builder().datasetId("dataset_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dataset_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExperimentRunCreateParams.builder()
                .datasetId("dataset_id")
                .comparativeExperimentId("comparative_experiment_id")
                .cursor("cursor")
                .addExampleId("string")
                .addExperimentId("string")
                .filters(
                    ExperimentRunCreateParams.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .pageSize(0L)
                .addSelect(ExperimentRunCreateParams.Select.ID)
                .sort(ExperimentRunCreateParams.Sort.builder().by("by").order("order").build())
                .build()

        val body = params._body()

        assertThat(body.comparativeExperimentId()).contains("comparative_experiment_id")
        assertThat(body.cursor()).contains("cursor")
        assertThat(body.exampleIds().getOrNull()).containsExactly("string")
        assertThat(body.experimentIds().getOrNull()).containsExactly("string")
        assertThat(body.filters())
            .contains(
                ExperimentRunCreateParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(body.pageSize()).contains(0L)
        assertThat(body.selects().getOrNull()).containsExactly(ExperimentRunCreateParams.Select.ID)
        assertThat(body.sort())
            .contains(ExperimentRunCreateParams.Sort.builder().by("by").order("order").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExperimentRunCreateParams.builder().datasetId("dataset_id").build()

        val body = params._body()
    }
}
