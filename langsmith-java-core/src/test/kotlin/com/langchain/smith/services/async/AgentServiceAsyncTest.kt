// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.agents.AgentCreateParams
import com.langchain.smith.models.agents.AgentRetrieveParams
import com.langchain.smith.models.agents.AgentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val agentServiceAsync = client.agents()

        val agentFuture =
            agentServiceAsync.create(
                AgentCreateParams.builder()
                    .id("id")
                    .sourceType(AgentCreateParams.SourceType.LSD)
                    .agentType(AgentCreateParams.AgentType.CUSTOM)
                    .name("name")
                    .productionOnly(true)
                    .build()
            )

        val agent = agentFuture.get()
        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val agentServiceAsync = client.agents()

        val agentFuture =
            agentServiceAsync.retrieve(
                AgentRetrieveParams.builder()
                    .agentId("agent_id")
                    .include(AgentRetrieveParams.Include.RUNTIME_BINDINGS)
                    .build()
            )

        val agent = agentFuture.get()
        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val agentServiceAsync = client.agents()

        val agentFuture =
            agentServiceAsync.update(
                AgentUpdateParams.builder()
                    .agentId("agent_id")
                    .agentType(AgentUpdateParams.AgentType.CUSTOM)
                    .name("name")
                    .ownerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sourceType(AgentUpdateParams.SourceType.LSD)
                    .build()
            )

        val agent = agentFuture.get()
        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val agentServiceAsync = client.agents()

        val pageFuture = agentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val agentServiceAsync = client.agents()

        val future = agentServiceAsync.delete("agent_id")

        val response = future.get()
    }
}
