// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.langchain.smith.core.JsonNull
import com.langchain.smith.core.jsonMapper
import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

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
        val params = AgentCreateParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.sourceType()).isEqualTo(AgentCreateParams.SourceType.EXTERNAL)
        assertSerializedSourceType(body, "EXTERNAL")
    }

    @ParameterizedTest
    @MethodSource("sourceTypes")
    fun preservesExplicitSourceType(sourceType: AgentCreateParams.SourceType) {
        val params = AgentCreateParams.builder().id("id").sourceType(sourceType).build()

        assertThat(params.sourceType()).isEqualTo(sourceType)
        assertSerializedSourceType(params._body(), sourceType.toString())
        assertSerializedSourceType(
            params.toBuilder().name("renamed").build()._body(),
            sourceType.toString(),
        )
    }

    @Test
    fun directBodyBuilderDefaultsToExternal() {
        val body = AgentCreateParams.Body.builder().id("id").build()

        assertSerializedSourceType(body, "EXTERNAL")
        assertSerializedSourceType(
            AgentCreateParams.builder().body(body).build()._body(),
            "EXTERNAL",
        )
    }

    @Test
    fun preservesExplicitNull() {
        val params = AgentCreateParams.builder().id("id").sourceType(JsonNull.of()).build()
        val json = jsonMapper().readTree(jsonMapper().writeValueAsString(params._body()))

        assertThat(json.get("source_type").isNull).isTrue()
    }

    private fun assertSerializedSourceType(body: AgentCreateParams.Body, expected: String) {
        val json = jsonMapper().readTree(jsonMapper().writeValueAsString(body))
        assertThat(json.get("source_type").asText()).isEqualTo(expected)
        assertThat(json.get("id").asText()).isEqualTo("id")
    }

    companion object {
        @JvmStatic
        fun sourceTypes(): Stream<AgentCreateParams.SourceType> =
            Stream.of(
                AgentCreateParams.SourceType.EXTERNAL,
                AgentCreateParams.SourceType.LSD,
                AgentCreateParams.SourceType.MDA,
                AgentCreateParams.SourceType.FLEET,
            )
    }
}
