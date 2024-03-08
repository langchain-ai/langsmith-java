// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetListParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createDatasetListParams() { // templates/JavaSDK/entities/testing.ts:18:13
        DatasetListParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dataType(DatasetListParams.DataType.KV)
            .limit(123L)
            .name("string")
            .nameContains("string")
            .offset(123L)
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:921:17
    fun getQueryParams() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetListParams.builder() // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:953:16 //
                // templates/JavaSDK/entities/params.ts:953:16
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

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getQueryParamsWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetListParams.builder().build() // templates/JavaSDK/entities/params.ts:953:16 //
        // templates/JavaSDK/entities/params.ts:953:16
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
