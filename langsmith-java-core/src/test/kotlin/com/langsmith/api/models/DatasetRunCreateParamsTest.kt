// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRunCreateParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createDatasetRunCreateParams() { // templates/JavaSDK/entities/testing.ts:18:13
        DatasetRunCreateParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .filters(DatasetRunCreateParams.Filters.builder().build())
            .limit(123L)
            .offset(123L)
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:1011:17
    fun getBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetRunCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .filters(DatasetRunCreateParams.Filters.builder().build())
                .limit(123L)
                .offset(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.sessionIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.filters()).isEqualTo(DatasetRunCreateParams.Filters.builder().build())
        assertThat(body.limit()).isEqualTo(123L)
        assertThat(body.offset()).isEqualTo(123L)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getBodyWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetRunCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.sessionIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getPathParam() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetRunCreateParams.builder() // templates/JavaSDK/entities/params.ts:1072:10 //
                // templates/JavaSDK/entities/params.ts:1072:10 //
                // templates/JavaSDK/entities/params.ts:1071:16 //
                // templates/JavaSDK/entities/params.ts:1071:16
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
