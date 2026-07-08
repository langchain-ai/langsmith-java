// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadQueryParamsTest {

    @Test
    fun create() {
        ThreadQueryParams.builder()
            .cursor("cursor")
            .filter("filter")
            .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageSize(20L)
            .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreadQueryParams.builder()
                .cursor("cursor")
                .filter("filter")
                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageSize(20L)
                .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .build()

        val body = params._body()

        assertThat(body.cursor()).contains("cursor")
        assertThat(body.filter()).contains("filter")
        assertThat(body.maxStartTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.minStartTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.pageSize()).contains(20L)
        assertThat(body.projectId()).contains("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ThreadQueryParams.builder().build()

        val body = params._body()
    }
}
