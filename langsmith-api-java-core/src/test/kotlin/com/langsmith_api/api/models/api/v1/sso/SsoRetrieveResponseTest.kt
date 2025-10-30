// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sso

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SsoRetrieveResponseTest {

    @Test
    fun create() {
        val ssoRetrieveResponse =
            SsoRetrieveResponse.builder()
                .organizationDisplayName("organization_display_name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(ssoRetrieveResponse.organizationDisplayName())
            .isEqualTo("organization_display_name")
        assertThat(ssoRetrieveResponse.organizationId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ssoRetrieveResponse.providerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ssoRetrieveResponse =
            SsoRetrieveResponse.builder()
                .organizationDisplayName("organization_display_name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedSsoRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ssoRetrieveResponse),
                jacksonTypeRef<SsoRetrieveResponse>(),
            )

        assertThat(roundtrippedSsoRetrieveResponse).isEqualTo(ssoRetrieveResponse)
    }
}
