// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponseBodyForRunsGenerateQueryTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createResponseBodyForRunsGenerateQuery() { // templates/JavaSDK/entities/testing.ts:18:13
        val responseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery
                .builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .filter("string")
                .build()
        assertThat(responseBodyForRunsGenerateQuery).isNotNull
        assertThat(responseBodyForRunsGenerateQuery.filter()).isEqualTo("string")
    }
}
