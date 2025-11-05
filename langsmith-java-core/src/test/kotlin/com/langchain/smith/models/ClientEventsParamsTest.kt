// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientEventsParamsTest {

    @Test
    fun create() {
        ClientEventsParams.builder()
            .eventType(ClientEventsParams.EventType.PLAYGROUND_VIEW)
            .owner("owner")
            .repo("repo")
            .commit("commit")
            .build()
    }

    @Test
    fun body() {
        val params =
            ClientEventsParams.builder()
                .eventType(ClientEventsParams.EventType.PLAYGROUND_VIEW)
                .owner("owner")
                .repo("repo")
                .commit("commit")
                .build()

        val body = params._body()

        assertThat(body.eventType()).isEqualTo(ClientEventsParams.EventType.PLAYGROUND_VIEW)
        assertThat(body.owner()).isEqualTo("owner")
        assertThat(body.repo()).isEqualTo("repo")
        assertThat(body.commit()).contains("commit")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ClientEventsParams.builder()
                .eventType(ClientEventsParams.EventType.PLAYGROUND_VIEW)
                .owner("owner")
                .repo("repo")
                .build()

        val body = params._body()

        assertThat(body.eventType()).isEqualTo(ClientEventsParams.EventType.PLAYGROUND_VIEW)
        assertThat(body.owner()).isEqualTo("owner")
        assertThat(body.repo()).isEqualTo("repo")
    }
}
