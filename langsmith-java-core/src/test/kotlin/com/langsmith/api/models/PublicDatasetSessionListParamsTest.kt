// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PublicDatasetSessionListParamsTest {

    @Test
    fun createPublicDatasetSessionListParams() {
        PublicDatasetSessionListParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .facets(true)
            .limit(123L)
            .name("string")
            .nameContains("string")
            .offset(123L)
            .sortBy(PublicDatasetSessionListParams.SortBy.NAME)
            .sortByDesc(true)
            .sortByFeedbackKey("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PublicDatasetSessionListParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .facets(true)
                .limit(123L)
                .name("string")
                .nameContains("string")
                .offset(123L)
                .sortBy(PublicDatasetSessionListParams.SortBy.NAME)
                .sortByDesc(true)
                .sortByFeedbackKey("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("facets", listOf("true"))
        expected.put("limit", listOf("123"))
        expected.put("name", listOf("string"))
        expected.put("name_contains", listOf("string"))
        expected.put("offset", listOf("123"))
        expected.put("sort_by", listOf(PublicDatasetSessionListParams.SortBy.NAME.toString()))
        expected.put("sort_by_desc", listOf("true"))
        expected.put("sort_by_feedback_key", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            PublicDatasetSessionListParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            PublicDatasetSessionListParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "shareToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
