// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingClaimResponseTest {

    @Test
    fun create() {
        val pendingClaimResponse = PendingClaimResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingClaimResponse = PendingClaimResponse.builder().build()

        val roundtrippedPendingClaimResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingClaimResponse),
                jacksonTypeRef<PendingClaimResponse>(),
            )

        assertThat(roundtrippedPendingClaimResponse).isEqualTo(pendingClaimResponse)
    }
}
