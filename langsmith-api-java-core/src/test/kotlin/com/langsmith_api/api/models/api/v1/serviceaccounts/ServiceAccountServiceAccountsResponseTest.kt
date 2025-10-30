// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.serviceaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceAccountServiceAccountsResponseTest {

    @Test
    fun create() {
        val serviceAccountServiceAccountsResponse =
            ServiceAccountServiceAccountsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationIdentityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(serviceAccountServiceAccountsResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountServiceAccountsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(serviceAccountServiceAccountsResponse.defaultWorkspaceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountServiceAccountsResponse.name()).isEqualTo("name")
        assertThat(serviceAccountServiceAccountsResponse.organizationId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountServiceAccountsResponse.organizationIdentityId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountServiceAccountsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val serviceAccountServiceAccountsResponse =
            ServiceAccountServiceAccountsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationIdentityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedServiceAccountServiceAccountsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(serviceAccountServiceAccountsResponse),
                jacksonTypeRef<ServiceAccountServiceAccountsResponse>(),
            )

        assertThat(roundtrippedServiceAccountServiceAccountsResponse)
            .isEqualTo(serviceAccountServiceAccountsResponse)
    }
}
