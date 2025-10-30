// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.datasets.experimentviewoverrides

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentViewOverrideListParamsTest {

    @Test
    fun create() {
        ExperimentViewOverrideListParams.builder()
            .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExperimentViewOverrideListParams.builder()
                .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("\"550e8400-e29b-41d4-a716-446655440000\"")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
