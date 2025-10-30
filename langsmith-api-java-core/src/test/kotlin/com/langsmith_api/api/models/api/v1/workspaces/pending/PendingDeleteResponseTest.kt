// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingDeleteResponseTest {

    @Test
    fun create() {
        val pendingDeleteResponse = PendingDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingDeleteResponse = PendingDeleteResponse.builder().build()

        val roundtrippedPendingDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingDeleteResponse),
                jacksonTypeRef<PendingDeleteResponse>(),
            )

        assertThat(roundtrippedPendingDeleteResponse).isEqualTo(pendingDeleteResponse)
    }
}
