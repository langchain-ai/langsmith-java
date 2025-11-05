// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experiments

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentGroupedParamsTest {

    @Test
    fun create() {
        ExperimentGroupedParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addMetadataKey("string")
            .datasetVersion("dataset_version")
            .experimentLimit(1L)
            .filter("filter")
            .nameContains("name_contains")
            .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .useApproxStats(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExperimentGroupedParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMetadataKey("string")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExperimentGroupedParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMetadataKey("string")
                .datasetVersion("dataset_version")
                .experimentLimit(1L)
                .filter("filter")
                .nameContains("name_contains")
                .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .useApproxStats(true)
                .build()

        val body = params._body()

        assertThat(body.metadataKeys()).containsExactly("string")
        assertThat(body.datasetVersion()).contains("dataset_version")
        assertThat(body.experimentLimit()).contains(1L)
        assertThat(body.filter()).contains("filter")
        assertThat(body.nameContains()).contains("name_contains")
        assertThat(body.statsStartTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.tagValueId().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.useApproxStats()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExperimentGroupedParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMetadataKey("string")
                .build()

        val body = params._body()

        assertThat(body.metadataKeys()).containsExactly("string")
    }
}
