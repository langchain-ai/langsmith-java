// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.sandboxes.pools.PoolCreateParams
import com.langchain.smith.models.sandboxes.pools.PoolListParams
import com.langchain.smith.models.sandboxes.pools.PoolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PoolServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolServiceAsync = client.sandboxes().pools()

        val poolFuture =
            poolServiceAsync.create(
                PoolCreateParams.builder()
                    .name("name")
                    .replicas(1L)
                    .templateName("template_name")
                    .timeout(0L)
                    .waitForReady(true)
                    .build()
            )

        val pool = poolFuture.get()
        pool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val poolServiceAsync = client.sandboxes().pools()

        val poolFuture = poolServiceAsync.retrieve("name")

        val pool = poolFuture.get()
        pool.validate()
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
        val poolServiceAsync = client.sandboxes().pools()

        val poolFuture =
            poolServiceAsync.update(
                PoolUpdateParams.builder().pathName("name").bodyName("name").replicas(0L).build()
            )

        val pool = poolFuture.get()
        pool.validate()
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
        val poolServiceAsync = client.sandboxes().pools()

        val poolsFuture =
            poolServiceAsync.list(
                PoolListParams.builder().limit(0L).nameContains("name_contains").offset(0L).build()
            )

        val pools = poolsFuture.get()
        pools.validate()
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
        val poolServiceAsync = client.sandboxes().pools()

        val future = poolServiceAsync.delete("name")

        val response = future.get()
    }
}
