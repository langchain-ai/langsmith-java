// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.sandboxes.registries.RegistryCreateParams
import com.langchain.smith.models.sandboxes.registries.RegistryListParams
import com.langchain.smith.models.sandboxes.registries.RegistryUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegistryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val registryService = client.sandboxes().registries()

        val registryResponse =
            registryService.create(
                RegistryCreateParams.builder()
                    .name("name")
                    .password("password")
                    .url("url")
                    .username("username")
                    .build()
            )

        registryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val registryService = client.sandboxes().registries()

        val registryResponse = registryService.retrieve("name")

        registryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val registryService = client.sandboxes().registries()

        val registryResponse =
            registryService.update(
                RegistryUpdateParams.builder()
                    .pathName("name")
                    .bodyName("name")
                    .password("password")
                    .url("url")
                    .username("username")
                    .build()
            )

        registryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val registryService = client.sandboxes().registries()

        val registryListResponse =
            registryService.list(
                RegistryListParams.builder()
                    .limit(0L)
                    .nameContains("name_contains")
                    .offset(0L)
                    .build()
            )

        registryListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val registryService = client.sandboxes().registries()

        registryService.delete("name")
    }
}
