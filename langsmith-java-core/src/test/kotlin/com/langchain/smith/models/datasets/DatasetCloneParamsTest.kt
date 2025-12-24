// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetCloneParamsTest {

    @Test
    fun create() {
        DatasetCloneParams.builder()
            .sourceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .targetDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .split("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            DatasetCloneParams.builder()
                .sourceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .split("string")
                .build()

        val body = params._body()

        assertThat(body.sourceDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.targetDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.asOf())
            .contains(
                DatasetCloneParams.AsOf.ofOffsetDateTime(
                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                )
            )
        assertThat(body.examples().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.split()).contains(DatasetCloneParams.Split.ofString("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetCloneParams.builder()
                .sourceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.sourceDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.targetDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
