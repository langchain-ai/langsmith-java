// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PublicDatasetFeedbackRetrieveParamsTest {

    @Test
    fun createPublicDatasetFeedbackRetrieveParams() {
        PublicDatasetFeedbackRetrieveParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .hasComment(true)
            .hasScore(true)
            .key(listOf("string"))
            .limit(123L)
            .offset(123L)
            .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .source(listOf(PublicDatasetFeedbackRetrieveParams.Source.API))
            .user(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PublicDatasetFeedbackRetrieveParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .hasComment(true)
                .hasScore(true)
                .key(listOf("string"))
                .limit(123L)
                .offset(123L)
                .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .source(listOf(PublicDatasetFeedbackRetrieveParams.Source.API))
                .user(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("has_comment", listOf("true"))
        expected.put("has_score", listOf("true"))
        expected.put("key", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("offset", listOf("123"))
        expected.put("run", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("session", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("source", listOf(PublicDatasetFeedbackRetrieveParams.Source.API.toString()))
        expected.put("user", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            PublicDatasetFeedbackRetrieveParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            PublicDatasetFeedbackRetrieveParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "shareToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
