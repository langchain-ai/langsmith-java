// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.businessinfo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessInfoBusinessInfoResponseTest {

    @Test
    fun create() {
        val businessInfoBusinessInfoResponse = BusinessInfoBusinessInfoResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessInfoBusinessInfoResponse = BusinessInfoBusinessInfoResponse.builder().build()

        val roundtrippedBusinessInfoBusinessInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessInfoBusinessInfoResponse),
                jacksonTypeRef<BusinessInfoBusinessInfoResponse>(),
            )

        assertThat(roundtrippedBusinessInfoBusinessInfoResponse)
            .isEqualTo(businessInfoBusinessInfoResponse)
    }
}
