// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationPgSchemaSlimTest {

    @Test
    fun create() {
        val organizationPgSchemaSlim =
            OrganizationPgSchemaSlim.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .disabled(true)
                .displayName("display_name")
                .isPersonal(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdByLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdByUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultSsoProvision(true)
                .jitProvisioningEnabled(true)
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .patCreationDisabled(true)
                .publicSharingDisabled(true)
                .ssoLoginSlug("sso_login_slug")
                .ssoOnly(true)
                .tier(PaymentPlanTier.NO_PLAN)
                .workspaceAdminCanInviteToOrg(true)
                .build()

        assertThat(organizationPgSchemaSlim.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(organizationPgSchemaSlim.disabled()).isEqualTo(true)
        assertThat(organizationPgSchemaSlim.displayName()).isEqualTo("display_name")
        assertThat(organizationPgSchemaSlim.isPersonal()).isEqualTo(true)
        assertThat(organizationPgSchemaSlim.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationPgSchemaSlim.createdByLsUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(organizationPgSchemaSlim.createdByUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(organizationPgSchemaSlim.defaultSsoProvision()).contains(true)
        assertThat(organizationPgSchemaSlim.jitProvisioningEnabled()).contains(true)
        assertThat(organizationPgSchemaSlim.modifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationPgSchemaSlim.patCreationDisabled()).contains(true)
        assertThat(organizationPgSchemaSlim.publicSharingDisabled()).contains(true)
        assertThat(organizationPgSchemaSlim.ssoLoginSlug()).contains("sso_login_slug")
        assertThat(organizationPgSchemaSlim.ssoOnly()).contains(true)
        assertThat(organizationPgSchemaSlim.tier()).contains(PaymentPlanTier.NO_PLAN)
        assertThat(organizationPgSchemaSlim.workspaceAdminCanInviteToOrg()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationPgSchemaSlim =
            OrganizationPgSchemaSlim.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .disabled(true)
                .displayName("display_name")
                .isPersonal(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdByLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdByUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultSsoProvision(true)
                .jitProvisioningEnabled(true)
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .patCreationDisabled(true)
                .publicSharingDisabled(true)
                .ssoLoginSlug("sso_login_slug")
                .ssoOnly(true)
                .tier(PaymentPlanTier.NO_PLAN)
                .workspaceAdminCanInviteToOrg(true)
                .build()

        val roundtrippedOrganizationPgSchemaSlim =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationPgSchemaSlim),
                jacksonTypeRef<OrganizationPgSchemaSlim>(),
            )

        assertThat(roundtrippedOrganizationPgSchemaSlim).isEqualTo(organizationPgSchemaSlim)
    }
}
