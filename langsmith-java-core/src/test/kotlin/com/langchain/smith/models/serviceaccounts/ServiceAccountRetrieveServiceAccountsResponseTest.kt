// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.serviceaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceAccountRetrieveServiceAccountsResponseTest {

    @Test
    fun create() {
        val serviceAccountRetrieveServiceAccountsResponse =
            ServiceAccountRetrieveServiceAccountsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(serviceAccountRetrieveServiceAccountsResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountRetrieveServiceAccountsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(serviceAccountRetrieveServiceAccountsResponse.defaultWorkspaceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountRetrieveServiceAccountsResponse.name()).isEqualTo("name")
        assertThat(serviceAccountRetrieveServiceAccountsResponse.organizationId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(serviceAccountRetrieveServiceAccountsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val serviceAccountRetrieveServiceAccountsResponse =
            ServiceAccountRetrieveServiceAccountsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedServiceAccountRetrieveServiceAccountsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(serviceAccountRetrieveServiceAccountsResponse),
                jacksonTypeRef<ServiceAccountRetrieveServiceAccountsResponse>(),
            )

        assertThat(roundtrippedServiceAccountRetrieveServiceAccountsResponse)
            .isEqualTo(serviceAccountRetrieveServiceAccountsResponse)
    }
}
