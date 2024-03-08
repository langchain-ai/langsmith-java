// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleUploadCreateParamsTest {

    @Test
    fun createExampleUploadCreateParams() {
        ExampleUploadCreateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .file("file.txt")
            .inputKeys(listOf("string"))
            .outputKeys(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExampleUploadCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .file("file.txt")
                .inputKeys(listOf("string"))
                .outputKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.inputKeys()).isEqualTo(listOf("string"))
        assertThat(body.outputKeys()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExampleUploadCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .file("file.txt")
                .inputKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.inputKeys()).isEqualTo(listOf("string"))
    }

    @Test
    fun getPathParam() {
        val params =
            ExampleUploadCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .file("file.txt")
                .inputKeys(listOf("string"))
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
