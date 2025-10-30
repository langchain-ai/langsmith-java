// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.runs

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunIngestMultipartParamsTest {

    @Test
    fun create() {
        RunIngestMultipartParams.builder()
            .attachmentRunIdFilename(JsonValue.from(mapOf<String, Any>()))
            .feedbackRunId("some content".byteInputStream())
            .patchRunId("some content".byteInputStream())
            .patchRunIdOutputs("some content".byteInputStream())
            .postRunId("some content".byteInputStream())
            .postRunIdInputs("some content".byteInputStream())
            .build()
    }

    @Test
    fun body() {
        val params =
            RunIngestMultipartParams.builder()
                .attachmentRunIdFilename(JsonValue.from(mapOf<String, Any>()))
                .feedbackRunId("some content".byteInputStream())
                .patchRunId("some content".byteInputStream())
                .patchRunIdOutputs("some content".byteInputStream())
                .postRunId("some content".byteInputStream())
                .postRunIdInputs("some content".byteInputStream())
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "attachment.{run_id}.{filename}" to
                            MultipartField.of(JsonValue.from(mapOf<String, Any>())),
                        "feedback.{run_id}" to MultipartField.of("some content".byteInputStream()),
                        "patch.{run_id}" to MultipartField.of("some content".byteInputStream()),
                        "patch.{run_id}.outputs" to
                            MultipartField.of("some content".byteInputStream()),
                        "post.{run_id}" to MultipartField.of("some content".byteInputStream()),
                        "post.{run_id}.inputs" to
                            MultipartField.of("some content".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunIngestMultipartParams.builder().build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
