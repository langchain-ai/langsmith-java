// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderUserSlimTest {

    @Test
    fun create() {
        val providerUserSlim =
            ProviderUserSlim.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .emailConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstName("first_name")
                .fullName("full_name")
                .isDisabled(true)
                .lastName("last_name")
                .provider(ProviderUserSlim.Provider.EMAIL)
                .providerUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .provisioningMethod(ProviderUserSlim.ProvisioningMethod.SCIM)
                .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .username("username")
                .build()

        assertThat(providerUserSlim.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(providerUserSlim.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(providerUserSlim.lsUserId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(providerUserSlim.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(providerUserSlim.email()).contains("email")
        assertThat(providerUserSlim.emailConfirmedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(providerUserSlim.firstName()).contains("first_name")
        assertThat(providerUserSlim.fullName()).contains("full_name")
        assertThat(providerUserSlim.isDisabled()).contains(true)
        assertThat(providerUserSlim.lastName()).contains("last_name")
        assertThat(providerUserSlim.provider()).contains(ProviderUserSlim.Provider.EMAIL)
        assertThat(providerUserSlim.providerUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(providerUserSlim.provisioningMethod())
            .contains(ProviderUserSlim.ProvisioningMethod.SCIM)
        assertThat(providerUserSlim.samlProviderId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(providerUserSlim.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val providerUserSlim =
            ProviderUserSlim.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .emailConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstName("first_name")
                .fullName("full_name")
                .isDisabled(true)
                .lastName("last_name")
                .provider(ProviderUserSlim.Provider.EMAIL)
                .providerUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .provisioningMethod(ProviderUserSlim.ProvisioningMethod.SCIM)
                .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .username("username")
                .build()

        val roundtrippedProviderUserSlim =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providerUserSlim),
                jacksonTypeRef<ProviderUserSlim>(),
            )

        assertThat(roundtrippedProviderUserSlim).isEqualTo(providerUserSlim)
    }
}
