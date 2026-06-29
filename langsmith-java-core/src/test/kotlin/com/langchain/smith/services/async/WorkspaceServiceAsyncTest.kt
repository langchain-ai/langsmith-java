// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspaces.WorkspaceCreateParams
import com.langchain.smith.models.workspaces.WorkspaceListParams
import com.langchain.smith.models.workspaces.WorkspaceRetrieveParams
import com.langchain.smith.models.workspaces.WorkspaceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspaceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture =
            workspaceServiceAsync.create(
                WorkspaceCreateParams.builder()
                    .displayName("display_name")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tenantHandle("tenant_handle")
                    .build()
            )

        val workspace = workspaceFuture.get()
        workspace.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture =
            workspaceServiceAsync.retrieve(
                WorkspaceRetrieveParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataPlaneId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeDeleted(true)
                    .build()
            )

        val workspace = workspaceFuture.get()
        workspace.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture =
            workspaceServiceAsync.update(
                WorkspaceUpdateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .displayName("display_name")
                    .build()
            )

        val workspace = workspaceFuture.get()
        workspace.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspacesFuture =
            workspaceServiceAsync.list(
                WorkspaceListParams.builder()
                    .dataPlaneId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeDeleted(true)
                    .build()
            )

        val workspaces = workspacesFuture.get()
        workspaces.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture = workspaceServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val workspace = workspaceFuture.get()
        workspace.validate()
    }
}
