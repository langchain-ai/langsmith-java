// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.sandboxes.pools.PoolCreateParams
import com.langchain.smith.models.sandboxes.pools.PoolListParams
import com.langchain.smith.models.sandboxes.pools.PoolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PoolServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolService = client.sandboxes().pools()

        val pool =
            poolService.create(
                PoolCreateParams.builder()
                    .name("name")
                    .replicas(1L)
                    .templateName("template_name")
                    .timeout(0L)
                    .waitForReady(true)
                    .build()
            )

        pool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolService = client.sandboxes().pools()

        val pool = poolService.retrieve("name")

        pool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolService = client.sandboxes().pools()

        val pool =
            poolService.update(
                PoolUpdateParams.builder().pathName("name").bodyName("name").replicas(0L).build()
            )

        pool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolService = client.sandboxes().pools()

        val pools =
            poolService.list(
                PoolListParams.builder().limit(0L).nameContains("name_contains").offset(0L).build()
            )

        pools.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolService = client.sandboxes().pools()

        poolService.delete("name")
    }
}
