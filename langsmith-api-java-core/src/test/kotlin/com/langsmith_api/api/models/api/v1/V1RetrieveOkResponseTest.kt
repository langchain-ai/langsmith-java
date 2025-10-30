// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveOkResponseTest {

    @Test
    fun create() {
        val v1RetrieveOkResponse = V1RetrieveOkResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveOkResponse = V1RetrieveOkResponse.builder().build()

        val roundtrippedV1RetrieveOkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveOkResponse),
                jacksonTypeRef<V1RetrieveOkResponse>(),
            )

        assertThat(roundtrippedV1RetrieveOkResponse).isEqualTo(v1RetrieveOkResponse)
    }
}
