package com.langchain.smith.client

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunIngestBatchParams
import java.io.ByteArrayOutputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunMultipartBatchTest {

    @Test
    fun `serializes run data into main and separate multipart fields`() {
        val run =
            testRun("r1")
                .toBuilder()
                .inputs(
                    RunIngest.Inputs.builder()
                        .putAdditionalProperty("question", JsonValue.from("hello"))
                        .build()
                )
                .outputs(
                    RunIngest.Outputs.builder()
                        .putAdditionalProperty("answer", JsonValue.from("world"))
                        .build()
                )
                .events(
                    listOf(
                        RunIngest.Event.builder()
                            .putAdditionalProperty("event", JsonValue.from("started"))
                            .build()
                    )
                )
                .extra(
                    RunIngest.Extra.builder()
                        .putAdditionalProperty("metadata", JsonValue.from("value"))
                        .build()
                )
                .error("boom")
                .serialized(
                    RunIngest.Serialized.builder()
                        .putAdditionalProperty("lc", JsonValue.from(1))
                        .build()
                )
                .build()

        val multipart =
            RunIngestBatchParams.builder()
                .post(listOf(run))
                .build()
                .toRunMultipartFormData(jsonMapper())
        assertThat(multipart).isNotNull()
        val body = multipart!!.asString()

        assertThat(body).contains("name=\"post.r1\"")
        assertThat(body).contains("name=\"post.r1.inputs\"")
        assertThat(body).contains("name=\"post.r1.outputs\"")
        assertThat(body).contains("name=\"post.r1.events\"")
        assertThat(body).contains("name=\"post.r1.extra\"")
        assertThat(body).contains("name=\"post.r1.error\"")
        assertThat(body).contains("name=\"post.r1.serialized\"")

        val mainPayload = body.multipartPayload("post.r1")
        assertThat(mainPayload).contains("\"id\":\"r1\"")
        assertThat(mainPayload).contains("\"trace_id\":\"r1\"")
        assertThat(mainPayload).contains("\"dotted_order\":\"order\"")
        assertThat(mainPayload).contains("\"name\":\"test\"")
        assertThat(mainPayload).doesNotContain("question")
        assertThat(mainPayload).doesNotContain("answer")
        assertThat(mainPayload).doesNotContain("started")
        assertThat(mainPayload).doesNotContain("metadata")
        assertThat(mainPayload).doesNotContain("boom")
        assertThat(mainPayload).doesNotContain("\"lc\"")

        assertThat(body.multipartPayload("post.r1.inputs")).contains("\"question\":\"hello\"")
        assertThat(body.multipartPayload("post.r1.outputs")).contains("\"answer\":\"world\"")
        assertThat(body.multipartPayload("post.r1.events")).contains("\"event\":\"started\"")
        assertThat(body.multipartPayload("post.r1.extra")).contains("\"metadata\":\"value\"")
        assertThat(body.multipartPayload("post.r1.error")).contains("\"boom\"")
        assertThat(body.multipartPayload("post.r1.serialized")).contains("\"lc\":1")
    }

    @Test
    fun `omits missing separated fields instead of emitting null parts`() {
        val multipart =
            RunIngestBatchParams.builder()
                .post(listOf(testRun("r1")))
                .build()
                .toRunMultipartFormData(jsonMapper())
        assertThat(multipart).isNotNull()
        val body = multipart!!.asString()

        assertThat(body).contains("name=\"post.r1\"")
        assertThat(body).doesNotContain("name=\"post.r1.inputs\"")
        assertThat(body).doesNotContain("name=\"post.r1.outputs\"")
        assertThat(body).doesNotContain("name=\"post.r1.events\"")
        assertThat(body).doesNotContain("name=\"post.r1.extra\"")
        assertThat(body).doesNotContain("name=\"post.r1.error\"")
        assertThat(body).doesNotContain("name=\"post.r1.serialized\"")
        assertThat(body.multipartPayload("post.r1")).doesNotContain("null")
    }

    @Test
    fun `returns null when required multipart fields are missing`() {
        val multipart =
            RunIngestBatchParams.builder()
                .post(listOf(RunIngest.builder().id("r1").name("missing required fields").build()))
                .build()
                .toRunMultipartFormData(jsonMapper())

        assertThat(multipart).isNull()
    }

    private fun testRun(id: String): RunIngest =
        RunIngest.builder().id(id).traceId(id).dottedOrder("order").name("test").build()

    private fun com.langchain.smith.core.http.HttpRequestBody.asString(): String =
        ByteArrayOutputStream().use { output ->
            writeTo(output)
            output.toString(Charsets.UTF_8.name())
        }

    private fun String.multipartPayload(partName: String): String {
        val marker = "Content-Disposition: form-data; name=\"$partName\""
        val markerIndex = indexOf(marker)
        assertThat(markerIndex)
            .withFailMessage("Expected multipart part %s", partName)
            .isGreaterThanOrEqualTo(0)
        val payloadStart = indexOf("\r\n\r\n", markerIndex) + "\r\n\r\n".length
        val payloadEnd = indexOf("\r\n--", payloadStart).takeIf { it >= 0 } ?: length
        return substring(payloadStart, payloadEnd)
    }
}
