package com.langchain.smith.address

import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sessions.SessionResolveParams
import com.langchain.smith.tracing.AddressEnv
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

internal class AddressTest {

    @AfterEach fun resetEnv() = AddressEnv.override.set(null)

    @Test
    fun `valid addresses map to resolve params`() {
        val agent = AgentAddress("a", "Production").toApiAddress()
        assertThat(agent.kind()).isEqualTo(SessionResolveParams.Kind.AGENT)
        assertThat(agent.id()).contains("a")
        assertThat(agent.environment()).contains(SessionResolveParams.Environment.PRODUCTION)

        val id = "0190C3D4-0000-7000-8000-0000000000B1"
        val experiment = ExperimentAddress(id).toApiAddress()
        assertThat(experiment.kind()).isEqualTo(SessionResolveParams.Kind.EXPERIMENT)
        assertThat(experiment.id()).contains(id.lowercase())

        assertThat(EvaluatorAddress().toApiAddress().kind())
            .isEqualTo(SessionResolveParams.Kind.EVALUATOR)
        AgentAddress("a" + "b".repeat(62), "local")
    }

    @ParameterizedTest
    @ValueSource(
        strings =
            [
                "",
                "Support",
                "1agent",
                "agent-",
                "a_b",
                "secret-é",
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            ]
    )
    fun `invalid agent ids are rejected without echoing them`(id: String) {
        assertThatThrownBy { AgentAddress(id, "production") }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .satisfies({ assertThat(it.message).doesNotContain("secret", "xxx") })
    }

    @Test
    fun `invalid environment and experiment id are rejected without echoing them`() {
        assertThatThrownBy { AgentAddress("agent", "prod-secret") }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .satisfies({ assertThat(it.message).doesNotContain("secret") })
        assertThatThrownBy { ExperimentAddress("not-a-secret-uuid") }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .satisfies({ assertThat(it.message).doesNotContain("secret") })
    }

    @Test
    fun `lrn is lower-case and parsed strictly`() {
        val address = AgentAddress("support", "PRODUCTION")
        assertThat(address.toLrn()).isEqualTo("lrn:agents/support/environments/production")
        assertThat(AgentAddress.fromLrn(address.toLrn())).isEqualTo(address)
        assertThatThrownBy { AgentAddress.fromLrn("lrn:agents/Secret/environments/production") }
            .isInstanceOf(LangChainInvalidDataException::class.java)
            .satisfies({ assertThat(it.message).doesNotContain("Secret") })
        assertThatThrownBy { AgentAddress.fromLrn("lrn:agents/a/environments/local/x") }
            .isInstanceOf(LangChainInvalidDataException::class.java)
    }

    @ParameterizedTest
    @CsvSource(
        value =
            [
                "NIL, NIL, none",
                "support, staging, address",
                "support, NIL, error",
                "NIL, staging, error",
                "Bad_Id, staging, error",
            ],
        nullValues = ["NIL"],
    )
    fun `env vars name both or neither`(id: String?, environment: String?, expected: String) {
        AddressEnv.override.set(
            listOfNotNull(
                    id?.let { "LANGSMITH_AGENT_ID" to it },
                    environment?.let { "LANGSMITH_AGENT_ENVIRONMENT" to it },
                )
                .toMap()
        )
        when (expected) {
            "none" -> assertThat(AgentAddress.fromEnv()).isNull()
            "address" ->
                assertThat(AgentAddress.fromEnv()).isEqualTo(AgentAddress("support", "staging"))
            else ->
                assertThatThrownBy { AgentAddress.fromEnv() }
                    .isInstanceOf(EnvAddressException::class.java)
                    .satisfies({ assertThat(it.message).doesNotContain("Bad_Id") })
        }
    }
}
