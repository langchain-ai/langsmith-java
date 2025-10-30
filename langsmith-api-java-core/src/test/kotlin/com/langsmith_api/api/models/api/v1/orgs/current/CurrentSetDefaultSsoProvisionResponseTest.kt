// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentSetDefaultSsoProvisionResponseTest {

    @Test
    fun create() {
        val currentSetDefaultSsoProvisionResponse =
            CurrentSetDefaultSsoProvisionResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentSetDefaultSsoProvisionResponse =
            CurrentSetDefaultSsoProvisionResponse.builder().build()

        val roundtrippedCurrentSetDefaultSsoProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentSetDefaultSsoProvisionResponse),
                jacksonTypeRef<CurrentSetDefaultSsoProvisionResponse>(),
            )

        assertThat(roundtrippedCurrentSetDefaultSsoProvisionResponse)
            .isEqualTo(currentSetDefaultSsoProvisionResponse)
    }
}
