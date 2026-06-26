// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.sandboxes.registries.RegistryCreateParams
import com.langchain.smith.models.sandboxes.registries.RegistryListParams
import com.langchain.smith.models.sandboxes.registries.RegistryUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegistryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val registryServiceAsync = client.sandboxes().registries()

        val registryResponseFuture =
            registryServiceAsync.create(
                RegistryCreateParams.builder()
                    .name("name")
                    .password("password")
                    .url("url")
                    .username("username")
                    .build()
            )

        val registryResponse = registryResponseFuture.get()
        registryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val registryServiceAsync = client.sandboxes().registries()

        val registryResponseFuture = registryServiceAsync.retrieve("name")

        val registryResponse = registryResponseFuture.get()
        registryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val registryServiceAsync = client.sandboxes().registries()

        val registryResponseFuture =
            registryServiceAsync.update(
                RegistryUpdateParams.builder()
                    .pathName("name")
                    .bodyName("name")
                    .password("password")
                    .url("url")
                    .username("username")
                    .build()
            )

        val registryResponse = registryResponseFuture.get()
        registryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val registryServiceAsync = client.sandboxes().registries()

        val registryListResponseFuture =
            registryServiceAsync.list(
                RegistryListParams.builder()
                    .limit(0L)
                    .nameContains("name_contains")
                    .offset(0L)
                    .build()
            )

        val registryListResponse = registryListResponseFuture.get()
        registryListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val registryServiceAsync = client.sandboxes().registries()

        val future = registryServiceAsync.delete("name")

        val response = future.get()
    }
}
