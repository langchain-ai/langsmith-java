// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitCreateParamsTest {

    @Test
    fun create() {
        CommitCreateParams.builder()
            .owner(JsonValue.from(mapOf<String, Any>()))
            .repo(JsonValue.from(mapOf<String, Any>()))
            .manifest(JsonValue.from(mapOf<String, Any>()))
            .parentCommit("parent_commit")
            .skipWebhooks(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommitCreateParams.builder()
                .owner(JsonValue.from(mapOf<String, Any>()))
                .repo(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        assertThat(params._pathParam(1)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommitCreateParams.builder()
                .owner(JsonValue.from(mapOf<String, Any>()))
                .repo(JsonValue.from(mapOf<String, Any>()))
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .parentCommit("parent_commit")
                .skipWebhooks(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.parentCommit()).contains("parent_commit")
        assertThat(body._skipWebhooks()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitCreateParams.builder()
                .owner(JsonValue.from(mapOf<String, Any>()))
                .repo(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()
    }
}
