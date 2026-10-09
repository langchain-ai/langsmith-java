package com.langchain.smith.tracing

import com.langchain.smith.address.AgentAddress
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

internal class AddressingTest {

    private val support = AgentAddress("support", "production")

    @AfterEach fun resetEnv() = AddressEnv.override.set(null)

    @Test
    fun `addressed run sends the lrn and no session fields`() {
        val data = RunTree.builder().address(support).build().buildRunData()
        assertThat(data.address()).contains("lrn:agents/support/environments/production")
        assertThat(data.sessionName()).isEmpty
        assertThat(data.sessionId()).isEmpty
    }

    @Test
    fun `a project beside an address is rejected`() {
        val conflicts =
            listOf<() -> Any>(
                { RunTree.builder().address(support).projectName("p").build() },
                { RunTree.builder().address(support).sessionId("s").build() },
                { TraceConfig.builder().address(support).projectName("p").build() },
            )
        conflicts.forEach {
            assertThatThrownBy { it() }.isInstanceOf(LangChainInvalidDataException::class.java)
        }
    }

    @Test
    fun `child joins its addressed parent`() {
        val parent = RunTree.builder().address(support).build()
        val child =
            parent.createChild(TraceConfig.builder().projectName("other").sessionId("s").build())
        assertThat(child.address).isEqualTo(support)
        assertThat(child.projectName).isNull()
        assertThat(child.sessionId).isNull()
    }

    @Test
    fun `config beats env and env addresses a root run that names nothing`() {
        AddressEnv.override.set(
            mapOf("LANGSMITH_AGENT_ID" to "env-agent", "LANGSMITH_AGENT_ENVIRONMENT" to "local")
        )
        assertThat(resolveRootDestination("p", null, null).address).isNull()
        assertThat(resolveRootDestination(null, null, support).address).isEqualTo(support)
        assertThat(resolveRootDestination(null, null, null).address)
            .isEqualTo(AgentAddress("env-agent", "local"))
    }

    @Test
    fun `feedback takes an agent address`() {
        val feedback = FeedbackCreateSchema.builder().key("k").address(support).build()
        assertThat(feedback.address()).contains("lrn:agents/support/environments/production")
    }
}
