// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.members.PendingIdentityCreate
import com.langchain.smith.models.workspaces.current.members.MemberBatchParams
import com.langchain.smith.models.workspaces.current.members.MemberCreateParams
import com.langchain.smith.models.workspaces.current.members.MemberRetrieveActiveParams
import com.langchain.smith.models.workspaces.current.members.MemberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.workspaces().current().members()

        val identity =
            memberService.create(
                MemberCreateParams.builder()
                    .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgIdentityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        identity.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.workspaces().current().members()

        val member =
            memberService.update(
                MemberUpdateParams.builder()
                    .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .build()
            )

        member.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.workspaces().current().members()

        val members = memberService.list()

        members.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.workspaces().current().members()

        val member = memberService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        member.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batch() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.workspaces().current().members()

        val pendingIdentities =
            memberService.batch(
                MemberBatchParams.builder()
                    .addBody(
                        PendingIdentityCreate.builder()
                            .email("email")
                            .fullName("full_name")
                            .password("password")
                            .readOnly(true)
                            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        pendingIdentities.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveActive() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.workspaces().current().members()

        val memberIdentities =
            memberService.retrieveActive(
                MemberRetrieveActiveParams.builder()
                    .addEmail("string")
                    .isDisabled(true)
                    .limit(1L)
                    .addLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .offset(0L)
                    .addUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        memberIdentities.forEach { it.validate() }
    }
}
