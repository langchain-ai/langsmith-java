// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.members.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingDeleteAllResponseTest {

    @Test
    fun create() {
        val pendingDeleteAllResponse = PendingDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingDeleteAllResponse = PendingDeleteAllResponse.builder().build()

        val roundtrippedPendingDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingDeleteAllResponse),
                jacksonTypeRef<PendingDeleteAllResponse>(),
            )

        assertThat(roundtrippedPendingDeleteAllResponse).isEqualTo(pendingDeleteAllResponse)
    }
}
