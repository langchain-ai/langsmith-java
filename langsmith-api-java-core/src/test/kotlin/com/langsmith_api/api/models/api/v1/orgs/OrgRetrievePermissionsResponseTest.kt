// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgs.current.members.AccessScope
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgRetrievePermissionsResponseTest {

    @Test
    fun create() {
        val orgRetrievePermissionsResponse =
            OrgRetrievePermissionsResponse.builder()
                .accessScope(AccessScope.ORGANIZATION)
                .description("description")
                .name("name")
                .build()

        assertThat(orgRetrievePermissionsResponse.accessScope()).isEqualTo(AccessScope.ORGANIZATION)
        assertThat(orgRetrievePermissionsResponse.description()).isEqualTo("description")
        assertThat(orgRetrievePermissionsResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgRetrievePermissionsResponse =
            OrgRetrievePermissionsResponse.builder()
                .accessScope(AccessScope.ORGANIZATION)
                .description("description")
                .name("name")
                .build()

        val roundtrippedOrgRetrievePermissionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgRetrievePermissionsResponse),
                jacksonTypeRef<OrgRetrievePermissionsResponse>(),
            )

        assertThat(roundtrippedOrgRetrievePermissionsResponse)
            .isEqualTo(orgRetrievePermissionsResponse)
    }
}
