// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PublicDatasetFeedbackRetrieveParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createPublicDatasetFeedbackRetrieveParams() { // templates/JavaSDK/entities/testing.ts:18:13
        PublicDatasetFeedbackRetrieveParams
            .builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .hasComment(true)
            .hasScore(true)
            .key(listOf("string"))
            .limit(123L)
            .offset(123L)
            .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .source(listOf(PublicDatasetFeedbackRetrieveParams.SourceType.API))
            .user(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:921:17
    fun getQueryParams() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            PublicDatasetFeedbackRetrieveParams
                .builder() // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:953:16 //
                // templates/JavaSDK/entities/params.ts:953:16
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .hasComment(true)
                .hasScore(true)
                .key(listOf("string"))
                .limit(123L)
                .offset(123L)
                .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .source(listOf(PublicDatasetFeedbackRetrieveParams.SourceType.API))
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
        expected.put(
            "source",
            listOf(PublicDatasetFeedbackRetrieveParams.SourceType.API.toString())
        )
        expected.put("user", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getQueryParamsWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            PublicDatasetFeedbackRetrieveParams
                .builder() // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:954:10 //
                // templates/JavaSDK/entities/params.ts:953:16 //
                // templates/JavaSDK/entities/params.ts:953:16
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getPathParam() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            PublicDatasetFeedbackRetrieveParams
                .builder() // templates/JavaSDK/entities/params.ts:1072:10 //
                // templates/JavaSDK/entities/params.ts:1072:10 //
                // templates/JavaSDK/entities/params.ts:1071:16 //
                // templates/JavaSDK/entities/params.ts:1071:16
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "shareToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
