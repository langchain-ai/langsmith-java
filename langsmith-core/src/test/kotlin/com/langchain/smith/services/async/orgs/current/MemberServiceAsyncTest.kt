// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.current.members.MemberBatchParams
import com.langchain.smith.models.orgs.current.members.MemberRetrieveActiveParams
import com.langchain.smith.models.orgs.current.members.MemberUpdateParams
import com.langchain.smith.models.orgs.current.members.PendingIdentityCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().current().members()

        val pendingIdentityFuture =
            memberServiceAsync.create(
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

        val pendingIdentity = pendingIdentityFuture.get()
        pendingIdentity.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().current().members()

        val memberFuture =
            memberServiceAsync.update(
                MemberUpdateParams.builder()
                    .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fullName("full_name")
                    .password("password")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val member = memberFuture.get()
        member.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().current().members()

        val membersFuture = memberServiceAsync.list()

        val members = membersFuture.get()
        members.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().current().members()

        val memberFuture = memberServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val member = memberFuture.get()
        member.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batch() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().current().members()

        val pendingIdentitiesFuture =
            memberServiceAsync.batch(
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

        val pendingIdentities = pendingIdentitiesFuture.get()
        pendingIdentities.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveActive() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().current().members()

        val orgMemberIdentitiesFuture =
            memberServiceAsync.retrieveActive(
                MemberRetrieveActiveParams.builder()
                    .addEmail("string")
                    .limit(1L)
                    .addLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .offset(0L)
                    .addUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val orgMemberIdentities = orgMemberIdentitiesFuture.get()
        orgMemberIdentities.forEach { it.validate() }
    }
}
