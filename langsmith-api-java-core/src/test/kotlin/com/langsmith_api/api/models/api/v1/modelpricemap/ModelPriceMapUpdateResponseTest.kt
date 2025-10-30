// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.modelpricemap

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelPriceMapUpdateResponseTest {

    @Test
    fun create() {
        val modelPriceMapUpdateResponse = ModelPriceMapUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelPriceMapUpdateResponse = ModelPriceMapUpdateResponse.builder().build()

        val roundtrippedModelPriceMapUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelPriceMapUpdateResponse),
                jacksonTypeRef<ModelPriceMapUpdateResponse>(),
            )

        assertThat(roundtrippedModelPriceMapUpdateResponse).isEqualTo(modelPriceMapUpdateResponse)
    }
}
