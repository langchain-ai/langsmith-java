// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetUpdateTagsParamsTest {

    @Test
    fun create() {
        DatasetUpdateTagsParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .tag("tag")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetUpdateTagsParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tag("tag")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DatasetUpdateTagsParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tag("tag")
                .build()

        val body = params._body()

        assertThat(body.asOf())
            .isEqualTo(
                DatasetUpdateTagsParams.AsOf.ofOffsetDateTime(
                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                )
            )
        assertThat(body.tag()).isEqualTo("tag")
    }
}
