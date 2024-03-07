// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUploadParamsTest {

    @Test
    fun createDatasetUploadParams() {
        DatasetUploadParams.builder()
            .file("file.txt")
            .inputKeys(listOf("string"))
            .dataType(DatasetUploadParams.DataType.KV)
            .description("string")
            .name("string")
            .outputKeys(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetUploadParams.builder()
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

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetUploadParams.builder().file("file.txt").inputKeys(listOf("string")).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.inputKeys()).isEqualTo(listOf("string"))
    }
}
