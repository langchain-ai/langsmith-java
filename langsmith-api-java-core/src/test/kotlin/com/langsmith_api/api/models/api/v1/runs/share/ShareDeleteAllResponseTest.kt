// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.share

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareDeleteAllResponseTest {

    @Test
    fun create() {
        val shareDeleteAllResponse = ShareDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shareDeleteAllResponse = ShareDeleteAllResponse.builder().build()

        val roundtrippedShareDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shareDeleteAllResponse),
                jacksonTypeRef<ShareDeleteAllResponse>(),
            )

        assertThat(roundtrippedShareDeleteAllResponse).isEqualTo(shareDeleteAllResponse)
    }
}
