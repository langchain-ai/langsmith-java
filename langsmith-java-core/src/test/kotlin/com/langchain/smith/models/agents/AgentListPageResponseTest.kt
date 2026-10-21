// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListPageResponseTest {

    @Test
    fun create() {
        val agentListPageResponse =
            AgentListPageResponse.builder()
                .addItem(
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
                        .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(agentListPageResponse.items())
            .containsExactly(
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
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(agentListPageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentListPageResponse =
            AgentListPageResponse.builder()
                .addItem(
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
                        .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedAgentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListPageResponse),
                jacksonTypeRef<AgentListPageResponse>(),
            )

        assertThat(roundtrippedAgentListPageResponse).isEqualTo(agentListPageResponse)
    }
}
