// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.orgs.current.accesspolicies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessPolicyCreateResponseTest {

    @Test
    fun create() {
        val accessPolicyCreateResponse = AccessPolicyCreateResponse.builder().id("id").build()

        assertThat(accessPolicyCreateResponse.id()).contains("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessPolicyCreateResponse = AccessPolicyCreateResponse.builder().id("id").build()

        val roundtrippedAccessPolicyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessPolicyCreateResponse),
                jacksonTypeRef<AccessPolicyCreateResponse>(),
            )

        assertThat(roundtrippedAccessPolicyCreateResponse).isEqualTo(accessPolicyCreateResponse)
    }
}
