// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretListParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspaceSecretServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val workspaceSecretService = client.workspaceSecrets()

        val workspaceSecrets =
            workspaceSecretService.list(
                WorkspaceSecretListParams.builder().includeConfigs(true).build()
            )

        workspaceSecrets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val workspaceSecretService = client.workspaceSecrets()

        workspaceSecretService.delete("key")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val workspaceSecretService = client.workspaceSecrets()

        val workspaceSecret =
            workspaceSecretService.upsert(
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

        workspaceSecret.validate()
    }
}
