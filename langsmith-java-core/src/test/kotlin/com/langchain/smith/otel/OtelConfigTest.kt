package com.langchain.smith.otel

import com.langchain.smith.address.AgentAddress
import com.langchain.smith.errors.LangChainInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class OtelConfigTest {

    @Test
    fun `an address sets the agent headers in lower case`() {
        val config = OtelConfig.builder().address(AgentAddress("support-agent", "Staging")).build()

        assertThat(config.headers)
            .containsEntry("Langsmith-Agent-Id", "support-agent")
            .containsEntry("Langsmith-Agent-Environment", "staging")
            .doesNotContainKey("Langsmith-Project")
    }

    @Test
    fun `the exporter builder takes an address too`() {
        val builder = OtelTraceExporter.builder().address(AgentAddress("support-agent", "local"))

        // A project header beside the address is refused before any exporter is created.
        assertThatThrownBy { builder.putHeader("Langsmith-Project", "mine").build() }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .hasMessageContaining("cannot be combined")
    }

    @Test
    fun `the exporter builder refuses an address beside a supplied config in either order`() {
        val config = OtelConfig.builder().putHeader("Langsmith-Project", "mine").build()
        val address = AgentAddress("support-agent", "staging")

        listOf(
                OtelTraceExporter.builder().config(config).address(address),
                OtelTraceExporter.builder().address(address).config(config),
            )
            .forEach { builder ->
                assertThatThrownBy { builder.build() }
                    .isInstanceOf(LangChainInvalidDataException::class.java)
                    .hasMessageContaining("cannot be combined with config()")
            }
    }

    @Test
    fun `a project header alone is unchanged`() {
        val config = OtelConfig.builder().putHeader("Langsmith-Project", "mine").build()

        assertThat(config.headers).containsOnlyKeys("Langsmith-Project")
    }

    @Test
    fun `a project header and an address are refused`() {
        val builder =
            OtelConfig.builder()
                .putHeader("langsmith-project", "mine")
                .address(AgentAddress("support-agent", "production"))

        assertThatThrownBy { builder.build() }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .hasMessageContaining("cannot be combined")
    }

    @Test
    fun `an address replaces every spelling of the agent headers`() {
        val config =
            OtelConfig.builder()
                .putHeader("langsmith-agent-id", "old-agent")
                .putHeader("LANGSMITH-AGENT-ENVIRONMENT", "local")
                .address(AgentAddress("new-agent", "staging"))
                .build()

        assertThat(config.headers)
            .containsOnlyKeys("Langsmith-Agent-Id", "Langsmith-Agent-Environment")
            .containsEntry("Langsmith-Agent-Id", "new-agent")
            .containsEntry("Langsmith-Agent-Environment", "staging")
    }

    @Test
    fun `an address survives headers being set after it`() {
        val config =
            OtelConfig.builder()
                .address(AgentAddress("support-agent", "production"))
                .headers(mapOf("x-api-key" to "key"))
                .build()

        assertThat(config.headers)
            .containsEntry("x-api-key", "key")
            .containsEntry("Langsmith-Agent-Id", "support-agent")
    }

    @Test
    fun `a destination header set twice in different spellings is refused`() {
        val builder =
            OtelConfig.builder()
                .putHeader("Langsmith-Agent-Id", "one")
                .putHeader("langsmith-agent-id", "two")
                .putHeader("Langsmith-Agent-Environment", "staging")

        assertThatThrownBy { builder.build() }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .hasMessageContaining("more than once")
    }

    @Test
    fun `an empty project header does not block an address`() {
        val config =
            OtelConfig.builder()
                .putHeader("Langsmith-Project", "")
                .address(AgentAddress("support-agent", "staging"))
                .build()

        assertThat(config.headers).containsEntry("Langsmith-Agent-Id", "support-agent")
    }

    @Test
    fun `an empty agent header alone is not half an address`() {
        val config = OtelConfig.builder().putHeader("Langsmith-Agent-Id", "").build()

        assertThat(config.headers).containsOnlyKeys("Langsmith-Agent-Id")
    }

    @Test
    fun `half an address is refused`() {
        listOf("Langsmith-Agent-Id", "Langsmith-Agent-Environment").forEach { header ->
            val builder = OtelConfig.builder().putHeader(header, "value")

            assertThatThrownBy { builder.build() }
                .isInstanceOf(LangChainInvalidDataException::class.java)
                .hasMessageContaining("must be set together")
        }
    }
}
