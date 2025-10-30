// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetTransformationTest {

    @Test
    fun create() {
        val datasetTransformation =
            DatasetTransformation.builder()
                .addPath("string")
                .transformationType(
                    DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                )
                .build()

        assertThat(datasetTransformation.path()).containsExactly("string")
        assertThat(datasetTransformation.transformationType())
            .isEqualTo(DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetTransformation =
            DatasetTransformation.builder()
                .addPath("string")
                .transformationType(
                    DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                )
                .build()

        val roundtrippedDatasetTransformation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetTransformation),
                jacksonTypeRef<DatasetTransformation>(),
            )

        assertThat(roundtrippedDatasetTransformation).isEqualTo(datasetTransformation)
    }
}
