// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetListParamsTest {

    @Test
    fun createDatasetListParams() {
        DatasetListParams.builder()
            .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dataType(DatasetListParams.DataType.KV)
            .limit(123L)
            .name("string")
            .nameContains("string")
            .offset(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DatasetListParams.builder()
                .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetListParams.DataType.KV)
                .limit(123L)
                .name("string")
                .nameContains("string")
                .offset(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("as_of", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("data_type", listOf(DatasetListParams.DataType.KV.toString()))
        expected.put("limit", listOf("123"))
        expected.put("name", listOf("string"))
        expected.put("name_contains", listOf("string"))
        expected.put("offset", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DatasetListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
