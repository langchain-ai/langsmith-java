// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .agentId("agent_id")
            .agentType(AgentUpdateParams.AgentType.CUSTOM)
            .name("name")
            .ownerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sourceType(AgentUpdateParams.SourceType.LSD)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agent_id")
                .agentType(AgentUpdateParams.AgentType.CUSTOM)
                .name("name")
                .ownerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(AgentUpdateParams.SourceType.LSD)
                .build()

        val body = params._body()

        assertThat(body.agentType()).contains(AgentUpdateParams.AgentType.CUSTOM)
        assertThat(body.name()).contains("name")
        assertThat(body.ownerId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.sourceType()).contains(AgentUpdateParams.SourceType.LSD)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().agentId("agent_id").build()

        val body = params._body()
    }
}
