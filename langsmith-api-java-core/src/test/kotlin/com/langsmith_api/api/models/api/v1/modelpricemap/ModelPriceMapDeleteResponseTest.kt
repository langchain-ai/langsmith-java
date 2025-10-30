// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.modelpricemap

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
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
