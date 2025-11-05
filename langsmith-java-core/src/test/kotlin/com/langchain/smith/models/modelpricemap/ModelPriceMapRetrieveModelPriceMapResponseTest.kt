// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.modelpricemap

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelPriceMapRetrieveModelPriceMapResponseTest {

    @Test
    fun create() {
        val modelPriceMapRetrieveModelPriceMapResponse =
            ModelPriceMapRetrieveModelPriceMapResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelPriceMapRetrieveModelPriceMapResponse =
            ModelPriceMapRetrieveModelPriceMapResponse.builder().build()

        val roundtrippedModelPriceMapRetrieveModelPriceMapResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelPriceMapRetrieveModelPriceMapResponse),
                jacksonTypeRef<ModelPriceMapRetrieveModelPriceMapResponse>(),
            )

        assertThat(roundtrippedModelPriceMapRetrieveModelPriceMapResponse)
            .isEqualTo(modelPriceMapRetrieveModelPriceMapResponse)
    }
}
