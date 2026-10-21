// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTest {

    @Test
    fun create() {
        val agent =
            Agent.builder()
                .id("id")
                .agentType(Agent.AgentType.CUSTOM)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEnvironment(
                    Agent.Environment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .agentId("agent_id")
                        .environment(Agent.Environment.InnerEnvironment.LOCAL)
                        .tracerSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tracerSessionName("tracer_session_name")
                        .addRuntimeBinding(
                            Agent.Environment.RuntimeBinding.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .agentEnvironmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .sourceId("source_id")
                                .build()
                        )
                        .build()
                )
                .name("name")
                .sourceType(Agent.SourceType.LSD)
                .owner("owner")
                .ownerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(agent.id()).isEqualTo("id")
        assertThat(agent.agentType()).isEqualTo(Agent.AgentType.CUSTOM)
        assertThat(agent.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agent.environments())
            .containsExactly(
                Agent.Environment.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .agentId("agent_id")
                    .environment(Agent.Environment.InnerEnvironment.LOCAL)
                    .tracerSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tracerSessionName("tracer_session_name")
                    .addRuntimeBinding(
                        Agent.Environment.RuntimeBinding.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .agentEnvironmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .sourceId("source_id")
                            .build()
                    )
                    .build()
            )
        assertThat(agent.name()).isEqualTo("name")
        assertThat(agent.sourceType()).isEqualTo(Agent.SourceType.LSD)
        assertThat(agent.owner()).contains("owner")
        assertThat(agent.ownerId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agent.tagKeyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agent.tagValueId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agent =
            Agent.builder()
                .id("id")
                .agentType(Agent.AgentType.CUSTOM)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEnvironment(
                    Agent.Environment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .agentId("agent_id")
                        .environment(Agent.Environment.InnerEnvironment.LOCAL)
                        .tracerSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tracerSessionName("tracer_session_name")
                        .addRuntimeBinding(
                            Agent.Environment.RuntimeBinding.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .agentEnvironmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .sourceId("source_id")
                                .build()
                        )
                        .build()
                )
                .name("name")
                .sourceType(Agent.SourceType.LSD)
                .owner("owner")
                .ownerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedAgent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(agent), jacksonTypeRef<Agent>())

        assertThat(roundtrippedAgent).isEqualTo(agent)
    }
}
