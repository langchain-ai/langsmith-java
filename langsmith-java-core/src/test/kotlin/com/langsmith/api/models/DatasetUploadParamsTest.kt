// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.ContentTypes
import com.langsmith.api.core.MultipartFormValue
import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUploadParamsTest {

    @Test
    fun createDatasetUploadParams() {
        DatasetUploadParams.builder()
            .file("some content".toByteArray())
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
                .file("some content".toByteArray())
                .inputKeys(listOf("string"))
                .dataType(DatasetUploadParams.DataType.KV)
                .description("string")
                .name("string")
                .outputKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .containsExactly(
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary
                ),
                MultipartFormValue.fromList<String>(
                    "inputKeys",
                    listOf("string"),
                    ContentTypes.DefaultText
                ),
                MultipartFormValue.fromEnum(
                    "dataType",
                    DatasetUploadParams.DataType.KV,
                    ContentTypes.DefaultText
                ),
                MultipartFormValue.fromString("description", "string", ContentTypes.DefaultText),
                MultipartFormValue.fromString("name", "string", ContentTypes.DefaultText),
                MultipartFormValue.fromList<String>(
                    "outputKeys",
                    listOf("string"),
                    ContentTypes.DefaultText
                ),
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetUploadParams.builder()
                .file("some content".toByteArray())
                .inputKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .containsExactly(
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary
                ),
                MultipartFormValue.fromList<String>(
                    "inputKeys",
                    listOf("string"),
                    ContentTypes.DefaultText
                ),
                null,
                null,
                null,
                null,
            )
    }
}
