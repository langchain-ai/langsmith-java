// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentAddressTest {

    @Test
    fun create() {
        val agentAddress =
            AgentAddress.builder()
                .id("support-agent")
                .environment(AgentAddress.Environment.PRODUCTION)
                .build()

        assertThat(agentAddress.id()).isEqualTo("support-agent")
        assertThat(agentAddress.environment()).isEqualTo(AgentAddress.Environment.PRODUCTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentAddress =
            AgentAddress.builder()
                .id("support-agent")
                .environment(AgentAddress.Environment.PRODUCTION)
                .build()

        val roundtrippedAgentAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentAddress),
                jacksonTypeRef<AgentAddress>(),
            )

        assertThat(roundtrippedAgentAddress).isEqualTo(agentAddress)
    }
}
