// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.orgs.current.user.ProviderUserSlim
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgMemberIdentityTest {

    @Test
    fun create() {
        val orgMemberIdentity =
            OrgMemberIdentity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accessScope(AccessScope.ORGANIZATION)
                .avatarUrl("avatar_url")
                .displayName("display_name")
                .email("email")
                .fullName("full_name")
                .isDisabled(true)
                .addLinkedLoginMethod(
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
                )
                .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgRoleName("org_role_name")
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(orgMemberIdentity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(orgMemberIdentity.lsUserId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.organizationId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.readOnly()).isEqualTo(true)
        assertThat(orgMemberIdentity.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.accessScope()).contains(AccessScope.ORGANIZATION)
        assertThat(orgMemberIdentity.avatarUrl()).contains("avatar_url")
        assertThat(orgMemberIdentity.displayName()).contains("display_name")
        assertThat(orgMemberIdentity.email()).contains("email")
        assertThat(orgMemberIdentity.fullName()).contains("full_name")
        assertThat(orgMemberIdentity.isDisabled()).contains(true)
        assertThat(orgMemberIdentity.linkedLoginMethods().getOrNull())
            .containsExactly(
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
            )
        assertThat(orgMemberIdentity.orgRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.orgRoleName()).contains("org_role_name")
        assertThat(orgMemberIdentity.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.roleName()).contains("role_name")
        assertThat(orgMemberIdentity.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgMemberIdentity.tenantIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgMemberIdentity =
            OrgMemberIdentity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accessScope(AccessScope.ORGANIZATION)
                .avatarUrl("avatar_url")
                .displayName("display_name")
                .email("email")
                .fullName("full_name")
                .isDisabled(true)
                .addLinkedLoginMethod(
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
                )
                .orgRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgRoleName("org_role_name")
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedOrgMemberIdentity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgMemberIdentity),
                jacksonTypeRef<OrgMemberIdentity>(),
            )

        assertThat(roundtrippedOrgMemberIdentity).isEqualTo(orgMemberIdentity)
    }
}
