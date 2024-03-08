// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleDeleteParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createExampleDeleteParams() { // templates/JavaSDK/entities/testing.ts:18:13
        ExampleDeleteParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .exampleIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:921:17
    fun getQueryParams() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            ExampleDeleteParams.builder() // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:953:16 //
                // templates/JavaSDK/entities/params.ts:953:16
                .exampleIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("example_ids", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getQueryParamsWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            ExampleDeleteParams.builder() // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:953:16 //
                // templates/JavaSDK/entities/params.ts:953:16
                .exampleIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("example_ids", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
