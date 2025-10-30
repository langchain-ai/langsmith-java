// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.orgs.current.members.PendingIdentityCreate
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberBatchParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberRetrieveActiveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.api().v1().workspaces().current().members()

        val identityFuture =
            memberServiceAsync.create(
                MemberCreateParams.builder()
                    .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgIdentityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val identity = identityFuture.get()
        identity.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.api().v1().workspaces().current().members()

        val memberFuture =
            memberServiceAsync.update(
                MemberUpdateParams.builder()
                    .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .build()
            )

        val member = memberFuture.get()
        member.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.api().v1().workspaces().current().members()

        val membersFuture = memberServiceAsync.list()

        val members = membersFuture.get()
        members.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.api().v1().workspaces().current().members()

        val memberFuture = memberServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val member = memberFuture.get()
        member.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batch() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.api().v1().workspaces().current().members()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.api().v1().workspaces().current().members()

        val memberIdentitiesFuture =
            memberServiceAsync.retrieveActive(
                MemberRetrieveActiveParams.builder()
                    .addEmail("string")
                    .limit(1L)
                    .addLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .offset(0L)
                    .addUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val memberIdentities = memberIdentitiesFuture.get()
        memberIdentities.forEach { it.validate() }
    }
}
