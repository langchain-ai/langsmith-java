// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspaces.WorkspaceCreateParams
import com.langchain.smith.models.workspaces.WorkspaceListParams
import com.langchain.smith.models.workspaces.WorkspaceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkspaceServiceAsyncTest {

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
        val workspaceServiceAsync = client.workspaces()

        val appSchemasTenantFuture =
            workspaceServiceAsync.create(
                WorkspaceCreateParams.builder()
                    .displayName("display_name")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tenantHandle("tenant_handle")
                    .build()
            )

        val appSchemasTenant = appSchemasTenantFuture.get()
        appSchemasTenant.validate()
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
        val workspaceServiceAsync = client.workspaces()

        val appSchemasTenantFuture =
            workspaceServiceAsync.update(
                WorkspaceUpdateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .displayName("display_name")
                    .build()
            )

        val appSchemasTenant = appSchemasTenantFuture.get()
        appSchemasTenant.validate()
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
        val workspaceServiceAsync = client.workspaces()

        val tenantForUsersFuture =
            workspaceServiceAsync.list(WorkspaceListParams.builder().includeDeleted(true).build())

        val tenantForUsers = tenantForUsersFuture.get()
        tenantForUsers.forEach { it.validate() }
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
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture = workspaceServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val workspace = workspaceFuture.get()
        workspace.validate()
    }
}
