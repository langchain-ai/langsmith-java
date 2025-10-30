// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1LoginResponseTest {

    @Test
    fun create() {
        val v1LoginResponse = V1LoginResponse.builder().accessToken("access_token").build()

        assertThat(v1LoginResponse.accessToken()).isEqualTo("access_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1LoginResponse = V1LoginResponse.builder().accessToken("access_token").build()

        val roundtrippedV1LoginResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1LoginResponse),
                jacksonTypeRef<V1LoginResponse>(),
            )

        assertThat(roundtrippedV1LoginResponse).isEqualTo(v1LoginResponse)
    }
}
