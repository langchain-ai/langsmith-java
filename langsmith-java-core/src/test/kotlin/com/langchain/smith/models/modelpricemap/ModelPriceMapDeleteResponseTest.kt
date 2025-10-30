// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.modelpricemap

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelPriceMapDeleteResponseTest {

    @Test
    fun create() {
        val modelPriceMapDeleteResponse = ModelPriceMapDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelPriceMapDeleteResponse = ModelPriceMapDeleteResponse.builder().build()

        val roundtrippedModelPriceMapDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelPriceMapDeleteResponse),
                jacksonTypeRef<ModelPriceMapDeleteResponse>(),
            )

        assertThat(roundtrippedModelPriceMapDeleteResponse).isEqualTo(modelPriceMapDeleteResponse)
    }
}
