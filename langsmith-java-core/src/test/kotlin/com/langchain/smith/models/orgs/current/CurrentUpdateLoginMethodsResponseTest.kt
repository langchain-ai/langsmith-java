// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentUpdateLoginMethodsResponseTest {

    @Test
    fun create() {
        val currentUpdateLoginMethodsResponse = CurrentUpdateLoginMethodsResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentUpdateLoginMethodsResponse = CurrentUpdateLoginMethodsResponse.builder().build()

        val roundtrippedCurrentUpdateLoginMethodsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentUpdateLoginMethodsResponse),
                jacksonTypeRef<CurrentUpdateLoginMethodsResponse>(),
            )

        assertThat(roundtrippedCurrentUpdateLoginMethodsResponse)
            .isEqualTo(currentUpdateLoginMethodsResponse)
    }
}
