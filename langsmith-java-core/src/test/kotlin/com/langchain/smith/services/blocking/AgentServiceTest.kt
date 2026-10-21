// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.agents.AgentCreateParams
import com.langchain.smith.models.agents.AgentRetrieveParams
import com.langchain.smith.models.agents.AgentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val agentService = client.agents()

        val agent =
            agentService.create(
                AgentCreateParams.builder()
                    .id("id")
                    .sourceType(AgentCreateParams.SourceType.LSD)
                    .agentType(AgentCreateParams.AgentType.CUSTOM)
                    .name("name")
                    .productionOnly(true)
                    .build()
            )

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val agentService = client.agents()

        val agent =
            agentService.retrieve(
                AgentRetrieveParams.builder()
                    .agentId("agent_id")
                    .include(AgentRetrieveParams.Include.RUNTIME_BINDINGS)
                    .build()
            )

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val agentService = client.agents()

        val agent =
            agentService.update(
                AgentUpdateParams.builder()
                    .agentId("agent_id")
                    .agentType(AgentUpdateParams.AgentType.CUSTOM)
                    .name("name")
                    .sourceType(AgentUpdateParams.SourceType.LSD)
                    .build()
            )

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val agentService = client.agents()

        val page = agentService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val agentService = client.agents()

        agentService.delete("agent_id")
    }
}
