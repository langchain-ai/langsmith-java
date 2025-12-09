// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitListParamsTest {

    @Test
    fun create() {
        CommitListParams.builder()
            .owner(JsonValue.from(mapOf<String, Any>()))
            .repo(JsonValue.from(mapOf<String, Any>()))
            .limit(1L)
            .offset(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommitListParams.builder()
                .owner(JsonValue.from(mapOf<String, Any>()))
                .repo(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        assertThat(params._pathParam(1)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommitListParams.builder()
                .owner(JsonValue.from(mapOf<String, Any>()))
                .repo(JsonValue.from(mapOf<String, Any>()))
                .limit(1L)
                .offset(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "1").put("offset", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CommitListParams.builder()
                .owner(JsonValue.from(mapOf<String, Any>()))
                .repo(JsonValue.from(mapOf<String, Any>()))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
