// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.orgs.current.members.AccessScope
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
