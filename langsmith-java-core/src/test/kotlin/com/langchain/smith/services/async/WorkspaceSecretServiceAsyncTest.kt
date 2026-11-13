// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretListParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspaceSecretServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceSecretServiceAsync = client.workspaceSecrets()

        val workspaceSecretsFuture =
            workspaceSecretServiceAsync.list(
                WorkspaceSecretListParams.builder().includeConfigs(true).build()
            )

        val workspaceSecrets = workspaceSecretsFuture.get()
        workspaceSecrets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceSecretServiceAsync = client.workspaceSecrets()

        val future = workspaceSecretServiceAsync.delete("key")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val workspaceSecretServiceAsync = client.workspaceSecrets()

        val workspaceSecretFuture =
            workspaceSecretServiceAsync.upsert(
                WorkspaceSecretUpsertParams.builder()
                    .key("key")
                    .addConfig(
                        WorkspaceSecretUpsertParams.Config.builder()
                            .hostPattern("host_pattern")
                            .headerName("header_name")
                            .headerValueTemplate("header_value_template")
                            .build()
                    )
                    .value("x")
                    .build()
            )

        val workspaceSecret = workspaceSecretFuture.get()
        workspaceSecret.validate()
    }
}
