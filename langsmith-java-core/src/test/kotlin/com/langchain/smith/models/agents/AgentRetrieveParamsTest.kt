// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveParamsTest {

    @Test
    fun create() {
        AgentRetrieveParams.builder()
            .agentId("agent_id")
            .include(AgentRetrieveParams.Include.RUNTIME_BINDINGS)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentRetrieveParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AgentRetrieveParams.builder()
                .agentId("agent_id")
                .include(AgentRetrieveParams.Include.RUNTIME_BINDINGS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include", "runtime_bindings").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentRetrieveParams.builder().agentId("agent_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
