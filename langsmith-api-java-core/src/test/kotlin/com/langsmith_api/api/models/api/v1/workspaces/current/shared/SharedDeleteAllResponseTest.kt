// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.shared

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SharedDeleteAllResponseTest {

    @Test
    fun create() {
        val sharedDeleteAllResponse = SharedDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sharedDeleteAllResponse = SharedDeleteAllResponse.builder().build()

        val roundtrippedSharedDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sharedDeleteAllResponse),
                jacksonTypeRef<SharedDeleteAllResponse>(),
            )

        assertThat(roundtrippedSharedDeleteAllResponse).isEqualTo(sharedDeleteAllResponse)
    }
}
