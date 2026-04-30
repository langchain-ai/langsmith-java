// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.annotationqueues.workspaces.WorkspaceCreateParams
import com.langchain.smith.models.annotationqueues.workspaces.WorkspaceListParams
import com.langchain.smith.models.annotationqueues.workspaces.WorkspaceUpdateParams
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
                .organizationId("My Organization ID")
                .build()
        val workspaceServiceAsync = client.annotationQueues().workspaces()

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
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val workspaceServiceAsync = client.annotationQueues().workspaces()

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
                .organizationId("My Organization ID")
                .build()
        val workspaceServiceAsync = client.annotationQueues().workspaces()

        val workspacesFuture =
            workspaceServiceAsync.list(WorkspaceListParams.builder().includeDeleted(true).build())

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
                .organizationId("My Organization ID")
                .build()
        val workspaceServiceAsync = client.annotationQueues().workspaces()

        val workspaceFuture = workspaceServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val workspace = workspaceFuture.get()
        workspace.validate()
    }
}
