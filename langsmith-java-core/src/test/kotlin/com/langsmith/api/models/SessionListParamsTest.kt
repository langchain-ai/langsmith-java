// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SessionListParamsTest {

    @Test
    fun createSessionListParams() {
        SessionListParams.builder()
            .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .facets(true)
            .limit(123L)
            .name("string")
            .nameContains("string")
            .offset(123L)
            .referenceDataset(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .referenceFree(true)
            .sortBy(SessionListParams.SortBy.NAME)
            .sortByDesc(true)
            .sortByFeedbackKey("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SessionListParams.builder()
                .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .facets(true)
                .limit(123L)
                .name("string")
                .nameContains("string")
                .offset(123L)
                .referenceDataset(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .referenceFree(true)
                .sortBy(SessionListParams.SortBy.NAME)
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
        expected.put("reference_dataset", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("reference_free", listOf("true"))
        expected.put("sort_by", listOf(SessionListParams.SortBy.NAME.toString()))
        expected.put("sort_by_desc", listOf("true"))
        expected.put("sort_by_feedback_key", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SessionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
