// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1EventsParamsTest {

    @Test
    fun create() {
        V1EventsParams.builder()
            .eventType(V1EventsParams.EventType.PLAYGROUND_VIEW)
            .owner("owner")
            .repo("repo")
            .commit("commit")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1EventsParams.builder()
                .eventType(V1EventsParams.EventType.PLAYGROUND_VIEW)
                .owner("owner")
                .repo("repo")
                .commit("commit")
                .build()

        val body = params._body()

        assertThat(body.eventType()).isEqualTo(V1EventsParams.EventType.PLAYGROUND_VIEW)
        assertThat(body.owner()).isEqualTo("owner")
        assertThat(body.repo()).isEqualTo("repo")
        assertThat(body.commit()).contains("commit")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1EventsParams.builder()
                .eventType(V1EventsParams.EventType.PLAYGROUND_VIEW)
                .owner("owner")
                .repo("repo")
                .build()

        val body = params._body()

        assertThat(body.eventType()).isEqualTo(V1EventsParams.EventType.PLAYGROUND_VIEW)
        assertThat(body.owner()).isEqualTo("owner")
        assertThat(body.repo()).isEqualTo("repo")
    }
}
