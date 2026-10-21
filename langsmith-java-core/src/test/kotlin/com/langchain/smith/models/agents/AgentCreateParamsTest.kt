// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .id("id")
            .sourceType(AgentCreateParams.SourceType.LSD)
            .agentType(AgentCreateParams.AgentType.CUSTOM)
            .name("name")
            .productionOnly(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentCreateParams.builder()
                .id("id")
                .sourceType(AgentCreateParams.SourceType.LSD)
                .agentType(AgentCreateParams.AgentType.CUSTOM)
                .name("name")
                .productionOnly(true)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.sourceType()).isEqualTo(AgentCreateParams.SourceType.LSD)
        assertThat(body.agentType()).contains(AgentCreateParams.AgentType.CUSTOM)
        assertThat(body.name()).contains("name")
        assertThat(body.productionOnly()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .id("id")
                .sourceType(AgentCreateParams.SourceType.LSD)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.sourceType()).isEqualTo(AgentCreateParams.SourceType.LSD)
    }
}
