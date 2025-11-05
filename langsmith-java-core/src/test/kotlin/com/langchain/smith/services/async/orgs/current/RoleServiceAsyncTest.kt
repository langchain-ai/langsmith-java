// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.current.roles.RoleCreateParams
import com.langchain.smith.models.orgs.current.roles.RoleUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoleServiceAsyncTest {

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
        val roleServiceAsync = client.orgs().current().roles()

        val roleFuture =
            roleServiceAsync.create(
                RoleCreateParams.builder()
                    .description("description")
                    .displayName("display_name")
                    .addPermission("string")
                    .build()
            )

        val role = roleFuture.get()
        role.validate()
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
        val roleServiceAsync = client.orgs().current().roles()

        val roleFuture =
            roleServiceAsync.update(
                RoleUpdateParams.builder()
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .displayName("display_name")
                    .addPermission("string")
                    .build()
            )

        val role = roleFuture.get()
        role.validate()
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
        val roleServiceAsync = client.orgs().current().roles()

        val rolesFuture = roleServiceAsync.list()

        val roles = rolesFuture.get()
        roles.forEach { it.validate() }
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
        val roleServiceAsync = client.orgs().current().roles()

        val roleFuture = roleServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val role = roleFuture.get()
        role.validate()
    }
}
