// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.fleet.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadActivateSandboxResponseTest {

    @Test
    fun create() {
        val threadActivateSandboxResponse =
            ThreadActivateSandboxResponse.builder()
                .sandboxSlug("sandbox-abc123")
                .scope(ThreadActivateSandboxResponse.Scope.AGENT)
                .status(ThreadActivateSandboxResponse.Status.READY)
                .build()

        assertThat(threadActivateSandboxResponse.sandboxSlug()).isEqualTo("sandbox-abc123")
        assertThat(threadActivateSandboxResponse.scope())
            .isEqualTo(ThreadActivateSandboxResponse.Scope.AGENT)
        assertThat(threadActivateSandboxResponse.status())
            .isEqualTo(ThreadActivateSandboxResponse.Status.READY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadActivateSandboxResponse =
            ThreadActivateSandboxResponse.builder()
                .sandboxSlug("sandbox-abc123")
                .scope(ThreadActivateSandboxResponse.Scope.AGENT)
                .status(ThreadActivateSandboxResponse.Status.READY)
                .build()

        val roundtrippedThreadActivateSandboxResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadActivateSandboxResponse),
                jacksonTypeRef<ThreadActivateSandboxResponse>(),
            )

        assertThat(roundtrippedThreadActivateSandboxResponse)
            .isEqualTo(threadActivateSandboxResponse)
    }
}
