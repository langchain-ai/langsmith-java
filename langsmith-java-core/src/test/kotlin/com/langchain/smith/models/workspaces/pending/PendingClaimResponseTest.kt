// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
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
