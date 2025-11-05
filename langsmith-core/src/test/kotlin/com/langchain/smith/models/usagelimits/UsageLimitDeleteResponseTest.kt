// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.usagelimits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageLimitDeleteResponseTest {

    @Test
    fun create() {
        val usageLimitDeleteResponse = UsageLimitDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageLimitDeleteResponse = UsageLimitDeleteResponse.builder().build()

        val roundtrippedUsageLimitDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageLimitDeleteResponse),
                jacksonTypeRef<UsageLimitDeleteResponse>(),
            )

        assertThat(roundtrippedUsageLimitDeleteResponse).isEqualTo(usageLimitDeleteResponse)
    }
}
