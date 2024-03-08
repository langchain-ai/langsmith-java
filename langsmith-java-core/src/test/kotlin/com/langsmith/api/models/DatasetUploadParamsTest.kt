// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUploadParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createDatasetUploadParams() { // templates/JavaSDK/entities/testing.ts:18:13
        DatasetUploadParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .file("file.txt")
            .inputKeys(listOf("string"))
            .dataType(DatasetUploadParams.DataType.KV)
            .description("string")
            .name("string")
            .outputKeys(listOf("string"))
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:1011:17
    fun getBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetUploadParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .file("file.txt")
                .inputKeys(listOf("string"))
                .dataType(DatasetUploadParams.DataType.KV)
                .description("string")
                .name("string")
                .outputKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.inputKeys()).isEqualTo(listOf("string"))
        assertThat(body.dataType()).isEqualTo(DatasetUploadParams.DataType.KV)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.outputKeys()).isEqualTo(listOf("string"))
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getBodyWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            DatasetUploadParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .file("file.txt")
                .inputKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.inputKeys()).isEqualTo(listOf("string"))
    }
}
